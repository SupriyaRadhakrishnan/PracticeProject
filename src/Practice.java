import java.util.Arrays;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.*;

public class Practice {

	public static void main(String[] args) {


		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,7));
		
		for (int i : list) {
			//System.out.println(i);
		}
		//list.forEach(i -> System.out.println(i));
		//list.forEach(System.out::println);
		
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		map.put(1, 7);
	    map.put(5, 3);
	    map.put(3, 8);
	    
	    Set<Integer> set = map.keySet();
//	    map.forEach((k,v) -> System.out.println(k + ":" + v));
//			
//	    Iterator<Integer> it =  map.keySet().iterator();
//	    
//	    while(it.hasNext()) {
//	    	int val = it.next();
//	    	System.out.println(val + ":" + map.get(val));
//	    }
	    
	    HashMap<Integer,Integer> map1 =  map.entrySet().stream().sorted(Entry.comparingByKey()).collect(Collectors.toMap(Entry::getKey,Entry::getValue,(e1,e2)-> e1,HashMap::new ));
	    	//System.out.println(map1);

	    Employee  e1 = new Employee(1,"John");
	    Employee  e2 = new Employee(2,"Amp");
	    List<Employee> emplist = new ArrayList<Employee>();
	    emplist.add(e1);
	    emplist.add(e2);
	   
	    Collections.sort(emplist,(s1,s2) -> s1.getName().compareTo(s2.getName()));
	    
	  emplist.forEach(m -> System.out.println(m.getId() + " : " + m.getName()));
	    
	}

}
