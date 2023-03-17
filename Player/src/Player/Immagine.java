package Player;

public class Immagine implements Playable {
private int luminosità;
private String titolo;

public Immagine(int luminosità,String titolo) {
	
	this.luminosità=luminosità;
	this.titolo=titolo;
}
public void play() {};
public void show() {
	System.out.println(this.titolo);
	for(int i=0;i<this.luminosità;i++) {
		System.out.println("*");
	}
}

public void aumentaLuminosità() {luminosità++;
	
}

public void diminuisciLuminosità() {
	if(luminosità>0) {luminosità--;}
}
}
