	package singleton;
	
	class Test02{
		int num;
		static int cnt;
		private Test02() {
			cnt++;
			System.out.println(cnt +" : 객체생성");
		}
	}

	public interface Ex02 {
	public static void main(String[] args) {
		Test01 t01 = new Test02(); //342 t01에 저장
		Test01 t02 = t01; //new Test01();
		Test01 t03 = t02; //new Test01();
		Test01 t04 = new Test02(); // 이러면 싱글턴이 망가진다
		//객체를 맘대로 생성가능하니까 생성을 private로 막는다
		//t02 에 t01주소를 전달 t03에 t02에 전달했지만
		//t01값을 t02값에 전달했기떄문에 t03도 같은 값을 출력한다.
		//이러한 작업을 싱글턴이라고한다
		
		
		t01.num = 100; //342 저장 위치
		t02.num = 200; //8f5
		t03.num = 300; //e5d
		
		
		System.out.println(t01 + "  :  "+t01.num);
		System.out.println(t02 + "  :  "+t02.num);
		System.out.println(t03 + "  :  "+t03.num);
	}
	}
	
