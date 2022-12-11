package com.scaler.intermediate.dsa.hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {


    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1,1);
        hm.put(2,1);
        hm.put(3,1);
        hm.put(4,1);
        hm.put(2, 4);

        //iterating on hashmap
        System.out.println("key - value ----------------------------------------");
        //using keyset, keyset -> returns Set, as keys are unique
        for(Integer key: hm.keySet()){
            //value can be retrieved using key as key is unique, hm.get(key)
            System.out.println(key + " - " +hm.get(key));
//            hm.remove(key); //cannot remove key while iterating, ConcurrentModificationException gets thrown
        }

        //using values, values -> returns Collection, as values can be duplicate
        //u cannot retrieve keys from values, as values can be duplicate and can be pointed by diff unique keys
        System.out.println("values----------------------------------------");
        for(Integer val: hm.values()){
            System.out.println(val);
        }

        //using entry set
        System.out.println("entry set----------------------------------------");
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            System.out.println("key -" + entry.getKey());
            System.out.println("value -" + entry.getValue());
        }

        System.out.println("iterator ----------------------------------------");
        //iterator can be taken on keys, values and entrySet
        Iterator<Map.Entry<Integer, Integer>> it = hm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer, Integer> entry = it.next();
            System.out.println("key -" + entry.getKey());
            System.out.println("value -" + entry.getValue());
            //remove an ele
            it.remove();
        }
        System.out.println("hm size -" + hm.size()); //if ele removed using iterator while iterating, hm size becomes 0
    }

}
