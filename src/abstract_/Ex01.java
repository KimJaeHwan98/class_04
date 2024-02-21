	package abstract_;
	//클래스앞에 abstract 꼭 붙여줘야한다.
	abstract class Test01 {
		public abstract void speed(); //이거는 따로 구현하세요
		//추상화 오버라이딩 해야하는구나 알려주는 코드
		//나중에 이메소드를 무조건 오버라이딩해야해 아니면 오류발생
		//다형성
		public void myBreak() {
		System.out.println("멈출 기능");
		}
	}
	class TestClass01 extends Test01 {
		public void speed() {
			System.out.println("2025");
		}
		public void autoSystem() {
			System.out.println("자동차 운전 모드");
		}
	}
	public class Ex01 {
		public static void main(String[] args) {
			TestClass01 t = new TestClass01();
			t.speed(); t.myBreak(); t.autoSystem();
		}
	
	}

	
	//년도가 바뀌면 기능과 년도가 바뀌는데 저 기능을 만들 필요가 있을까?
	//매년 코드를 오버라이딩해서 바꿔줘야한다. 이건 깜빡해서 수정하지않아도 문법적으로는 동작한다
	//이걸 나중에 만들라고