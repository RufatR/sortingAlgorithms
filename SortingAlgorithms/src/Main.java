import algorithmService.SortingAlgorithms;
import algorithmService.bubblesort.BubbleSortImpl;
import algorithmService.mergeSort.MergeSortImpl;
import algorithmService.shakerSort.ShakerSortOrCocktailSortImpl;

public class Main {
    public static void main(String[] args) {

        int[] arr = { 9, 5, 3 , 7 , 0 ,-5, 50,-200,39};
//         Bubble sort
        System.out.println("Bubble Sort: ");
        SortingAlgorithms iBubbleSort = new BubbleSortImpl();
        iBubbleSort.sort(arr);
        iBubbleSort.printArr(arr);

//        Shaker sort or cocktail sort
        System.out.println("\nShaker Or Cocktail Sort: ");
        SortingAlgorithms iShakerSortOrCocktailSort = new ShakerSortOrCocktailSortImpl();
        iShakerSortOrCocktailSort.sort(arr);
        iShakerSortOrCocktailSort.printArr(arr);

        //Merge Sort
        System.out.println("\n Merge Sort");
        SortingAlgorithms iMergeSort = new MergeSortImpl();
        iMergeSort.sort(arr);
        iMergeSort.printArr(arr);

    }
}