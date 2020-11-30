import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class SimpleArraySum {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>(2);
        result.add(0);
        result.add(0);
        for (int i = 0; i < a.size(); i++){
            if(a.get(i) > b.get(i)){
                result.set(1, result.get(0) + 1);
            }
            if(a.get(i) < b.get(i)){
                result.set(1, result.get(1) + 1);
            }
        }
        return result;

    }
}
