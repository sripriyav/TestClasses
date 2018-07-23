import java.util.ArrayList;

public class TestArr
{
	public static void main(String[] args)
	{
		ArrayList<String> ar = new ArrayList<String>();
        ar.add("created");
        ar.add("contact");
        System.out.println(ar);
        ar.remove("created ");
        System.out.println(ar);
	}
}
