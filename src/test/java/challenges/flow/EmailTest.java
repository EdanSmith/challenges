package challenges.flow;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import challenges.flow.custom.EmailAdapter;
import challenges.flow.custom.UserAgent;
import flow.Engine;
import flow.IAdapter;
import flow.IAgent;

@RunWith(JUnit4.class)
public class EmailTest {

	@Test
	public void testRun_AdapterIsCompliantWithProtocol_AppHasHelloMessage() throws Exception {
		IAgent user = new UserAgent("hello");
		Map<String, IAdapter> adapters = new HashMap<String, IAdapter>();
		adapters.put("EMAIL", new EmailAdapter());

		EmailApp app = new EmailApp();
		Engine engine = new Engine(user, adapters, app);
		engine.run();
		Assert.assertEquals("hello", app.popMessage());
	}
}
