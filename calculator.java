import java.util.Scanner;
public class calculator{
public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	String[] format={"AC","X","%","/","7","8","9","*","4","5","6","-","1","2","3","+","00","0",".",""};
    calcu(format);

}
public static void calcu(String[] format)
{
	System.out.println();
	System.out.println("|"+format[0]+"|"+format[1]+"|"+format[2]+"|"+format[3]+"|");
	System.out.println("|"+format[4]+"|"+format[5]+"|"+format[6]+"|"+format[7]+" |");
	System.out.println("|"+format[8]+"|"+format[9]+"|"+format[10]+"|"+format[11]+" | ");
	System.out.println("|"+format[12]+"|"+format[13]+"|"+format[14]+"|"+format[15]+" | ");
	System.out.println("|"+format[16]+"|"+format[17]+"|"+format[18]+"|"+format[19]+" | ");
	
}
}

