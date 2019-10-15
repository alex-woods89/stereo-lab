import components.Radio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {
    Radio radio;

    @Before
    public void before() {
        radio = new Radio("Sony", "XYZ2001");
    }

    @Test
    public void canGetMake() {
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("XYZ2001", radio.getModel());
    }
//    @Test
//    public void canPlayRadio(){
//        assertEquals("Radio 1", radio.play());
//    }
}