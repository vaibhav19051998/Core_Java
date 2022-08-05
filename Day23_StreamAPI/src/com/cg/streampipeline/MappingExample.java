package com.cg.streampipeline;
//Program on Mapping Operation

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MappingExample {

	public static void main(String[] args) {
		List<Integer>A=Arrays.asList(new Integer[] {52,55,49,73});
		Optional<Integer>B= A.stream().filter((i)->i>5).reduce((a,b)->a>b?a:b);
		if(B.isPresent())
		{
			System.out.println("Result: "+B.get());
		}
	
	
	}

}
