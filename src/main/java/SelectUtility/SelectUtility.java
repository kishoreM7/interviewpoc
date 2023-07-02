package SelectUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtility {

	public void selectByName(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByVisibleText(value);
	}

}
