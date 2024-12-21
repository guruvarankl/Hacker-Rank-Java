import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                for(int j=s1.length();j<15;j++)
                s1=s1 + ' ';
                int num=sc.nextInt();
                System.out.print(s1);
                System.out.printf("%03d\n",num);
            }
            System.out.println("================================");    
    }
}


