import java.util.Scanner;

public class SumOfNElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of N: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum = sum + i;

                    //n=5  0+1+2+3+4+5
        }
        System.out.println("sum =" + sum);
    }
}
