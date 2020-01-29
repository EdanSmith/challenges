package challenges.flow.custom;

import java.util.LinkedList;
import java.util.List;

import flow.IAction;
import flow.IAgent;

public class UserAgent implements IAgent {

	private String[] values;

	public UserAgent(String... values) {
		this.values = values;
	}

	public List<IAction> act() {
		List<IAction> flow = new LinkedList<IAction>();
		for (String value : values) {
			flow.add(new Action(value));
		}
		return flow;
	}

}
