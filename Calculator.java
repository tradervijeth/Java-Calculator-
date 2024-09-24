public class Calculator{
  
  public Calculator(){
    
  }

  public int add(int a, int b){
     
     return a + b;
  }

  public int subtract(int a, int b){

    return a - b;
  }

  public int multiply(int a, int b){

    return a * b;
  }

  public int divide(int a, int b){

    return a / b;
  }

  public int modulo(int a, int b){

    return a % b ;

  }

  // we need to handle when anything is divided by zero

  public int modulo(int a, int b){
    if (b == 0){
      System.out.println("Dividing by zero is not defined in mathematics");
      return 0;
    }
    return a / b;

    
  }

  public int dvide(int a, int b){
    if(b == 0){
      System.out.println("Dividing by zero is not defined in mathematics");
      return 0;
    }
    return a % b;
  }
  


public static void main(String[] args){
  Calculator myCalculator = new Calculator();
 System.out.println(myCalculator.add(5,7));
 System.out.println(myCalculator.subtract(45,11));
}
}