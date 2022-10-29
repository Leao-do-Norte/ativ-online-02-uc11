package teste.senai;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteGameMania {
	private WebDriver driver;
	
	@Before
	public void ConfigurarTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void TesteNavegabilidade() {
		
		try {
			
			driver.get("http://localhost:4200/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"menu\"]/a[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"email-example\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"email-example\"]")).sendKeys("alpha@mail.com");
			Thread.sleep(3000);
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys("senhaalpha ");
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/app-root/app-login/main/div/div[1]/form/button")).sendKeys(Keys.ENTER);	
			Thread.sleep(3000);
			
		} catch (InterruptedException e){			
			e.printStackTrace();		
		}	
	}
	
	@After
	public void Fim() {
		driver.quit();
	}
}
