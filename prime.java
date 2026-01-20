import java.util.Scanner;

public class PrimeNumberChecker {

    public static boolean isPrime(int n) {
          if (n <= 1) {
            return false;
        }
        
        if (n % 2 == 0) {
            return n == 2;
        }
        
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false; 
            }
        }
        
    
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
