import java.util.Scanner;

public class Main {
	
	
  public static void main(String[] args) {
	  // Enter the number of test cases
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter the test cases to complete");
	    int testCaseNum = myObj.nextInt();  // Read user input
	    if ((testCaseNum > 10) || (testCaseNum < 1)) {
	    	System.out.println("Please enter testCase Num between 1 and 10");
	    	return;
	    }
	    for (int i = 0; i < testCaseNum; i++) {
		    System.out.println("Please enter the number of rows of the MAZE like n*n & chase Units");
		    int N = myObj.nextInt();  // Read user input
		    if ((N > 100) || (N < 1)) {
		    	System.out.println("Please enter Maze Num between 1 and 100");
		    	return;
		    }
		    System.out.println("Entered N " + N);
		    
		    int numberOfUnits = myObj.nextInt();  // Read user input
		    if ((numberOfUnits > N) || (numberOfUnits < 1)) {
		    	System.out.println("Please enter units chase catch number less than Maze n*n");
		    	return;
		    }
		    System.out.println("Entered numberOfUnits " + numberOfUnits);

		    // Create that much dimensional array and store
		    System.out.println("Enter the Maze Data ");
	    	myObj.nextLine();  // Read user input
		    String mazeData[][] = new String[N][N];
		    for (int j = 0; j < N; j++) {
		    	String data = myObj.nextLine();  // Read user input
				mazeData[j] = data.split(" ");
		    }
		    System.out.println(mazeData.toString());
		    
		    
		    int numberOfCatches = 0;
		    // Now logic to go through which needs to be 3 conditions.
		    // do the loop of maze and if the content is red, jump for chase within the allotted d
		    for (int j = 0; j < N; j++) {
		    	for (int k = 0; k < N; k++) {
		    		System.out.println(mazeData[j][k]);
		    		if (mazeData[j][k].contentEquals("r")) {
		    			int p = k+1;
		    			int loopCt = p + numberOfUnits;
		    			if (loopCt > N)
		    				loopCt = N;
		    			while (p < loopCt) {
		    					if (mazeData[j][p].contentEquals("b")) {
		    						numberOfCatches++;
		    					}
		    					p++;
		    				}
		    		}
 		    	}
		    }
		    System.out.println(" number of Catches done " + numberOfCatches);
		    
	    }
	  
  }
}
