package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<String, List<String>> list = new HashMap<String, List<String>>();

		List<String> newyorkList = new ArrayList<>();
		newyorkList.add("Rochester");
		newyorkList.add("Niagra Falls");
		newyorkList.add("Albany");
		list.put("Newyork", newyorkList);

		List<String> texasList = new ArrayList<>();
		texasList.add("Dallas");
		texasList.add("Houston");
		texasList.add("San Antonio");
		list.put("Texas", texasList);

		List<String> floridaList = new ArrayList<>();
		floridaList.add("Miami");
		floridaList.add("Orlando");
		list.put("Florida",floridaList);


		for (Map.Entry<String, List<String>> entry : list.entrySet()) {
			String key = entry.getKey();
			List<String> value = entry.getValue();
			for(String aString : value){
				System.out.println("key : " + key + " value : " + aString);
			}
		}

	}

}
