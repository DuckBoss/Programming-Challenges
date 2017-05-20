using System;

namespace SubsetSum
{
	class MainClass
	{
		public static void Main(string[] args)
		{
			
			if (args.Length == 0)
			{
				Console.WriteLine("This program requires atleast 1 integer input!\n");
				Environment.Exit(0);
			}

			int[] inputtedData = new int[args.Length];
			Console.Write("Given: {");
			for (int i = 0; i < args.Length; i++)
			{
				inputtedData[i] = Convert.ToInt32(args[i]);
				Console.Write($" {inputtedData[i]}");
			}
			Console.Write(" }");
			Console.WriteLine();

			bool isFalse = true;
			int compareVal = int.MinValue;

			Console.Write("Two numbers in this array of integers equals to zero - ");
			if (inputtedData.Length > 0)
				for (int g = 0; g < inputtedData.Length; g++)
					if (isFalse)
						for (int i = 0; i < inputtedData.Length; i++)
						{
							if (i == g)
								compareVal = inputtedData[g];

							if (compareVal == -inputtedData[i])
							{
								Console.Write("TRUE\n");
								isFalse = false;
								break;
							}
						}
			

			if (isFalse)
				Console.Write("FALSE\n");




			Console.WriteLine();
			Console.ReadKey();
		}
	}
}
