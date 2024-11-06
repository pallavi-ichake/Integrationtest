package com.Docker.integration;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DockerWithFirefox {

	@Test
	public void testFirefox() throws MalformedURLException
	{
		DesiredCapabilities cap=DesiredCapabilities.firefox();

		URL url=new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(url,cap);
	
		driver.get("https://hub.docker.com/r/selenium/standalone-chrome");
		System.out.println("Title of the Home Firefox page:"+driver.getTitle());
		
		driver.quit();
	}
	
}
