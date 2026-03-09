import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        int i,j;
        for(i=5;i>=1;i=i-1){
            for(j=1;j<=i;j=j+1){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}