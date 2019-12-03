package Abstraction;

public class RajaramTest extends Rajaram {

	public RajaramTest(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void nadi() {
		System.out.println("RajaRam Test");
		
	}
	public static void main(String[] args) {
		RajaramTest rt=new RajaramTest(100);
		rt.nadi();
		rt.premagopadi();
		
		
	}

}
