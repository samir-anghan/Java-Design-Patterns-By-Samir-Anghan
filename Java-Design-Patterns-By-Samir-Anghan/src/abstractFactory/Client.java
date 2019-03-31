package abstractFactory;

import java.util.Arrays;
import java.util.List;

/**
 * @author Samir Anghan
 *
 */
public class Client {

	public static void main(String[] args) {
		final ISort<String> s = new Factory().getSortAlgorithm();
		final List<String> l = Arrays.asList("Boy", "Apple", "Cat");
		s.sort(l);
	}

}
