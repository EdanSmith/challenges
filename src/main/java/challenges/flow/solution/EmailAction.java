package challenges.flow.solution;

import flow.ActionException;
import flow.IAction;

public class EmailAction implements IAction<String> {

	private String value;

	public EmailAction(String value) {
		this.value = value;
	}

	public String execute() throws ActionException {

		return value;
	}

	public String getType() {
		return "EMAIL";
	}

}
