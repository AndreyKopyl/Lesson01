package lesson.lesson1;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalcTest {

    private Calc calc;

    @BeforeMethod
    public void setUp(){
        calc = new Calc();
    }

        @Test
        public void testSum() {
        Assert.assertEquals (calc.sum(2,8), 10);
        }

        @Test
        public void testDiv(){
        Assert.assertEquals (calc.div(20,5),4);
        }

        @Test
        public void testMul(){
        Assert.assertEquals (calc.mul(3,3),9);
        }

        @Test
        public void testSub(){
        Assert.assertEquals (calc.sub(5,3),2);
        }
}
