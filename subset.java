public class subset{
public static void subset(String str,String ans,int i){
    //base case
    if(i==str.length()){
        System.out.println(ans);
        return;
    }
    //recursive case
    // Character ch=str.charAt(0);
//yes
subset(str, ans+str.charAt(i),i+1);
//no
subset(str, ans, i+1);
 }
public static void findSubset(int arr[],int ans[],int i){
    if(i==arr.length){
   System.out.print(ans[i]+" ");
        return;
    }
    //recursion
    //yes
    ans[i]=arr[i];
    findSubset(arr, ans, i+1);
    //no
    ans[i]=0;
}

    public static void main(String[] args) {
    String str="abc"; 
subset(str, "", 0);

    }
}