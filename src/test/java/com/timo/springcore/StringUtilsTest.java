package com.timo.springcore;

import org.apache.commons.lang3.ObjectUtils;
import org.junit.Test;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.util.WebUtils;

import java.util.*;

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
	@Test
	public void test2(){
	/*	ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<6;i++){
			list.add(i);
		}
		String str = org.apache.commons.lang3.StringUtils.join(list, "#");
		System.out.println(str);*/
		Integer min = ObjectUtils.min(1, 2, 3);
		Integer max = ObjectUtils.max(1, 2, 3);
		System.out.println(max
		);
		System.out.println(min);
	}
}

