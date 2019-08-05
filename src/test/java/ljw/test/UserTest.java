//SX1816082 栗静文
package ljw.test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetIP() {
		User user = new User();
		user.setIP("SX1816082");
		assertEquals("SX1816082", user.getIP());
	}

	@Test
	public void testSetName() {
		User user =  new User();
		user.setName("lijingwen");
		assertEquals("lijingwen", user.getName());
		
	}

	@Test
	public void testSetPassword() {
		User user =  new User();
		user.setPassword("0427ljw");
		assertEquals("0427ljw", user.getPassword());
	}

	@Test
	public void testIsOnline() {
		User user =  new User();
		user.setStatus(0);
		assertEquals(true, user.isOnline());
	}

	@Test
	public void testSetSex() {
		User user =  new User();
		user.setSex("girl");
		assertEquals("girl", user.getSex());
	}
}
