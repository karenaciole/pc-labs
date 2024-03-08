public class Find {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Use: java Main <size>");
            System.exit(1);
        }

        try {
            int size = Integer.parseInt(args[0]);

            int[][] matrix = Matrix.generateMatrix(size);
		
    	   Thread maxThread = new Thread(new MaxValueThread(matrix));
	   Thread minThread = new Thread(new MinValueThread(matrix));
	   
	   maxThread.start();
	   minThread.start(); 

           // System.out.printf("Max value: %d\n", Matrix.Max(matrix)); // 1T
           // System.out.printf("Min value: %d\n", Matrix.Min(matrix)); // 2T
            
        } catch (NumberFormatException e) {
            System.out.println("The size of the matrix must be an integer.");
            System.exit(1);
        }

        
    }
}
