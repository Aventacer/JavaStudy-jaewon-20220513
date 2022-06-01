package j18_최상위클래스;

public class Main {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("유재원", "웹개발", 23);
		Teacher t2 = new Teacher("유재원", "웹개발", 23);

		System.out.println(t1); // toString()은 생략이 가능
		System.out.println(t2.toString());
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2));
		// 기본적으로 Object에서 상속받기때문에 Object 클래스의 equal로 된다 이때 t1과 t2는 Object 자료형이다.
		// 이때 Teacher 클래스에서 equals를 오버라이드 후 다운캐스팅 후 비교하면 값이 달라진다
		System.out.println(t1.hashCode() == t2.hashCode());

		// Object obj = t1; // 업캐스팅 되었다. Object로 상속 또는 구현이된거다.
		// String str = t1; // 안됨
		System.out.println();

	}

	/*
	 * public void test(Object obj) { System.out.println(obj.toString()); if(obj
	 * instanceof Teacher) { Teacher teacher = (Teacher) obj; } }
	 */
}
