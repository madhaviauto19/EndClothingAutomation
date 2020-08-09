package PageObjects;

public class ProductListingPage {
	
	public String ProductsCnt = "//div[@data-testid='Product__Counter']/span";
	public String ProductsColor = "//span[@data-test='ProductCard__ProductColor']";
	public String sFilters = "//div[@class='filtered-by']/button";
	
	public String sFirstProduct = "(//a[@data-test='ProductCard__ProductCardSC'])[1]";
	public String sSmallSize = "//div[text()='Small']";
	public String sLargeSize = "//div[text()='X-Large']";
	public String sAddtoCart = "//button[@data-test='AddToCart__Button']";
	

}
