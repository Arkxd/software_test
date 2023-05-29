package 计算器;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    //引入Calculator对象
    Main main = new Main();

    @Test
    public void testAdd(){
        int res = main.add(3, 4);
        int actualres = 7;
        assertEquals(res, actualres);
    }

    @Test
    public void testSub(){
        int a = main.sub(10, 4);
        int b = 6;
        assertEquals(a, b);
    }

    @Test
    public void testMultiply(){
        int a = main.multiply(10, 4);
        int b = 40;
        assertEquals(a, b);
    }

    @Test
    public void testDivide(){
        int res = 0;
        try{
            res = main.divide(8,2);
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
        assertEquals(res,4);
    }

    @Test
    public void testDivideByZero(){
        Throwable th = null;
        int res = 0;
        try{
            res = main.divide(8,0);
        }
        catch (Exception e){
            th = e;
        }
        assertEquals("除数不能为0",th.getMessage());
    }
}