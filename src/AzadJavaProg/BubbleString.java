package AzadJavaProg;

public class BubbleString {

	public static void main(String[] args) {
   
		String[] a={"vikky","uttam","manish","rakesh","azad","rishi"};
		String temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
				
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
		
	}

}
