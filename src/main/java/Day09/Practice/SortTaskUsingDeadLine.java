package Day09.Practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

class Task implements Comparable<Task>{
		private int id;
	    private String name;
	    private LocalDate deadline;
	    
	    public Task(){}

		public Task(int id, String name, LocalDate deadline) {
			super();
			this.id = id;
			this.name = name;
			this.deadline = deadline;
		}

		@Override
		public String toString() {
			return "Task [id=" + id + ", name=" + name + ", deadline=" + deadline + "]";
		}
	    
	    
}

public class SortTaskUsingDeadLine {
    public static void main(String[] args) {
    	
    }
}
