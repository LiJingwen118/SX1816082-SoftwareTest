//SX1816082 栗静文

package ljw.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.Test;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({ EmbodyTest.class, UserTest.class })
public class Testsuite {
	public static Test suite() {
		TestSuite suite = new TestSuite(TestSuite.class.getName());
		suite.addTestSuite(EmbodyTest.class);
		suite.addTestSuite(UserTest.class);
		return suite;
	}
}
