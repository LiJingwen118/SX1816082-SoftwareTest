//SX1816082 栗静文

package ljw.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmbodyTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetOrder() {
		Embody embody = new Embody();
		embody.setOrder("student");
		assertEquals("student", embody.getOrder());		
	}

	@Test
	public final void testGetFriendID() {
		Embody embody = new Embody();
		embody.setFriendID(1816082);
		assertEquals(1816082, embody.getFriendID());
	}

	@Test
	public final void testGetfriendIP() {
		Embody embody = new Embody();
		embody.setfriendIP("192.168.31.234");
		assertEquals("192.168.31.234", embody.getfriendIP());		
	}

}
