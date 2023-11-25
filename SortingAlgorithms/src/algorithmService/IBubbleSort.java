package algorithmService;

public interface IBubbleSort {
    void bubbleSort(int []arr);

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
