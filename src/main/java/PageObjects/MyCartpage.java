package PageObjects;

public class MyCartpage {
	

	public String sCheckOutButton = "//a[@data-test='CartTotal__CheckoutButton']";
	public String sSizes = "//span[@data-test='CartItem__Size']";
	public String sSizesOne = "(//span[@data-test='CartItem__Size'])[1]";
	public String sSizesTwo = "(//span[@data-test='CartItem__Size'])[2]";
	public String sPricesOne = "(//span[@data-test='CartItem__Price'])[1]";
	public String sPricesTwo = "(//span[@data-test='CartItem__Price'])[2]";
	public String sTotal = "//span[@data-testid='CartQuantityCounty__CartCount__Total']";

}
