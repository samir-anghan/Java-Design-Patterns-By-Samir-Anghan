package iterator;

import java.util.Arrays;
import java.util.List;

/**
 * @author Samir Anghan
 *
 */
public class Client {
	
	public static void main(String[] args) {
		
		final List<String> list = Arrays.asList(new String[] { "Venus", "Earth", "Mars" });
		
		final ISort<String> t = Factory.getInstance().getInternalSortAlgorithms();
		
		final ITypeOfSort<String> c = (ITypeOfSort<String>) t;
		final ISortIterator<String> i = c.getSortAlgorithms();
		
		while (i.hasNext()) {
			final ISort<String> sortAlgorithm = i.getNext();
			System.out.println(sortAlgorithm.getClass());
			System.out.println(sortAlgorithm.sort(list));
		}
	}
	
}
