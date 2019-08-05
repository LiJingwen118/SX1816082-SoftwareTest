//SX1816082 栗静文

package ljw.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;
import junit.framework.TestCase;

public class MockTestEmbody extends TestCase{

	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public final void testGetOrder() {
		Embody embody = mock(Embody.class);
		when(embody.getOrder()).thenReturn("student");
		assertEquals("student", embody.getOrder());		
	}

	@Test
	public final void testGetFriendID() {
		Embody embody = mock(Embody.class);
		when(embody.getFriendID()).thenReturn(1816082);
		assertEquals(1816082, embody.getFriendID());
	}

	@Test
	public final void testGetfriendIP() {
		Embody embody = mock(Embody.class);
		when(embody.getfriendIP()).thenReturn("192.168.31.234");
		assertEquals("192.168.31.234", embody.getfriendIP());		
	}
    
}
