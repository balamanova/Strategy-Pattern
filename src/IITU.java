
public class IITU extends University{
	
	public IITU(){
		universityRule = new HireWithoutIELTS();
	}
	
	public void display(){
		System.out.println("I`m IITU");
	}
	
}
