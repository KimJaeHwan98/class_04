package singleton;

class Test01{
	int num;
	static int cnt;
	public Test01() {
		cnt++;
		System.out.println(cnt +" : 객체생성");
	}
}

public interface Ex01 {
public static void main(String[] args) {
	Test01 t01 = new Test01();
	Test01 t02 = new Test01();
	Test01 t03 = new Test01();
	
	
	t01.num = 100; //342 저장 위치
	t02.num = 200; //8f5
	t03.num = 300; //e5d
	
	
	System.out.println(t01 + "  :  "+t01.num);
	System.out.println(t02 + "  :  "+t02.num);
	System.out.println(t03 + "  :  "+t03.num);
}
}
















