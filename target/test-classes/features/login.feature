Feature: Rediff Login Feature

Scenario Outline: Login with Username and Password
Given Open a Login Page of "https://rediff.com"
When Type possible <username> and <password>
Then If not a registered user, show an error

Examples:
|username|password|
|john@gmail.com|test123|
|naz@gmail.com|naz898989|
|justin@gmail.com|justin676767|