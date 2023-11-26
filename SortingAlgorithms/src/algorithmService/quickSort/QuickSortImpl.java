package algorithmService.quickSort;

import algorithmService.SortingAlgorithms;

import java.util.Random;

public class QuickSortImpl implements SortingAlgorithms {
    @Override
    public void sort(int arr[]) {
        quickSort(arr, 0, arr.length - 1);
    }


    public void quickSort(int[] arr, int lowIndex, int highIndex) {

        //sol sag dan boyuk ve ya beraber olarsa cixsin
        if (lowIndex >= highIndex) {
            return;
        }
   // daha seliqeli deqiq olmagi ucun random pivot secilir yalniz sondan degil
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;

        int pivot = arr[pivotIndex];

        // sonuncu indexle yeri degisilir
        swap(arr, pivotIndex, highIndex);

        // cixartdig ayri metoda
        int leftPointer = partition(arr, lowIndex, highIndex, pivot);

        //pivotdan ferqli olani goturmey ucun sol terefde qalan ucun
        quickSort(arr, lowIndex, leftPointer - 1);
        //pivotdan ferqli olan sag teref ucun
        quickSort(arr, leftPointer + 1, highIndex);
    }


    private static int partition(int[] arr, int lowIndex, int highIndex, int pivot) {

        // 0 dan
        int leftPointer = lowIndex;
        //son dan
        int rightPointer = highIndex;


        // pivotdan kicikler = leftPointer
        // pivotdan boyukler = rightPointer


        // soldakilar sagdakilar kicik oldugu muddetce
        while (leftPointer < rightPointer) {

            // soldaki pivotdan kicikdirse ve soldaki sagdakinnan boyukdurse sol indexi artir
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            // sagdaki pivotdan boyukdurse ve soldaki sagdakinnan boyukdurse sag indexi azalt
            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            // eger eksine soldaki pivotdan boyuk , sagdaki pivotdan kicikdirse , solnan sagin yerin degis
            swap(arr, leftPointer, rightPointer);
        }
        // sol sag ust uste gelende solnan ve ya sagnan  ferqi yoxdu , sonuncunun yerin degis
        swap(arr, leftPointer, highIndex);
        return leftPointer;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
