/**
 * 
 */
package Abstraction;

/**
 * @author NBhaskar
 *
 */
public class PhoneTest implements phone,Phone2{


	@Override
	public void sample_Method2() {
		System.out.println("Downcasting by using abs");
	}

	@Override
	public void sample_Method() {
		// TODO Auto-generated method stub
		System.out.println("Upcasting by using abs");
	}

	@Override
	public void sample_Method1() {
		// TODO Auto-generated method stub
		System.out.println("Upcasting by using abs");
	}

	@Override
	public void sample_Methods3() {
		// TODO Auto-generated method stub
		System.out.println("Downcasting by using Abs");
		
	}
	public static void main(String[] args) {
		System.out.println(phone.name);
		System.out.println(Phone2.i);
		System.out.println(Phone2.d);
		System.out.println("------Upcasting ----------");
		phone p=new PhoneTest();
		p.sample_Method();
		p.sample_Method1();
		System.out.println("-----Downcasting-------");
		Phone2 p2=(PhoneTest)p;
		p2.sample_Method2();
		p2.sample_Methods3();
		System.out.println("----Create a instace of Subcalss---- ");
		PhoneTest p3=new PhoneTest();
		p3.sample_Method();
		p3.sample_Method2();
		p3.sample_Method1();
		p3.sample_Methods3();
	
	}
	
	
	
	

}
