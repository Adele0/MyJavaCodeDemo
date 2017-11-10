package cn.itsource.template;

public class TestCoupleRoutine {

	public static void main(String[] args) {
		
		System.out.println("-------Male's Routine in Couple Behavior--------");
		
		Male male = new Male();
		male.routineTemplate();//直接调用

		System.out.println("");
		System.out.println("-------Female's Routine in Couple Behavior--------");
		Female female = new Female();
		female.routineTemplate();
	}

}
