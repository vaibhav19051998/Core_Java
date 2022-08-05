package com.cg.streampipeline;
//Program on Stream API

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Basic_Stream {

	public static void main(String[] args) {
		//Stream can be created with static data
		Stream<String>A=Stream.of("Vaibhav ","Priyanka ","Chetan ","Sakshi ");
		A.forEach((n)->System.out.print(n));
		System.out.println();
		//Stream can be acquired from array or collections
		List<String>B=Arrays.asList(new String[] {"Mumbai","Pune", "Amravati","Nagpur"});
		A=B.stream();
		A.forEach(System.out::println);
	}

}
