public class Main
{
	public static void main(String[] args) {
	    int i,j,k;
	    for(i=5;i>=1;i=i-1){
	        for(k=0;k<=5-i;k++){
	            System.out.print(" ");
	        }
	        for(j=1;j<=i;j=j+1){
	        System.out.print(i);
	        }
	    System.out.println();
	    }
	}
}