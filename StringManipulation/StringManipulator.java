//String trimAndConcat(String, String): Trim both input strings and then concatenate them. Return the new string. Feel free to use the trim method of the String class.
//
// public class StringManipulator {
//     public String trimAndConcat(String s1, String s2) {
//         String sentence = s1.trim() + s2.trim();
//         return sentence;
//         }

//     public static void main(String[] args ) {
//         StringManipulator manipulator = new StringManipulator();
//         String str = manipulator.trimAndConcat("    Hello     ","     World    ");
//         System.out.println(str);
//     }
// }

// Integer getIndexOrNull(String, char): Get the index of the character and return either the index or null. If the character appears multiple times, return the first index. Feel free to use the indexOf method of the String class.
//
// public class StringManipulator {
//     public Integer getIndexOrNull(String s1, char c1) {
//         int num = s1.indexOf(c1);
//         if (num == -1) {
//             return null;
//         }
//         return num;
//         }

//     public static void main(String[] args) {
//         StringManipulator manipulator = new StringManipulator();
//         char letter = 'o';
//         Integer a = manipulator.getIndexOrNull("Coding", letter);
//         Integer b = manipulator.getIndexOrNull("Hello World", letter);
//         Integer c = manipulator.getIndexOrNull("Hi", letter);
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(c);
//     }
// }

// Integer getIndexOrNull(String, String): Get the index of the start of the substring and return either the index or null. Feel free to use the indexOf method of the String class.

// public class StringManipulator {
//     public Integer getIndexOrNull(String s1, String s2) {
//         int num = s1.indexOf(s2);
//         if (num == -1) {
//             return null;
//         }
//         return num;
//     }
//
//     public static void main(String[] args) {
//         StringManipulator manipulator = new StringManipulator();
//         String word = "Hello";
//         String subString = "llo";
//         String notSubString = "world";
//         Integer a = manipulator.getIndexOrNull(word, subString);
//         Integer b = manipulator.getIndexOrNull(word, notSubString);
//         System.out.println(a);
//         System.out.println(b);
//     }
// }

// String concatSubstring(String, int, int, String): Get a substring using a starting and ending index, and concatenate that with the second string input to our method. Feel free to use the substring method of the String class.

public class StringManipulator {

  public String concatSubstring(String s1, int n1, int n2, String s2) {
    String newsubstring = s1.substring(n1, n2);
    String newstring = newsubstring + s2;
    return newstring;
  }

  public static void main(String[] args) {
    StringManipulator manipulator = new StringManipulator();
    String word = manipulator.concatSubstring("Hello", 1, 2, "World");
    System.out.println(word);
  }
}
