Feature: Login

Scenario: Login with valid credentials
Given User launch edge browser	
When User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
And User enters Email as "admin@yourstore.com" and Password as "admin"
And User clicks on Login button
Then Page title should be "Dashboard / nopCommerce administration"
When User clicks on Logout button
Then Page title should be "Your store. Login"
And Close the browser

