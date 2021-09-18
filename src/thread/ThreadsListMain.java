package thread;

import java.util.Set;

public class ThreadsListMain {
	public static void main(String[] args) {
		//Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
		
		Thread.getAllStackTraces().keySet().forEach((t) -> System.out.println(t.getName() + "\nIs Daemon " + t.isDaemon() + "\nIs Alive " + t.isAlive()));
	}
}
