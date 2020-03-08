package fifth;
import java.util.*;

public class Cleancode {

	static Scanner scan=new Scanner(System.in);
	public static int area(String standardmaterial,int areaofthesite,String automatedornot)
	{
		
		int rate=-1;
		if(standardmaterial.equals("standard materials"))
		{
			if(!automatedornot.equals("fully automated"))
				rate=1200;
			else
			{
				//System.out.println("wrong input");
				rate=0;
			}
		}
		else if(standardmaterial.equals("above standard"))
		{
			if(!automatedornot.equals("fully automated"))
				rate=1500;
			else
			{
				rate=0;
			}
		}
		else if(standardmaterial.equals("high standard"))
		{
			if(automatedornot.equals("fully automated"))
				rate=2500;
			else
				rate=1800;
		}	
		int totalarea=rate*areaofthesite;
		return(totalarea);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=-1;
		//System.out.println("enter automation");
		String automatedornot=scan.nextLine();
		//System.out.println("enter standard");
		String standardmaterial=scan.nextLine();
		//System.out.println("enter area");
		int areaofthesite=scan.nextInt();
		result=area(standardmaterial,areaofthesite,automatedornot);
		if(result==0)
			System.out.println("wrong input");
		else
			System.out.println(result);
	}

}
