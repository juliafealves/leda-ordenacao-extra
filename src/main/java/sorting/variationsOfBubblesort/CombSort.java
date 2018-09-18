package sorting.variationsOfBubblesort;

import sorting.AbstractSorting;
import util.Util;

/**
 * The combsort algoritm.
 */
public class CombSort<T extends Comparable<T>> extends AbstractSorting<T> {

    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        int gap = rightIndex - leftIndex;
        boolean swaps = true;

        while (gap != 1 || swaps) {
            gap = (int) (gap / 1.25);

            if (gap < 1) {
                gap = 1;
            }

            swaps = false;

            for (int i = leftIndex; i <= rightIndex - gap; i++) {
                if (array[i].compareTo(array[i + gap]) > 0) {
                    Util.swap(array, i, i + gap);
                    swaps = true;
                }
            }
        }
    }
}
