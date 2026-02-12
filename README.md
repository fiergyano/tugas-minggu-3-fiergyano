# Swag Labs Automation Testing – Juaracoding Week 3

## Overview

This project contains automated test scripts for the Swag Labs web application using Selenium WebDriver with Java and TestNG. The purpose of this automation is to verify the functionality of the **Add to Cart** feature on the Inventory page.

This project was developed as part of the Juaracoding QA Automation Bootcamp – Week 3 assignment.

---

## Objective

The objective of this test automation is to ensure that users can successfully add a product to the shopping cart and that the system updates the UI accordingly.

---

## Test Case Covered

**Test Case ID:** TC_INV_003  
**Test Scenario:** Verify Add to Cart functionality  

### Test Steps:
1. Open Swag Labs website: https://www.saucedemo.com/
2. Login using valid credentials:
   - Username: `standard_user`
   - Password: `secret_sauce`
3. Verify user is redirected to Inventory page
4. Click **Add to Cart** button on the first product

### Expected Result:
- Cart icon badge displays number **1**
- Add to Cart button changes to **Remove**
- Product is successfully added to cart

---

## Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- ChromeDriver
- Git & GitHub

---

## Project Structure

