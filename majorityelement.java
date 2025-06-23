public class majorityelement {
public static int majority(int arr[],int n){ 
    int candidate=arr[0];//choise a candidate
    int count=1;//maintain count variable
//step 1  //find the candidate
    for(int i=1;i<n;i++){
       
        //case1 if candidate is same as arr[i]
        if(arr[i]==candidate){
            count++;
    }else{
        //case2 if candidate is not same as arr[i]
            count--;
        }
        //case3 if count becomes 0
        if(count==0){
            candidate=arr[i];
            count=1;
        }   
          }

    //step 2 verify the candidate
count =0;
for(int num:arr){
    if(num==candidate){
        count++;
    }
}
   // step 3 check if candidate is majority element
if(count>n/2){
    System.out.println("Candidate is majority element");
    return candidate;

}else{
    System.out.println("Candidate is not majority element");
    return -1; // Return -1 if no majority element is found
}
 

  }



    public static void main(String[] args) {
int arr[]= {2,2,1,1,1,2,2};
int n=arr.length;
int result=majority(arr,n);
System.out.println("Majority element is: " + result);
// Test case    
int[] arr2 = {3, 3, 4, 2, 4, 4, 2, 4, 4};
int n2 = arr2.length;
int result2 = majority(arr2, n2);
System.out.println("Majority element is: " + result2);
// Test case 
int[] arr3 = {1, 2, 3, 4, 5};
int n3 = arr3.length;
int result3 = majority(arr3, n3);
System.out.println("Majority element is: " + result3);        

    }
}
