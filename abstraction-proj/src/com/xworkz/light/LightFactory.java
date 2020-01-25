package com.xworkz.light;

public class LightFactory {
	public static ISwitch getLight(String type) {

		if (type.equalsIgnoreCase("TubeLight")) {
			return new TubeLightImpl();
		} else if (type.equalsIgnoreCase("LedLight")) {
			return new LedLightImpl();
		} else
			return null;
	}

}
