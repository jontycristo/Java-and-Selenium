package javacode;

public class ReverseString {
	
	public static void main (String args[]){
	
		 String str = "Automation";

         StringBuilder str2 = new StringBuilder();

         str2.append(str);

         str2 = str2.reverse();     // used string builder to reverse

         System.out.println(str2);


		System.out.println("================================");
		
		String name="Cristo Jonty";
		
		char chars[] = name.toCharArray();
		
		int n = chars.length;
		
		System.out.println("Count of Array: "+n);
		
		
		for (int i = chars.length-1; i>=0;i--){
			System.out.print(chars[i]);
			
		}
			
			
		
         
         
		
	}

}
