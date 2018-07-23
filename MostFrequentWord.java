import java.util.HashMap;

public class MostFrequentWord
{
	// Given an array containing N words, you need to find the most frequent
	// word in the array.
	// If multiple words have same frequency then print the word that comes
	// first in lexicographical order.
	public static String mostFrequent(String[] arr)
	{
		if (arr == null || arr.length == 0)
			return null;
		String retVal;
		HashMap<String, Integer> number = new HashMap<>();
		for (String val : arr)
		{
			Integer value = number.get(val);
			if (value == null)
				number.put(val, 1);
			else
				number.put(val, ++value);
		}
		
		int max = -1;
		String word = null;
		//loop thru hashmap
		if (number.size() > 0)
		{
			for (String key: number.keySet())
			{
				Integer value = number.get(key);
				if (value > max)
				{
					max = value;
					word = key;
				}
				//take the one lexicographically lower
				else if (value == max)
				{
					if (word.compareTo(key) > 0)
					{
						word = key;
					}
				}
			}
		}
		return word;
	}

	public static void main(String[] args)
	{
		String [] vals = { "geeks", "code", "geeks"};
		String output = mostFrequent(vals );
		System.out.println(output);
	}
}
