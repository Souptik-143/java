class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        findpermute(nums,new ArrayList<>(),result,new boolean[nums.length]);
        return result;

    }

    public static void findpermute(int nums[],List<Integer> cur,List<List<Integer>> result,boolean used[] ){
if(cur.size()==nums.length){
    result.add(new ArrayList<>(cur));
    return;
}

        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;//
            used[i]=true;
            cur.add(nums[i]);//
            findpermute(nums,cur,result,used);//
            cur.remove(cur.size()-1);//
            used[i]=false;//

        }
    }
}
