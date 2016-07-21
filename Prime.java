import java.util.Scanner;
public class Prime {
	public static void main(String [] args){
		Scanner s=new Scanner(System.in); 
		int i,sum=0;
		System.out.println("Enter Start");
		int n=s.nextInt();
		System.out.println("Enter End");
		int e=s.nextInt();
		int count1=0;
		for(i=n;i<e;i++){
			int count=0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==0){
				count1++;
			System.out.print(" "+i+" ");
			}
		}
		System.out.println();
		System.out.println("prime Count is"+count1);
	}
}
	
