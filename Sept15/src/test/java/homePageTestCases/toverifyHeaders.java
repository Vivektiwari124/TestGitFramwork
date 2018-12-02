package homePageTestCases;

import org.testng.annotations.Test;

import com.Diaspark.app.basePackage;
import com.Diaspark.app.homePage;

public class toverifyHeaders extends basePackage {

	@Test
	public void toVerifyHeader() {
		homePage h= new homePage();
		h.toVerifyHeaderContent(driver);
	}
	
	
	
	
}
