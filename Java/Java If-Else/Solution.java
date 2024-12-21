import java.util.*;
public class Solution {
public static void main(String args[])
{
    Scanner s1=new Scanner(System.in);
    int s= s1.nextInt();
    if((s%2)!=0)
    System.out.println("Weird");
    else
    if((s>=2 && s<=5) || s>20)
        System.out.println("Not Weird");
    else
        if(s>=6 && s<=20)  System.out.println("Weird");
    s1.close();
    
}   
}

