package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "CHROME DRIVER PATH");
		WebDriver driver = new ChromeDriver();

		String base_url = "http://localhost/part1/jenelleteaches-donutshop-qatesting-c3074dccd0fe/admin/";

		driver.get(base_url);

		Thread.sleep(1500);

		WebElement adminpage = driver.findElement(By.id("adminPageLink"));
		adminpage.click();
		Thread.sleep(1000);

		WebElement addproduct = driver.findElement(By.id("addProduct"));
		addproduct.click();
		Thread.sleep(1000);

		WebElement productname = driver.findElement(By.id("product_name"));
		productname.sendKeys("Boston cream");
		productname.click();
		Thread.sleep(1000);

		WebElement Description = driver.findElement(By.id("product_description"));
		Description.sendKeys("Silky vanilla custard donut");
		Description.click();
		Thread.sleep(1000);

		WebElement price = driver.findElement(By.id("product_price"));
		price.sendKeys("1.2");
		price.click();
		Thread.sleep(1000);

		WebElement AddProduct = driver.findElement(By.id("product_add"));
		AddProduct.click();
		Thread.sleep(1500);

		String base_url1 = "http://localhost/part1/jenelleteaches-donutshop-qatesting-c3074dccd0fe/admin/show-products.php";

		driver.get(base_url1);
		Thread.sleep(3000);

		String base_url2 = "http://localhost/Other/jenelleteaches-donutshop-qatesting-c3074dccd0fe/public/";

		driver.get(base_url2);
		Thread.sleep(1500);

		WebElement menu = driver.findElement(By.id("menu"));
		menu.click();
		Thread.sleep(2000);

		driver.close();

	}

}
	

