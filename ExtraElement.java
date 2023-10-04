// import java.util.HashSet;
import java.util.Scanner;
// import java.util.Set;

// class Solution {
//     public char findTheDifference(String s, String t) {
//         char ans = ' ';
//         for (int i = 0; i < t.length(); i++) {
//             boolean found = false; 
//             for (int j = 0; j < s.length(); j++) {
//                 if (t.charAt(i) == s.charAt(j)) {
//                     found = true;
//                     break;
//                 }
//             }
//             if (!found) {
//                 ans = t.charAt(i); 
//                 break; 
//             }
//         }
//         return ans;
//     }
// }
class ExtraElement
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the s");
        String s1= sc.nextLine();
        System.out.println("Enter the t");
        String t1= sc.nextLine();
        Solution obj= new Solution();
        System.out.println(obj.findTheDifference(s1, t1));
        sc.close();
    }
}
// class Solution {
//     public char findTheDifference(String s, String t)
//      {
//        Set<Character> ans= new HashSet<>();
//        for(char c : s.toCharArray())
//        {
//          ans.add(c);
//        }

//        for(char alt : t.toCharArray())
//        {
//         if(!ans.contains(alt))
//         {
//             return alt;
//         }
//        }
//        return ' ';
//     }
// }
class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()) c ^= cs;
        for(char ct : t.toCharArray()) c ^= ct;
        return c;
    }
}