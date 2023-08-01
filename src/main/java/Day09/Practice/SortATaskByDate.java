package day09.practice;

import java.util.Comparator;

import com.fssa.learnJava.project.taskapp.model.Task;

public abstract class SortATaskByDate implements Comparator<Task> {
	public int compare(Task a, Task b) {

	return a.getDeadline().compareTo(b.getDeadline());
	


	}
}