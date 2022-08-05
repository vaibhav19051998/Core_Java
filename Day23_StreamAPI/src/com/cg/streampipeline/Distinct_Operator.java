package com.cg.streampipeline;
//Program of Stream API on Distinct, Limit, Shorted_Operator
import java.util.Arrays;
import java.util.List;

public class Distinct_Operator {

	public static void main(String[] args) {
		List<String>str=Arrays.asList("Vaibhav","Pratik","Pavan");
		//Distinct: Take unique values
		str.stream().distinct().forEach(System.out::println);
		//Limit : Set the limit of element
		str.stream().limit(2).forEach(System.out::println);
		//Shorted the function
		str.stream().sorted().forEach(System.out::println);
		
	}

}
