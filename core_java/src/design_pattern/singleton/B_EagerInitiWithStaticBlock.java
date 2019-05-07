package design_pattern.singleton;

public class B_EagerInitiWithStaticBlock {

	private static B_EagerInitiWithStaticBlock instance;

	// static block enables to handle exception

	static {

		try {
			instance = new B_EagerInitiWithStaticBlock();
		} catch (Exception ex) {
			System.out.println("B_EagerInitiWithStaticBlock: Unable to create singleton instance");
			throw new RuntimeException("B_EagerInitiWithStaticBlock: Unable to create singleton instance");
		}

	}

	private B_EagerInitiWithStaticBlock() {
	}

	public static B_EagerInitiWithStaticBlock getInstance() {

		return instance;
	}

}
