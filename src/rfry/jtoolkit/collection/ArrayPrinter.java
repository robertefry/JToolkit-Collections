
package rfry.jtoolkit.collection;

import java.io.PrintStream;

/**
 * A collection of methods for printing arrays.
 * @author Robert E Fry
 * @date 2 Dec 2018
 * @time 20:07:14
 *
 */
public final class ArrayPrinter {
	
	/**
	 * Prints an array in a formatted string to a {@code PrintStream} stream.
	 * @param stream the {@code PrintStream} to print to.
	 * @param array the array to print.
	 */
	public static final void print(PrintStream stream, boolean[] array) {
		StringBuilder builder = new StringBuilder("[");
		for (int i = 0; i < array.length; i++ ) {
			builder.append(array[i]);
			if (i < array.length - 1) builder.append(", ");
		}
		stream.println(builder.append("]"));
	}
	
	/**
	 * Prints an array in a formatted string to a {@code PrintStream} stream.
	 * @param stream the {@code PrintStream} to print to.
	 * @param array the array to print.
	 */
	public static final void print(PrintStream stream, char[] array) {
		StringBuilder builder = new StringBuilder("[");
		for (int i = 0; i < array.length; i++ ) {
			builder.append(array[i]);
			if (i < array.length - 1) builder.append(", ");
		}
		stream.println(builder.append("]"));
	}
	
	/**
	 * Prints an array in a formatted string to a {@code PrintStream} stream.
	 * @param stream the {@code PrintStream} to print to.
	 * @param array the array to print.
	 */
	public static final void print(PrintStream stream, byte[] array) {
		StringBuilder builder = new StringBuilder("[");
		for (int i = 0; i < array.length; i++ ) {
			builder.append(array[i]);
			if (i < array.length - 1) builder.append(", ");
		}
		stream.println(builder.append("]"));
	}
	
	/**
	 * Prints an array in a formatted string to a {@code PrintStream} stream.
	 * @param stream the {@code PrintStream} to print to.
	 * @param array the array to print.
	 */
	public static final void print(PrintStream stream, short[] array) {
		StringBuilder builder = new StringBuilder("[");
		for (int i = 0; i < array.length; i++ ) {
			builder.append(array[i]);
			if (i < array.length - 1) builder.append(", ");
		}
		stream.println(builder.append("]"));
	}
	
	/**
	 * Prints an array in a formatted string to a {@code PrintStream} stream.
	 * @param stream the {@code PrintStream} to print to.
	 * @param array the array to print.
	 */
	public static final void print(PrintStream stream, int[] array) {
		StringBuilder builder = new StringBuilder("[");
		for (int i = 0; i < array.length; i++ ) {
			builder.append(array[i]);
			if (i < array.length - 1) builder.append(", ");
		}
		stream.println(builder.append("]"));
	}
	
	/**
	 * Prints an array in a formatted string to a {@code PrintStream} stream.
	 * @param stream the {@code PrintStream} to print to.
	 * @param array the array to print.
	 */
	public static final void print(PrintStream stream, long[] array) {
		StringBuilder builder = new StringBuilder("[");
		for (int i = 0; i < array.length; i++ ) {
			builder.append(array[i]);
			if (i < array.length - 1) builder.append(", ");
		}
		stream.println(builder.append("]"));
	}
	
	/**
	 * Prints an array in a formatted string to a {@code PrintStream} stream.
	 * @param stream the {@code PrintStream} to print to.
	 * @param array the array to print.
	 */
	public static final void print(PrintStream stream, float[] array) {
		StringBuilder builder = new StringBuilder("[");
		for (int i = 0; i < array.length; i++ ) {
			builder.append(array[i]);
			if (i < array.length - 1) builder.append(", ");
		}
		stream.println(builder.append("]"));
	}
	
	/**
	 * Prints an array in a formatted string to a {@code PrintStream} stream.
	 * @param stream the {@code PrintStream} to print to.
	 * @param array the array to print.
	 */
	public static final void print(PrintStream stream, double[] array) {
		StringBuilder builder = new StringBuilder("[");
		for (int i = 0; i < array.length; i++ ) {
			builder.append(array[i]);
			if (i < array.length - 1) builder.append(", ");
		}
		stream.println(builder.append("]"));
	}
	
	/**
	 * Prints a generic array in a formatted string to a {@code PrintStream} stream.
	 * @param stream the {@code PrintStream} to print to.
	 * @param array the array to print.
	 */
	public static final <T> void print(PrintStream stream, T[] array) {
		StringBuilder builder = new StringBuilder("[");
		for (int i = 0; i < array.length; i++ ) {
			builder.append(array[i]);
			if (i < array.length - 1) builder.append(", ");
		}
		stream.println(builder.append("]"));
	}
	
}
