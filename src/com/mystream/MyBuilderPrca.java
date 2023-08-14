package com.mystream;

import java.util.stream.Stream;

public class MyBuilderPrca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.Builder<String>builder=Stream.builder();
		builder.add("BaudeRate");
		builder.add("Ohm");
		builder.add("Kilowatt");
		builder.add("Bits");
		builder.add("Analog");
		builder.add("Digital");
		Stream<String> stream=builder.build();
        stream.forEach(System.out::println);
	}

}
