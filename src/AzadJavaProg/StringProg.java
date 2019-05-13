package AzadJavaProg;

public class StringProg {

	public static void main(String[] args) {
    
		String str="  hi this 	is	 me   	";
		String str1=str.replace(" ", ",").replace("\t",",");
		System.out.println(str1);
		
	}	

}
