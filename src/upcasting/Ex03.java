package upcasting;
class Test{}
public class Ex03 {
public static void main(String[] args) {
	//하나의 부모로 설정은 편하지만 형변환을 해줘야한다
	Object num = 100; //부모형태로 받아 출력가능하다
	Object name = "홍길동"; //모든값의 부모로 오브젝트 사용가능
	Object t = new Test();
	System.out.println(num.getClass());
	System.out.println(name.getClass());
	
	int a = 100+(int)num; // 오브젝트타입과 정수와 연산이 불가능합니다.
	System.out.println(a);
}// 오젝트타입을 인트로 형변환해서 넘을 원래의 모습으로 돌리고 출력하겠다
}//다운캐스팅
