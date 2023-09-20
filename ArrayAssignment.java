import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayAssignment {
    public static int[] createArray(int num){
        int[] array = new int[num];
        Random random = new Random();
    
        for(int i = 0; i < array.length; i++){
          array[i] = random.nextInt(101);
        } 
        return array;
      }
    public static int minimumOfArray( int[] arr )
  {
    int minimum = arr[0];

    for ( int i = 0; i < arr.length; i++ )
    {
      if ( arr[i] < minimum )
        minimum = arr[i];
    }
    return minimum;
  }

  public static int maximumOfArray( int[] arr )
  {
    int maximum = arr[0];

    for ( int i = 0; i < arr.length; i++ )
    {
      if ( arr[i] > maximum )
        maximum = arr[i];
    }
    return maximum;
  }
  public static int sumOfOdds(int[] arr){
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        if (i%2 == 1) {
            sum += arr[i];  
        }
    }

    return sum;
}

public static int sumOfEvens(int[] arr){
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        if (i%2 == 0) {
            sum += arr[i];  
        }
    }
  
    return sum;
}

public static double[] difference_average(int[] array_input) {

  double sum = 0;
  for (double i : array_input) {
      sum += i;
  }
  double average = sum / array_input.length;

  double[] result_array = new double[array_input.length];

  for (int i = 0; i < result_array.length; i++) {
      result_array[i] = array_input[i] - average;
  }
  return result_array;

}

public static void userDisplay(int[] arrr) {
  String temp = "asda";
  Scanner s = new Scanner(System.in);


  while (!temp.equalsIgnoreCase("exit")) {
      System.out.println("Choose your option: \n1) Find min/max. \n2) Find average. \n3) Find the sum of elements with odd and even numbered indexes.");
      System.out.print("Your option: ");
      temp = s.nextLine();


      if (temp.equalsIgnoreCase("1")) {
        System.out.println(minimumOfArray(arrr));
        System.out.println(maximumOfArray(arrr));

      }   
      else if (temp.equalsIgnoreCase("2")) {
        System.out.println(Arrays.toString(difference_average(arrr)));
      }
      else if (temp.equalsIgnoreCase("3")) {
          System.out.println("sum of evens: " + sumOfEvens(arrr));
          System.out.println("sum of odds: " + sumOfOdds(arrr));
      }

      System.out.println();
  }

}

public static void main(String[] args) {
  userDisplay(createArray(5));
}


}
