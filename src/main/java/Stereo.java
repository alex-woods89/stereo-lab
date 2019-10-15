import components.CDPlayer;
import components.Radio;

public class Stereo {

    private String name;
    private Radio radio;
    private CDPlayer cdPlayer;

    public Stereo (String name){
        this.name = name;
        this.radio = new Radio("Sony","Radio" );
        this.cdPlayer = new CDPlayer("Sony", "CD Player");
    }

    public String getName(){
        return this.name;
    }

    public String playRadio(){
        return radio.play();
    }

    public String playCdPlayer(){
        return cdPlayer.play();
    }

}
