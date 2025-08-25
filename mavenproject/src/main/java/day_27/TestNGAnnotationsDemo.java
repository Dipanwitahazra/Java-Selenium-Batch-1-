package day_27;
import org.testng.annotations.*;
public class TestNGAnnotationsDemo {



   @BeforeSuite
     public void beforeSuite()
   {
         System.out.println("1. Setup before the entire suite runs");
     }

     @BeforeClass
     public void beforeClass() 
     {
         System.out.println("2. Setup before this class runs");
     }

     @BeforeMethod
     public void beforeMethod()
     {
         System.out.println("3. Run before each test method");
     }

     @Test
     public void testLogin()
     {
         System.out.println(" Running test: Login");
     }

     @Test
     public void testSearch() 
     {
         System.out.println("Running test: Search");
     }

     @AfterMethod
     public void afterMethod() 
     {
         System.out.println("4. Run after each test method");
     }

     @AfterClass
     public void afterClass() 
     {
         System.out.println("5. Cleanup after this class runs");
     }

     @AfterSuite
     public void afterSuite() 
     {
         System.out.println("6. Cleanup after the entire suite runs");
     }
 }


