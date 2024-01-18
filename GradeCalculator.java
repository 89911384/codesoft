import java.util.Scanner;

class GradeCalculator
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	
	System.out.println("Enter marks obtained in each subject (out of 100) :\n");
	System.out.print("Maths:");
	float maths=sc.nextFloat();
	System.out.print("Biology:");
	float bio=sc.nextFloat();
	System.out.print("English:");
	float eng=sc.nextFloat();
	System.out.print("Physics:");
	float phy=sc.nextFloat();
	System.out.print("Chemistry:");
	float ch=sc.nextFloat();
	System.out.print("Physical Education:");
	float phy_edu=sc.nextFloat();
	System.out.print("Environmental Studies:");
	float evs=sc.nextFloat();
	System.out.print("Computer:");
	float comp=sc.nextFloat();


	float total_obtained= maths+bio+eng+phy+ch+phy_edu+evs+comp;
	float avg=total_obtained/8;
	

	System.out.println("Total Marks obtained : "+total_obtained+"/800");
	System.out.println("Average : "+avg);

	if(avg>90)
	{
		System.out.println("Pass!! A+ Grade ");
	}
	else if(avg>80 && avg<90)
	{
		System.out.println("Pass!! A Grade ");
	}
	else if(avg>70 && avg<80)
	{
		System.out.println("Pass!! B+ Grade ");
	}
	else if(avg>60 && avg<70)
	{
		System.out.println("Pass!! B Grade ");
	}
	else if(avg>50 && avg<60)
	{
		System.out.println("Pass!! C Grade ");
	}
	else if(avg>33 && avg<50)
	{
		System.out.println("Pass!! D Grade ");
	}
	else
	{
		System.out.println("Fail ");
	}


	}
}