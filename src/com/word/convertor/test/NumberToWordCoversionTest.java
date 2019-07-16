package com.word.convertor.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.word.convrtor.Problem1_NumberToWordCoversion;
/**
 * 
 * @author Nivedita
 * To test the possible inputs for the program.
 *
 */
class NumberToWordCoversionTest {
	
	private Problem1_NumberToWordCoversion wordConvertor;
	
	@Before
	public void setUp() {
		wordConvertor = new Problem1_NumberToWordCoversion();
	}

	@Test
	void testBelow10() {		
		assertEquals(" two",wordConvertor.convert(2l));
	}
	

	@Test
	void testFor0() {
		assertEquals("zero",wordConvertor.convert(0l));
	}

	@Test
	void testForNegativeNumber() {
		assertEquals("Number must be greater than zero.",wordConvertor.convert(-6l));
	}

}
