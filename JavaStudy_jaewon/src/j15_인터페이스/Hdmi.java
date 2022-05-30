package j15_인터페이스;

/*
 * Interface(인터페이스)
 * - 쌍방간의 약속 (규격)
 * - 클래스와 클래스를 연결하기위해 규격을 맞춰 연결해주는것(?)
 * 
 * 1. 기본적으로 모든 메소드는 추상메소드다.
 * 2. 일반 메소드를 사용하려면 return type 앞에 default 키워드를 사용해야한다.
 * 
*/

public interface Hdmi {
	public void connect();
	public void disconnect();
}
