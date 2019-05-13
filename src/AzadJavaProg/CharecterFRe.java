package AzadJavaProg;

public class CharecterFRe {

	public static void main(String[] args) {
   
		String s="hello worldllwho";
		String s1=s.replace(" ","").replace("\t","");
		char[] c=s1.toCharArray();
		int sz=c.length;
		for(int i=0;i<sz;i++)
		{
			int count=0;
			for(int j=0;j<sz;j++)
			{
				if(j<i && c[i]==c[j])
				{
					break;
				}
				if(c[j]==c[i])
				{
					count++;
				}
				if(j==sz-1)
				{
					System.out.println("the charecter of "+c[i]+" is present "+count+" times");
				}
			}
		}
	}

}
