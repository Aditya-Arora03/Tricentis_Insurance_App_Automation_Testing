## 🚗 Vehicle Insurance Application Automation  

This project automates the **Vehicle Insurance Application** available at [Tricentis Sample App](https://sampleapp.tricentis.com/101/index.php).  
It demonstrates **AutomationTesting Selenium WebDriver API usuage, Core Java, OOP's** by automating the complete insurance quote process for multiple vehicle types.  

---

### 📌 Project Overview  
The application simulates a real-world insurance portal where users can apply for **Motorcycle, Automobile, Truck, and Camper insurance**.  

This project automates the end-to-end workflow:  
1. Selects an insurance type (Motorcycle / Automobile / Truck / Camper).  
2. Fills in **Vehicle Data, Insurant Data, and Product Data** forms.  
3. Selects a **Price Option**.  
4. Submits the **quote** request.  
5. Captures **confirmation message and screenshots** for reporting.  

---

### 🛠️ Tech Stack  
- **IDE:** IntelliJ IDEA  
- **Language:** Java (Core Java, OOP, Collections)  
- **Automation:** Selenium WebDriver  
- **Build Tool:** Maven (integrated in IntelliJ)  
- **Testing Framework:** TestNG / JUnit  
- **Reporting:** Console logs + screenshots  
- **Browser Support:** Chrome (default), extendable to Firefox/Edge
  
---

### ⚡ Features  
- ✅ End-to-end automation of insurance workflows.  
- ✅ **Object-Oriented Design** – separate classes for each insurance type.  
- ✅ Uses **Selenium WebDriver API** (`WebDriver`, `WebElement`, `By`, `Select`, `Actions`, `WebDriverWait`,`Screenshot API`).  
- ✅ Screenshot capture for verification.  
- ✅ Fully runnable inside IntelliJ IDEA.  
- ✅ Modular design – can extend to new insurance types easily.  

---

### 🚀 Running the Project in IntelliJ IDEA  

#### 1️⃣ Prerequisites  
- Install [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)  
- Install [Java JDK 8+](https://www.oracle.com/java/technologies/javase-downloads.html)  
- Install [Maven](https://maven.apache.org/) (IntelliJ will auto-import `pom.xml`)  
- Install [Chrome Browser](https://www.google.com/chrome/)  
- Download [ChromeDriver](https://chromedriver.chromium.org/downloads) and add it to system PATH  

#### 2️⃣ Open in IntelliJ  
1. Open IntelliJ IDEA → **File > Open** → select project root folder.  
2. IntelliJ will auto-detect `pom.xml` and download dependencies.  
3. Ensure JDK is configured (`File > Project Structure > SDK`).  

#### 3️⃣ Run Tests  
- Run `Main.java`
- This `Main.java` file will run all the Insurance Pages one-by-one. 

#### 📊 Sample Execution Flow
🔹Launches browser and opens Tricentis Vehicle Insurance App.  
🔹Selects "Automobile Insurance".  
🔹Enters vehicle details (make, engine performance, manufacture date, seats, fuel type, etc.).  
🔹Enters insurant details (name, DOB, country, occupation, etc.).  
🔹Selects product details (start date, insurance sum, damage insurance, etc.).  
🔹Picks a price option.  
🔹Submits the quote and validates confirmation.  
🔹Captures a screenshot for reporting.  

#### 👨‍💻 Author

Aditya-Arora03 [Aditya Ajay Arora]

- 📧 Email: [work.aditya.arora@gmail.com](mailto:work.aditya.arora@gmail.com)  
- 💼 LinkedIn: [linkedin.com/in/aditya-arora](https://www.linkedin.com/in/aditya-ajay-arora-8800a2222/)  
- 🐙 GitHub: [github.com/Aditya-Arora03](https://github.com/Aditya-Arora03) 
