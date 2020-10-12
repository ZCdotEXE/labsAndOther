package com.zarriacook.laba;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestLabA {
	
	LabA myLabA;
	
	@BeforeEach
	void testDivide() {
	myLabA = new LabA();

	}
	
	@Test
	void testAdd() {
		myLabA = new LabA();
		int x = myLabA.add(6,2);
		
		assertEquals(x,8);
		}
	
	@Test
	void testSubtract() {
		myLabA = new LabA();
		int x = myLabA.subtract(6,2);
		
		assertEquals(x,4);
		}
}
