import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static boolean flag;
static int B,H;
static{
    Scanner sc=new Scanner(System.in);
    B=sc.nextInt();
    H=sc.nextInt();
    sc.close();
    try{
        if(B>0 && H>0)
        flag=true;
        else
        throw new Exception("Breadth and height must be positive");
    }
    catch(Exception e){
        System.out.print(e);
    }
    
}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

