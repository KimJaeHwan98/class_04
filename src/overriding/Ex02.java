	package overriding;
	
	import java.util.ArrayList;
	
	class Test02 extends ArrayList<String>{
		public String get(int i) {
			System.out.println(super.get(i));
			return super.get(i));
		}

		@Override
		public boolean add(String e) {
			System.out.println("저장되었씁니다");
			return super.add(e);
		}
	}
	public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02();
		t.add("111");
		t.get(0);
		t.add("333");
		t.get(2);
		
	}
}
//StackOverflowError 뻉뻉이돌았다 자기 자신을 출력