package a;

public class ClassName {
	// 생성자 접근제한
	byte byteValue;
	short shortValue;
	int intValue;
	
	// 필드, 메소드 접근제한
	public int publicField = 1;
	int defaultField = 1;
	private int privateField = 1;
	
	public void publicMethod() {}
	void defaultMethod() {}
	private void privateMethod() {}

	
	// 필드, 메소드 접근제한
	public ClassName() {
		publicField = 2;
		defaultField = 2; // default : 같은 패키지에서만 가능
		privateField = 2; // private : 같은 객체에서만 가능
		publicMethod();
		defaultMethod(); // default : 같은 패키지에서만 가능
		privateMethod(); // private : 같은 객체에서만 가능
	}
	
	
	
	
	// 생성자 접근제한
	public ClassName(byte byteValue) {
		this.byteValue = byteValue;
	}
	
	ClassName(short shortValue) {
		this.shortValue = shortValue;
	}
	
	private ClassName(int intValue) {
		this.intValue = intValue;
	}
	
	// 같은 객체(클래스) 내 생성자 호출
	ClassName cn1 = new ClassName(1);
	ClassName cn2 = new ClassName(1);
	// private도 객체 내에서 호출 가능
	ClassName cn3 = new ClassName(1);

	
	
	
	
}
