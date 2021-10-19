
import java.util.Scanner;
//3) Read a Number 1,10,100,1000 and display unit, tem hundred

public class Digit{

public static void main (String args[]){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if(a<10){
		System.out.println("Unit Digit");
	}
	else if(a<100){
		System.out.println("Ten Digit");
	}
	else if(a<1000){
		System.out.println("Hundred Digit");
	}
	else if(a<10000){
		System.out.println("Thousand digit");
	}
	else 
		System.out.println("Enter valid number");

	
	}


}
