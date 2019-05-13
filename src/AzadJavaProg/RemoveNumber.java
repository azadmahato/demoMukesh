package AzadJavaProg;

public class RemoveNumber {

	public static void main(String[] args) {
   
		String s="he123ll0o w098rld";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(!(c>47 && c<58))
			{
				s1=s1+c;
			}
		}
		System.out.println(s1);
	}

}
