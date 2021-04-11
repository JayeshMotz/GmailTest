package Automation.GmailComposeFunction;

import Essentials.ConfigFile;
import Essentials.Gmail_Utills;
import Essentials.gmail_Locators;

public class SendEmail extends Gmail_Utills {

    public void sendMessages(String to, String subLine, String emailBody) throws InterruptedException {

	driver.findElement(gmail_Locators.composeBtn).click();
	DynamicWait(gmail_Locators.sendBtnDiv);

	driver.findElement(gmail_Locators.recepientsInp).sendKeys(to);
	driver.findElement(gmail_Locators.subjectInp).sendKeys(subLine);
	driver.findElement(gmail_Locators.msgBodyInp).sendKeys(emailBody);

	driver.findElement(gmail_Locators.sendBtnDiv).findElement(gmail_Locators.sendBtn).click();
	Thread.sleep(ConfigFile.Medium_Wait);
    }

}
