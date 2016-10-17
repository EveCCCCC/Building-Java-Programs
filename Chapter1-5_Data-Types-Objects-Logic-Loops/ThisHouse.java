// CS11a: Programming in Java
// Programming Assignment 1
// Student: Fan Di

public class ThisHouse {
   public static void main(String[] args) {
      // print verse 1 - 7 repectively by calling static methods defined below
      verse1();
      verse2();
      verse3();
      verse4();
      verse5();
      verse6();
      verse7();
   }

   public static void verse1() {
      // verse 1 has only one line
      System.out.println("This is the house that Jack built.\n");
   }

   public static void verse2() {
      // line 1 unique in verse 2, and verse2_2
      System.out.println("This is the malt");
      verse2_2();
   }

   public static void verse2_2() {
      // line 2 in verse 2
      // to be repeated in verse 3
      System.out.println("That lay in the house that Jack built.\n");
   }

   public static void verse3() {
      // line 1 unique in verse 3, and verse3_2
      System.out.println("This is the rat,");
      verse3_2();
   }

   public static void verse3_2() {
      // line 2 in verse 3, repeated part from verse2_2
      // to be repeated in verse 4
      System.out.println("That ate the malt");
      verse2_2();
   }

   public static void verse4() {
      // line 1 in verse 4, and verse4_2
      System.out.println("This is the cat,");
      verse4_2();
   }

   public static void verse4_2() {
      // line 2 in verse 4, rest repeated from verse3_2
      // to be repeated in verse 5
      System.out.println("That killed the rat,");
      verse3_2();
   }

   public static void verse5() {
      // line 1 in verse 5, and verse5_2
      System.out.println("This is the dog,");
      verse5_2();
   }

   public static void verse5_2() {
      // line 2 in verse 5, rest repeated from verse4_2
      // to be repeated in verse 6
      System.out.println("That worried the cat,");
      verse4_2();
   }

   public static void verse6() {
      // line 1 in verse 6, and verse6_2
      System.out.println("This is the cow with the crumpled horn,");
      verse6_2();
   }

   public static void verse6_2() {
      // line 2 in verse 6, rest repeated from verse5_2
      // to be repeated in verse 7
      System.out.println("That tossed the dog,");
      verse5_2();
   }

   public static void verse7() {
      // line 1 and 2 new in verse 7, rest repeated from verse6_2
      System.out.println("This is the maiden all forlorn");
      System.out.println("That milked the cow with the crumpled horn,");
      verse6_2();
   }
}
