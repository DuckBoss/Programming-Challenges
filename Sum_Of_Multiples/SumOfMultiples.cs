using System;

namespace SumOfMultiples
{
	class MainClass
	{
		public static void Main(string[] args)
		{
			
			if (args.Length < 2)
			{
				Console.WriteLine("This program requires 1 integer input and 1 multiple input!\n");
				Console.WriteLine("NOTE: This program can handle multiple 'Multiple integer' inputs...\n");
				Environment.Exit(0);
			}

			int givenNum = Convert.ToInt32(args[0]);
			int[] givenMultiples = new int[args.Length-1];
			for (int i = 0; i < args.Length; i++)
			{
				if (i == 0)
					continue;
				givenMultiples[i - 1] = Convert.ToInt32(args[i]);
			}


			int totalSum = 0;
			for (int g = 0; g < givenMultiples.Length; g++)
			{
				int sum = 0;
				for (int i = givenMultiples[g]; i < givenNum; i += givenMultiples[g])
				{
					sum += i;
				}
				totalSum += sum;
			}

			Console.WriteLine();
			Console.Write("Multiples Of - ");
			foreach (int multiple in givenMultiples)
			{
				Console.Write($"{multiple} ");
			}
			Console.Write($"under {givenNum} - \n");
			Console.WriteLine($"Sum Of Multiples - {totalSum}\n");




			Console.WriteLine();
			Console.ReadKey();
		}
	}
}
