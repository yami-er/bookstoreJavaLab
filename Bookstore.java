//import java.time;
import java.util.*;
import java.io.*;
public class Bookstore {
    

        String name;
        String address;
        int sqfeet;
        boolean storeOpen;
        boolean storesClosed;
        String openTime;
       
        String closeTime;
        String usedOrNew;

        private ArrayList<String> titles = new ArrayList<String>();

       public Bookstore(){
        this.openTime="8AM";
        this.closeTime="5PM";
        this.loadTitles();
       }
       public Bookstore(String ot, String ct){
        this.openTime=ot;
        this.closeTime=ct;
        this.loadTitles();
       }
        
       private void loadTitles()
        {
        try
        {
                Utils.loadStringsToArray(this.titles);
        }
        catch (IOException e)
        {
                // for now simply init the array to zero
                System.out.println("Could not initilize the titles");
                // make sure it is empty
                this.titles = new ArrayList<String>();
        
        }
        }

        public int numberOfTitles(){
                return this.titles.size();
       
               }

        public String getAddress(){
         return this.address;

        }
        public String getName(){
          return this.name;
 
         }
         public int sqfeet(){
          return this.sqfeet;
 
         }
         public boolean storeOpen(){
          return this.storeOpen;
 
         }
         public boolean storeClosed(){
          return this.storesClosed;
 
         }
         public String openTime(){
          return this.openTime;
 
         }
         public String closeTime(){
                return this.closeTime;
       
        }
         public String usedOrNew(){
          return this.usedOrNew;
 
         }
 }
    
    
    