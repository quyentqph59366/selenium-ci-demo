import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaculatorTest {
    @Test
    public void add1(){
        Caculator caculator = new Caculator();
        int result = caculator.add(1,2);
        int expected = 3;
        assertEquals(expected,result);
    }

    @Test
    public void add2(){
        Caculator caculator = new Caculator();
        int result = caculator.add(4,100);
        int expected = 104;
        assertEquals(expected,result);
    }

    @Test
    public void tru(){
        Caculator caculator = new Caculator();
        int result = caculator.tru(23,8);
        int expected = 15;
        assertEquals(expected,result);
    }
    @Test
    public void nhan(){
        Caculator caculator = new Caculator();
        assertEquals(20, caculator.nhan(4,5));
    }

    @Test
    public void chia(){
        Caculator caculator = new Caculator();
        assertEquals(2, caculator.chia(10,5));
    }

    @Test
    public void chia2(){
        Caculator caculator = new Caculator();
        assertEquals(8, caculator.chia(10,0));
    }
}