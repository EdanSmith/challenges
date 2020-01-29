package challenges.flow.custom;

import flow.IEvent;

public class Event implements IEvent<String> {

	private String value;

	public Event(String value) {
		this.value = value;
	}

	public String trigger() {
		return "MSG:" + value;
	}

}
