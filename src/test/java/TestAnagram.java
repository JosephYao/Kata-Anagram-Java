
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class TestAnagram {

	@Test
	public void empty_word_list_and_any_word() {
		assertAnagramsEquals(new String[]{}, new String[]{}, "anyword");
	}

	@Test
	public void one_word_list_and_input_is_double_of_this_word() {
		assertAnagramsEquals(new String[]{"a a"}, new String[]{"a"}, "aa");
		assertAnagramsEquals(new String[]{"b b"}, new String[]{"b"}, "bb");
		assertAnagramsEquals(new String[]{}, new String[]{"a"}, "bb");
		assertAnagramsEquals(new String[]{"ab ab"}, new String[]{"ab"}, "abab");
	}
	
	@Test
	public void more_than_one_word_list_and_input_is_the_combination_of_first_and_any_other_word() {
		assertAnagramsEquals(new String[]{"a b"}, new String[]{"a", "b"}, "ab");
		assertAnagramsEquals(new String[]{"a c"}, new String[]{"a", "b", "c"}, "ac");
	}
	
	@Test
	public void input_is_the_combination_of_any_word_in_the_word_list() {
		assertAnagramsEquals(new String[]{"b c"}, new String[]{"a", "b", "c"}, "bc");
		assertAnagramsEquals(new String[]{"b d"}, new String[]{"a", "b", "c", "d"}, "bd");
	}
	
	@Test
	public void word_combination_is_anagram_but_order_is_different_from_input() {
		assertAnagramsEquals(new String[]{"a b"}, new String[]{"a", "b"}, "ba");
	}
	
	@Test
	public void more_than_one_anagrams() {
		assertAnagramsEquals(new String[]{"a bc", "a cb"}, new String[]{"a", "bc", "cb"}, "abc");
		assertAnagramsEquals(new String[]{"a bcd", "a cbd", "a dcb"}, new String[]{"a", "bcd", "cbd", "dcb"}, "abcd");
	}
	
	@Test
	public void acceptance_test() {
		assertAnagramsEquals(new String[]{"ab ab", "ab ba", "ba ba"}, new String[]{"ab", "ba"}, "abab");
		assertAnagramsEquals(new String[]{"ab cd", "ab dc", "ba cd", "ba dc", "bc ad"}, 
				new String[]{"gh", "ab", "ba", "cd", "ef", "bc", "ad", "dc"}, "abcd");
	}
	
	private void assertAnagramsEquals(String[] expectedAnagrams, String[] wordList, String input) {
		Anagram generator = new Anagram(wordList);
		List<String> actualAnagrams = generator.generate(input);
		assertEquals(Arrays.asList(expectedAnagrams), actualAnagrams);
	}
	
}
