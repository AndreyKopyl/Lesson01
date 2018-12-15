package lesson.lesson1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {

        private Calc calc = new Calc();

        @Test
        public void testSum() {
            Assert.assertEquals(10, calc.sum(2,8));
        }
}
