package javaPractice;

public class WordCount {

	public static void main(String[] args) {
  
		String s="  	hello   this is india	";
		String s1=s.trim();
		int len=s1.length();
		System.out.println(len);
		int count=1;
		for(int i=0;i<len-1;i++)
		{
			if(s1.charAt(i)==' ' && s1.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
