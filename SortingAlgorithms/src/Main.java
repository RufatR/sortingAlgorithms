import algorithmService.bubblesort.BubbleSortImpl;
import algorithmService.bubblesort.IBubbleSort;
import algorithmService.shakerSort.IShakerSortOrCocktailSort;
import algorithmService.shakerSort.ShakerSortOrCocktailSortImpl;

public class Main {
    public static void main(String[] args) {

        int[] arr = { 9 , 55 ,7 , 0 , 3 , -6 , 5 , 10, 15};
//         Bubble sort
        System.out.println("Bubble Sort: ");
        IBubbleSort iBubbleSort = new BubbleSortImpl();
        iBubbleSort.sort(arr);
        iBubbleSort.printArr(arr);

//        Shaker sort or cocktail sort
        System.out.println("\nShaker Or Cocktail Sort: ");
        IShakerSortOrCocktailSort iShakerSortOrCocktailSort = new ShakerSortOrCocktailSortImpl();
        iShakerSortOrCocktailSort.sort(arr);
        iShakerSortOrCocktailSort.printArr(arr);

    }
}