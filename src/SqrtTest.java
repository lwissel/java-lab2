import static org.junit.Assert.*;

public class SqrtTest{

  @Test
    public void sqrtTest1() {
      assertEquals("We test whether the computation of sqrt(4) is correct",
                    2, Math.sqrt(4), 0.000001);
    }
}
