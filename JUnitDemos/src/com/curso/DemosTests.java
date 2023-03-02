package com.curso;

import static org.junit.jupiter.api.Assertions.*;//usamos elementos estáticos

import java.lang.annotation.Repeatable;
import java.time.Duration;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class DemosTests {
	
	@Test
	@DisplayName("Length Basic")
	void length_basic() {
		int actualLength = "ABCD".length();
		int expectedLength = 4;
		assertEquals(actualLength, expectedLength);
	}
	
	@Test
	void lengt_greater_than_zero() {//espera un true de retorno
		String chain = "ABCD";
		assertTrue(chain.length() > 0);
		assertTrue("jgdasd".length() > 0);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"has", "jhsjhfds", "jhd", "jjkkj"})
	void length_gtz_using_ParameterizedTest(String str) {
		assertTrue(str.length() > 2);
	}
	
	@ParameterizedTest(name = "{0} a Mayúsulas es {1}")
	@ValueSource(strings = {"abc, 4", "ABD", "abc, ABC", " ", "SDFGHJK, ghjk"})
	void uppercase(String word, String capitalizeWord) {
		assertEquals(capitalizeWord, word.toUpperCase());
	}
	
	@ParameterizedTest(name = "{0} tamaño es {1}")
	@ValueSource(strings = {"abc, 4", "ABD", "abc, ABC", " ", "SDFGHJK, ghjk"})
	void length(String word, int expectedLength) {
		assertEquals(expectedLength, word.length());
	}
	
	@Test
	@DisplayName("When length is null throw an exception")
	void length_exc() {
		String str = null;
		assertThrows(NullPointerException.class, () -> str.length());
	}
	
	
	@Test
	@Disabled //ya no la hace
	void perfonrmanceTest() {
		assertTimeout(Duration.ofSeconds(3), () -> {
			for (int i = 0; i <= 10_000; i++) {
				int j = i;
				System.out.println(j);
			}
		});
	}
	
	@Test
	void testNull() {
		String str ="abcd";
		String result = null;
		assertNotNull(str);
		assertNull(result);
	}
	
	@Test
	@RepeatedTest(5)
	void contains_basic() {
		assertFalse("asdfghj".contains("nmi"));
	}

	@Test
	void split_basic() {
	String str = "abc def ghi";
	String[] result = str.split(" ");
	String[] expected = new String[] {"abc", "def", "ghi"};
	assertArrayEquals(result, expected);
	}
	
	
	
}
