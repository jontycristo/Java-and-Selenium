
public class JavaSwitchCase {

	public static void main(String[] args) {
		String browserName="FireFox";
		
		switch (browserName) {
		case "Chrome":
			
			System.out.println("Open Chrome");
			
			break;
			
		case "FireFox":
			
			System.out.println("Open FireFox");
			
			break;
			
		case "IE":
			System.out.println("Open IE");

		default:
		System.out.println("Selenium does not support other browser");
			break;
		}

	}

}
