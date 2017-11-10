package cn.itsource.factory;

public class PhoneFactory {

	public Phone getPhone(String brand) {//通过给定的brand返回具体的手机对象
		
		if ("苹果".equals(brand)) {
			return new Iphone();
		}else if ("三星".equals(brand)) {
			return new SamSung();
		}else if ("魅族".equals(brand)) {
			return new Meizu();
		}	
		return null;
	}

}
