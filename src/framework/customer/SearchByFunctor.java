package framework.customer;

import java.util.Vector;

import framework.IFunctor;

public class SearchByFunctor<T> implements IFunctor<T> {

	@SuppressWarnings("rawtypes")
	private FieldGetter			fieldGetter;
	private Object				valueToSearch;
	private Vector<T>	foundList;

	@SuppressWarnings("rawtypes")
	/**
	 * Search functor for customer manager
	 * @param fieldGetter Field getter of customer
	 * @param valueToSearch value to search
	 */
	public SearchByFunctor(FieldGetter fieldGetter, Object valueToSearch) {
		this.fieldGetter = fieldGetter;
		this.valueToSearch = valueToSearch;
		foundList = new Vector<T>();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void process(T t) {
		fieldGetter.process(t);
		if (fieldGetter.getValue().equals(valueToSearch)) {
			foundList.add(t);
		}
	}

	public Vector<T> getResult() {
		return foundList;
	}

	public int foundMatches() {
		return foundList.size();
	}
}
