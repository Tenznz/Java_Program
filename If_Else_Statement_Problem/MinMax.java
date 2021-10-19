import java.util.Scanner;

public class MinMax {
    public static void main(String[] args){
        System.out.println("Enter three numbers and do the following arithmetic Operations");
        Scanner scanner=new Scanner(System.in);
        double min,max,a,b,c;
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        c=scanner.nextDouble();
        double res1=a+b*c;
        double res2=c+a/b;
        double res3=a%b+c;
        double res4=a*b+c;
//max 
       max=0;
        if (res1>res3&&res1>res2&&res1>res4){
            max=res1;
        }
        else if (res2>res3&&res2>res4){
            max=res2;
        }
        else if (res3>res4){
          max=res3;
        }
        else
           max=res4;
   //min
        if (res1<res3&&res1<res2&&res1<res4){
            min=res1;
        }
        else if (res2<res3&&res2<res4){
            min=res2;
        }
        else if (res3<res4){
            min=res3;
        }
        else
            min=res4;

        System.out.println("minimum value is "+min);

        System.out.println("maximum value is "+max);


    }
}
