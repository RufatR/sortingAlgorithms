import algorithmService.bubblesort.BubbleSortImpl;
import algorithmService.bubblesort.IBubbleSort;

public class Main {
    public static void main(String[] args) {

        int[] arr = { 9 , 55 ,7 , 0 , 3 , -6 , 5 , 10, 15};
//         Bubble sort
        IBubbleSort iBubbleSort = new BubbleSortImpl();
        iBubbleSort.sort(arr);
        iBubbleSort.printArr(arr);




    }
}