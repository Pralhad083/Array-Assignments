/* Q1 How to find the missing number in an integer array of 1 to 100? */

class Q1
{
	public static void main(String[] args)
	{
		int a[]=new int[101];
			a[0]=0;
			
		for(int i=1;i<100;i++)
		{
			a[i]=i;  
		}

		a[51]=0;   // Missing number

		for(int i=1;i<100;i++)
		{
			if(a[i]!=i)
				{
					System.out.println("Missing element is : "+i);
				}
		}
	}
}