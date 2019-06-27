package javaref;

public class Example {

	public void g(){
		System.out.println("hi there!!");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("sfah");	
	}
	
}
