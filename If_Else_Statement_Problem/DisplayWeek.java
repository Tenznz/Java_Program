import java.util.Scanner;
//2) Read a Number and Display The Week day
public class DisplayWeek{
public static void main(String[] args){
	System.out.println("Enter Day 1-7");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	if(num==1)
		System.out.println("Monday");	
	else if(num==2)
		System.out.println("Tuesday");
	else if(num==3)
		System.out.println("Wednesday");
	else if(num==4)
		System.out.println("Thursday");
	else if(num==5)
		System.out.println("Friday");
	else if(num==6)
		System.out.println("Saturday");
	else if(num==7)
		System.out.println("Sunday");
	else 
		System.out.println("Enter valid Day Number");
	
	}
}
