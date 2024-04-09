/*Write a complete multi-threaded program to meet following 
requirements:
a. Read matrix [A] m x n
b. Create m number of threads
c. Each thread computes summation of elements of one row, i.e. 
ith row of the matrix is processed by ith thread. Where 0 <= 
i< m.
d. Print the results.*/
import java.util.*;
class Matrix extends Thread{
	int[] row;
	int sum;
	Matrix(int[] row){
	this.row = row;
	this.sum = 0;
	}
	public int getsum(){
		return sum;
	}
	public void run(){
		for(int i=0;i<row.length;i++){
			sum += row[i];
		}
	}
}
public class Lab_9_3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int m = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int n = sc.nextInt();
		int[][] matrix = new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print("Enter A["+i+"]["+j+"]: ");
				matrix[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		Matrix[] t = new Matrix[m];
		for(int i=0;i<m;i++){
			t[i] = new Matrix(matrix[i]);
			t[i].start();
		}
		try{
			for(int i=0;i<m;i++){
				t[i].join();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		for(int i=0;i<m;i++){
			System.out.println("Sum of Row"+i+" = "+t[i].getsum());
		}
	}
}