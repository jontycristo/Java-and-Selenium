package javacode;

public class Palindrom {

	public static void main(String[] args) {
		try {
			String a ="radar";
			System.out.println("Before Palindrome: "+a);
			
			String rev="";
			
			char[] b = a.toCharArray();
			int n = b.length;
			
			for(int i =b.length-1; i<=b.length; i-- ){
				
				rev = rev+b[i];
			
				
				if(a.equalsIgnoreCase(rev)){
					System.out.println("It is a Palindrome: "+rev);
				}
				
				else{
					System.out.println("It is not a Palindrome: "+rev);
				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
