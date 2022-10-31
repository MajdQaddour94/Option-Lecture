package myfirstwebsite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Option_Lecture {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUSEB\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1:5500/index.html");
		
		String testWebsite = driver.getTitle();
		
		System.out.println(testWebsite);
		
		List <WebElement> myListOfOptions = driver.findElements(By.tagName("option"));
		
		for(int i=0 ;i<myListOfOptions.size();i++) {
			
		System.out.println(myListOfOptions.get(i).getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
				
				
		
		
		
		
		
		
		

	}

}
