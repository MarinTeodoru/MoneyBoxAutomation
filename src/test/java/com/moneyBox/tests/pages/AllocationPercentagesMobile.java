package com.moneyBox.tests.pages;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;


//Here i keep all my locators for "Allocation Percentages"
public class AllocationPercentagesMobile {

@FindBy(id = "allocationtypeCaution")
    public MobileElement cautiousButton;

@FindBy(id = "allocationtypeBalanced")
    public MobileElement balancedButton;

@FindBy(id = "allocationtypeAdventurous")
    public MobileElement adventurousButton;

@FindBy(id = "allocationpercentage1")
    public MobileElement getPercent30;

@FindBy(id = "allocationpercentage2")
    public MobileElement getPercent45;

@FindBy(id = "allocationpercentage3")
    public MobileElement getPercent25;

@FindBy(id = "allocationpercentage4")
    public MobileElement getPercent85;

@FindBy(id = "allocationpercentage5")
    public MobileElement getPercent10;

@FindBy(id = "allocationpercentage6")
    public MobileElement getPercent5;

@FindBy(id = "allocationpercentage7")
    public MobileElement getPercent60;

@FindBy(id = "allocationpercentage8")
    public MobileElement getPercent35;

}
