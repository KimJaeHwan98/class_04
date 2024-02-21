	package upcasting;
	class A01{
		public void test() {System.out.println("aaaaa");}
	}
	class B01 extends A01 {
		public void test() {System.out.println("bbbbbb");}
		
	}
	class C01 extends A01{
		public void test() {System.out.println("ccccc");}
	}
	public class Ex01 {
		public static void main(String[] args) {
			A01 a;
			a = new B01(); a.test(); //a01에 b,c01둘다 저장가능하다
			//이게 오버라이딩 이다. 변수 한번을 덜 만들어도 된다.
			a = new C01(); a.test();
			/*
			B01 b;
			C01 c;
			b = new B01(); b.test();
			c = new C01(); c.test();
			*/
		}
	}
//부모형태에서 자식형태 다운캐스팅
	//자식에서 부모형태 업캐스팅
	//c01에 a01을 저장하면 a01은 c01위치를 알고있다.
	//자식형태에서 부모형태에 저장을한다.