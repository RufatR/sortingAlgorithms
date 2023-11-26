package algorithmService.mergeSort;

import algorithmService.SortingAlgorithms;

public class MergeSortImpl implements SortingAlgorithms {
    @Override
    public void sort(int[] arr) {
        if (arr.length > 2) {
            return;
        }

        int midIndex = arr.length / 2;
        int[] leftArr = new int[midIndex];
        int[] rightArr = new int[arr.length - midIndex];

        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = arr[i];
        }

        for (int i = midIndex; i < rightArr.length; i++) {
            rightArr[i - midIndex] = arr[i];
        }

        sort(leftArr);
        sort(rightArr);

        merge(arr, leftArr, rightArr);
    }

    private void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int i = 0, j = 0, k = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] > rightArr[j]) {
                arr[k] = arr[j++];
            } else {
                arr[k] = arr[i++];
            }
            k++;
        }

        while (i < leftArr.length) {
            arr[k++] = arr[i++];
        }

        while (j < rightArr.length) {
            arr[k] = arr[j++];
        }

    }
}
