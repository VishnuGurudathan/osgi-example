package com.vishnu.random.reader;

import com.vishnu.random.generator.RandomNumberGenerator;

/**
 * random-number-reader : com.vishnu.random.reader
 * 
 * @author vishnu.g
 *
 *         13-Sep-2020
 */
public class RandomNumberReader implements Runnable {

	private final RandomNumberGenerator randomNumberGenerator;
    private volatile boolean generate = true;
 
    public RandomNumberReader (final RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

	@Override
	public void run() {
		while (this.generate) {
            System.out.println ("New random number: " + this.randomNumberGenerator.generate(100));
            try {
                Thread.sleep (1000);
            } catch (final InterruptedException exc) {
            	System.err.println("Error in generating random number, " + exc.getMessage());
                break;
            }
        }
        System.out.println ("Random generation process got terminated.");
    }
 
    public void stop () {
        this.generate = false;
    }
}
