package day11b;

public class SmartTV implements RemoteControl, WebSearch{
	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println("브로드밴드 서비스로 인터넷에 연결합니다. ");
		System.out.println(url +"에 접속합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("스마트티비를 켭니다.");
		
	}
	
	@Override
	public void turnOff() {
		System.out.println("스마트티비를 끕니다.");
		
	}
	
	@Override
	public void setVolume(int volume) {
		//정해진 볼륨의 범위에서만 set 하도록 정의합니다.
				
		if(volume > RemoteControl.MAX_VOLUME)
	         this.volume = RemoteControl.MAX_VOLUME;
	      else if(volume < RemoteControl.MIN_VOLUME)
	         this.volume = RemoteControl.MIN_VOLUME;
	      else
	         this.volume=volume;
		
		System.out.println("현재 당신의 스마트 티비 볼륨은 " +this.volume);
	}
	
	
}
