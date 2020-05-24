//import java.time;
import java.util.*;
import java.io.*;
public class Bookstore {
        private String name;
        private String address;
        private int sqfeet;
        private boolean storeOpen;
        private boolean storesClosed;
        private String openTime;
        private String closeTime;
        private String usedOrNew;

        private ArrayList<String> titles = new ArrayList<String>();

        //constractor
        public Bookstore(String name, String address, int sqfeet,boolean storeOpen,
        boolean storesClosed,String openTime,String closeTime,String usedOrNew){
                this.name = name;
                this.address = address;
                this.sqfeet = sqfeet;
                this.storeOpen = storeOpen;
                this.storesClosed = storesClosed;
                this.closeTime = closeTime;
                this.openTime = openTime;
                this.usedOrNew = usedOrNew;
                this.loadTitles();
        }
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

        //getters 
        public String getName(){
        return this.name;

       }
        public String getAddress(){
         return this.address;

        }
       
         public int getSqfeet(){
          return this.sqfeet;
 
         }
         public boolean getStoreOpen(){
          return this.storeOpen;
 
         }
         public boolean getStoreClosed(){
          return this.storesClosed;
 
         }
         public String getOpenTime(){
          return this.openTime;
 
         }
         public String getCloseTime(){
                return this.closeTime;
       
        }
         public String getusedOrNew(){
          return this.usedOrNew;
 
         }
         public String getTitles(){
          return this.titles;
         }

         //setter
         public void setName(String name){
                 this.name = name;
         }
         public void setAddress(String address){
                this.address = address;
        }
        public void setSqfeet(int sqfeet){
                this.sqfeet = sqfeet;
        }
        public void setStoreOpen(boolean storeOpen){
                this.storeOpen = storeOpen;
        }
        public void setStoresClosed(boolean storesClosed){
                this.storesClosed = storesClosed;
        }
        public void setOpenTime(String openTime){
                this.openTime = openTime;
        }
        public void setCloseTime(String closeTime){
                this.closeTime = closeTime;
        }
        public void setUsedOrNew(String usedOrNew){
                this.usedOrNew = usedOrNew;
        }
        public void setTitles(ArrayList<String> titles){
                this.titles = titles;
        }
        //method to get number of title the store has
        public int numberOfTitles(){
                return this.titles.size();
         }
         //method to check if the store has a specific title
         public boolean isTitleAvailable(String title){
                return this.titles.contains(title);
         }
         //method to check if word appears anywhere in a title  
         public boolean isWordAvailable(String word){
                boolean available = false;
                for(String t:titles){
                        if(t.contains(word)){
                                available = true;
                                break;
                        }
                }
                return available; 
         }       
 }
    
    
    