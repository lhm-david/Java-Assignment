import java.util.ArrayList;
import java.util.Arrays;

public class ArrayBasics {

  // Print 1-255
  // Write a method that prints all the numbers from 1 to 255.
  //   public static void main(String[] args) {
  //     for (int i = 1; i <= 255; i++) {
  //       System.out.println(i);
  //     }
  //   }

  // Print odd numbers between 1-255
  // Write a method that prints all the odd numbers from 1 to 255.
  //   public static void main(String[] args) {
  //     for (int i = 1; i <= 255; i++) {
  //       if (i % 2 != 0) {
  //         System.out.println(i);
  //       }
  //     }
  //   }

  // Print Sum
  // Write a method that prints the numbers from 0 to 255, but this time print the sum of the numbers that have been printed so far. For example, your output should be something like this:
  //   public static void main(String[] args) {
  //     int SUM = 0;
  //     for (int i = 0; i <= 255; i++) {
  //       SUM = i + SUM;
  //       System.out.println("New number:" + i + " Sum:" + SUM);
  //     }
  //   }

  // Iterating through an array
  // Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each member of the array and print each value on the screen. Being able to loop through each member of the array is extremely important.
  //   public static void main(String[] args) {
  //     int[] myArray = { 1, 3, 5, 7, 9, 13 };
  //     for (int i = 0; i < myArray.length; i++) {
  //       System.out.println(myArray[i]);
  //     }
  //   }

  // Find Max
  // Write a method (sets of instructions) that takes any array and prints the maximum value in the array. Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.
  //   public static void main(String[] args) {
  //       int[] myArray = {-3, -5, -7};
  //       int maxNumber = myArray[0];
  //       for (int i = 0; i < myArray.length; i++) {
  //           if (myArray[i] > maxNumber) {
  //               maxNumber = myArray[i];
  //           }
  //       }
  //       System.out.println(maxNumber);
  //   }

  // Get Average
  // Write a method that takes an array, and prints the AVERAGE of the values in the array. For example for an array [2, 10, 3], your method should print an average of 5. Again, make sure you come up with a simple base case and write instructions to solve that base case first, then test your instructions for other complicated cases.
  //   public static void main(String[] args) {
  //       int[] myArray = {5,10,6};
  //       int SUM = 0;
  //       int aveNumber = 0;
  //       for (int i = 0; i < myArray.length; i++) {
  //           SUM = myArray[i] + SUM;
  //           aveNumber = SUM / (i+1);
  //       }
  //       System.out.println(aveNumber);
  //   }

  // Array with Odd Numbers
  // Write a method that creates an ArrayList 'y' that contains all the odd numbers between 1 to 255. When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].
  // public static void main(String[] args) {
  //     ArrayList<Integer> myArray = new ArrayList<Integer>();
  //     for (int i = 0; i <=255; i++) {
  //         if (i % 2 != 0) {
  //             myArray.add(i);
  //         }
  //     }
  //     System.out.println(myArray);
  // }

  // Greater Than Y
  // Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will print 2 (since there are two values in the array that are greater than 3).
  //   public static int returnNumber() {
  //     int Y = 3;
  //     int counter = 0;
  //     int[] myArray = { 1, 3, 5, 7 };
  //     for (int i = 0; i < myArray.length; i++) {
  //       if (myArray[i] > Y) {
  //         counter = counter + 1;
  //       }
  //     }
  //     return counter;
  //   }

  //   public static void main(String[] args) {
  //     System.out.println(returnNumber());
  //   }

  // Square the values
  // Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].
  //   public static void main(String[] args) {
  //     int[] myArray = { 1, 5, 10, -2 };
  //     int sqrtNumber = 0;
  //     ArrayList<Integer> newArray = new ArrayList<Integer>();
  //     for (int i = 0; i < myArray.length; i++) {
  //       sqrtNumber = myArray[i] * myArray[i];
  //       newArray.add(sqrtNumber);
  //     }
  //     System.out.println(newArray);
  //   }

  // Eliminate Negative Numbers
  // Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0. When the method is done, x should have no negative values, say [1, 5, 10, 0].
  //   public static void main(String[] args) {
  //     int[] myArray = { 1, 5, 10, -2 };
  //     for (int i = 0; i < myArray.length; i++) {
  //       if (myArray[i] < 0) {
  //         myArray[i] = 0;
  //       }
  //     }
  //     System.out.println(Arrays.toString(myArray));
  //   }

  // Max, Min, and Average
  // Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum number in the array, the minimum value in the array, and the average of the values in the array. The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG]
  //   public static ArrayList newMethod() {
  //     int[] myArray = { 1, 5, 10, -2 };
  //     int numberMax = myArray[0];
  //     int numberMin = myArray[0];
  //     int numberAve = 0;
  //     int numberSUM = 0;
  //     ArrayList<Integer> newArray = new ArrayList<Integer>();
  //     for (int i = 0; i < myArray.length; i++) {
  //       numberSUM = myArray[i] + numberSUM;
  //       numberAve = numberSUM / (i + 1);
  //       if (myArray[i] > numberMax) {
  //         numberMax = myArray[i];
  //       }
  //       if (myArray[i] < numberMin) {
  //         numberMin = myArray[i];
  //       }
  //     }
  //     newArray.add(numberMax);
  //     newArray.add(numberMin);
  //     newArray.add(numberAve);
  //     return (newArray);
  //   }

  //   public static void main(String[] args) {
  //     System.out.println(newMethod());
  //   }

  // Shifting the Values in the Array
  // Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the front. For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. Notice that the last number is 0. The method does not need to wrap around the values shifted out of bounds.
//   public static void main(String[] args) {
//       int[] myArray = {1,5,10,7,-2};
//       Integer lastNumber = 0;
//       for (int i = 0 ; i < myArray.length-1; i++) {
//           myArray[i] = myArray[i+1];
//       }
//       myArray[myArray.length-1] = lastNumber;
//       System.out.println(Arrays.toString(myArray));
//   }
// }
