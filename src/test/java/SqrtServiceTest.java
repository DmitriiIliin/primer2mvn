import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrtServiceTest {
    @Test
    public void calc1(){
        SqrtService service = new SqrtService();
        int x = 25;
        int expected = 5;
        int actual = service.calcSqrt(25);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void calc2(){
        SqrtService service = new SqrtService();
        int x = 27;
        int expected = 6;
        int actual = service.calcSqrt(27);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void calc3(){
        SqrtService service = new SqrtService();
        int x = 81;
        int expected = 9;
        int actual = service.calcSqrt(81);
        Assertions.assertEquals(expected,actual);
    }
}
