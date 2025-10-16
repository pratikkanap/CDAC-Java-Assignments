package com.demo.beans;

public class Student {
		private String studname;
		private int studid;
		private int m1;
		private int m2;
		private int avgmarks;
		
		//default constructor stud
		public Student() {
			super();
		}

		/* studname studid m1, m2, avgmarks*/
		public Student(String studname, int studid, int m1, int m2, int avgmarks) {
			super();
			this.studname = studname;
			this.studid = studid;
			this.m1 = m1;
			this.m2 = m2;
			this.avgmarks = avgmarks;
		}

		public Student(int studid) {
			super();
			this.studid = studid;// TODO Auto-generated constructor stub
		}

		public String getStudname() {
			return studname;
		}

		public void setStudname(String studname) {
			this.studname = studname;
		}

		public int getStudid() {
			return studid;
		}

		public void setStudid(int studid) {
			this.studid = studid;
		}

		public int getM1() {
			return m1;
		}

		public void setM1(int m1) {
			this.m1 = m1;
		}

		public int getM2() {
			return m2;
		}

		public void setM2(int m2) {
			this.m2 = m2;
		}

		public int getAvgmarks() {
			return avgmarks;
		}

		public void setAvgmarks(int avgmarks) {
			this.avgmarks = avgmarks;
		}
		//to string

		@Override
		public String toString() {
			return "Student [studname=" + studname + ", studid=" + studid + ", m1=" + m1 + ", m2=" + m2 + ", avgmarks="
					+ avgmarks + "]";
		}
		
		
		
		
		
		
}


