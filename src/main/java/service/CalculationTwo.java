package service;

import constant.Constant;

/**
 * @ClassName TestOne
 * @Description 算法第二题
 * @Author lidongchen
 * @Date 2019/4/24 21:30
 * @Version 1.0
 **/
public class CalculationTwo {

  public void print(int numOne, int numTwo) {
    validateNum(numOne);
    validateNum(numTwo);
    for (int i = 1; i <= 100; i++) {
      if (mathGame(i, numOne) && mathGame(i, numTwo)) {
        System.out.println(Constant.fizzBuzz);
      } else if (mathGame(i, numOne)) {
        System.out.println(Constant.fizz);
      } else if (mathGame(i, numTwo)) {
        System.out.println(Constant.buzz);
      } else {
        System.out.println(i);
      }
    }
  }

  private Boolean mathGame(int number, int divisor) {
    if(number%divisor==0){
      return true;
    }else if (contains(number,divisor)){
      return true;
    }else{
      return false;
    }
  }

  private boolean contains(int number, int divisor){
    while (number > 10){
      int tmp = number%10;
      if(tmp==divisor){
        return true;
      }
      number = (number-tmp)/10;
    }
    return false;
  }

  private void validateNum(int num) {
    if (1 <= num && 9 >= num) {
      return;
    } else {
      throw new RuntimeException("The number you have input (" + num + ") is invalid");
    }
  }

}
