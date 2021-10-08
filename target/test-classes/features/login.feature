Feature: Rediff Login Feature

Scenario: Login with Username and Password
Given Open a Login Page of "https://rediff.com"
When Type possible "john@gmail.com" and "test123"
Then If not a registered user, show an error