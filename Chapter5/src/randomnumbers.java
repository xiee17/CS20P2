
public class randomnumbers
{
	
	public static void main(String[] arges)
	{
		int randNum;
		int seqLength = 0;
		
		do
		{
			randNum = (int)(11*Math.random());
			
			System.out.println(randNum + "");
			
			seqLength = seqLength + 1;
			
		}while(randNum !=0);
		
		System.out.println("\n"
				            + "Length of sequence was"
				            + seqLength
				            );
	}

}
