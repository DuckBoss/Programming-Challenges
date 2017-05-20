
public class SubsetSum {

	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("This program requires atleast 1 integer input!\n");
			System.exit(0);
		}
		
		int[] inputtedData = new int[args.length];
		System.out.print("Given: {");
		for(int i = 0; i < args.length; i++) {
			inputtedData[i] = Integer.parseInt(args[i]);
			System.out.print(String.format(" %d", inputtedData[i]));
		}
		System.out.print(" }");
		System.out.println();
		
		boolean isFalse = true;
		int compareVal = Integer.MIN_VALUE;
		
		System.out.print("Two numbers in this array of integers equals to zero - ");
		if(inputtedData.length > 0)
			for(int g = 0; g < inputtedData.length; g++)
				if(isFalse)
					for(int i = 0; i < inputtedData.length; i++) {
						if(i == g)
							compareVal = inputtedData[g];
						
						if(compareVal == -inputtedData[i]) {
							System.out.print("TRUE\n");
							isFalse = false;
							break;
						}
					}
		
		if(isFalse)
			System.out.print("FALSE\n");
		
		
		System.out.println();
	}
	
}
