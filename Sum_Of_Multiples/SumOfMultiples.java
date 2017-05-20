import static java.lang.System.out;

public class SumOfMultiples {

	public static void main(String[] args) {
		if(args.length < 2) {
			out.println("This program requires 1 integer input and 1 multiple input!");
			out.println("NOTE: This program can handle multiple 'Multiple integer' inputs.");
			System.exit(0);
		}
		
		int givenNum = Integer.parseInt(args[0]);
		int[] givenMultiples = new int[args.length-1];
		for(int i = 0; i < args.length; i++) {
			if(i == 0)
				continue;
			givenMultiples[i-1] = Integer.parseInt(args[i]);
		}
		
		int totalSum = 0;
		for(int g = 0; g < givenMultiples.length; g++) {
			int sum = 0;
			for(int i = givenMultiples[g]; i < givenNum; i += givenMultiples[g]) {
				sum += i;
			}
			totalSum += sum;
		}
		
		out.println();
		out.print("Multiples of - ");
		for(int multiple : givenMultiples)
			out.print(" " + multiple);
		out.print(String.format(" under %d - \n", givenNum));
		out.println(String.format("Sum Of Multiples - %d", totalSum));
		
		out.println();
	}

}
