import Herramientas.Hacha;
import org.junit.Test;
import static org.junit.Assert.*;

public class HachaTest {
    @Test
    public void HachaTieneDurabilidad10(){
        Hacha hacha = new Hacha();
        int durabilidad = hacha.durabilidad();
    }
}