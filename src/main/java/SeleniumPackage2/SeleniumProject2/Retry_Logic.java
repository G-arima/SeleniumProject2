package SeleniumPackage2.SeleniumProject2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Logic implements IRetryAnalyzer{
    int current_count=0;
    int number_of_retry=1;
	@Override
	public boolean retry(ITestResult result) {
	    if(current_count<number_of_retry)
	    {
	    	current_count++;
	    	return true;//Give a retry
	    }
		return false;//Don't retry
	}
	

}
