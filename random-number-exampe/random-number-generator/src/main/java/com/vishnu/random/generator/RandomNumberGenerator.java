package com.vishnu.random.generator;

import java.util.List;

/**
 * random-number-generator : com.vishnu.random.generator
 * 
 * @author vishnu.g
 *
 *         14-Sep-2020
 */
public interface RandomNumberGenerator {
	
	/**
	 * 
	 * @return randomly generated number.
	 */
	int generate();
	
	/**
	 * 
	 * @param bound
	 * @return randomly generated number with in upper bound.
	 */
	int generate(int bound);
	
	/**
	 * 
	 * @param streamSize
	 * @param origin
	 * @param bound
	 * @return integer array of randomly generated number between origin and bound.
	 */
	int[] generate(long streamSize, int origin, int bound);
	
	/**
	 * 
	 * @param streamSize
	 * @param origin
	 * @param bound
	 * @return list of {@link Integer} randomly generated between origin and bound.
	 */
	List<Integer> generateToList(long streamSize, int origin, int bound);

}
