package Automation.GmailComposeFunction;

import Essentials.Gmail_Utills;
import Essentials.gmail_Locators;

public class LoginToGMail extends Gmail_Utills {

    public void Login(String email, String password) throws InterruptedException {

	DynamicWait(gmail_Locators.nextBtn);

	driver.findElement(gmail_Locators.emailInput).sendKeys(email);

	driver.findElement(gmail_Locators.nextBtn).click();

	DynamicWait(gmail_Locators.passwordInput);

	driver.findElement(gmail_Locators.emailInput).sendKeys(email);

	driver.findElement(gmail_Locators.passNextBtn).click();

	DynamicWait(gmail_Locators.composeBtn);

    }

    public void Logout() throws InterruptedException {
	driver.findElement(gmail_Locators.UsrAccImg).click();
	DynamicWait(gmail_Locators.signOutBtn);
	driver.findElement(gmail_Locators.signOutBtn).click();
	DynamicWait(gmail_Locators.userAnotherAcc);
	driver.findElement(gmail_Locators.userAnotherAcc).click();
	DynamicWait(gmail_Locators.nextBtn);
    }

}
