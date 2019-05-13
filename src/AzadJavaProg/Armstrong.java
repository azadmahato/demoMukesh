package AzadJavaProg;



public class Armstrong {

	public static void main(String[] args) {
        
        int number=0;
		int num=153;
		int temp;
		while(num!=0)
		{
		
			temp=num%10;
			number=number+(temp*temp*temp);
			num=num/10;
			
			
		}
		System.out.println(number);
		
	}

}
