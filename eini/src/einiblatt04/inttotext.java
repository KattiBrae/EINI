package einiblatt04;

public class inttotext { //if bedingungen statt switch
public static void main(String[] args)
	{
	int number=-12;
		if(number==0)
			{
			System.out.println("zero");
			}
		else if(number==1)
			{
			System.out.println("one");
			}
		else if(number==2)
			{
			System.out.println("two");
			}
		else if(number==3)
			{
			System.out.println("three");
			}
		else if(number==4)
			{
			System.out.println("four");
			}
		else if(number>4 && number<=7)
			{
			System.out.println("between five and seven");
			}
		else if(number>7)
			{
			System.out.println("greater seven");
			}
		else if(number<0)
			{
			System.out.println("ungültig");
			}
	}
}
