
 import java.util.Scanner;
public class arrays1 {
    public static void main(String[] args) {
         System.out.println(" ARRAYS");

  // ways to make arrays in java 

  int[] arr = { 1,23,44,55};

  int[] Arr = new int[5];
  arr[0] = 10;
Arr[1] = 20;
Arr[2] = 30;
Arr[3] = 40;
Arr[4] = 50;

Scanner sc = new Scanner(System.in);

int [] ARR = new int[8];

for( int i = 0 ; i< 8 ; i++){
    ARR[i] = sc.nextInt();

}

   System.out.println(" the first way is" + " = " + arr[3]);
      System.out.println(" the second way is" + " = " + Arr[3]);

         System.out.println(" the third way is" + " = " + ARR);



    }
}
