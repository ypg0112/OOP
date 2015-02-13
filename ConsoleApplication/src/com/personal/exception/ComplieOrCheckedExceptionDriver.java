package com.personal.exception;

import java.util.ArrayList;
import java.util.List;

public class ComplieOrCheckedExceptionDriver {

	public static void main(String[] args) throws DataNotFoundException {

		List<String> duplicateList = new ArrayList<String>();
		duplicateList.add("d");
		duplicateList.add("b");
		duplicateList.add("a");
		duplicateList.add("c");
		duplicateList.add("c");
			
		String result = null; 
		try {
			 result = searchKeyword(duplicateList, "asdasdf");
		} 
		
		finally {
			System.out.println("End.");
		}
		
	}
	
	private static String searchKeyword(List<String> datas, String keyword) throws DataNotFoundException {
		String result = null;
		try {
			for(String e : datas) {
				if(keyword.equals(e)) {
					result = e;
					break;
				}
			}
		}
		catch(NullPointerException e) {
			throw new IllegalArgumentException("Keyword cannot be null");
		}
		
		if(result == null) {
			throw new DataNotFoundException("Cannot find keyword:");
		}
		else {
			return result;
		}
	}

}
