package com.vishnu.random.generator;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * random-number-generator : com.vishnu.random.generator
 * 
 * @author vishnu.g
 *
 *         14-Sep-2020
 */
public class RandomNumberGeneratorImpl implements RandomNumberGenerator {


	private final Random random;
	 
    public RandomNumberGeneratorImpl() {
        this.random = new Random();
    }
    
	@Override
	public int generate() {
		return random.nextInt();
	}


	@Override
	public int generate(int bound) {
		return random.nextInt(bound);
	}

	@Override
	public int[] generate(long streamSize, int origin, int bound) {
		return random.ints(streamSize, origin, bound).toArray();
	}

	@Override
	public List<Integer> generateToList(long streamSize, int origin, int bound) {
		return Arrays.stream(generate(streamSize, origin, bound))
				.boxed()
				.collect(Collectors.toList());
	}

}
