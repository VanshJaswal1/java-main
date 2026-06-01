// public class excercise3 {
//     public static void main(String[] args) {
// System.out.println("Write a Java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade");
//  char g = 'A' ;

//  System.out.println(" the encryption of grade " + " " + ++g);

//   System.out.println(" the decryption of grade " + " " + --g);



//     }
// }

public class exercise3
{
    public static void main(String[] args)
    {
        char g = 'A';

        g = (char)(g + 8);
        System.out.println("Encrypted grade = " + g);

        g = (char)(g - 8);
        System.out.println("Decrypted grade = " + g);
    }
}
