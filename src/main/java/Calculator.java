public class Calculator {
  public int evaluate(String expression) {
    int sum = 10;
    for (String summand: expression.split("\\+"))
      sum += Integer.valueOf(summand);
    return sum;
  }
}
