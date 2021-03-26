package expandableArray;

/**
* This class provides methods for working with an array that expands
* to include any positive index value supplied by the caller.
*/
public class ExpandableArray {

    // Instance variables
    private Object[] arr;
    

    /**
    * Creates a new expandable array with no elements.
    */
    public ExpandableArray() {
        arr = new Object[5];
        
    }

    /**
    * Sets the element at the given index position to the specified.
    * value. If the internal array is not large enough to contain that
    * element, the implementation expands the array to make room.
    */
    public void set(int index, Object value) {
    	//implementation here
    }

    /**
    * Returns the element at the specified index position, or null if
    * no such element exists. Note that this method never throws an
    * out-of-bounds exception; if the index is outside the bounds of
    * the array, the return value is simply null.
    */
    public Object get(int index) {
        if (index > arr.length - 1) {
            System.out.println("Index does not exist");
            return -1;
        }
        return arr[index];

    }

   
}