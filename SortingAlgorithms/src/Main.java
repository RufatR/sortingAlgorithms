import algorithmService.BubbleSort;
import algorithmService.IBubbleSort;

public class Main {
    public static void main(String[] args) {

        int arr [] = { 9 , 5 ,7 , 0 , 3 , -6 , 5 , 10, 15};
        // bubbleSort in intArray
        IBubbleSort iBubbleSort = new BubbleSort();
        iBubbleSort.bubbleSort(arr);
        iBubbleSort.printArr(arr);


    }
}