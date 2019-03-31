package composite;

import java.util.List;

/**
 * @author Samir Anghan
 *
 */
public abstract class AbstractSort<E> {
	public abstract List<E> sort(final List<E> aList);
	
	public void someHelperMethod() {
	// Some implementation...
	}
	protected void someOtherHelperMethod() {
	// Some implementation...
	}

}
