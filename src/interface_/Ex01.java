	package interface_;
	interface A01 {
		public void test1(); //인터페이스안에 중괄호가 없어야한다 코드가없어야지만 만들수 있다
	}
	interface B01 {
		public void test1();
	}
	class Class01 {}
	class Class02 {}
	public class Ex01 extends Class01 implements A01,B01 {

		@Override
		public void test1() {
			// TODO Auto-generated method stub
			
		}
	
	}
//다중 상속.
	//Class는 여러개 상속이 불가능
	//인터페이스 상속은 임플리먼트 ,로 다중상속이 가능하다
	//실체화가 이뤄지지않았기때문에 오버라이딩 해야한다.
	//class 앞 ex01 에 커서를 가져가면 자동으로 오버라이드를 만들어준다
	//실제로는 클래스파일말고 인터페이스파일로 만들어준다