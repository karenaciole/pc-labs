//import java.concurrent.Matrix; 

public class MinValueThread implements Runnable {
	private int[][] matrix; 
	
	public MinValueThread(int[][] matrix) {
		this.matrix = matrix;
	}
	
	@Override
	public void run() {
		int minValue = Matrix.Min(matrix); 
		System.out.printf("Min value: %d\n", minValue);
	}
} 
