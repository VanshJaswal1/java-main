public class Loop2 {
     public static void main(String[] args) {
         System.out.println("while loop");

 int i = 5;
  while( i<=10) {

     System.err.println("numbers upto" + i);
      i++;

  }
 
  System.out.println("second problem");
  int a = 7;
  while(a<=100) {

    System.out.println(" multiple of 7 / number divisble by 7" + (a%7 ==0) + a);
     a++;

  }
while (a <= 100) {
    if (a % 7 == 0) {
        System.out.println(a + " is divisible by 7");
    }
    a++;
}

     }
}
