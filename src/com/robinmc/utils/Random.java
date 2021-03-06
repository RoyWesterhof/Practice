package com.robinmc.utils;

import java.util.concurrent.ThreadLocalRandom;

public class Random {
	
	private static java.util.Random random = new java.util.Random();
	
	public static int getRandomInteger(int min, int max){
		//return NumberUtils.randomInteger(min, max);
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}
	
	public static boolean getRandomBoolean(){
		int i = getRandomInteger(0, 1);
		if (i == 0){
			return false;
		} else {
			return true;
		}
	}
	
	public static double getRandomDouble(){
		return random.nextDouble();
	}
	
	public static float getRandomFloat(){
		return random.nextFloat();
	}

	/**
	 * @deprecated Use getRandomInteger() instead.
	 * @param min
	 * @param max
	 * @return
	 */
	@Deprecated
	public static float getRandomFloat(int min, int max){
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}
	
}