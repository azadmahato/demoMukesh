package javaPractice;

public class CountVowCoso {

	public static void main(String[] args) {
    
		String s="This is my India 2019";
		int length=s.length();
		int vow=0,con=0,num=0,spaces=0;
		for(int i=0;i<length;i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'
			||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||
			s.charAt(i)=='O'||s.charAt(i)=='U'){
				vow++;
			}
			else if(Character.isWhitespace(s.charAt(i)))
			{
				spaces++;
			}
			else if(Character.isDigit(s.charAt(i)))
			{
				num++;
			}
			else
			{
				con++;
			}
		}
		System.out.println("You entered "+length+" charecter");
		System.out.println("vowel ="+vow);
		System.out.println("consonent ="+con);
		System.out.println("number ="+num);
		System.out.println("spaces ="+spaces);
		
	}

}
