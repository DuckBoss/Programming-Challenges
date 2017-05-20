
public class SelfPowers {

	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("This program requires 1 integer input!");
			System.exit(0);
		}
		
		long totalSum = 0; 
		int inputtedNum = Integer.parseInt(args[0]);
		for(int i = 1; i <= inputtedNum; i++) {	
			long val = (long) Math.pow(i, i);
			totalSum += val;
			System.out.println(val);
		}
		System.out.println("Total Sum - " + totalSum);
		
		
	}

}
