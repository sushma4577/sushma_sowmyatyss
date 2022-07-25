package org.mavenexample.practice;

import org.testng.annotations.Test;

public class Practice1Test {
	
@Test
public void practice1Test() {
	String Url = System.getProperty("Url");
	String browser = System.getProperty("Browser");
//String URL = System.getProperty("url");
String USERNAME = System.getProperty("username");
String PASSWORD = System.getProperty("password");
System.out.println("url from jenkin"+Url);
System.out.println("browser from jenkin"+browser);

System.out.println("username"+USERNAME);
System.out.println("password"+PASSWORD);
System.out.println("Test1===>class1 hi buddy");

//hi hello
//how are u

}


@Test 
public void practice2Test() {
	System.out.println("Test1===>class1");
}

@Test
public void practice3Test() {
	System.out.println("Test1===>class1");
	System.out.println("Test2===>class1");
}
}
