import java.util.*;

class A_2{
	public static void main(String args[]){
		int n = 5;
		int ar[] = new int[n];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<n;i++){
			ar[i] = scan.nextInt();
		} 

		int sum = 0;
		for(int d: ar)
			sum += d;

		double av =  sum / n;

		System.out.print("Sum : "+sum+" and average : " + av);
}
}