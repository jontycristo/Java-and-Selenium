package javacode;

public class Prac1_SumOf10DisplayFalse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		String a="55387974564845";
		
		int n = a.length();
		
		System.out.println("String Length: "+n);
		
		char[] chars = a.toCharArray();
		
		//System.out.println("Char Vales: "+chars[0]);
		
		
			for(int i=0; i<=a.length();i++){
				
				System.out.println("Char of I: " +chars[i]);
				
				for(int j=i+1; j>=i;j++){
					
					System.out.println("Char of J: " +chars[j]);
					
					if(chars[i]+chars[j]==10)
					{
						System.out.println("True");
					}
					else
					{
						System.out.println("False");
					}
				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println("Exception is: "+e);
			e.printStackTrace();
		}

	}

}