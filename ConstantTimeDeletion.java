import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class ConstantTimeDeletion {

    private Map<Integer, LinkedList<Integer>> hashMap = new LinkedHashMap<Integer, LinkedList<Integer>>();

    public void add(int key) {
        hashMap.putIfAbsent(key % 100, new LinkedList<>());
        hashMap.get(key % 100).add(key);
    }

    public boolean remove(int key) {            //returns boolean whether the key was found or not
        if (hashMap.containsKey(key % 100)) {
            LinkedList<Integer> list = hashMap.get(key % 100);
            if (list.removeFirstOccurrence(key)) {
                return true; 
            }
        }
        return false;
    }
}
