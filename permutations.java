public class permutations {

    public static void findpermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans); // Fix: Print the permutation instead of "null"
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);//
            String newstr = str.substring(0, i) + str.substring(i + 1);
            findpermutations(newstr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        String ans = "";
        findpermutations(s, ans);
        // Test case
        String s2 = "xyz";
        String ans2 = "";
        findpermutations(s2, ans2);
        // Test case
        String s3 = "123";
        String ans3 = "";
        findpermutations(s3, ans3);
        // Test case
        String s4 = "hello";
        String ans4 = "";
        findpermutations(s4, ans4);
        // Test case
        String s5 = "world";
        String ans5 = "";
        findpermutations(s5, ans5);
    }
}
