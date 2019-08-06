package dsa.HashMap;

import java.util.HashMap;

public class Find_sum {

    static boolean check = false;

    void GetAnswer(HashMap<Integer, Integer> numbers, int val) {

        for (Integer num : numbers.values()) {
            if (numbers.containsValue(val - num) && num != val - num) {
                System.out.println(num + " adds up with " + numbers.get(val - num) + " to make " + val);
                check = true;
            }
        }
            if (!check)
                System.out.println("No such values found!");
        }

        public static void main (String[] args){
            HashMap<Integer, Integer> map = new HashMap();

            map.put(2, 2);
            map.put(3, 3);
            map.put(8, 8);
            map.put(11, 11);
            map.put(5, 5);
            map.put(6, 6);
            map.put(9, 9);
            map.put(7, 7);

            Find_sum ob = new Find_sum();

            ob.GetAnswer(map, 23);

        }
    }
