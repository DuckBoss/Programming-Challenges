using System;

namespace Subset_Sum
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
			for (int i = 0; i < args.Length; i++)
				inputtedData[i] = Convert.ToInt32(args[i]);

			bool isFalse = true;
			int compareVal = int.MinValue;

			if (inputtedData.Length > 0)
				for (int g = 0; g < inputtedData.Length; g++)
					if (isFalse)
						for (int i = 0; i < inputtedData.Length; i++)
						{
							if (i == g)
								compareVal = inputtedData[g];

							if (compareVal == -inputtedData[i])
							{
								Console.WriteLine("TRUE");
								isFalse = false;
								break;
							}
						}
			

			if (isFalse)
				Console.WriteLine("FALSE");




			Console.WriteLine("\n");
			Console.ReadKey();
		}
	}
}
