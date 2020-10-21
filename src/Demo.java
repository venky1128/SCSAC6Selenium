//WAP to disply Even separated Digits in give numbers

class  LOP1
{
	public static void main(String[] args) 
	{
		int num=1213415215455;
		while (num>0)
		{

			System.out.println(num%10); //4
			num=num/10;
		}
		System.out.println("hi");
	}
}
