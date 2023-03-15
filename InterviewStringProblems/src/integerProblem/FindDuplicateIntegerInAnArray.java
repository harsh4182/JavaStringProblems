package integerProblem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FindDuplicateIntegerInAnArray 
{
	public static void main(String[] args) 
	{		
		String names[] = {"harsh","harsh","raj","harsh","kumar","raj"};
		Map<String,Integer> m = new HashMap<String,Integer>();
		for(String name:names) 
		{
			if(!(m.containsKey(name))) 
			{
				m.put(name, 1);
			}
			else {
				int count= (int) m.get(name);
				m.put(name, ++count);
			}				
		}	
		Iterator<Map.Entry<String, Integer>>itr = m.entrySet().iterator();
		while(itr.hasNext()) 
		{
			Map.Entry<String, Integer>entry = itr.next();
			if((int)entry.getValue()>1) 
			{
				System.out.println(entry.getKey()+" count is : "+entry.getValue());
			}
			
		}
		Set<String> s = new HashSet<String>();
		for(String name:names) 
		{
			if(s.add(name)==false) {
				System.out.println(name);
			}
		}
		
	}
}
