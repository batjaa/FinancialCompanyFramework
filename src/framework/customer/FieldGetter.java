package framework.customer;

import framework.IFunctor;

public abstract class FieldGetter<T, R> implements IFunctor<T> {
	protected R	value;

	public R getValue() {
		return value;
	}

}
