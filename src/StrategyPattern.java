

public class StrategyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University it = new IITU();
		it.performHire();
		it.setBehaviour(new HireWithIELTS());
		it.performHire();
	}

}
