	package overriding;
	
	//상속
	class  Ferrari{
		private int ye;
		public Ferrari(int ye) {
			this.ye = ye; //년식 초기화
		}
		public int getYe() {
			return ye;
		}
		public void speed() {
			System.out.println(ye+"년식 페라리 속도 : 300km 달립니다");
		}
		public void onCar() {
			System.out.println("자동차 시동을 켭니다!!");
		}
	}
	class NewFerrari extends Ferrari { // Ferrari 먼저 실행 후 new Ferrari실행
		public void speed() {
			System.out.println(getYe()+"년식 페라리 속도 변경");
			System.out.println("500km까지 달릴수 있습니다~");
		}

		public NewFerrari(int ye) {
			super(ye);
			// TODO Auto-generated constructor stub
		}
		public void autoSystem() {
			System.out.println("자동 운전모드를 실행합니다.");
		}
	}
	public class Ex01 {
	public static void main(String[] args) {
		NewFerrari f = new NewFerrari(2025);
		f.onCar();
		f.speed();
		f.autoSystem();
	}
}
	//동일한 이름으로 쓰면 부모클래스에서 작동한다. 오버라이딩.
// 오버라이딩 기존의 코드를 사용해도 메인클레스를 수정할 필요가 없다.
	//초록색 삼각형이 오버라이딩했다라고 표시