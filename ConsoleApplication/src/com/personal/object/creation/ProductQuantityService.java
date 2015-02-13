package com.personal.object.creation;

public interface ProductQuantityService {

	int getQuantity(int productId);
	
	class Impl implements ProductQuantityService {

		@Override
		public int getQuantity(int productId) {
			return 0;
		}
		
	}
}
