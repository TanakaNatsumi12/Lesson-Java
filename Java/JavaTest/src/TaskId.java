
import java.util.ArrayList;

public class TaskId {
	public static void main(String[] args) {
		
		ArrayList<String> taskList = new ArrayList<>();
		
		taskList.add("TASK001");
		taskList.add("TASK002");
		taskList.add("TASK003");
		taskList.add("TASK001");
		taskList.add("TASK004");
		taskList.add("TASK002");
		
		System.out.println("処理済みタスクID一覧：");
		
		for(String task : taskList) {
			System.out.println("-" + task);
		}
		
		String task2 = "TASK003";
		String task3 = "TASK005";
		
		if(taskList.contains(task2)) {
			System.out.println("処理済み");
		}else {
			System.out.println("未処理");
		}
		
		if(taskList.contains(task3)) {
			System.out.println("処理済み");
		}else {
			System.out.println("未処理");
		}
		
		
		System.out.println("処理済みのタスクの総数；" + taskList.size());
		
		
		
	}
}
