package com.epam.apiautomation.app;

public enum Context {
	
	IPET("InputPet"),
	OPET("OutputPet"),
	JSON("application/json");

	
	private String value;
	
		private Context(final String value) {
			this.value = value;
		}
	
		@Override
		public String toString() {
			return String.valueOf(this.value);
		}

}
