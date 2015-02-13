package com.personal.generic;

public class EnumKeyValuePairDriver {

	public static void main(String[] args) {

		EnumKeyValuePair<AddressType, Integer> kv1 = EnumKeyValuePair.newInstance(AddressType.BILLING, 10);
		
		//Compile error
		//EnumKeyValuePair<Double, Integer> kv2 = EnumKeyValuePair.newInstance(10.0, 10);

	}

}
