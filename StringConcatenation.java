package JavaBasics;

/**
 * @author user
 *
 */
public class StringConcatenation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//+
		int a=100;
		int b=200;
		String x="hello";
		String y="world";{
		System.out.println(a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+b);
		System.out.println("The value of a is:"+a);
		System.out.println("The addition of a and b is:"+(a+b));
		System.out.println("The addition of a,b,x,y is:"+(a+b+x+y));
		
		}
	}

	
}
