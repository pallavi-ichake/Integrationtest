package com.Docker.integration;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DockerWithChrome {

	
    @Test
	public void testChrome() throws MalformedURLException
	{
	
		DesiredCapabilities cap=DesiredCapabilities.chrome();
	
		URL url=new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(url,cap);
	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Title of the Home chrome page:"+driver.getTitle());
		
		driver.quit();
	}
	
}
