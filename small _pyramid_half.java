import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        int i,j,k;
        int space = 0;
        for(i=5;i>=1;i=i-2){
            for(k=1;k<=space;k=k+1){
                System.out.print(" ");
            }
            for(j=1;j<=i;j=j+1){
                System.out.print("*");
            }
            System.out.println("");
            space = space+1;
        }
    }
}