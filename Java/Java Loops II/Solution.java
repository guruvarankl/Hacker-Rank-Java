import java.util.*;
class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int k;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            k=0;
            for(int j=0;j<n;j++){
                k=k+(((int)Math.pow(2,j))*b);
                System.out.print(k+a +" ");
            }
            System.out.println();
       }
        in.close();
    }
}

