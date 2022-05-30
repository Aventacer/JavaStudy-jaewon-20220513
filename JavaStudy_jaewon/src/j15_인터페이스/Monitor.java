package j15_인터페이스;

public class Monitor implements Hdmi, VGA{

	@Override
	public void connect() {
		System.out.println("모니터에 연결");
	}
	
	@Override
	public void disconnect() {
		System.out.println("모니터에서 연결해제");
	}

	@Override
	public void vgaConnect() {
	}

	@Override
	public void vgaDisConnect() {
	}

}
