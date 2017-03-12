package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;
import LeukePrefix.*;

/**
 * Created by jkkoe on 12/03/2017.
 */
public class pietest {
    private ObjectFactory factory;
    private PowerServiceImpl psi;

    @Before
    public void setUp(){
        factory = new ObjectFactory();
        psi = new PowerServiceImpl();
    }

    @Test
    public void Test() throws Fault_Exception{
        Request request = new Request();
        request.setGetal1(20);
        request.setGetal2(50);
        request.setGetal3(30);
        psi.calculatePower(request);

        assertEquals("Uw percentages zijn: getal1: 20.0%, getal2: 50.0%, getal3: 30.0%.", psi.calculatePower(request).getResult());
    }
}
