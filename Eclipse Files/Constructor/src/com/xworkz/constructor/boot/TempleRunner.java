package com.xworkz.constructor.boot;

import com.xworkz.constructor.Temple;

public class TempleRunner {

	public static void main(String[] args) {
		
		String[] items1 = {"Prabanan","Murugan temple","Hallur Basavanna","Banashankari Temple"};
		String[] items2 = {"Indonesia","Australia","Bagalkot"};
		String[] items3 = {"Mom ","Dad","Brother","Sister"};
		double[] items4 = {15000.0,15000.0,15000.0};
		long[]   items5 = {13458,7945,1455};
		String[] items6 = {"India","Indonesia","Australia"};
		
		Temple Namaskara = new Temple("Mount Elbrus",'S',"Russia",1,true,items1,items2,items3,items4,items5,items6);
		
		Namaskara.display();

	}

}
