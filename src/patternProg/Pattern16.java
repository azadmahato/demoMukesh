package patternProg;

public class Pattern16 {

	public static void main(String[] args) {
 
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++)
			{
				if(k>1 && k<(i*2)-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	}

}
