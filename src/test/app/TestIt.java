/**
 * 
 */
package test.app;

/**
 * @author t_pnjeru
 *
 */
@It(prefix = "test_", name ="table")
public class TestIt {

	public static void main(String[] a) {

		
		System.out.println("********");  
	}
}

@interface It{
	String prefix();
	String name();
}
