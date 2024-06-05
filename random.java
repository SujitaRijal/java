//wap to generate 10 random numbers


import java.util.Scanner;
public class random{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter your password size");
int size=input.nextInt();
String pool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()_+";
int A=5;
int B=4;
int C=pool.length();
int r=1;
for(int i=0;i<size;i++)
{
 if(i>C)
 System.out.println("error!! ");
else
   r=(r*A+B)%C;
   System.out.println(pool.charAt(r));
}
System.out.println("\n");
}
}
