//import java.concurrent.Matrix; 

public class MaxValueThread implements Runnable {
	private int[][] matrix; 
	
	public MaxValueThread(int[][] matrix) {
		this.matrix = matrix;
	}
	
	@Override
	public void run() {
		int maxValue = Matrix.Max(matrix); 
		System.out.printf("Max value: %d\n", maxValue);
	}
} 
