	package interface_;
	class A지상군 {
		public void 공격() {
			System.out.println("지상군이 공격합니다.");
		}
		public void 방어() {
			System.out.println("지상군이 방어합니다");
		}
		}
	
	class B공군 {
		public void attack() {
			System.out.println("비행기가 공격합니다.");
		}
		public void defense() {
			System.out.println("비행기가 방어합니다.");
		}
		
	}
	public class Ex03 {
	public static void main(String[] args) {
		A지상군 a = new A지상군();
		B공군 b = new B공군();
		
		a.공격();
		b.defense();
		
	}
}
//a는 a이가 만들고 b는 b가만든다 b가 a가 어떤코드를 쓰는지 알필요없다.
	//c가 합치는 사람이라고하면 그 사람은 혼란스럽다
	//그래서 용어를 합친다.