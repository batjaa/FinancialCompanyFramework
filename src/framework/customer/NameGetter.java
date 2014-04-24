package framework.customer;

public class NameGetter extends FieldGetter<ICustomer, String> {

	@Override
	public void process(ICustomer customer) {
		super.value = customer.getName();
	}

}
