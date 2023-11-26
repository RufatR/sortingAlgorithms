package algorithmService.quickSort;

public interface QuickSortAlgorithm {

    void quickSort(int[]arr, int lowIndex , int highIndex);

    default void printArr(int []arr){
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1){
                System.out.print(arr[i] + " ]");
                break;
            }
            System.out.print(arr[i] + ", ");

        }

    }
}
