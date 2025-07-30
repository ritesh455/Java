// import java.util.*;
// class string {
//     public static void main(String[] args) {
//         String s1="Helo";
//         String s2="hleo";
//         s1=s1.toLowerCase();
//         s2=s2.toLowerCase();
//         if(s1.length()==s2.length()){
//             char[] arr1=s1.toCharArray();
//             char[] arr2=s2.toCharArray();
//             Arrays.sort(arr1);
//             Arrays.sort(arr2);
//             if(Arrays.equals(arr1,arr2)){
//                 System.out.println("Anagram");
//             }else{
//                 System.out.println("no");
//             }
//         }else{
//             System.out.println("No anagrom");
//         }
//     }
// }






// example 2
import java.util.Scanner;
class string {
    public static void main(String[] args) {
        String s1="Helo";
        String s2="hleo";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()==s2.length()){
            int[] count=new int[26];
            for(int i=0;i<s1.length();i++){
                char c1=s1.charAt(i);
                char c2=s2.charAt(i);
                count[c1-'a']++;
                count[c2-'a']--;
            }
            boolean isAnagram = true;
            for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("No");
        }
        }
        else{
            System.out.println("No anagrom");
        }
    }
}
