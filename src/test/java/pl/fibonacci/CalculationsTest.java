package pl.fibonacci;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

public class CalculationsTest {

    @Test
    public void shouldReturnResultFor10(){
        //given
        Calculations calculator= new Calculations();
        //when
        long result= calculator.calculateEvenValuedFibonacciSum(21);
        //then
        Assert.assertThat(result, is (10L));
    }

    @Test
    public void shouldReturnResultFor89(){
        //given
        Calculations calculator= new Calculations();
        //when
        long result= calculator.calculateEvenValuedFibonacciSum(89);
        //then
        Assert.assertThat(result, is (44L));
    }

    @Test
    public void shouldReturnResultFor4000000(){
        //given
        Calculations calculator= new Calculations();
        //when
        long result= calculator.calculateEvenValuedFibonacciSum(4000000);
        //then
        Assert.assertThat(result, is (4613732L));
    }
}
