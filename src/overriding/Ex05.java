package overriding;
class Test05 { 
	
}
public class Ex05 {
public static void main(String[] args) {
	Test05 t = new Test05();
	System.out.println("aaa".getClass() );
	System.out.println(t.getClass() );
	System.out.println(t.toString() );
	System.out.println(t);
}
}
//기본 자료형을 알려주는게 getClass 
//t.toString은 그냥 t 를 쓰는거와 똑같다. //어느 위치에 저장한지알려준다
//t.toString으로 오버라이딩을 많이 한다
