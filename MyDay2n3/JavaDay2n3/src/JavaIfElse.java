
public class JavaIfElse {

	public static void main(String[] args) {
		int FirstNum=100;
		int SecondNum=10;
		int ThirdNum=50;
		
		if(FirstNum>SecondNum && FirstNum>ThirdNum)
		{
			System.out.println("First Number is Greater and the value is: "+FirstNum);
		}
		else if(SecondNum>FirstNum && SecondNum>ThirdNum)
		{
			System.out.println("Second Number is Greater and the value is: "+SecondNum);
		}
		else if(ThirdNum>FirstNum && ThirdNum>SecondNum)
		{
			System.out.println("Third Number is greater and the values is: "+ThirdNum);
		}
		else
		{
			System.out.println("All the Number is equal or Two number is greater");
		}
	}

}
