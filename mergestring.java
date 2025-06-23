public class mergestring {

public static void mergeSortt(String arr[], int str, int end) {
    if(str>=end){
        return;
    }

//work
int mid=str+(end-str)/2;
mergeSortt(arr, str, mid);
mergeSortt(arr, mid+1, end);
//call
merge(arr,str,mid,end);


}

public static void merge(String arr[], int str, int mid, int end) {
    String temp[] = new String[end - str + 1];
    int i = str;
    int j = mid + 1; // Fix: Correctly set j to mid + 1
    int k = 0;

    while (i <= mid && j <= end) {
        if (arr[i].compareTo(arr[j]) <= 0) {
            temp[k] = arr[i]; // Fix: Use temp[k] instead of arr[k]
            i++;
        } else {
            temp[k] = arr[j]; // Fix: Use temp[k] instead of arr[k]
            j++;
        }
        k++;
    }

    while (i <= mid) {
        temp[k++] = arr[i++];
    }
    while (j <= end) {
        temp[k++] = arr[j++];
    }

    for (k = 0, i = str; k < temp.length; k++, i++) {
        arr[i] = temp[k]; // Copy temp back to arr
    }
}

public static void main(String[] args) {
 String[] arr={"sun","earth","mars","mercury"};
    mergeSortt(arr,0,arr.length-1);
    System.out.println("Sorted array: ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    // Test case
    String[] arr2={"apple","banana","cherry","date"};
    mergeSortt(arr2,0,arr2.length-1);
    System.out.println("Sorted array2: ");
    for(int i=0;i<arr2.length;i++){
        System.out.print(arr2[i]+" ");
    }
    System.out.println();  
}
}