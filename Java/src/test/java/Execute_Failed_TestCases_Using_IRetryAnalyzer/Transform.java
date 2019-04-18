package Execute_Failed_TestCases_Using_IRetryAnalyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Transform implements IAnnotationTransformer{

	
	public void transform(ITestAnnotation annotation,Class Testclass,Constructor counstructor,Method TestMethod ){
		
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}
}
