package cn.itsource.template;

public class Male extends CoupleBehavior {

	@Override
	public void beforeMeal() {
		System.out.println("Males always play PS4 before the meal.");
	}

	@Override
	public void afterMeal() {
		System.out.println("Males always watch Sports Channel after the meal.");
	}

}
