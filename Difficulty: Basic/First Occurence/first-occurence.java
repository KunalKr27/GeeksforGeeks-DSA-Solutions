//{ Driver Code Starts
import java.util.*;

class Implement_strstr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String line = sc.nextLine();
            String a = line.split(" ")[0];
            line = sc.nextLine();
            String b = line.split(" ")[0];

            Solution g = new Solution();
            System.out.println(g.firstOccurence(a, b));

            t--;

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to locate the occurrence of the string x in the string s.
    int firstOccurence(String txt, String pat) {
        int m = txt.length();
        int n = pat.length();
        for(int i=0;i<=m-n;i++){
            int j;
            for(j=0;j<n;j++){
                if(txt.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
            }
            if(j==n){
                return i;
            }
        }
        return -1;
    }
}
