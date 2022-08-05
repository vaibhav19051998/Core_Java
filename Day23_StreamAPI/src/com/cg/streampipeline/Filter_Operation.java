package com.cg.streampipeline;
//Program of Stream API on Filter_Operation  

import java.util.Arrays;
import java.util.List;

public class Filter_Operation {

	public static void main(String[] args) {
		List<Integer>A=Arrays.asList(15,25,36,84);
		//System.out.println(A);
		//Filtering with conditions : filter(predicated)
		A.stream().filter(i->i>15).forEach(System.out::println);
		
	}

}
