package c;

// public이 아니면 호출할 수 없음
import a.A;
import b.B;

public class C {
	// B는 public이므로, 패키지가 달라도 import로 호출 가능
	B b = new B();
	A a = new A();
	
	
	
	
	
}
