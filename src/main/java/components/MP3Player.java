package components;

import behaviour.IConnect;


public class MP3Player implements IConnect {
    private String name;
//    private Stereo stereo;

    public MP3Player(String name){
        this.name = name;
//        this.stereo = new Stereo("The Beast");
    }
    public String connect(Stereo stereo){
        return "MP3 Connected to the " + stereo.getName();
    }
}
