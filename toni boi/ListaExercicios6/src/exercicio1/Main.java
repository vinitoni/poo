package exercicio1;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String... args) {
		List<Character> lista = new LinkedList<Character>();
		
		lista.add('A');
		lista.add('B');
		lista.add('C');
		lista.add('D');
		lista.add('E');
		lista.add('F');
		lista.add('G');
		lista.add('H');
		
		ListIterator<Character> iterator = new ListIterator<Character>(lista);
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
