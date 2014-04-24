package framework.customer;

public class EmailGetter extends FieldGetter<ICustomer,String> {

	@Override
	public void process(ICustomer customer) {
		super.value = customer.getEmail();
	}

}
