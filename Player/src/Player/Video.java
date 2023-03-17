package Player;

public class Video implements Playable{

private String title;
private int volume;
private int luminosità;
private int durata;

public Video(String title,int volume,int luminosità,int durata){
	
	this.title=title;
	this.volume=volume;
	this.luminosità=luminosità;
	this.durata=durata;
}

public void show() {};

public void play(){
	   for(int i=0;i<this.durata;i++) {  System.out.println(this.title);}
		for(int j=0;j<this.volume;j++) { System.out.println("!");}
		 for(int z=0;z<this.luminosità;z++){
		 System.out.println("*");}
		
	 
	
}

public void aumentaLuminosità(){luminosità++;}

public void diminuisciLuminosità() {if(luminosità>0) {
	luminosità--;
}}

}
