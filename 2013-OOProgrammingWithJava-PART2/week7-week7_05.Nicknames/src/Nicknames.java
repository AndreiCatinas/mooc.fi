
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        HashMap<String,String> alias = new HashMap();
        
        alias.put("matti", "mage");
        alias.put("mikael", "mixu");
        alias.put("arto", "arppa");
     
        System.out.println(alias.get("mikael"));
    }

}
