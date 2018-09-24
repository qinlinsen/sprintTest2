package com.timo.springcore;

import org.junit.Test;
import org.springframework.util.StringUtils;

/**
 * @author qinlinsen
 * @since 2019-09-24 中秋节
 */
public class StringUtilsTest {
	private static final String String_DEMO_EXAMPLE_WITH_COMMA = "1,2,3,4,5";
	@Test
	public void testCommaListsToString(){

		String[] stringArray = StringUtils.commaDelimitedListToStringArray(String_DEMO_EXAMPLE_WITH_COMMA);
		System.out.println(stringArray.length);
		//iterator stringArray:
		for(String str:stringArray){
			System.out.println(str);
		}
	}
}
