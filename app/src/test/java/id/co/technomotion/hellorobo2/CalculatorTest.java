package id.co.technomotion.hellorobo2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import id.co.technomotion.hellorobo2.model.Calculator;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by omayib on 4/6/15.
 */

@RunWith(RobolectricTestRunner.class)
@Config(emulateSdk = 19,manifest = "app/src/main/AndroidManifest.xml")//
public class CalculatorTest {
    private Calculator calc;

    @Before
    public void setup_calculator_model(){
        calc =new Calculator();
    }

    @Test
    public void addition_calculation(){
        String result=calc.calculate(2).addBy(4);
        assertThat(result,is("6.0"));
    }

    @Test
    public void subtraction_calculation(){
        String result=calc.calculate(2).substractBy(1);
        assertThat(result,is("1.0"));
    }

    @Test
    public void multiplication_calculation(){
        String result=calc.calculate(2).multiplyBy(8);
        assertThat(result,is("16.0"));

    }

    @Test
    public void division_calculation(){
        String result=calc.calculate(8).divideBy(2);
        assertThat(result,is("4.0"));
    }

}
