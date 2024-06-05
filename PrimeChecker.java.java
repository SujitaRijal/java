//write a program to test weather the given number is prime or not

//import java.util.Scanner;
//public class Prime
//{
//public static void main(String[] args){
//Scanner input = new Scanner(System.in);
//int n=input.nextInt();
//int isPrime=n;


//if(n%isPrime==0)

//{
//n/=isPrime;
//System.out.println("Not prime");
//}
//else
//{
//System.out.printf("prime");
//}
//}
//}


import java.util.Scanner;

public class PrimeChecker {
    public static boolean isPrime(int number) {
        if (number<=1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}




