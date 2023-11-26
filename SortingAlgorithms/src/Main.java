import algorithmService.SortingAlgorithms;
import algorithmService.bubblesort.BubbleSortImpl;
import algorithmService.mergeSort.MergeSortImpl;
import algorithmService.quickSort.QuickSortImpl;
import algorithmService.shakerSort.ShakerSortOrCocktailSortImpl;

public class Main {
    public static void main(String[] args) {

        int[] arr = {9, 5, 3, 7, 0, -5, 50, -200, 39};
//         Bubble quickSort
        System.out.println("Bubble Sort: ");
        SortingAlgorithms iBubbleSort = new BubbleSortImpl();
        iBubbleSort.sort(arr);
        iBubbleSort.printArr(arr);

//        Shaker quickSort or cocktail quickSort
        System.out.println("\nShaker Or Cocktail Sort: ");
        SortingAlgorithms iShakerSortOrCocktailSort = new ShakerSortOrCocktailSortImpl();
        iShakerSortOrCocktailSort.sort(arr);
        iShakerSortOrCocktailSort.printArr(arr);

        //Merge Sort
        System.out.println("\n Merge Sort");
        SortingAlgorithms iMergeSort = new MergeSortImpl();
        iMergeSort.sort(arr);
        iMergeSort.printArr(arr);

        //Quick Sort
        System.out.println("\n Quick Sort");
        SortingAlgorithms quickSort = new QuickSortImpl();
        quickSort.sort(arr);
        quickSort.printArr(arr);

    }
}