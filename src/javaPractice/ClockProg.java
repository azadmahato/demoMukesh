package javaPractice;

import java.util.Scanner;

public class ClockProg {

	public static void main(String[] args) {
        
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the hr angle:--");
		int hr=sc.nextInt();
		System.out.println("enter the min angle:--");
		int min=sc.nextInt();
		double mAngle=min*6;
		double hAngle=hr*30+min*0.5;
		double angle=0.0;
		if(hAngle>mAngle)
		{
			angle=hAngle-mAngle;
		}
		else
		{
			angle=mAngle-hAngle;
		}
		
		if(angle>180)
		{
			angle=360-angle;
			System.out.println(angle);
		}
		sc.close();
	

	}
}
