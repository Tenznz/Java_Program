import java.lang.Math;
public class FlipCoin{
public static void main(String args[]){
	String res;
	int a=(int)((Math.random()*100)%2);
	if(a==1){
	res="HEAD";
	}
	else
	res="TAIL";

	System.out.println(res);
	}

}
