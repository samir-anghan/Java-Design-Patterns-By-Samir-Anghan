package composite;

import java.util.List;

/**
 * @author Samir Anghan
 *
 */
public class InsertionSort<E> extends AbstractSort<E> implements ISort<E> {

	@Override
	public List<E> sort(List<E> aList) {
		
		// Please note that we are just faking sort functionality 
		// as we just want to understand design pattern not sorting algorithm
		// you can add here actual sort logic if you want but it's not necessary
		// we are returning null as sorted list
		
		final List<E> temporaryList = null;
		System.out.println("Insertion sort was performed.");
		return temporaryList;
	}

}
