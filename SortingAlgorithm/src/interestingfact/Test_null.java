package interestingfact;

public class Test_null {

	
	@SuppressWarnings({ "static-access", "null" })
	public static void main(String[] args) {
		Test_null t = null;
		t.staticMethod();
		t.nonstatic();
	}
	
	private static void staticMethod(){
		System.out.println("static method, on null reference");
	}
	
	private void nonstatic(){
		System.out.println("nonstaatic method");
	}
}
