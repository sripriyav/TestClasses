import java.util.ArrayList;

public class TestPerformance {
	public static void main(String[] args) {
		ArrayList<String> manyStrings = new ArrayList<String>();
		for (int i = 0; i < 100000; i++) {
			for (int j = 0; j < 1000; j++) {
				manyStrings.add("values" + j);
			}
			System.out.println(i);
		}
	}
}
