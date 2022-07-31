package patil.kite.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import patil.kite.util.Testutil;

public class Testbase {
public static Properties props;
public static WebDriver driver;
	
	
	public Testbase() throws IOException {
		props= new Properties();
		
		FileInputStream ip =new FileInputStream("C:\\Users\\Balaji\\.eclipse\\bandal\\src\\main\\java\\patil\\kite\\config\\config.properties");
		props.load(ip);
		
	}
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "c:\\testing\\notes\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Testutil.implicit_wait, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Testutil.pageload_wait, TimeUnit.SECONDS);
		driver.get(props.getProperty("url"));
		System.out.println("bbb");
		System.out.println("hello done");
		System.out.println("really");
		System.out.println("really2");
		
	}
}
