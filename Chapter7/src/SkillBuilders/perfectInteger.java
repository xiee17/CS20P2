package SkillBuilders;

public class perfectInteger {
		
		public static boolean isPerfect(int num)
		{
			int divisor = 0;
			int sum = 0;
			for(divisor = 1; divisor < num; divisor++)
			{
				if(isFactor(num,divisor))
				{
					sum = sum +divisor;
				}
			}
			if(sum == num)
			{
				return(true);
			}
			else
			{
				return(false);
			}
		}
		
		
		public static boolean isFactor(int dividend, int divisor) {
			if(dividend % divisor == 0)
			{
				return (true);
			}
			else
			{
				return(false);
			}
		}
		
		
		public static void main(String [] args) {
			for(int num = 1; num <= 100; num++)
			{
				if(isPerfect(num))
				{
					System.out.println(num);
				}
			}
		
		}

	}



