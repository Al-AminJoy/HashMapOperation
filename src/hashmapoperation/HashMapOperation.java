package hashmapoperation;

import java.util.HashMap;

public class HashMapOperation {

    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap();
        map.put(1, "Al-Amin");
        map.put(2, "Islam");
        map.put(3, "Joy");
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
    }
    
}
