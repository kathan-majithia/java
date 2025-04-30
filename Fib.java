class Fib{
	public static void main(String... args){
		int n = Integer.parseInt(args[0]);
		int a = 0,b = 1;
		
		if (n < 0){
			System.out.print("NOT POSSIBLE");
			return;
		}

		System.out.print("Fibonacci : "+a+" "+b);
		for(int i = 2;i<=n;i++){
			int c = a + b;
			a = b;
			b = c;
			System.out.print(" "+b);
		}

	}
}