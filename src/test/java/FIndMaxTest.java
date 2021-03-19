import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMaxTest {
    @Test
    public void checkMax_IfFirstDigitIsMax(){
        FindMax testMax = new FindMax();
        Integer check = testMax.maximum(3,2,1);
        Assertions.assertEquals(check,3);

    }
    @Test
    public void checkMax_IfSecondDigitIsMax(){
        FindMax testMax = new FindMax();
        Integer check = testMax.maximum(2,3,1);
        Assertions.assertEquals(check,3);
    }
    @Test
    public void checkMax_IfThirdDigitIsMax(){
        FindMax testMax = new FindMax();
        Integer check = testMax.maximum(2,1,3);
        Assertions.assertEquals(check,3);
    }
}