package com.personal.generic;

import java.util.ArrayList;
import java.util.List;

public class SortableDriver {

	public static void main(String[] args) {

		Sortable<Integer> sort = new SortableImpl<Integer>();
		@SuppressWarnings("rawtypes")
		List l = new ArrayList();
		l.add(1);
	}

}
