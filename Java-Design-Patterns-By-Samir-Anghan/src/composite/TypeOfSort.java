package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Samir Anghan
 *
 */
public class TypeOfSort<E extends Comparable<E>> extends AbstractSort<E> implements ITypeOfSort<E> {

	private final List<ISort<E>> listOfSortAlgorithms;
	private final String typeName;
	
	public TypeOfSort(final String aTypeName) {
		this.listOfSortAlgorithms = new ArrayList<ISort<E>>();
		this.typeName = aTypeName;
	}
	
	public void addSortAlgorithm(final ISort<E> aSortAlgorithm) {
		this.listOfSortAlgorithms.add(aSortAlgorithm);
	}
	
	@Override
	public List<ISort<E>> getSortAlgorithms() {
		return this.listOfSortAlgorithms;
	}

	@Override
	public String getTypeName() {
		return this.typeName;
	}

	@Override
	public List<E> sort(List<E> aList) {
		
		// Call each sort algorithm of this type one after the other...
		final Iterator<ISort<E>> iterator = this.listOfSortAlgorithms.iterator();
		List<E> sortedList = null;
		
		while (iterator.hasNext()) {
			final ISort<E> sortAlgorithm = (ISort<E>) iterator.next();
			sortedList = sortAlgorithm.sort(aList);
		}
		
		return sortedList;
	}
	
}
