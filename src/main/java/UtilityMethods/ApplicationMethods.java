package UtilityMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.HomePage;
import PageObjects.MyCartpage;
import PageObjects.ProductListingPage;

public class ApplicationMethods {
	
	public static WebDriver driver ;
	HomePage PageHome = new HomePage();
	ProductListingPage ProdPage = new ProductListingPage();
	MyCartpage CartPage = new MyCartpage();
	Report Reporter = new Report();
	
	
	String sURL = "https://www-dev.endclothing.com/";
	
	public void appLaunch() {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.navigate().to(sURL);
	}
	
	public void CloseApplication() throws Throwable {
		Reporter.LogStepInfo("Closing the application");
		driver.close();
		driver.quit();

	}

	
	public void ClickClothings() throws Exception {
		
		Thread.sleep(5000); //Need this wait to load the page completely
		
		WebElement Clothings = ApplicationMethods.driver.findElement(By.xpath(PageHome.sClothings));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", Clothings);
	
	}
	
	public void SelectShirts() {
		
		WebElement Shirts = driver.findElement(By.xpath(PageHome.sShirts));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", Shirts);
		
//		driver.findElement(By.xpath(sShirts)).click();
		
	}
	
	public void SelectBlack() {
		WebElement Shirts = driver.findElement(By.xpath(PageHome.sBlack));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", Shirts);
		//driver.findElement(By.xpath(sBlack)).click();
		
	}
	
	public int GetProductsCount() throws Exception {
		Thread.sleep(5000);   //Need this wait time to completely load the products based on the filter
		String count = driver.findElement(By.xpath(ProdPage.ProductsCnt)).getText();
		int i=Integer.parseInt(count);  
		return i;
	}
	
	
	public boolean CheckProductsColor() throws Exception {
		boolean bflag = true;

		String ColourText;
		List<WebElement> PrdClours = driver.findElements(By.xpath(ProdPage.ProductsColor));
		for(int i=0; i>=10;i++) {
			ColourText = PrdClours.get(i).getText();
			if(ColourText.contains("Black")) {
				System.out.println("yes - " + ColourText);
				Reporter.LogStepInfo(ColourText + " Filter is displaying");
			}else {
				Reporter.LogStepFail("No - " + ColourText);
				bflag=false;
				break;
			}
			
		}
		return bflag;

	}

	public void Validatefilters() throws Exception {
		String ColourText;
		List<WebElement> PrdFilters = driver.findElements(By.xpath(ProdPage.sFilters));
		if(PrdFilters.size()==3) {
			Reporter.LogStepPass("Two filters are displaying correctly");
		}
			
		for(int i=1; i>=PrdFilters.size();i++) {
			ColourText = PrdFilters.get(i).getText();
			Reporter.LogStepPass(ColourText + " Filter is displaying");			
		}

	}
	
	
	public void ClickSearchButton() throws Exception {
		WebElement Search = driver.findElement(By.xpath(PageHome.sSearchButton));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", Search);
	}
	

	public void EnterSearchInput(String sInput) throws Exception {
		WebElement Search = driver.findElement(By.xpath(PageHome.sSearchInput));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", Search);
		Search.sendKeys(sInput);
	}

	public void ClickViewAll() throws Exception {
		Thread.sleep(5000);  //Need this wait to completely load the search results
		WebElement Viewall = driver.findElement(By.xpath(PageHome.sViewall));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", Viewall);
		
	}
	
	
	
	public void ClickFirstproduct() throws Exception {
		Thread.sleep(5000);  //Need this wait to completely display the first product
		WebElement FirstProduct = driver.findElement(By.xpath(ProdPage.sFirstProduct));		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", FirstProduct);
	
	}
	
	
	public void ClickSmallSize() throws Exception {
		
		WebElement SmallSize = driver.findElement(By.xpath(ProdPage.sSmallSize));		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", SmallSize);
		
	}

	public void ClickLargeSize() throws Exception {

		WebElement LargeSize = driver.findElement(By.xpath(ProdPage.sLargeSize));		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", LargeSize);

	}

	
	
	public void ClickAddtoCart() throws Exception {
		
		WebElement AddToCart = driver.findElement(By.xpath(ProdPage.sAddtoCart));		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", AddToCart);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CartPage.sCheckOutButton)));
		

		
	}
	
	public void BackToProductPage() throws Exception {
		
		WebElement Logo = driver.findElement(By.xpath(PageHome.sLogo));		
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", Logo);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(CartPage.sCheckOutButton)));
		
	}
	

	
	
	
	public int NoOfProductsInCart() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CartPage.sCheckOutButton)));
		
		List<WebElement> Cartproducts = driver.findElements(By.xpath(CartPage.sSizes));		

		return Cartproducts.size();
		
	}
	
	public boolean ValidateproductOne() throws Exception {
		boolean b=false;
		WebElement ProductOne = driver.findElement(By.xpath(CartPage.sSizesOne));
		if(ProductOne.getText().equals("Small")) {
			b=true;
		}
		return b;
	}
	public boolean ValidateproductTwo() throws Exception {
		boolean b=false;
		WebElement ProductTwo = driver.findElement(By.xpath(CartPage.sSizesTwo));
		if(ProductTwo.getText().equals("X-Large")) {
			b=true;
		}
		return b;
	}
	
	public int GetsumofTwoProducts() throws Exception {
		int total;
		String priceOne = driver.findElement(By.xpath(CartPage.sPricesOne)).getText();
		priceOne=priceOne.substring(1).trim();
		priceOne = priceOne.replace(priceOne.substring(2), "");
		String priceTwo = driver.findElement(By.xpath(CartPage.sPricesTwo)).getText();
		priceTwo=priceTwo.substring(1).trim();
		priceTwo = priceTwo.replace(priceTwo.substring(2), "");
		System.out.println( "--"+priceOne+"--"+priceTwo+"--");
		total = Integer.parseInt(priceOne)+Integer.parseInt(priceTwo);
		return total;

	}

	
	public int GetTotalCartValue() throws Exception {
		Thread.sleep(5000);

		String totalPrice = driver.findElement(By.xpath(CartPage.sTotal)).getText();
		totalPrice=totalPrice.substring(1).trim();
		totalPrice = totalPrice.replace(totalPrice.substring(3), "");
		System.out.println( "--"+totalPrice+"--");
		
		return Integer.parseInt(totalPrice.trim());

	}
	

	
	
	
	

}
