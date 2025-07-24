import java.util.*;
public class Main
{
 	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
 		int count=1;
        if(number1< number2)
	{
		System.out.println("Not possible");
	}
	else 
	{
		boolean flag=false;
		while(number1!=0 && number2!=0)
		{
			int temp=0;
			int temp2=number2%10;
			if(flag)
				temp1=number1%10-1;
			else 
				temp1=number1%10;
			if(temp1< temp2)
			{
				count++;
				flag=true;
			}
			else{
				flag=false;
				number1=number1/10;
				number2=number2/10;
			}
		}
		System.out.println(count);
	}
    }
}
