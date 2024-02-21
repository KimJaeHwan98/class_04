	package singleton;
	class Test03 {
		private static  Test03 t;
		int num;
		private Test03 () {
			System.out.println("생성자 실행");
		}
		public static Test03 getInstance() {
			System.out.println("객체생성 메소드 연동");
			System.out.println("t :"+t);
			//Test03 t = new Test03();
			if(t == null)
			t = new Test03();
			return t;
		}
		//public static void test() {}
		//public void tes11() {}
	}
	public class Ex03 {
	public static void main(String[] args) {
		Test03 t01 = Test03.getInstance();
		Test03 t02 = Test03.getInstance();
		Test03 t03 = Test03.getInstance();
		t01.num = 1000; t02.num = 2000;
		
		
		
		System.out.println(t01 + "  :  "+t01.num); 
		System.out.println(t02 + "  :  "+t02.num); 
		System.out.println(t03 + "  :  "+t03.num); 
		//Test03 t = ;
	}
	
}
	//스테이틱을 붙여 프라이빗을 불러온다
	//객체를 두번째 생성부터는 저장 장소까지 표시한다.
	//해당 객체에서만 사용을 하기위해서 이다.
	//스테이틱을 맞춰주면 스테이틱만 안에서 프라이빗이 사용가능
