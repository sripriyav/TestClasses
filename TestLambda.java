import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestLambda
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("a1", "a2", "a3", "a4","a5","a6","a7","a8","a9","a10","a11"); // a1
		
		list.forEach(a->System.out.println(a));
		
		System.out.println("***");
		list.stream().limit(15).filter(string->string.contains("a11")).collect(Collectors.toList()).forEach(System.out::println);;
		System.out.println("***");
		
		list.forEach(System.out::println);
	}
}