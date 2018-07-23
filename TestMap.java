import java.util.HashMap;


public class TestMap
{
	public void test (HashMap map)
	{
		System.out.println("8" + map);
		map = checkNull(map);
		System.out.println("10" + map);
		map.put("a", "b");
	}
	private HashMap checkNull(HashMap map)
	{
		if (map == null)
		{
			map = new HashMap();
		}
		return map;
	}
	public static void main(String[] args)
	{
		TestMap test = new TestMap ();
		HashMap map1 = null;
		System.out.println(map1);
		test.test(map1);
		System.out.println("27" + map1);
	}
}
