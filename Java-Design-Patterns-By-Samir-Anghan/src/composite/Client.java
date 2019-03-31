package composite;

import java.util.Arrays;
import java.util.List;

/**
 * @author Samir Anghan
 *
 */
public class Client {
	
	public static void main(String[] args) {
		
		final List<String> list = Arrays.asList(new String[] { "Venus", "Earth", "Mars" });
		
		final ISort<String> s = Factory.getInstance().getBubbleSortAlgorithm();
		System.out.println(s.sort(list));
		
		final ISort<String> t = Factory.getInstance().getInternalSortAlgorithms();
		System.out.println(t.sort(list));
	}
	
}
