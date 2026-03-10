import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i=i+1){
            for(j=i;j<=n;j=j+1)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for(i=4;i>=1;i=i-1){
            for(j=i;j<=n;j=j+1){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}