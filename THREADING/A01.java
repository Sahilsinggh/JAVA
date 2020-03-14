import java.util.*;

class Myclass
{
	public static void main(String[] args)
	{
		int num[];
		num= new int[8];
		int sum=0;
		Scanner sc= new Scanner(System.in);

		for(int i=0;i<8;i++)
		{
			 num[i]= sc.nextInt();
			sum=sum+num[i];
		}
		System.out.println(sum);
	}
}