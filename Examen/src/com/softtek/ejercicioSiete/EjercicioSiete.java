package com.softtek.ejercicioSiete;

import java.util.HashMap;
import java.util.Map;

public class EjercicioSiete {
	
	static Map <String, String> Maps = new HashMap();
	
	public void ObtPersonaje (String key) {
		System.out.println(key + " " + (Maps.get(key)));
	}
	
	public static void main(String[] args) {
		
		Maps.put("a1234", "Steve Jobs ");
		Maps.put("a1235", "Scott McNealy");
		Maps.put("a1236", "Jeff Bezos");
	    Maps.put("a1237", "Larry Ellison");
		Maps.put("a1238", "Bill Gates");
		 
		 EjercicioSiete result = new EjercicioSiete();
		 result.ObtPersonaje("a1236");
	}

}
