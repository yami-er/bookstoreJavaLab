//import java.time;
//import java.util.Scanner;
//import java.util.*;
//import Bookstore.*;
public class BookStoreProject {
    public static void main(String[] args) {
      Bookstore myStore = new Bookstore("9AM", "9PM");
      myStore.name = "Yami's bookstore";
      myStore.address = "1234 S.Tryon st";
      myStore.sqfeet = 1000;
      myStore.storeOpen = true;
      myStore.storesClosed = false;
      //myStore.opentime = "8am";
      //myStore.closetime ="5pm";
      myStore.usedOrNew = "new";
      System.out.println("What is the name of the store?");
      System.out.println(myStore.name);

      System.out.println("What is the address of the store?");
      System.out.println(myStore.address);

      System.out.println("What time will the store open?");
      System.out.println(myStore.openTime());

      System.out.println("What time will the store close?");
      System.out.println(myStore.closeTime());

      System.out.println("What sqfeet of the store?");
      System.out.println(myStore.sqfeet);

      System.out.println("Do you have used or new books");
      System.out.println(myStore.usedOrNew);

      System.out.println("Is the store open?");
      System.out.println(myStore.storeOpen);

      System.out.println("Is the store closed?");
      System.out.println(myStore.storesClosed);

      System.out.println("Give me number of books");
      System.out.println(myStore.numberOfTitles());





      


    }
           
     
}


