public class Sub extends Super
{
	public Sub()
	{
		System.out.println("sub");
	}

	public static void main(String[] args)
	{
		Super superObj = new Sub ();
		System.out.println(superObj.getClass() == Super.class);
		System.out.println(superObj.getClass() == Sub.class);
		System.out.println(superObj instanceof Super);
		System.out.println(superObj instanceof Sub);
	}
}
