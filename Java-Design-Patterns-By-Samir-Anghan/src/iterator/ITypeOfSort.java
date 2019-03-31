package iterator;

import java.util.List;

/**
 * @author Samir Anghan
 *
 */
public interface ITypeOfSort<E extends Comparable<E>> extends ISort<E> {
	
	ISortIterator<E> getSortAlgorithms();
	String getTypeName();
	List<E> sort(final List<E> aList);

}
