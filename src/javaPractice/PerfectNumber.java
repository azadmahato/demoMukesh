package javaPractice;

import java.util.Scanner;

public class PerfectNumber {
	
	public static boolean isPerfrct(int n)
	{
		int i=1;
		int sum=0;
		while(i<=n/2){
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
			
		}
		return sum==n;
			
	
	}

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int num=sc.nextInt();
      boolean b=isPerfrct(num);
      if(b)
      {
    	  System.out.println("perfect");
      }
      else
      {
    	  System.out.println("not perfect");
      }
      sc.close();
	}

}
