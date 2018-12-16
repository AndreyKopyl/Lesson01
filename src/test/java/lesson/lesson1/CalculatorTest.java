package lesson.lesson1;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void test_sum(){
        int result = calculator.sum(2,2);
        Assert.assertThat(result, Is.is(4));
    }

    @Test
    public void test_sum_abs(){
        int result = calculator.sum(5,-3);
        Assert.assertThat(result, Is.is(8));
    }

    @Test
    public void test_sum1(){
        int result = calculator.sum(3,3);
        Assert.assertThat(result, Is.is(6));
    }

    @Test
    public void test_div(){
        int result = calculator.div(20,5);
        Assert.assertThat(result, Is.is(4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_div_on_zero(){
        calculator.div(100,0);
        Assert.fail();
    }

    @Test
    public void test_div_abs(){
        int result = calculator.div(10,-2);
        Assert.assertThat(result, Is.is(5));
    }
}
