// public class excercise4 {
    
//     public static void main(String[] args) {
//          String name = " v a n s h ";

//          System.out.println(name);
//          System.out.println( name.replace(' ', '_'));
//     }
// }

public class exercise4{
    public static void main(String[] args)
    {
        String text = "Hello  I am   learning Java";

        System.out.println("Double space found at index: " + text.indexOf("  "));

        System.out.println("Triple space found at index: " + text.indexOf("   "));
    }
}