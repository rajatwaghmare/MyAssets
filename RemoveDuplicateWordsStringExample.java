import java.util.*;
import java.util.stream.*;
 
public class  {
 
    public static void main(String[] args) {
        
        String str = 
            "India", "China", "India", "China";
            
        str = Arrays.stream( str.split("\\s+")).distinct().collect(Collectors.joining(" ") );
        
        System.out.println(str);
 
    }
}