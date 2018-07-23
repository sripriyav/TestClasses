public class RuntimeTest
{
	public static void main(String[] args)
	{
		System.out.println(Runtime.getRuntime().totalMemory()
				- Runtime.getRuntime().freeMemory());

		for (int i = 0; i < 10000; i++)
		{
			String s = new String("abvcdfjdskfjdsl");
		}
		System.out.println(Runtime.getRuntime().totalMemory()
				- Runtime.getRuntime().freeMemory());

	}
}
