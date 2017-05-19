using System;

namespace EvenFibonacciNumbers
{
	class MainClass
	{
		public static void Main(string[] args)
		{
			if (args.Length != 3)
			{
				Console.WriteLine("This program requires 2 starting integers, and the max terms to count!\n");
				Environment.Exit(0);
			}

			int start1 = Convert.ToInt32(args[0]);
			int start2 = Convert.ToInt32(args[1]);
			int maxCount = Convert.ToInt32(args[2]);
			if (maxCount < 2)
				maxCount = 2;

			int[] fullList = new int[maxCount];
			fullList[0] = start1;
			fullList[1] = start2;

			for (int i = 2; i < maxCount; i++)
				fullList[i] = fullList[i - 1] + fullList[i-2];


			Console.Write("Result - {");
			for (int i = 0; i < fullList.Length; i++)
			{
				if (fullList[i] % 2 == 0)
				{
					Console.Write($" {fullList[i]}");
				}
			}
			Console.Write(" }");

			Console.WriteLine();
			Console.ReadKey();
		}
	}
}
