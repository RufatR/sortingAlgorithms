package algorithmService.bubblesort;

import algorithmService.SortingAlgorithms;

public class BubbleSortImpl implements SortingAlgorithms {

    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isSorted =true;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j-1] > arr[j]){
                    isSorted = false;
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            if (isSorted){
                break;
            }
        }
    }
}
