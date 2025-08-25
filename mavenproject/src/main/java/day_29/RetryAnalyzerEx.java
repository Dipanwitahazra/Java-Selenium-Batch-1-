package day_29;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerEx implements IRetryAnalyzer {

    private int retryCount = 0;
    private static final int maxRetryCount = 2;  

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            System.err.println("Retrying test " + result.getName() + 
                               " for the " + retryCount + " time(s).");
            return true;  
        }
        return false; 
    }
}

