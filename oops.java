public class oops {

 
  class  dog {
  String name;
  int price;
   
 }
  
   public static void main ( String [] args) {
  
  // inside the main oops class 
      System.out.println(" the class inside the public class");
  

     oops dogs =  new oops();
     dog dog1 = dogs.new dog();
      
   dog1.name = "german";
   dog1.price = 100000;

        System.out.println("Dog Name: " + dog1.name);
        System.out.println("Dog Price: " + dog1.price);


        // outside the main oops class
        System.out.println(" the class outside the public class");

        // it does not require the main oops class object to make its own object
        cat cat1 = new cat();
        cat1.type = "desi bili hai badka ji " ;
        cat1.Price = 1000;
         
         System.out.println("cat Name: " + cat1.type);
        System.out.println("cat price: " + cat1.Price);

      }
}
class cat {

 String type;
 int Price;
}
  