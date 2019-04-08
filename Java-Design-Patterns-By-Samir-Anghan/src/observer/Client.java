package observer;

import java.util.Arrays;
import java.util.List;

/**
 * @author Samir Anghan
 *
 */
public class Client {
	
	public static void main(String[] args) {
		
		final BubbleSort<String> sort = new BubbleSort<String>();
		sort.addObserver(new SimpleObserver<String>());
		System.out.println(
			sort.sort(
				Arrays.asList(new String[] { "Venus", "Earth", "Mars" })));

		final InternalSorts<String> internalSorts = new InternalSorts<String>();
		internalSorts.addObserver(new SimpleObserver<String>());
		System.out.println(
			internalSorts.sort(
				Arrays.asList(new String[] { "Venus", "Earth", "Mars" })));
	}
	
}
