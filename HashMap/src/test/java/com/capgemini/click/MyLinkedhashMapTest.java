package com.capgemini.click;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class MyLinkedhashMapTest {

	private static final Logger log = LogManager.getLogger(MyLinkedList.class);

	/*
	 * @Test public void
	 * givenASentenceWhenWordsAreAddedToListShouldReturnParanoidFrequency() { String
	 * sentence = "Paranoids are not paranoid because they are paranoid but " +
	 * "because they keep putting themseleves deliberately into " +
	 * "paranoid avoidable situations";
	 * 
	 * MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
	 * String[] words = sentence.toLowerCase().split(" ");
	 * 
	 * for (String word : words) { Integer value = myLinkedHashMap.get(word); if
	 * (value == null) value = 1; else value = value + 1; myLinkedHashMap.add(word,
	 * value); }
	 * 
	 * int frequency = myLinkedHashMap.get("paranoid"); log.info(myLinkedHashMap);
	 * Assert.assertEquals(3, frequency); }
	 */
	@Test
	public void givenASentence_WhenWordsAreAddedToList_ShouldRemoveAvoidable() {
		String sentence = "Paranoids are not paranoid because they are paranoid but "
				+ "because they keep putting themseleves deliberately into " + "paranoid avoidable situations";

		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");

		for (String word : words) {
			Integer value = myLinkedHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myLinkedHashMap.add(word, value);
		}

		log.info(myLinkedHashMap);
		String result = myLinkedHashMap.searchDelete("avoidable");
		log.info(myLinkedHashMap);
		Assert.assertEquals("avoidable", result);
	}
}
