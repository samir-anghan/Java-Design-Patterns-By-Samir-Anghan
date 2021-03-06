package singleton;

import java.util.Arrays;
import java.util.List;

/**
 * @author Samir Anghan
 *
 */
public class Client {
	
	public static void main(String[] args) {
		final ISort<String> s = Factory.getInstance().getSortAlgorithm();
		final List<String> l = Arrays.asList("Boy", "Apple", "Cat");
		s.sort(l);
	}
	
}
