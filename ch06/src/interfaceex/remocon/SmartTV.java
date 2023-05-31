package interfaceex.remocon;

public class SmartTV implements RemoteControl, Searchable{
	
	private int volume;

	
	
	@Override
	public void search(String url) {
		System.out.println(url+"를 검색합니다.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME) {  //최대 볼륨
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) { //최소 볼륨
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨은 " + this.volume + "입니다.");
	}
	

	@Override
	public void setMute(boolean mute) {
			if(mute) {//mute == true
				System.out.println("무음 처리합니다.");
			}
			else {
				System.out.println("무음 해제합니다.");
			}
		}
	}
	


