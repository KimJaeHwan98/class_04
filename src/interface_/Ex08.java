package interface_;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface Testin {
	public int num = 1000;
	public static final String msg = "내용";
	public  final String msg1 = "내용";
	public String msg2 = "내용";
}//다 똑같다.
public class Ex08 {
	public final int num = 1000;
	public static void main(String[] args) {
	System.out.println(Testin.num);
	//Testin.num = 4567;
	List<String> arr = new ArrayList<>(); //부모형태로 받은 어레이리스트
	Map<String, String> m = new HashMap<>();//앞이 배운내용과 다르면 부모형태로 받아온것이다.
}
}
//무조건 스테이틱 파이널로 만들어진다