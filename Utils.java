import java.nio.file.*;
import java.util.stream.*;
import java.util.*;
import java.io.*;

public class Utils
{
  public static void loadStringsToArray(ArrayList<String> arrList) throws IOException
  {
    
    Path path = Paths.get("C:\\WIN2020\\java\\bookstoreJava\\bookfile.txt");
    arrList.clear();
     
    try (Stream<String> lines = Files.lines(path))
    {
      Object[] arr = lines.toArray();

      for(Object t: arr)
      {
        arrList.add(t.toString());
      }
    }
  }

}