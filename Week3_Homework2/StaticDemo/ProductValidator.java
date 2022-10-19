
public class ProductValidator {

	public boolean isValid(Produce produce) {
		if (produce.price > 0 && !produce.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
