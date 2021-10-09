/* Q3 How to find repeated numbers in an array if it contains
multiple duplicates?*/

class Q3{
	public static void main (String args[]){
	int a1[]={1,2,3,1,4,2,6,5,6};
	for (int i=0;i<a1.length-1;i++)
	{
		for (int j=i+1;j<a1.length;j++)
		  {
			  if (a1[i]==a1[j])
				System.out.println(a1[j]);
			}
    }
  }
}	