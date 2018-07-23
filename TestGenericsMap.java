import java.util.HashMap;

public class TestGenericsMap
{
	public static void main(String[] args)
	{
		int i = 1;
		String s ="test";
		HashMap<Integer, String> map = new HashMap <>();
		map.put(i, s);
		System.out.println(map);
	}
}
