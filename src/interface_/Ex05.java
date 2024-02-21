package interface_;
class A지상군05 implements TestInt05 {

	@Override
	public void attack() {
		attack2();
		attack3();
		attack4();
		
		System.out.println("지상군 공격");
		
	}
	public void attack2() {
		System.out.println("총알장전");
	}
	public void attack3() {
		System.out.println("총을 들어 올립니다");
	}
	public void attack4() {
		System.out.println("조준을 합니다.");
	
	}

	@Override
	public void defense() {
	System.out.println("지상군 방어");
		
	}
	
}
public class Ex05 {
public static void main(String[] args) {
 TestInt05 a = new A지상군05();
 a.attack(); a.defense();
}
}
//코드합치기가 편하다
//업캐스팅을 이용해서 어택만 보이게한다 부모형태로 보이게
//이렇게 쓰면 장점도 있다 업캐스팅
//이야기가 많다 쓰자 말자로