import java.util.*;
import java.text.*;
class Solution{   
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Double abc;
        abc=sc.nextDouble();
        System.out.println("US: " + currency(Locale.US,abc));
        System.out.println("India: " + currency(new Locale("en","IN"),abc));
        System.out.println("China: " + currency(Locale.CHINA,abc));
        System.out.println("France: " + currency(Locale.FRANCE,abc));
         }
    public static String currency(Locale l1,Double D1){
        NumberFormat abc=NumberFormat.getCurrencyInstance(l1);
        String s1=abc.format(D1);
        return s1;
    }
}
