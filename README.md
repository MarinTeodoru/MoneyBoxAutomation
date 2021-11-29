# MoneyBoxAutomation

I have used **IntelliJ** IDE, **JAVA** as programming language, **Appium** with **JUnit** as testing Framework and **Maven** as a build management tool.

For this task I have created BDD Cucumber Framework based on POM(Page Object Model) design pattern,
because I wanted to have an organised and easy to maintain Framework.


In my framework I have:
- under **pom.xml** fileI keep all my dependencies;
- under **features** folder I have my scenarios written in Gherkin language;
- under **pages** folder I keep my locators and usefully methods;
- under **stepDefinition** package I write my coding logic written in JAVA ;
- under **Hooks** class I keep my **before**, **after** methods;
- I trigger my Framework using **Runner** class;
- I also have **FailedTestRunner** to check all the failed test cases
