package sort.algo.main;

import java.io.File;

public class sample{
	
	
	public static void main(String[] args) {

	    String base = null;//System.getProperty("com.vtransact.properties.loc");
	    // it use set path to static path if dynamic path is not available 
	    if (base == null) {
	     File f   = new File("E:\\properties\\");
	     if(!f.exists()){
	    	 f = new File("D:\\properties\\");
	     }
	     base = f.getAbsolutePath();
	    }
	    System.out.println(base);
	}
}