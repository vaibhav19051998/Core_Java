package com.cg.streampipeline;
// Program on Mapping Operation
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapping_Operation {

	public static void main(String[] args) {
		List<String>I=Arrays.asList(new String[] {"ram","sham","radha","sita"});
		System.out.println("Word Length :");
		I.stream().map(String::length).forEach(i->System.out.print(i+" "));
		System.out.println();
		
		List<Integer>B=Arrays.asList(new Integer[] {5,10,7,9});
		List<Integer>C=B.stream().map(i->i*i).collect(Collectors.toList());
		System.out.print(C);
		
		}

}
