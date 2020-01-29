package challenges.flow.custom;

import flow.ActionException;
import flow.AdapterException;
import flow.IAction;
import flow.IAdapter;
import flow.IEvent;

public class EmailAdapter implements IAdapter<IAction> {

	public IEvent adapt(IAction action) throws AdapterException, ActionException {

		String value = (String) action.execute();
		return new Event(value);
	}
}
