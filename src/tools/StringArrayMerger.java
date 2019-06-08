package tools;

/** 
 * Merge two String-Arrays. Singleton-Class.
 * 
 * @author Steffen Benjamin Owtschinnikow
 * @version 1.0
 * @since 2019-06-06
 */

public class StringArrayMerger {

	private static StringArrayMerger stringArrayMerger;

	private StringArrayMerger() {
	}
	
	/*
	 * Return an StringArrayMerger Object.
	 * @return stringArrayMerger StringArrayMerger-Object
	 * */

	public static StringArrayMerger getStringArrayMerger() {
		if (stringArrayMerger == null) {
			stringArrayMerger = new StringArrayMerger();
		}

		return stringArrayMerger;
	}
	
	/*
	 * Merge two String-arrays.
	 * @param s1 String-array to merge
	 * @param s2 String-array to merge
	 * @return erg Merged arrays in new String-Array-Object
	 * */

	public static final String[] mergeStringArrays(String[] s1, String[] s2) {
		String[] erg = new String[s1.length + s2.length];

		System.arraycopy(s1, 0, erg, 0, s1.length);
		System.arraycopy(s2, 0, erg, s1.length, s2.length);

		return erg;
	}

}
