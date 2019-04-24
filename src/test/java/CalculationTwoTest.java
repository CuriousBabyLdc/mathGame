import org.junit.Test;
import service.CalculationOne;
import service.CalculationTwo;

/**
 * @ClassName CalculationTwoTest
 * @Description 算法第二题测试类
 * @Author lidongchen
 * @Date 2019/4/24 21:46
 * @Version 1.0
 **/
public class CalculationTwoTest {
  @Test
  public void testRight(){
    CalculationTwo calculationTwo = new CalculationTwo();
    calculationTwo.print(3,5);
  }

  @Test
  public void testWrong(){
    CalculationTwo calculationTwo = new CalculationTwo();
    calculationTwo.print(3,15);
  }

}
