
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class TestAnagram {

	@Test
	public void empty_word_list_and_input_is_any_word() {
		assertAnagramsEquals(new String[]{}, new String[]{}, "anyword");
	}

	@Test
	public void one_word_list_and_input_is_double_of_this_word() {
		assertAnagramsEquals(new String[]{"a a"}, new String[]{"a"}, "aa");
		assertAnagramsEquals(new String[]{"b b"}, new String[]{"b"}, "bb");
		assertAnagramsEquals(new String[]{}, new String[]{"b"}, "aa");
		assertAnagramsEquals(new String[]{"ab ab"}, new String[]{"ab"}, "abab");
	}
	
	@Test
	public void more_than_one_word_list_and_input_is_double_of_non_first_word() {
		assertAnagramsEquals(new String[]{"b b"}, new String[]{"a", "b"}, "bb");
		assertAnagramsEquals(new String[]{"c c"}, new String[]{"a", "b", "c"}, "cc");
	}

	private void assertAnagramsEquals(String[] expectedAnagrams, String[] wordList, String input) {
		Anagram generator = new Anagram(wordList);
		List<String> actualAnagrams = generator.generate(input);
		assertEquals(Arrays.asList(expectedAnagrams), actualAnagrams);
	}
	
}
