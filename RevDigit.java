import java.util.*;
public class Prob4 {
	public static void main(String []args){
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int s=0;
		int r;
		while(a>0){
			r=a%10;
			s=(s*10)+r;
			a=a/10;
		}
		System.out.println("Sum of the digits is"+s);
	}

}
