package com.dev.encapsulation;

public class Students {

		private int regno;
		private String name;
		private String email;
		private String password;
		
	public int getRegno() {			// helps to get variable and we can access
										// Read only
			return regno;
		}

		public void setRegno(int regno) {  // we can manipulate private data
											// Write only
			this.regno = regno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public void setPassword(String password) {   // its sensitive so we dint use getter method.
													//	we cant read we can write only
			this.password = password;
		}

	
}
