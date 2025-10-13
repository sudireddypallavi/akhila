package demo;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.annotation.Testable;
@Testable
public class Paramtest {
	
	@ParameterizedTest
	@ValueSource(strings = {"akhila","pravallika"})
	void endswith(String str)
	{
		assertTrue(str.endsWith("a"));
	}
}