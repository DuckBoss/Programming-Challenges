using System;

namespace SumOfSelfPowers
{
	class MainClass
	{
		public static void Main(string[] args)
		{
			if (args.Length < 1)
			{
				Console.WriteLine("This program requires 1 integer input");
				Environment.Exit(0);
			}

			long totalSum = 0;
			int inputtedNum = Convert.ToInt32(args[0]);
			for (int i = 1; i <= inputtedNum; i++)
			{
				long val = (long)Math.Pow(i, i);
				totalSum += val;
				Console.WriteLine(val);
			}
			Console.WriteLine("Total Sum - " + totalSum);

			Console.WriteLine();
			Console.ReadKey();
		}
	}
}
