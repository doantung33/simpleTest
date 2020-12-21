import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {
    @Test
    @DisplayName("0+0")
    public void  add1(){
        int first=0;
        int second=0;
        int exp=0;
        int result = Simple.add(first,second);
        assertEquals(exp,result);

    }
    @Test
    @DisplayName("1-0")
    public void sub() {
        int first = 1;
        int second=0;
        int exp=1;
        int result= Simple.sub(first,second);
        assertEquals(exp,result);
    }
    @Test
    @DisplayName("2+2")
    public void add(){
        int first=2;
        int second=2;
        int exp= 4;
        int result= Simple.add(first,second);
        assertEquals(exp,result);
    }

}

