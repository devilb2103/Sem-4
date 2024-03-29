package Java.Assignments.Assignment2;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {
    
    public static void main(String[] args) {
        InputClass input = new InputClass();

        System.out.println("Enter number of inputs: ");
        int numCount = input.intInput();

        ArrayClass arr = new ArrayClass(numCount);

        for (int i = 0; i < numCount; i++) {
            System.out.println(String.format("Enter Number %d: ", i + 1));
            int num = input.intInput();
            arr.appendNums(num);
            // if even
            if(num%2 == 0){
                arr.appendEven(num);
            }
            // if odd
            else{
                arr.appendOdd(num);
            }
        }

        // print odd and even array
        System.out.println("Even Array: " + Arrays.toString(arr.getEven()));
        System.out.println("Odd Array: " + Arrays.toString(arr.getOdd()));

        // print smallest neighbooring distance
        int dist[] = arr.findSmallestDistance();
        System.out.println("Smallest dist is " + dist[0] + " at index " + dist[1]);

        // array to arraylist
        ArrayList<Integer> arrList = arr.arrayToArrayList(arr.getArr());
        System.out.println("Array converted to Array list: " + arrList);

        // arraylist to array
        // Object arrPrimitive[] = arr.ArrayListToArray(arrList);
        int arrPrimitive[] = arr.ArrayListToArray(arrList);
        System.out.println("Array list converted to Primitive Array: " + Arrays.toString(arrPrimitive));

        // dispose scanner class instance in InputClass object
        input.disposeScanner();
    }
}
