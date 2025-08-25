package day_29;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonLoginTest {

    @DataProvider(name = "login-data")
    public Object[][] getLoginData() {
        return new Object[][] {
                {"validUser", "validPass"},  
                {"invalidUser", "wrongPass"}    
        };
    }

    @Test(dataProvider = "login-data", retryAnalyzer = RetryAnalyzerEx.class)
    public void testAmazonLogin(String username, String password) {
        System.out.println("Testing login with: " + username + " / " + password);

        boolean loginStatus = performLogin(username, password);

        if ("invalidUser".equals(username)) {
          
            Assert.assertFalse(loginStatus, "Invalid login should fail!");
        } else {
            
            Assert.assertTrue(loginStatus, "Valid login failed!");
        }
    }

  
    private boolean performLogin(String username, String password) {
        return "validUser".equals(username) && "validPass".equals(password);
    }
}
