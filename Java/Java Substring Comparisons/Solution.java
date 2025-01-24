import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String a;
        int flag1,flag2,len; 
        len=s.length();
        smallest=s.substring(0,k);
        largest=s.substring(0,k);
        for(int i=1;i<=len-k;i++)
        {
          a=s.substring(i,i+k);
          flag1=smallest.compareTo(a);
          flag2=largest.compareTo(a);
          if(flag1>0)
            smallest=a; 
          if(flag2<0) 
             largest=a;
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
