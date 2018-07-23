import java.util.HashMap;
import java.util.Iterator;

class HMObject
{

	public HMObject(String key, String value, Integer used)
	{
		super();
		this.key = key;
		this.value = value;
		this.used = used;
	}
	String key;
	String value;
	Integer used;
}

public class LRUCache
{
	int size;
	HashMap<String, HMObject> map = new HashMap();

	public void set(String k, String v)
	{
		if (map.get(k) == null && map.size() < size)
		{
			//add to map
			map.put(k, new HMObject (k, v, 1));
		}
		//Not present in map but size issue
		else if (map.get(k) ==null)
		{
			//evict
			evict (map);
			map.put(k, new HMObject (k, v, 1));
		}
		else if (map.get(k) !=null)
		{
			map.put(k, new HMObject (k, v, 1));
		}
			
	}

	private void evict(HashMap<String, HMObject> map2)
	{
		String keyToBeRemoved = null;
		Integer lowestValue = Integer.MAX_VALUE;
		// TODO Auto-generated method stub
		for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
		{
			String key = (String) iterator.next();
			HMObject value = map.get(key);
			if (value.used < lowestValue)
			{
				lowestValue = value.used;
				keyToBeRemoved = key;
			}
		}
		//Remove keyToBeRemoved
		map.remove(keyToBeRemoved);
	}

	public String get(String k)
	{
		return map.get(k).value;
	}

}
