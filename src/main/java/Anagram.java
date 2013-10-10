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

		for (String secondPartOfAnagram : wordList)
			if (isAnagram(input, secondPartOfAnagram))
				return Arrays.asList(new String[]{createAnagram(secondPartOfAnagram)});

		return new ArrayList<String>();
	}

	private String createAnagram(String secondPartOfAnagram) {
		return wordList.get(0) + " " + secondPartOfAnagram;
	}

	private boolean isAnagram(String input, String secondPartOfAnagram) {
		return (wordList.get(0) + secondPartOfAnagram).equals(input);
	}

}
