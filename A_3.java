class A_3{
	public static void main(String... args){
		int data[] = {3,5,4,2,1};


		for(int i=0;i<data.length;i++){
			int max = i;
			for(int j=i+1;j<data.length;j++)
				max = (data[j] < data[max])?j:max;

			int t = data[max];
			data[max] = data[i];
			data[i] = t;
		}


		System.out.print("\nSorted array : ");
		for(int i=0;i<data.length;i++)
			System.out.print(data[i] + " ");

}
}