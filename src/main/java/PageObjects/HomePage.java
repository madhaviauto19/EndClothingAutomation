package PageObjects;


public class HomePage{
	
	public String sClothings = "//div[@id='navigation']/span[3]/a";

	public String sShirts = "//span[text()='Shirts']";
	public String sBlack = "//div[@data-testid = 'colour_FilterItem']/span[text()='Black']";
	
	public String sSearchButton = "//button[@data-testid='Autosuggest__Button']";
	public String sSearchInput = "//input[@data-testid='Autosuggest__Input']";
	public String sViewall = "//a[contains(text(),'View all ')]";
	public String sLogo = "(//a[@data-test='Logo__Anchor'])[1]";

}
