import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Puzzling {
  // Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)
  //   public static ArrayList newArray() {
  //     int[] myArray = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
  //     int Sum = 0;
  //     ArrayList<Integer> nA = new ArrayList<Integer>();
  //     for (int i = 0; i < myArray.length; i++) {
  //       Sum = myArray[i] + Sum;
  //       if (myArray[i] > 10) {
  //         nA.add(myArray[i]);
  //       }
  //     }
  //     System.out.println(Sum);
  //     return nA;
  //   }
  //   public static void main(String[] args) {
  //     System.out.println(newArray());
  //   }

  //   Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.
  //   public static ArrayList newArray() {
  //     ArrayList<String> name = new ArrayList<String>();
  //     ArrayList<String> newname = new ArrayList<String>();
  //     name.add("Nancy");
  //     name.add("Jinichi");
  //     name.add("Fujibayashi");
  //     name.add("Momochi");
  //     name.add("Ishikawa");
  //     Collections.shuffle(name);
  //     System.err.println(name);
  //     for (int i = 0; i < name.size(); i++){
  //         if (name.get(i).length() > 5) {
  //             newname.add(name.get(i));
  //         }
  //     }
  //     return newname;
  //   }

  //   public static void main(String[] args) {
  //     System.out.println(newArray());
  //   }

  //   Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.
  //   public static void main(String[] args) {
  //     ArrayList<Character> character = new ArrayList<Character>();

  //     for (char ch = 'a'; ch <= 'z'; ++ch) {
  //       character.add(ch);
  //     }
  //     System.out.println(character);
  //     Collections.shuffle(character);
  //     System.out.println(character);
  //     System.out.println(character.get(25));
  //     System.out.println(character.get(0));
  //   }

  //   Generate and return an array with 10 random numbers between 55-100.
  //   public static void main(String[] args) {
  //     ArrayList<Integer> newArray = new ArrayList<Integer>();
  //     Random r = new Random();
  //     for (int i = 0; i < 10; i++) {
  //       int N = (r.nextInt(46) + 55);
  //       newArray.add(N);
  //     }
  //     System.out.println(newArray);
  //   }

  //   Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
  // public static void main(String[] args) {
  //     ArrayList<Integer> myArray = new ArrayList<Integer>();
  //     Random r = new Random();
  //     for (int i = 0; i < 10; i++) {
  //       int N = (r.nextInt(46) + 55);
  //       myArray.add(N);
  //     }
  //     Collections.sort(myArray);
  //     System.out.println(myArray);
  //     System.out.println(myArray.get(0));
  //     System.out.println(myArray.get(myArray.size()-1));
  // System.out.println("Max val: " + Collections.max(myArray));
  // System.out.println("Max val: " + Collections.min(myArray));
  // Collections.sort(myArray, Collections.reverseOrder());
  // }

  //    Create a random string that is 5 characters long.
  // public static String randomString() {
  //     ArrayList<Character> randomCharArr = new ArrayList<Character>();
  //     ArrayList<Character> alphabet = new ArrayList<Character>();
  //     for (char i = 'a'; i <='z'; i++) {
  //         alphabet.add(i);
  //     }
  //     Collections.shuffle(alphabet);
  //     for (int i = 0; i < 5; i++) {
  //         randomCharArr.add(alphabet.get(i));
  //     }
  //     StringBuilder randomStr = new StringBuilder();
  //     for (char randomCharacter : randomCharArr) {
  //         randomStr.append(randomCharacter);
  //     }
  //     return randomStr.toString();
  // }

  // public static void main (String[] args){
  //     System.out.println(randomString());
  // }

  //   Generate an array with 10 random strings that are each 5 characters long
  //   public static String randomString() {
  //         ArrayList<Character> randomCharArr = new ArrayList<Character>();
  //         ArrayList<Character> alphabet = new ArrayList<Character>();
  //         for (char i = 'a'; i <='z'; i++) {
  //             alphabet.add(i);
  //         }
  //         Collections.shuffle(alphabet);
  //         for (int i = 0; i < 5; i++) {
  //             randomCharArr.add(alphabet.get(i));
  //         }
  //         StringBuilder randomStr = new StringBuilder();
  //         for (char randomCharacter : randomCharArr) {
  //             randomStr.append(randomCharacter);
  //         }
  //         return randomStr.toString();
  //     }

  //     public static void main (String[] args){
  //         ArrayList<String> newArray = new ArrayList<String>();
  //         for (int i = 0; i <10; i++){
  //             newArray.add(randomString());

  //         }
  //         System.out.println(newArray);
  //     }
}
