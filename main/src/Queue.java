import java.util.NoSuchElementException;

import static java.lang.System.arraycopy;

public class Queue {


    /**
     * Array of integers in queue
     */
    private int[] contents;


    /**
     * Create a new queue with one value
     * Runtime = O(1)
     * @param val (first value to put in the queue)
     */
    public Queue(int val)
    {
        contents = new int[1];
        contents[0] = val;
    }


    /**
     * Add a new value to the end of the queue by creating new array of length+1
     * Runtime = O(n)
     * @param element (value to add to end of queue)
     */
    public void add(int element)
    {
        int[] result = new int[contents.length + 1];
        arraycopy(contents, 0, result, 0, contents.length);
        result[result.length - 1] = element;
        contents = result;
    }


    /**
     * Remove the front value from the queue by making new array of length-1
     * Runtime = O(n)
     * @return removed value (front of queue)
     * @throws NoSuchElementException
     */
    public int remove() throws NoSuchElementException
    {
        int[] result = new int[contents.length - 1];
        int head = contents[0];
        arraycopy(contents, 1, result, 0, contents.length-1);
        contents = result;
        return head;
    }


    /**
     * Runtime = O(1)
     * @return head of queue (first element in array)
     * @throws NoSuchElementException
     */
    public int peek() throws NoSuchElementException
    {
        return contents[0];
    }


    /**
     * Runtime = O(1)
     * @return length of queue/array
     */
    public int size()
    {
        return contents.length;
    }


    /**
     * Runtime = O(1)
     * @return true if queue/array is empty
     */
    public boolean isEmpty()
    {
        return contents.length < 1;
    }


    /**
     * Runtime - O(n)
     * @return contents of queue as a string
     */
    @Override
    public String toString()
    {
        String result = "";
        for (int num : contents)
        {
            result = result + Integer.toString(num) + "  ";
        }
        return result;
    }
}
