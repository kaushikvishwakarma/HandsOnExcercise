package TaskManagementSystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Task Management System ===\n");

        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(301, "Prepare sprint report", "Pending"));
        taskList.addTask(new Task(302, "Review pull requests", "In Progress"));
        taskList.addTask(new Task(303, "Update deployment plan", "Pending"));

        System.out.println("All tasks:");
        taskList.traverseTasks();

        System.out.println("\nSearching task 302:");
        System.out.println(taskList.searchTask(302));

        System.out.println("\nDeleting task 301:");
        System.out.println("Deleted: " + taskList.deleteTask(301));

        System.out.println("\nTasks after delete:");
        taskList.traverseTasks();
    }
}