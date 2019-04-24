import service.CalculationOne;
import org.junit.*;

/**
 * @ClassName CalculationOneTest
 * @Description 算法第一题测试类
 * @Author lidongchen
 * @Date 2019/4/24 21:46
 * @Version 1.0
 **/
public class CalculationOneTest {
  @Test
  public void testRight(){
    CalculationOne calculationOne = new CalculationOne();
    calculationOne.print(3,5);

  }

  @Test
  public void testWrong(){
    CalculationOne calculationOne = new CalculationOne();
    calculationOne.print(3,15);
  }
}
