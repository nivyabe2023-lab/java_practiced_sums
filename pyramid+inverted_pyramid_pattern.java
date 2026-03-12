import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;

        // Pyramid
        for(i = 1; i <= n; i++){
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Inverted Pyramid
        for(i = n-1; i >= 1; i--){
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}