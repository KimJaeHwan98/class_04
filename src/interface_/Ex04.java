package interface_;
class A04{
	public void aaa() {}
}
class B04 extends A04{
	public void aaa() {} //기본매소드는 public void
	public void bbb() {}
	public void ccc() {}
}
public class Ex04 {
public static void main(String[] args) {
	A04 b = new B04();
}
}

//업캐스팅을 하면 자식의 매소드는 보이지않는다.
//부모형식으로 받으면 부모형식만 보인다.