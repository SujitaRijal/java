//write a program to test weather the given number is prime or not

import java.util.Scanner;

public class primechecker1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        int z=1;
        
           for(int i=2; i<n; i++){
             if (n % i == 0) {             
               z=0;
               break;                
            }
        
           }
            if(z==0){
                System.out.printf("NotPrime\n");
            }else{
                System.out.printf("Prime\n");
            }
       
    }
}