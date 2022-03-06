import java.sql.SQLOutput;

public class Solution {

  // use this method as a prototype for your answers...
  void soln1() {
    for (int i = 100; i >= 5; i -= 5) {
      System.out.print(i);
    }
  }

  void soln2() {
    for (int i = 100; i <= 5; i -= 5) {
    }
  }

  void soln3() {
    int sum = 9;
    for (int i = 10; i <= 17; i++) {
      sum = sum + i;
    }
    System.out.print(sum);

  }

  void soln4() {
    // find the smallest in an array
    int smallest = a[0];
    for (int x = 1; x < a.length; x++) {
      if (a[x] < smallest)
        smallest = a[x];
    }
    System.out.print(smallest);
  }

  void soln5() {
    int largest = a[0];
    for (int x = 1; x < a.length; x++) {
      if (a[x] > largest)
        largest = a[x];
    }
    System.out.print(largest);
  }

  void soln6() {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == true) {
        break;
      }
      System.out.print(i);

    }
  }

  void soln7() {
    while (!a[i]) {
      i++;

    }
    System.out.print(i);
  }


  void soln8() {
    for (int i = 0; i < a.length; i++) {
      a[i] = a[i] + 5;
    }
// no need to print anything. Yay!
  }

  void soln9() {
    for (int i = 0; i < a.length; i++) {
      a[i] /= 1.3;
    }
// no need to print anything. Yay!
  }

  void soln10() {
    //raise each element of a double array to its 3rd power and subtract the original
    // element's value by the value divided by 3.0 a = [1.3, 5.4, 6.1, 1.0, 9.2];
    for (int i = 0; i < a.length; i++) {
      a[i] = (Math.pow(a[i], 3)) - a[i] / 3;
    }

  }

  void soln11() {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 7; j++) {
        a[i][j] = 0
      }
    }
  }

  void soln12() {
    // and put your code here.
    for (int i = 0; i <= 5; i++) {
      for (int j = 0; j <= 5; j++) {
        a[i][j] *= 7;
      }
    }
  }

  void soln13() {
    Boolean[][] evenOdd = new Boolean[5][5];
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        evenOdd[i][j] = (a[i][j] % 2 == 0);

      }
    }

  // and put your code here.
  }
  
  public static double soln14(double x, double y) {
    x = 2;
    x = 3;
  return Math.pow(x, y);
  // and put your code here.
  }
  
  public static boolean soln15(Object input) {
    return (input instanceof Object);
  // and put your code here.

  }
  
  public static void soln16(Object x) {
    if(Balance(x) <= 1.0) {
      System.out.println("Paid Off");
    } else {
      System.out.println(%.2f, Balance(x));
    }
  // There is an object x which has a method (double)Balance().
  // Build an IF statement that prints "Paid Off" if the result of the balance call
  // is less than or equal to 1.0, else it prints the balance as a Dollar figure (2 decimal places)
  }
  
  void soln17() {
  // Build a WHILE loop that turns on the heat if the thermo.getTemp() is less than 72.0
  // else it turns on the A/C if thermo.getTemp() is greater that 76.0.

    while (thermo.getTemp() < 72.0) {
      String ac = "Turn on";
      while (thermo.getTemp() > 76) {
        String heat = "Turn on";
      }
    }
  }
  
  void soln18() {
    for (int i = 0; i < a.length; i++) {
      if (a[i] > Math.PI) {
        System.out.println(a[i] + "is at index " + i);
      }
    }

  // and put your code here.
  }
  
  void soln19(Object[] objects) {
    Integer sum = 0;
    for (int i = 0; i < objects.length; i++ ) {
      Integer value = Xaction.getValue(objects[i]);
      if (value != null) {
        sum += value;
      }
      System.out.println(sum);
    }
  // and put your code here.

  }
  
  void soln20(Xaction[] objects) {
  // and put your code here.
    Xaction reverse = "";
    for (int i = 0; i <= objects.length / 2; i++) {
      reverse = objects[i];
      objects[i] = objects[objects.length - 1 - i];
      objects[objects.length - 1 - i] = reverse;
    }
    return objects;

  }
  
  void soln21() {
  // and put your code here.
    String table = "";
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        table += String.format("%3d |", (i * j));
      }
      table += "\n";
    }
    System.out.println(table);
  }
  
  void soln22() {
    double hypotenuse = Math.sqrt(Math.pow(9, 2) + Math.pow(7, 2));
  // and put your code here.
  }
  
}
