import components.CDPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {
    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Sony", "XYZ2000");
    }

    @Test
    public void canGetMake(){
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("XYZ2000",cdPlayer.getModel());
    }
//    @Test
//    public void cdPlayerCanPlay(){
//        assertEquals("CD's Bangin, mate!", cdPlayer.play());
//    }
}
