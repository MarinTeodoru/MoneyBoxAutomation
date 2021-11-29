package com.moneyBox.tests.step_definitions;
import com.moneyBox.tests.pages.AllocationPercentagesMobile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AllocationPercentagesStepDefs {


    @Given("User is on the Confirm allocation page")
    public void user_is_on_the_Confirm_allocation_page() {
        //Here i didn't write code because once i run the program it will run the "@Before" method from "Hooks" class
        //and we will get straight to the "Confirm Allocation" page

    }

    @Then("User taps {string} tab")
    public void user_taps_tab(String tab) {

        AllocationPercentagesMobile allocationPercentagesMobile = new AllocationPercentagesMobile();

        if(tab.equals("Cautious")){
            allocationPercentagesMobile.cautiousButton.click();
        }else if(tab.equals("Balanced")){
            allocationPercentagesMobile.balancedButton.click();
        }else if(tab.equals("Adventurous")){
            allocationPercentagesMobile.balancedButton.click();
        }else {
            System.out.println("Wrong tab name selection!");
        }
    }


    @And("User should see {string},{string},{string}")
    public void user_should_see(String num1, String num2, String num3) {
        AllocationPercentagesMobile allocationPercentagesMobile = new AllocationPercentagesMobile();

        if(num1.equals("85%") && num2.equals("10%") && num3.equals("5%")){

            String txt1,txt2,txt3;
            txt1 = allocationPercentagesMobile.getPercent85.getText();
            Assert.assertEquals(txt1,"85%");
            txt2 = allocationPercentagesMobile.getPercent10.getText();
            Assert.assertEquals(txt2,"10%");
            txt3 = allocationPercentagesMobile.getPercent5.getText();
            Assert.assertEquals(txt3,"5%");
        }else if (num1.equals("30%") && num2.equals("45%") && num3.equals("25%")){

            String txt1,txt2,txt3;
            txt1 = allocationPercentagesMobile.getPercent30.getText();
            Assert.assertEquals(txt1,"30%");
            txt2 = allocationPercentagesMobile.getPercent45.getText();
            Assert.assertEquals(txt2,"45%");
            txt3 = allocationPercentagesMobile.getPercent25.getText();
            Assert.assertEquals(txt3,"25%");
        }else if(num1.equals("5%") && num2.equals("60%") && num3.equals("35%")){

            String txt1,txt2,txt3;
            txt1 = allocationPercentagesMobile.getPercent5.getText();
            Assert.assertEquals(txt1,"5%");
            txt2 = allocationPercentagesMobile.getPercent60.getText();
            Assert.assertEquals(txt2,"60%");
            txt3 = allocationPercentagesMobile.getPercent35.getText();
            Assert.assertEquals(txt3,"35%");
        }else {
            System.out.println("Wrong percentage selection!");
        }


    }
}
