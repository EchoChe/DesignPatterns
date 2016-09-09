package main.java;

public class NullCustomer extends AbstractCustomer {

	@Override
	public Boolean isNill() {
		return true;
	}

	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}

}
