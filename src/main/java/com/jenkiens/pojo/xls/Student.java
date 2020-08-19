package com.jenkiens.pojo.xls;

public class Student {

		int sr;
		String className;
		String pack;
		int line;
		public Student(int sr,String pack,String className, int line) {
			super();
			this.sr = sr;
			this.className = className;
			this.pack = pack;
			this.line = line;
		}
		@Override
		public String toString() {
			return "Student [sr=" + sr + ", className=" + className + ", pack=" + pack + ", line=" + line + "]\n";
		}

		
}
