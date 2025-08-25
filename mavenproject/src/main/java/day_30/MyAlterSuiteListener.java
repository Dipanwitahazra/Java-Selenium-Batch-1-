package day_30;
import java.util.ArrayList;
import java.util.List;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;


import org.testng.IAlterSuiteListener;

public class MyAlterSuiteListener  implements IAlterSuiteListener{
	
	@Override
	public void alter(List<XmlSuite> suites)
	{
		System.out.println("Inside alter()-modifying suite programmatically");
		XmlSuite suite = suites.get(0);
		XmlTest test = new XmlTest(suite);
		test.setName("DynamicTest");
		
		List<XmlClass> classes= new ArrayList<>();
		classes.add(new XmlClass("day_30.TestClassOne"));
	    //classes.add(new XmlClass("day_30.TestClassTwo"));
		
		test.setXmlClasses(classes);
		
		
		
	

}

	
		// TODO Auto-generated method stub
		
	}

