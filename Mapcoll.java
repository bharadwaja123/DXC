import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Set;

public class Mapcoll {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hs=new HashMap<>();
		hs.put(1,"messi");
		hs.put(2, "ronaldo");
		hs.put(3, "sergio");
		
		String value=hs.get(1);
         System.out.println(value);
         Set<Integer>h=hs.keySet();
	}

}
