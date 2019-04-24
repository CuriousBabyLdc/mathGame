package service;

import constant.Constant;

/**
 * @ClassName TestOne
 * @Description 算法第一题
 * @Author lidongchen
 * @Date 2019/4/24 21:30
 * @Version 1.0
 **/
public class CalculationOne {

  public void print(int numOne, int numTwo){
    //TODO 校验入参合法性（此处应考虑两位数是否合法，待定）
    for(int i=1;i<=100;i++){
      if(i%numOne == 0 && i%numTwo == 0){
        System.out.println(Constant.fizzBuzz);
      }else if(i%numOne == 0){
        System.out.println(Constant.fizz);
      }else if(i%numTwo == 0){
        System.out.println(Constant.buzz);
      }else{
        System.out.println(i);
      }
    }
  }

}
