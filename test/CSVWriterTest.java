import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import tools.StringArrayMerger;

class CSVWriterTest {

	@Test
	void testConcat() {

		String[] s1 = { "1", "2", "3" };
		String[] s2 = { "1", "2", "3", "4" };
		String[] s3 = { "1", "2", "3", "1", "2", "3", "4" };
		String[] s4 = { "1", "2", "3", "4", "1", "2", "3" };

		assertArrayEquals(s3, StringArrayMerger.mergeStringArrays(s1, s2));
		assertArrayEquals(s4, StringArrayMerger.mergeStringArrays(s2, s1));
	}
	
}
