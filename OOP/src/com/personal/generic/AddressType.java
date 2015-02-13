package com.personal.generic;

import java.util.Collections;
import java.util.List;

public enum AddressType implements Sortable<AddressType> {

	BILLING,
	SHIPPING,;

	@Override
	public void sort(List<AddressType> items) {
		Collections.sort(items);
	}
}
