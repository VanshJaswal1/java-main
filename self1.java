class freinds {
     freinds() {
        System.out.println("list of freinds");
     }
     void Freinds () {
               System.out.println(" this is the list of freinds ");
     }
}

class vansh extends freinds{
    void Vansh() {
        System.out.println(" they all are my freinds ");
    }
}

public class self1 {
     public static void main(String[] args) {
        System.out.println("justva self made boeing code ");

          freinds obj1 = new freinds();
          obj1.Freinds();
          vansh obj2 = new vansh();
          obj2.Vansh();

        //  freinds obj3 = new vansh();
        //  obj3.Freinds();
         
        // vansh obj3 = new freinds();
        //  obj3.Freinds();     isse errror ayga

    //     freinds obj3 = new vansh();
    // obj3.Vansh();   errro dega
     }
}
