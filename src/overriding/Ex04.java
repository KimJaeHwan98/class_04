package overriding;
class Test04{
	public void test() {
		System.out.println("부모실행");
	}
}
class TestClass04 extends Test04 { // 부모클래스와 모든걸 일치시켜야 오버라이딩한다.
	//protected는 public 보다 범위가 작다
	
	public void test() {
		System.out.println("자식실행");
		
	}
	
}
public class Ex04 {
public static void main(String[] args) {
	
}
}
