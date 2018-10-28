import java.util.Scanner;

public class ConvertVNtoUSD {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number by USD: ");
        usd = scanner.nextDouble();
        double convert = usd * vnd;
        System.out.printf("Convert %s USD to %s VND",usd ,convert);
    }
}
