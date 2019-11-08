package TestReport;

import ChildOne.Iphone;
import Parent.Phone;

public class Report extends Phone {

	public static void main(String[] args) {
		Report obj = new Report();
		Iphone.call("Cristo Jonty", 26);
		Phone.Model="Inheritance";
		obj.call();

	}

}
