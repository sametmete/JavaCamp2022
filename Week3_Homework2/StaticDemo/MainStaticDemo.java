
public class MainStaticDemo {

	public static void main(String[] args) {
		ProduceManager manager = new ProduceManager();
		Produce produce = new Produce();
		produce.name="Laptop";
		produce.price=15000;
		manager.add(produce);
	}

}
