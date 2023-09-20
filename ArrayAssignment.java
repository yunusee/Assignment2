import java.util.Arrays;
import java.util.Random;

public class ArrayAssignment {
    public static int[] createArray(int num){
        int[] array = new int[num];
        Random random = new Random();
    
        for(int i = 0; i < array.length; i++){
          array[i] = random.nextInt(101);
        } 
        return array;
      }
}
