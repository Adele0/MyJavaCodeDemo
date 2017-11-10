package cn.itsource.template;

public class Female extends CoupleBehavior {

	@Override
	public void beforeMeal() {
		System.out.println("Females always post their Instagram before the meal.");
	}

	@Override
	public void afterMeal() {
		System.out.println("Females always take a walk after the meal.");
	}

}
