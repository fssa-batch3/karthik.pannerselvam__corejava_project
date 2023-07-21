package day06.Practice;

public class TaskTracker {
	private String TaskName;
	private int priority;
	
	public TaskTracker( String TaskName, int priority) {
		this.TaskName = TaskName;
		this.priority = priority;
	}
	
	
	public String getName() {
		return TaskName;
	}
	
	public void setName(String TaskName) {
		this.TaskName = TaskName;
	}
	
	public int priority () {
		return priority;
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	}


