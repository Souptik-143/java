public class Mergesort {
    public static void mergesort(int arr[], int str, int end) {
        // base
        if (str >= end) {
            return;
        }
        // work
        int mid = str + (end - str) / 2;
        mergesort(arr, str, mid);
        mergesort(arr, mid + 1, end);
        merge(arr, str, mid, end);
        // call
    }

    public static void merge(int arr[], int str, int mid, int end) {
        int temp[] = new int[end - str + 1];
        int i = str;
        // left
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j]; // Fix: Use temp[k] instead of arr[k]
                j++;
            }
            k++;
        }
        while (i <= mid) { // single
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }
        // temp--->>arr copy4
        for (k = 0, i = str; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergesort(arr, 0, arr.length - 1);
        System.out.println("Sorted array1: ");
        // System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Test case
        int[] arr2 = {5, 2, 9, 1, 5, 6};
        mergesort(arr2, 0, arr2.length - 1);
        System.out.println("Sorted array2: ");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        // Test case
        int[] arr3 = {1, 2, 3, 4, 5};
        mergesort(arr3, 0, arr3.length - 1);
        System.out.println("Sorted array3: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
    }
}