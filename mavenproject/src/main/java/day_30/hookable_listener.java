package day_30;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
 
public class hookable_listener implements IHookable {
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return IHookable.super.isEnabled();
	}
	
	@Override
	public void run(IHookCallBack callBack, ITestResult testResult) {
		// TODO Auto-generated method stub
		System.out.println("Before Method" + testResult.getMethod().getMethodName());
		callBack.runTestMethod(testResult);
		System.out.println("After Method" + testResult.getMethod().getMethodName());
	
	
	}
}
 
 
