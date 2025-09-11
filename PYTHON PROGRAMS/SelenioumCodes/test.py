from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("https://geu.ac.in")

links = driver.find_elements(By.TAG_NAME, "a")
print("Found", len(links), "links:")

for link in links:
    print(link.text, "-", link.get_attribute("href"))

driver.quit()