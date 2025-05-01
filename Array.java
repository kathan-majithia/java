import java.util.Scanner;

class Array{
	int data[];

	Array(){
		data = new int[10];
	}
	Array(int n){
		data = new int[n];
	}
	Array(int d[]){
		int n = d.length;
		data = new int[n];

		for(int i=0;i<n;i++)
			data[i] = d[i];
	}
	int size(){
		return data.length;
	}
	int Maximum_of_Array(){
		int m = data[0];
		for(int i=1;i<data.length;i++)
			m = (data[i] > m)?data[i]:m;

		return m;
	}
	int Average_of_Array(){
		int sum = 0;
		for(int d: data)
			sum += d;

		return sum / data.length;
	}
	void Reverse_an_array(){
		System.out.print("\nReversed array : ");
		for(int i=data.length-1;i>=0;i--)
			System.out.print(data[i] + " ");
	}
	void sorting(){
		for(int i=0;i<data.length;i++){
			int max = i;
			for(int j=i+1;j<data.length;j++)
				max = (data[j] < data[max])?j:max;
			int t = data[max];
			data[max] = data[i];
			data[i] = t;
		}
	}
	void display(){
		for(int d: data)
			System.out.print(d+ " ");
	}
	int search(int no){
		for(int i=0;i<data.length;i++){
			if(no == data[i])
				return i;
		}
		return -1;
	}

	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter custom size : ");
		int n = sc.nextInt();

		Array ar = new Array();
		Array ar2 = new Array(n);

		int da[] = {1,4,12,65,12,56,89};
		Array ar3 = new Array(da);

		System.out.print("\nSize of default array : " + ar.size());
		System.out.print("\nSize of custom array : " + ar2.size());

		System.out.print("\n\nArray elements : ");
		ar3.display();

		ar3.Reverse_an_array();

		System.out.print("\n\nAverage : " + ar3.Average_of_Array());
		System.out.print("\nMaximum : " + ar3.Maximum_of_Array());
		System.out.print("\n12 is located at " + ar3.search(12));
		System.out.print("\nSorted array : ");
		ar3.display();
	}
}