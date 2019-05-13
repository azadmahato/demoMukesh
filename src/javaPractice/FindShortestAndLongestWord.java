package javaPractice;

public class FindShortestAndLongestWord {

	public static void main(String[] args) {
    
		String s="hi this is a java Programming";
		String[] s1=s.split(" ");
		String shortest=s1[0];
		String longest="";
		for(String s2:s1)
		{
			if(s2.length()<shortest.length())
			{
				shortest=s2;
			}
			else if(s2.length()>longest.length())
			{
				longest=s2;
			}
		}
		System.out.println("shortest= "+shortest);
		System.out.println("longest= "+longest);
	}

}
