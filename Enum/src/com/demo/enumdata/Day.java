package com.demo.enumdata;

public enum Day {
	MONDAY{
		public String getNumber() {
				return "1st Day";
		}
	},
	FRIDAY{
		public String getNumber() {
			return "5th Day";
		}
	},
	SATURDAY{
		public String getNumber() {
			return "7th Day";
		}
	
		
	};
	
    public abstract String getNumber();

}
