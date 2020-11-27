package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * DesignAnOrderedStream.
 *
 * @author Ibodulla Ibodullaev
 * @since 27.11.2020
 */
public class OrderedStream {
    private String[] orderedStreamArray;
    private int currentPosition = 0;

    public OrderedStream(int n) {
        orderedStreamArray = new String[n];
    }

    public List<String> insert(int id, String value) {
        orderedStreamArray[id - 1] = value;

        List<String> list = new ArrayList<>();
        if(orderedStreamArray[currentPosition] != null){
            while(currentPosition < orderedStreamArray.length
                && orderedStreamArray[currentPosition] != null){
                list.add(orderedStreamArray[currentPosition++]);
            }
        }
        return list;
    }
}