import components.MP3Player;
import components.Stereo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3PlayerTest {
    MP3Player mp3Player;
    Stereo stereo;

    @Before
    public void before(){
        mp3Player = new MP3Player("MP3 Name");
        stereo = new Stereo("The Beast");
    }

    @Test
    public void canConnectToStereo(){
        assertEquals("MP3 Connected to the The Beast", mp3Player.connect(stereo));
    }


}
