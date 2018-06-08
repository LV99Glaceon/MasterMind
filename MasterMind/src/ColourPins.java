import java.util.ArrayList;
import java.util.*;

public class ColourPins {
   public static void main(String[] args) {
      
    ArrayList<String> colour_list = new ArrayList<String>(5);


    colour_list.add("White");
    colour_list.add("Black");
    colour_list.add("Red");
    colour_list.add("Blue");
	colour_list.add("Yellow");
	colour_list.add("Green");
	    
    for (int i = 0; i < 6; i++)
      {
         System.out.println(colour_list.get(i).toString());
      }
    
  }
} 