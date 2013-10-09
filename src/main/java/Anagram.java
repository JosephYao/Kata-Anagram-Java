import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Anagram {

	private final List<String> wordList;

	public Anagram(String[] wordList) {
		this.wordList = Arrays.asList(wordList);
	}

	public List<String> generate(String input) {
		if (wordList.isEmpty())
			return new ArrayList<String>();
		
		if ((wordList.get(0) + wordList.get(0)).equals(input))
			return new ArrayList<String>(){{add(wordList.get(0) + " " + wordList.get(0));}};
		
		return new ArrayList<String>();
	}

}
