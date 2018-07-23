import java.util.ArrayList;
import java.util.List;

public class TestForEach
{
	public static void main(String[] args)
	{
		List<StringBuilder> list = new ArrayList<>();
		list.add(new StringBuilder("abc"));
		list.add(new StringBuilder("bbb"));
		list.add(new StringBuilder("ccc"));
		System.out.println(list);
		for (int i = 0; i < list.size(); i++)
		{
			list.set(i, list.get(i).append("mod"));
		}
		System.out.println(list);
		for (StringBuilder s : list)
		{
			s.append(" again");
		}
		System.out.println(list);
	}
}
