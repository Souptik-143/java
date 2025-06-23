public class quicksort {
    public static void quicksort(int arr[], int str, int end) {
        //base 
        if(str>=end){
            return;
        }
//pviot & partion
//left and right qick
int pvtidx=partion(arr,str,end);
        quicksort(arr,str,pvtidx-1);
        quicksort(arr,pvtidx+1,end);


    }
    public static int partion(int arr[], int str, int end) {
        //pviot
        int pivot=arr[end];
        int i=str-1;
        for(int j=str;j<end;j++){
            if(arr[j]<pivot){
                i++;
                //swap
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            }
         

        }
        i++;
        int temp=pivot;
        arr[end]=arr[i];
        arr[i]=temp;
        return i;
    }
        



    public static void main(String[] args) {
        int [] arr = {38, 27, 43, 3, 9, 82, 10};
        quicksort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Test case
        int[] arr2 = {5, 2, 9, 1, 5, 6};
        quicksort(arr2, 0, arr2.length - 1);
        System.out.println("Sorted array2: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        // Test case
        int[] arr3 = {10, 7, 8, 9, 1, 5};
        quicksort(arr3, 0, arr3.length - 1);
        System.out.println("Sorted array3: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        // Test case
        int[] arr4 = {1, 2, 3, 4, 5};
        quicksort(arr4, 0, arr4.length - 1);
        System.out.println("Sorted array4: ");
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }
        System.out.println();
    }
        
}
