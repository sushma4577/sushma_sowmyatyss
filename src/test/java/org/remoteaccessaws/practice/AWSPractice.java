package org.remoteaccessaws.practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AWSPractice {

	public static void main(String[] args) throws MalformedURLException {
		// load the URL
		URL url = new URL("https://localhost:4444/wd/hub");
		
		//set desired capabilities
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		
		//load remote web driver
		RemoteWebDriver driver=new RemoteWebDriver(url,cap);
		
		//load the app
		driver.get("https://gmail.com");
		
		
		

	}

}
