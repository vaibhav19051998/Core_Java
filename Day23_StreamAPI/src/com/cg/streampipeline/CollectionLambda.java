package com.cg.streampipeline;
//Program of Stream API on Collection Lambda 
import java.util.LinkedList;

public class CollectionLambda {

	public static void main(String[] args) {
		LinkedList<Character>ch=new LinkedList<>();
		ch.add('A');
		ch.add('B');
		ch.add('C');
		System.out.println(ch);
		//ch.forEach(n->System.out.println(n));
		ch.forEach(System.out::println);
	}

}
