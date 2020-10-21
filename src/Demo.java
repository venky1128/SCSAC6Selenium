//WAP to disply Even separated Digits in give numbers

class  LOP1
{
	public static void main(String[] args) 
	{
		int num=123456;
		while (num>0)
		{

			System.out.println(num%10); //4
			num=num/10;
		}
	}
}
