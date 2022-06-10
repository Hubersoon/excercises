package calculatorApp;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Calculator {

    public static void main(String[] args) {

        System.out.println(calculate());

    }

    public static BigDecimal calculate() {
      Scanner scanner = new Scanner(System.in);
      String info = "";
      int counter = 0;
      Map<Integer, List<Object>> history = new HashMap<>();
      List<Object> elements = new ArrayList<>();

      while (!"exit".equals(info)) {
          Scanner scan = new Scanner(System.in);
          System.out.println("please enter the first number");
          BigDecimal firstNumber = scan.nextBigDecimal();
          elements.add(firstNumber);
          System.out.println("please enter operation type");
          scan.nextLine();
          String operationType = scan.nextLine();
          elements.add(operationType);
          System.out.println("please enter second number");
          BigDecimal secondNumber = scan.nextBigDecimal();
          elements.add(secondNumber);

          switch (operationType) {
              case "+" -> elements.add(addMethod(firstNumber, secondNumber));
              case "-" -> elements.add(subtractMethod(firstNumber, secondNumber));
              case "*" -> elements.add(multiplyMethod(firstNumber, secondNumber));
              case "/" -> elements.add(divideMethod(firstNumber, secondNumber));
          }
          history.put(counter, new ArrayList<>(elements));
          elements.removeAll(elements);
          counter++;
          System.out.println("press enter to calculate, type exit to exit, type hist to show history");
          info = scanner.nextLine();

          if ("hist".equals(info)) {
              System.out.println("press enter to see full history, or type the number of last operations you want to see");
              Integer histCounter = scan.nextInt();
              if (histCounter > 0) {
                  for (int i = 0; i < (history.size() - (history.size() - histCounter)); i++) {
                      List<Object> temp = history.get(history.size() - histCounter + i);
                      for (int j = 0; j < temp.size(); j++) {
                          if ((j + 1) == temp.size()) {
                              System.out.print("=");
                          }
                          System.out.print(temp.get(j));
                      }
                      System.out.println();

                  }
                  continue;
              }

                  for (int i = 0; i < history.size(); i++) {
                      List<Object> temp = history.get(i);
                      for (int j = 0; j < temp.size(); j++) {
                          if ((j + 1) == temp.size()) {
                              System.out.print("=");
                          }
                          System.out.print(temp.get(j));
                      }
                      System.out.println();
                  }




          }
      }
      return null;
    }










    private static BigDecimal addMethod(BigDecimal firstNumber, BigDecimal secondNumber) {
        System.out.println("result: " + firstNumber.add(secondNumber));
        return firstNumber.add(secondNumber);
    }

    private static BigDecimal subtractMethod(BigDecimal firstNumber, BigDecimal secondNumber) {
        System.out.println("result: " + firstNumber.subtract(secondNumber));
        return firstNumber.subtract(secondNumber);
    }

    private static BigDecimal multiplyMethod(BigDecimal firstNumber, BigDecimal secondNumber) {
        System.out.println("result: " + firstNumber.multiply(secondNumber));
        return firstNumber.multiply(secondNumber);
    }

    private static BigDecimal divideMethod(BigDecimal firstNumber, BigDecimal secondNumber) {
        BigDecimal result = firstNumber.divide(secondNumber,3,RoundingMode.HALF_UP);

        System.out.println("result: " + result);
        return result;
    }


}
