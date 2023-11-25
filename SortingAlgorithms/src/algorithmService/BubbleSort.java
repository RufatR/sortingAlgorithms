package algorithmService;

public class BubbleSort implements IBubbleSort {

    @Override
    public void bubbleSort(int[] arr) {
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
