package javacode;

public class StringManipulationConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Java and Selenium are good to work and effective for Web Application";

		System.out.println(s.charAt(6));
		System.out.println(s.indexOf("r"));
		System.out.println(s.indexOf("n"));
		System.out.println(s.indexOf("n", s.indexOf("n") + 1));
		System.out.println(s.indexOf("n", s.indexOf("n") + 1) + 1);
		System.out.println((s.indexOf("n", s.indexOf("n") + 1) + 1) + 1);
		System.out.println((s.indexOf("n", (s.indexOf("n", s.indexOf("n") + 1) + 1) + 1) + 1));
		System.out.println(s.indexOf("and"));
		System.out.println(s.indexOf("Cristo"));
		System.out.println(s.substring(0, 15));

		String t = "      trime   ";
		System.out.println(t);
		System.out.println(t.trim());
		
		String d="Hello_How_are_you_?";
		String d1[]=d.split("_");
		System.out.println(d);
		for(int i=0;i<d1.length;i++){
			System.out.println(d1[i]);
		}
		
	}

}
