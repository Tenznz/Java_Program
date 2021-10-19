import java.lang.Math; 
public class RandomDigitMinMax{
public static void main(String[] args){
	int low=100;
	int high=999;
	int min,max;
	int Random1=(int)(Math.random()*(high-low+1)+low);
	int Random2=(int)(Math.random()*(high-low+1)+low);
	int Random3=(int)(Math.random()*(high-low+1)+low);
        System.out.println(Random1+" "+Random2+" "+Random3);
        
	if (Random1>Random2&&Random1>Random3){
		max=Random1;

		if(Random2>Random3){
		min=Random3;
		}
		else
		min=Random2;
	}
	else if (Random2>Random3){
		max=Random2;
		if (Random1>Random3)
		min=Random3;
		else
		min=Random1;
		}
	else{
		max=Random3;
		if(Random1>Random2)
		min=Random2;
		else
		min=Random1;
		}
	System.out.println(max+" is the maximum number");
	System.out.println(min+" is the minimum number");
	}
}
