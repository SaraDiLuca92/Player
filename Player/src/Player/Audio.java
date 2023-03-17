package Player;

public class Audio implements Playable {

private String title;
private int duration;
private int volume;


public Audio(String title, int durata, int vol) {
	
	this.title=title;
	this.duration=durata;
	this.volume=vol;
}

public void show() {};

public void play() {
	
	for(int i=0;i<this.duration;i++) {System.out.println(title);}

	
	for(int j=0;j<this.volume;j++) {
	System.out.println("!");} 
}
	

public void abbassaVolume() 
{
	if(volume>0) {this.volume--;}
	}

public void alzaVolume() {
	
	this.volume++;
}
}
