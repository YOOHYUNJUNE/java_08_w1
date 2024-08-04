package polymorphism;

public class Car {

	private Tire tire; // Tire 타입

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	
	// instanceof 연산자
	public void drive() {
		if (tire instanceof HankookTire hk) { // true인 경우 hk에 변환시켜줌
//			System.out.println(tire.hankookStyle); // 타입 변환 전 사용 불가
			System.out.println(hk.hankookStyle);
		}
//		if (tire instanceof HankookTire) {
////			System.out.println(tire.hankookStyle); // 타입 변환 전 사용 불가
//			HankookTire hk = (HankookTire) tire;
//			System.out.println(hk.hankookStyle);
//		}
		tire.roll();
	}
	
	
	
	
}
