import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import net.*;
import net.database.Event;
import net.database.EventDao;
import net.database.LoginDao;
import net.database.User;
import net.database.registerDao;
import net.login.LoginBean;
class testCases {

	@Test
	void test() throws ClassNotFoundException {
		fail("Not yet implemented");
		Event e1 = new Event();
		EventDao e2 = new EventDao();
		User u = new User();
		LoginDao l = new LoginDao();
		registerDao r = new registerDao();
		LoginBean lb = new LoginBean();
		e1.setName("John Johnson");
		e1.setDate("11/25/2024");
		e1.setEventID(12345);
		e1.setCount(10000);
		e2.getEventResultSet();
		u.setEmail("hello@gmail.com");
		u.setUsername("testing");
		u.setPassword("testing");
		l.validate(lb);
		r.validate(u);
		
	}

}
