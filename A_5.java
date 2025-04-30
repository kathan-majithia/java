class A_5{
	public static void main(String... args){
		int data[] = {1,3,5,6,8};

		int nd[] = new int[data.length];

		System.out.print("\narray : ");
		for(int i=0;i<data.length-1;i++)
			nd[i] = data[i];

		for(int d:nd)
			System.out.print(" "+d);
}
}