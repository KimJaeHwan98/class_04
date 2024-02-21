	package upcasting;
	class Parents { 
		public void familyName() {
			System.out.println("이");
		}
		public void name() {
			familyName();
			System.out.println("순신");
		}
	}
	
class Daughter extends Parents {
	public void name() {
		familyName();
		System.out.println("국주");
	}
	
}
class Son extends Parents {
	public void name() {
		familyName();
		System.out.println("기광");
	}
}
	public class Ex02 {
	public static void main(String[] args) {
	/*
	Parents par = new Parents();
	par.name();
	Daughter d = new Daughter();
	d.name();
	Son s = new Son(); s.name();
	*/ //1번 아빠이름 2번 딸 3번 아들이름
		Parents par;
		Daughter d ;
		Son s ; 
		int num = 2;
		if(num ==1) {
			par= new Parents();
			par.name();
		}else if(num ==2) {
			par = new Daughter();
			par.name();
		}else {
			par = new Son();
			par.name();
		}
	}
}
	//부모가한테 전부 익스텐즈했기때문에 par로 통일해도 모두 추력이 가능하다.
