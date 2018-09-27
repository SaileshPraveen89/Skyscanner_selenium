package pages;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}


	//locate elements
	@FindBy(id="fsc-trip-type-selector-one-way")
	WebElement onewayBtn;

	@FindBy(xpath="//*[@id=\"origin-fsc-search\"]")
	WebElement fromSourceSearch;

	@FindBy(id="react-autowhatever-origin-fsc-search")
	WebElement searchResultsSrc;

	@FindBy(id="react-autowhatever-origin-fsc-search--item-1")
	WebElement searchResultsrc1;

	@FindBy(id="react-autowhatever-destination-fsc-search")
	WebElement searchResultsDest;

	@FindBy(id="react-autowhatever-destination-fsc-search--item-1")
	WebElement searchResultDst1;

	@FindBy(xpath="//*[@id=\"destination-fsc-search\"]")
	WebElement toDestSearch;

	@FindBy(id="depart-fsc-datepicker-input")
	WebElement departDatepicker;

	@FindBy(id="return-fsc-datepicker-input")
	WebElement returnDatepicker;

	@FindBy(xpath="//*[@id=\"flights-search-controls-root\"]/div/div/form/div[3]/button")
	WebElement searchFlightsBtn;

	@FindBy(xpath = "//*[@id=\"depart-fsc-datepicker-input-popover\"]/div/div[2]/div/table")
	List <WebElement> dateTable;

	@FindBy(xpath="//*[@id=\"depart-fsc-datepicker-input-popover\"]/div/div[2]/div/table/tbody/tr[4]/td[5]/button")
	WebElement date;

	//searchflights method
	public void searchflights()
	{
		onewayBtn.click();
		fromSourceSearch.clear();
		fromSourceSearch.sendKeys("Cai");
		searchResultsrc1.click();
		toDestSearch.clear();
		toDestSearch.sendKeys("Vi");
		searchResultDst1.click();
		departDatepicker.click();
		date.isDisplayed();
		date.click();
		searchFlightsBtn.click();
	}
}
