
public class YTypeCastingDemo {

	public static void main(String[] args) {
		//Implicit type casting
		
		int x = 6;
		
		float y;
		
		y = x;
		
		System.out.printf("Float y = %s \n" , y);
		System.out.printf("int  x = %s \n" , x);
		
		
		

		//Explicit type casting
		long a = 107877777760L;
		int b;
		
		
		b = (int)a;
		
		System.out.printf("long a = %s \n" , a);
		System.out.printf("int  b = %s \n" , b);
		
	

	}

}
