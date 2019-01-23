
package rfry.jtoolkit.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/**
 * A collection of helper methods for arrays.
 * @author Robert E Fry
 * @date 3 Dec 2018
 * @time 05:54:21
 *
 */
public final class ArrayHelper {
	
	/**
	 * Returns a random element from the Set {@code set}
	 * @param set the set to search
	 * @return a random element from {@code set}
	 */
	public static final <T> T randomElement(Set<T> set) {
		for (T elem : set) {
			return elem;
		}
		return null;
	}
	
	/**
	 * Forms a string representation of the array {@code data}.
	 * @param data the array.
	 * @return a string representation of the array {@code data}.
	 */
	public static final <T> String toString(List<T> data) {
		StringBuilder builder = new StringBuilder("[");
		for (int i = 0; i < data.size(); i++) {
			builder.append(data.get(i));
			if (i < data.size() - 1) builder.append(", ");
		}
		return builder.append("]").toString();
	}
	
	/**
	 * Forms a string representation of the array {@code data}.
	 * @param data the array.
	 * @return a string representation of the array {@code data}.
	 */
	public static final <T> String toString(T[] data) {
		StringBuilder builder = new StringBuilder("[");
		for (int i = 0; i < data.length; i++) {
			builder.append(data[i]);
			if (i < data.length - 1) builder.append(", ");
		}
		return builder.append("]").toString();
	}
	
	/**
	 * Counts the number of elements in the array {@code data} that meet the {@code condition}.
	 * @param condition the condition to test with.
	 * @param data the data to test.
	 * @return the number of elements in the array {@code data} that meet the {@code condition}.
	 */
	public static final <T> int meetscondition(Predicate<T> condition, List<T> data) {
		int count = 0;
		for (T element : data) {
			if (condition.test(element)) count++;
		}
		return count;
	}
	
	/**
	 * Counts the number of elements in the array {@code data} that meet the {@code condition}.
	 * @param condition the condition to test with.
	 * @param data the data to test.
	 * @return the number of elements in the array {@code data} that meet the {@code condition}.
	 */
	public static final <T> int meetscondition(Predicate<T> condition, T[] data) {
		int count = 0;
		for (T element : data) {
			if (condition.test(element)) count++;
		}
		return count;
	}
	
	/**
	 * Counts the number of elements in the array {@code data} that pass the test {@code condition}.
	 * @param predicate the test condition.
	 * @param data the data to test.
	 * @return the number of elements in the array {@code data} that pass the test {@code condition}.
	 */
	public static final <T> int countif(Predicate<T> condition, List<T> data) {
		int count = 0;
		for (T element : data) {
			if (condition.test(element)) count++;
		}
		return count;
	}
	
	/**
	 * Counts the number of elements in the array {@code data} that pass the test {@code condition}
	 * @param predicate the test condition.
	 * @param data the data to test.
	 * @return the number of elements in the array {@code data} that pass the test {@code condition}.
	 */
	public static final <T> int countif(Predicate<T> condition, T[] data) {
		int count = 0;
		for (T element : data) {
			if (condition.test(element)) count++;
		}
		return count;
	}
	
	/**
	 * Creates a subset of {@code data} where each element returns true for a given test {@code condition}.
	 * @param condition the condition to test each element with.
	 * @param data the initial list.
	 * @return a subset of {@code data} based on a given {@code condition}.
	 */
	public static final <T> List<T> subset(Predicate<T> condition, List<T> data) {
		List<T> result = new ArrayList<>();
		for (T element : data) {
			if (condition.test(element)) result.add(element);
		}
		return result;
	}
	
	/**
	 * Creates a subset of {@code data} where each element returns true for a given test {@code condition}.
	 * @param condition the condition to test each element with.
	 * @param data the initial list.
	 * @return a subset of {@code data} based on a given {@code condition}.
	 */
	public static final <T> List<T> subset(Predicate<T> condition, T[] data) {
		List<T> result = new ArrayList<>();
		for (T element : data) {
			if (condition.test(element)) result.add(element);
		}
		return result;
	}
	
	/**
	 * Fills {@code out} with the first elements of {@code data}.
	 * There must be enough room in the array {@code out}.
	 * @param out the array to fill.
	 * @param data the original array.
	 * @return the filled array {@code out} containing the first elements of {@code data}.
	 */
	public static final <T> List<T> fillwithfirst(int ammount, List<T> data) {
		List<T> result = new ArrayList<>(ammount);
		for (int i = 0; i < ammount; i++ ) {
			result.set(i, data.get(i));
		}
		return result;
	}

	/**
	 * Fills {@code out} with the first elements of {@code data}.
	 * There must be enough room in the array {@code out}.
	 * @param out the array to fill.
	 * @param data the original array.
	 * @return the filled array {@code out} containing the first elements of {@code data}.
	 */
	public static final <T> T[] fillwithfirst(T[] out, T[] data) {
		for (int i = 0; i < out.length; i++ ) {
			out[i] = data[i];
		}
		return out;
	}

	/**
	 * Fills {@code out} with the last elements of {@code data}.
	 * There must be enough room in the array {@code out}.
	 * @param out the array to fill.
	 * @param data the original array.
	 * @return the filled array {@code out} containing the last elements of {@code data}.
	 */
	public static final <T> List<T> fillwithlast(int ammount, List<T> data) {
		List<T> result = new ArrayList<>(ammount);
		final int x = data.size() - ammount;
		for (int i = 0; i < ammount; i++ ) {
			result.set(i, data.get(i + x));
		}
		return result;
	}
	
	/**
	 * Fills {@code out} with the last elements of {@code data}.
	 * There must be enough room in the array {@code out}.
	 * @param out the array to fill.
	 * @param data the original array.
	 * @return the filled array {@code out} containing the last elements of {@code data}.
	 */
	public static final <T> T[] fillwithlast(T[] out, T[] data) {
		final int x = data.length - out.length;
		for (int i = 0; i < out.length; i++ ) {
			out[i] = data[i + x];
		}
		return out;
	}
	
}
