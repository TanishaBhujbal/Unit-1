import java.util.Scanner;

public class Factorial {
    public static void main (String[] args){
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n");
        n = scan.nextInt();
        int nfact = 1;
        for (int i = 1; i<=n; i++){
            nfact = nfact * i;
        }
        System.out.println("factoial value is - "+nfact);
    }
}
