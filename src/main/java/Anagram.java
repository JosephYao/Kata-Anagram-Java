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

		for (String firstPartOfAnagram : wordList)
			for (String secondPartOfAnagram : wordList)
				if (isAnagram(input, firstPartOfAnagram, secondPartOfAnagram))
					return Arrays.asList(new String[] { createAnagram(
							firstPartOfAnagram, secondPartOfAnagram) });

		return new ArrayList<String>();
	}

	private String createAnagram(String firstPartOfAnagram,
			String secondPartOfAnagram) {
		return firstPartOfAnagram + " " + secondPartOfAnagram;
	}

	private boolean isAnagram(String input, String firstPartOfAnagram,
			String secondPartOfAnagram) {
		return (firstPartOfAnagram + secondPartOfAnagram).equals(input);
	}

}
