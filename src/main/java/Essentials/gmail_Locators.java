package Essentials;

import org.openqa.selenium.By;

public class gmail_Locators {

    public static By emailInput = By.cssSelector("input[type='email']");
    public static By nextBtn = By.id("identifierNext");
    public static By passwordInput = By.cssSelector("input[type='password']");
    public static By passNextBtn = By.id("passwordNext");
    public static By composeBtn = By.cssSelector("div[gh='cm']");
    public static By sendBtnDiv = By.cssSelector("div[class='dC']");
    public static By sendBtn = By.id(":af");
    public static By recepientsInp = By.cssSelector("div[class='oL aDm']");
    public static By subjectInp = By.name("subjectbox");
    public static By msgBodyInp = By.cssSelector("div[aria-label='Message Body']");
    public static By notificationText = By.cssSelector("span[class='bAq']");
    public static By sentBox = By.linkText("Sent");
    public static By UsrAccImg = By.cssSelector("img[class='gb_Da gbii']");
    public static By signOutBtn = By.linkText("Sign out");
    public static By userAnotherAcc = By.cssSelector("div[class='BHzsHc']");
    public static By logInWithGoogle = By.cssSelector("button[data-provider='google']");
    public static By logInSO = By.linkText("Log in");
    public static By searchSO = By.cssSelector("input[aria-controls='top-search']");

}
