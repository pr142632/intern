package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashmapit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String ,Integer> p =new HashMap<>();
		
		p.put("India",120);
		p.put("Usa",50);
		p.put("france ",30);
		p.put("Germany", 20);
		System.out.print(p);
		
		  Iterator<Map.Entry<String, Integer>> iterator = p.entrySet().iterator();
		    while (iterator.hasNext()) {
		        Map.Entry<String, Integer> entry = iterator.next();
		        System.out.println(entry.getKey() + ":" + entry.getValue());
	}
	}

}
