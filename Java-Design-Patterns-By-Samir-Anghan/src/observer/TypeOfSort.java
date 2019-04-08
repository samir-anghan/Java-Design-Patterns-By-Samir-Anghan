package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Samir Anghan
 *
 */
class TypeOfSort<E extends Comparable<E>> extends AbstractSort<E> {
    private final List<ISort<E>> listOfSortAlgorithms;
    private final String typeName;

    public TypeOfSort(final String aTypeName) {
        this.listOfSortAlgorithms = new ArrayList<ISort<E>>();
        this.typeName = aTypeName;
    }
    @Override
    public void addObserver(final ISortObserver<E> anObserver) {
        final Iterator<ISort<E>> iterator =
            this.listOfSortAlgorithms.iterator();
        while (iterator.hasNext()) {
            final ISort<E> sortAlgorithm = (ISort<E>) iterator.next();
            sortAlgorithm.addObserver(anObserver);
        }
    }
    
    public void addSortAlgorithm(final ISort<E> aSortAlgorithm) {
    	/* TODO: Something is missing here */
    	 this.listOfSortAlgorithms.add(aSortAlgorithm);
    }
    
    public ISortIterator<E> getSortAlgorithms() {
        return new ConcreteSortIterator<E>(this.listOfSortAlgorithms);
    }
    public String getTypeName() {
        return this.typeName;
    }
    public List<E> sort(final List<E> aList) {
        // Call each sort algorithm of this type one after the other...
        
        /* TODO: Something is missing here */
        final Iterator<ISort<E>> itr = this.listOfSortAlgorithms.iterator();
        
        List<E> sortedList = null;
        while (itr.hasNext()) {
            final ISort<E> sortAlgorithm = (ISort<E>) itr.next() /* TODO: Something is missing here */;
            sortedList = sortAlgorithm.sort(aList);
        }
        return sortedList;
    }
}
