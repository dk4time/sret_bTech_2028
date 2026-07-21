/*
 * Topic: HashMap
 * Core idea: key-value storage with O(1) average get/put, no ordering
 * guarantee at all. The default, most common Map choice whenever you don't
 * care about iteration order.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, Object> student = new HashMap<>();
        student.put("id", 101);
        student.put("name", "John");
        student.put("marks", 95);
        System.out.println(student);

        // get(key) / getOrDefault(key, default) | HashMap | Params: key (Required), default (Optional) | Returns: Object | O(1) average
        System.out.println(student.get("name"));
        System.out.println(student.getOrDefault("city", "Not Found"));

        // put(key, value) | HashMap | Params: 2 Required | Returns: previous value or null | O(1) average
        student.put("marks", 98);

        // keySet() / values() / entrySet() | Params: None | Returns: Set<K> / Collection<V> / Set<Entry<K,V>> | O(1)
        System.out.println(student.keySet());
        System.out.println(student.values());

        // remove(key) | HashMap | Params: key (Required) | Returns: removed value | O(1) average
        student.remove("id");
        System.out.println(student);

        // Removing an arbitrary entry - HashMap has no popitem(); use an Iterator
        Iterator<Map.Entry<String, Object>> iterator = student.entrySet().iterator();
        Map.Entry<String, Object> popped = iterator.next();
        iterator.remove();
        System.out.println(popped);

        // putAll(other) | HashMap | Params: map (Required) | Returns: void | O(n)
        student.putAll(Map.of("department", "MCA", "year", 2));
        System.out.println(student);

        // containsKey() / containsValue()
        System.out.println(student.containsKey("department"));

        // merge() - update-or-insert in one call, common for counting
        // HashMap | Params: key, value, remappingFunction (Required) | Returns: new value | O(1) average
        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] words = {"a", "b", "a", "c", "a", "b"};
        for (String w : words) {
            wordCount.merge(w, 1, Integer::sum);
        }
        System.out.println(wordCount);

        for (Map.Entry<String, Object> entry : student.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
