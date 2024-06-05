import java.util.Scanner;
import java.time.LocalDate;
public class time{
public static void main(String[] args)
{
	Scanner input =new Scanner(System.in);
	 System.out.println("Enter date in yyyy-mm-dd format");
	 String GivenDate=input.next();

	String[] dateParts=GivenDate.split("-");
	int y=Integer.parseInt(dateParts[0]);
	int m=Integer.parseInt(dateParts[1]);
	int d=Integer.parseInt(dateParts[2]);

	int olddate=(y-1)*365+(m-1)*30+d;
	LocalDate now=LocalDate.now();

	int yy=now.getYear();
	int mm=now.getMonthValue();
	int dd=now.getDayOfMonth();

	int todaydate=(yy-1)*365+(mm-1)*30+dd;
	int day=todaydate-olddate;
	System.out.println("day="+day);

	if(day==0){
	System.out.println("Today");
	}
	else if(day==1){
	System.out.println("Yesterday");
	}
	else if(day==2){
	System.out.println("2 days ago");
	}
	else if(day==3){
	System.out.println("3 days ago");
	}
	else if(day==4){
	System.out.println("4 days ago");
	}
	else if(day==5){
	System.out.println("5 days ago");
	}
	else if(day==6){
	System.out.println("6 days ago");
	}
	else if(day==7){
	System.out.println("A week ago");
	}
	
	else if(day>7 && day<=32)
	{
	System.out.println("A month ago");
	}
}
}