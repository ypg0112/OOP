package com.personal.db.jdbc;

public class CustomerDB {

	private final int id;
	
	private final String firstName;
	
	private final String lastName;
	
	private final String email;
	
	private final String phone;
	
	private CustomerDB() {
		this(builder());
	}
	
	private CustomerDB(Builder builder) {
		this.id = builder.id;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.email = builder.email;
		this.phone = builder.phone;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	
	public static class Builder {
		
		private int id;
		
		private String firstName;
		
		private String lastName;
		
		private String email;
		
		private String phone;
		
		private Builder() {
			
		}

		public Builder withId(int id) {
			this.id = id;
			return this;
		}

		public Builder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder withLastName(String lastName) {
			this.lastName = lastName;
			return this;

		}

		public Builder withEmail(String email) {
			this.email = email;
			return this;
		}

		public Builder withPhone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public CustomerDB build() {
			return new CustomerDB(this);
		}
		
	}
}
