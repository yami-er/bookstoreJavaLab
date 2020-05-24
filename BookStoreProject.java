
public class BookStoreProject {
    public static void main(String[] args) {
      Bookstore myStore = new Bookstore("Yami's bookstore","1234 S.Tryon st",1000,true,false, "9AM","5PM","new");
      
      System.out.println("What is the name of the store?");
      System.out.println(myStore.getName());

      System.out.println("What is the address of the store?");
      System.out.println(myStore.getAddress());

      System.out.println("What time will the store open?");
      System.out.println(myStore.getOpenTime());

      System.out.println("What time will the store close?");
      System.out.println(myStore.getCloseTime());

      System.out.println("What sqfeet of the store?");
      System.out.println(myStore.getSqfeet());

      System.out.println("Do you have used or new books");
      System.out.println(myStore.getusedOrNew());

      System.out.println("Is the store open?");
      System.out.println(myStore.getStoreOpen());

      System.out.println("Is the store closed?");
      System.out.println(myStore.getStoreClosed());

      System.out.println("Give me number of books");
      System.out.println(myStore.numberOfTitles());

      System.out.println("Is this title available? ");
      System.out.println(myStore.isTitleAvailable("Python Crash Course"));

      System.out.println("Is there a title with this word? ");
      System.out.println(myStore.isWordAvailable("Crash"));

    }
             
}


