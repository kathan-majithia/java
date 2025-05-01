import java.util.Scanner;

class Matrix{
	int row,column;
	float mat[][];

	Matrix(){
		row = 3;
		column = 3;
		mat = new float[row][column];
	}
	Matrix(float a[][]){
		row = a.length;
		column = a[0].length;
		mat = new float[row][column];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++)
				mat[i][j] = a[i][j];
		}
	}
	Matrix(int r,int c){
		row = r;
		column = c;
		mat = new float[row][column];
	}
	void readMatrix(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter elements of the matrix : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++)
				mat[i][j] = sc.nextFloat();
		}
	}
	float[][] transpose(){
		float tr[][] = new float[row][column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++)
				tr[i][j] = mat[j][i];
		}
		return tr;
	}
	float[][] matrixMultiplication(Matrix second){
		float mm[][] = new float[row][second.column];
		for(int i=0;i<row;i++){
			for(int j=0;j<second.column;j++){
				mm[i][j] = 0;
				for(int k=0;k<column;k++)
					mm[i][j] += mat[i][k] * second.mat[k][j];
			}
		}
		return mm;
	}
	void displayMatrix(float[][] a){
		System.out.println("Matrix : ");
		for(float r[]: a){
			for(float c: r)
				System.out.print(c+" ");
			System.out.print("\n");
		}
	}
	void displayMatrix(){
		System.out.println("Matrix : ");
		for(float r[]: mat){
			for(float c: r)
				System.out.print(c+" ");
			System.out.print("\n");
		}
	}
	float maximum_of_array(){
		float max = mat[0][0];
		for(float r[]: mat){
			for(float c: r)
				max = (c > max)?c:max;
		}	
		return max;
	}
	float average_of_array(){
		float av = 0;
		for(float r[]: mat){
			for(float c: r)
				av += c;
		}
		return (av / (row * column));
	}
	public static void main(String... args){
		Matrix mt1 = new Matrix(); // default size 3x3
		Matrix mt2 = new Matrix(2,4);
		float ar[][] = {{1,2,3},{4,5,6},{7,8,9}};
		Matrix mt3 = new Matrix(ar);

		System.out.print("\nDefault ");
		mt3.displayMatrix();

		mt1.readMatrix();


		float tr[][] = mt1.transpose();		
		System.out.print("\nTranspose ");
		mt1.displayMatrix(tr);

		float mm[][] = mt1.matrixMultiplication(mt3);
		System.out.print("\nMultiplied ");
		mt3.displayMatrix(mm);

		System.out.print("\nMaximum element : " + mt1.maximum_of_array());
		System.out.print("\nAverage element : " + mt1.average_of_array());
	}
}