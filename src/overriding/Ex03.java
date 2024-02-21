	package overriding;

import java.util.ArrayList;

final class Test03 { //상속받을수 없습니다. //파이널은 불변이다.
		public void test() {
			System.out.println("test03의 test기능");
		}
	}
	
	
	class TestClass03 extends String{
		Test03 t = new Test03(); //final을 붙이면 new생성 후 사용가능
		public void test() {
			System.out.println("class03 test기능");
		}
	public class Ex03 extends Test03 {
	public static void main(String[] args) {
	TestClass03 t = new TestClass03();
	t.test();
	
	}
	}
	
