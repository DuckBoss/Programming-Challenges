
public class FibonacciNumbersSum {

	public static void main(String[] args) {
		
		if(args.length != 3) {
			System.out.println("This program requires 2 starting integers, and the max terms to count!");
			System.exit(0);
		}
		
		int start1 = Integer.parseInt(args[0]);
		int start2 = Integer.parseInt(args[1]);
		int maxCount = Integer.parseInt(args[2]);
		if(maxCount < 2)
			maxCount = 2;
		
		int[] fullList = new int[maxCount];
		int sum = 0;
		fullList[0] = start1;
		fullList[1] = start2;
		
		for(int i = 2; i < maxCount; i++)
			fullList[i] = fullList[i-1]+fullList[i-2];
		
		System.out.print("Result - {");
		for(int fib : fullList) {
			System.out.print(String.format(" %d", fib));
			sum += fib;
		}
		System.out.print(" }\n");
		
		System.out.println(String.format("Sum - %d", sum));
		
		System.out.println();
		
	}

}
