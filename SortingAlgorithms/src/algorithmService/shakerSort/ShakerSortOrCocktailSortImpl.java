package algorithmService.shakerSort;

import algorithmService.SortingAlgorithms;


public class ShakerSortOrCocktailSortImpl implements SortingAlgorithms {
    @Override
    public void sort(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            boolean isSorted = true;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
            isSorted = true;
            for (int j = arr.length - 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }

        }
    }
}
