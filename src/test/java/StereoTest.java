import components.Stereo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {
    Stereo stereo;

    @Before
    public void before(){
        stereo = new Stereo("The Beast");
    }

    @Test
    public void canGetStereoName(){
        assertEquals("The Beast", stereo.getName());
    }

    @Test
    public void canPlayRadio(){
        assertEquals("Radio 1", stereo.playRadio());
    }

    @Test
    public void canPlayCD(){
        assertEquals("CD Playing", stereo.playCdPlayer());
    }
}
