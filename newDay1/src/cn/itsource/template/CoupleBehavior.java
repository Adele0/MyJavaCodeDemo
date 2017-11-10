package cn.itsource.template;

public abstract class CoupleBehavior {
	
	public abstract void beforeMeal();//同一模板下 抽象出不同 的行为模式
	public abstract void afterMeal();//以便子类继承后覆写 
	
	public void eat() {//同一模板下 共有的行为模式
		System.out.println("Male and Female eat together.");
	}
	
	public void sleep() {
		System.out.println("Male and Female sleep together.");
	}
	
	public void routineTemplate() {//作息按照一定规律进行先后排序 成为模板
		beforeMeal();
		eat();
		afterMeal();
		sleep();
	}
	
}
