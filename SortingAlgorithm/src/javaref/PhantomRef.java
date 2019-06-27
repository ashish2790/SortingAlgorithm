package javaref;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomRef {

	public static void main(String[] args){
	
		Example e = new Example();
		
		e.g();
		
		
		ReferenceQueue<Example> d = new ReferenceQueue<Example>();
		
		PhantomReference<Example> phanRef = null;
		
		phanRef = new PhantomReference<Example>(e, d);
		phanRef.enqueue();
		System.out.println(d.poll());
		//e = null;
		
		System.gc();
		System.out.println(d.poll());
		e = phanRef.get();
		
		e.g();
 	}
}


