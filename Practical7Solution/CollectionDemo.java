import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;

public class CollectionDemo {
    public static void main(String[] args) {
        // Array
        String[] array = new String[3];
        array[0] = "Apple";
        array[1] = "Banana";
        array[2] = "Orange";

        System.out.println("Array:");
        for (String fruit : array) {
            System.out.println(fruit);
        }
        System.out.println();

        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Green");
        arrayList.add("Blue");

        System.out.println("ArrayList:");
        for (String color : arrayList) {
            System.out.println(color);
        }
        System.out.println();

        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Cat");
        linkedList.add("Dog");
        linkedList.add("Elephant");

        System.out.println("LinkedList:");
        for (String animal : linkedList) {
            System.out.println(animal);
        }
        System.out.println();
        System.out.println("Example on hash map");
        //hasmap stores item in key value pair,key is used as index where as value is used as actual vlue to store in index . key can be anything like string,integer
        HashMap <String,String>hm1 = new HashMap<String,String>();
        hm1.put("honda","CBR");   // here honda is key and CBR is value
        hm1.put("Bajaj", "Pulsar");
        hm1.put("Hero","Karizma");
        hm1.put("tvs","apache");
        hm1.put("Yamaha","FZ");
                
        
        // displaying key only 
        System.out.println("Keys are:");
        for(String key:hm1.keySet()){
            System.out.println(key);
            
        }
        //displaying values only
        for(String value:hm1.values()){
            System.out.println(value);
        }
        
        //displaying key and value
        System.out.println("Key and value are:");
        for(String keys:hm1.keySet()){
            System.out.println("key: "+keys+" value: "+hm1.get(keys) );
        }
    }
}