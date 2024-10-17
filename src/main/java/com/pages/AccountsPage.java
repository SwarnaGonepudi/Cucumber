package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class AccountsPage {
	
	
	
	private WebDriver driver;
	
	private By accountSections = By.xpath("//div[@id = 'content']/ul[1]/li/a");
	
	public AccountsPage(WebDriver driver)

	{
		this.driver = driver;
	}
	
	public String getAccountsPageTitle()
	{
		return driver.getTitle();
	}
	public int getAccountsSectionCount()
	{
		return driver.findElements(accountSections).size();
	}
	
	public List<String> getAccountsSectionList()
	{
		List<String> accountsListText = new ArrayList<>();
		List<WebElement> accountsList = driver.findElements(accountSections);
		for(WebElement e : accountsList)
		{
			String text = e.getText();
			System.out.println(text);
			accountsListText.add(text);
		}
		return accountsListText;
	}
	
	
}
