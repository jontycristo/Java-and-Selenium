package javacode;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a= "Cristo Jonty";
		
		int n = a.length();
		
		try {
			for (int i=0 ; i<n;i=i+2){
				
				char[] b = a.toCharArray();
				
				System.out.print(b[i]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		
		String[] s={"A","5","B","6","6","A","7","3"};
		
		
		
		for(int i=0;i<=s.length;i++){
			boolean b = s.toString().
		}

	}

}
