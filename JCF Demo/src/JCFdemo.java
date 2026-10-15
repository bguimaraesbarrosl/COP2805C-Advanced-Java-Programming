import java.util.ArrayList;
import java.util.HashMap;

public class JCFdemo {
    public static void main(String[] args) {
        // Classroom Inventory Tracker
        // whiteboard, maker, eraser, computer, projector, desk, chair

//        ArrayList<String> supplies = new ArrayList<>(); // declare and instantiate an ArrayList
//
//        supplies.add("whiteboard");
//        supplies.add("marker");
//        supplies.add("eraser");
//        supplies.add("computer");
//
//        System.out.println(supplies);
//        System.out.println(supplies.get(1));
//        System.out.println(supplies.size());
//
//        supplies.set(3, "Mac");
//        System.out.println(supplies);
//
//        supplies.remove(1);
//        System.out.println(supplies);
//
//        System.out.println(supplies.isEmpty());
//        supplies.clear();
//        System.out.println(supplies.isEmpty());
//        System.out.println(supplies);

        HashMap<String, Integer> suppliesOnHand = new HashMap<>();
        suppliesOnHand.put("whiteboard", 1);
        suppliesOnHand.put("marker", 12);
        suppliesOnHand.put("eraser", 2);
        suppliesOnHand.put("computer", 25);
        suppliesOnHand.put("desk", 25);
        suppliesOnHand.put("chair", 25);
        suppliesOnHand.put("projector", 1);

        System.out.println(suppliesOnHand);

        suppliesOnHand.put("whiteboard", 2);
        System.out.println(suppliesOnHand);

        suppliesOnHand.putIfAbsent("whiteboard", 200);
        System.out.println(suppliesOnHand);
        suppliesOnHand.putIfAbsent("pencil", 200);
        System.out.println(suppliesOnHand);

        System.out.println(suppliesOnHand.get("chair"));
        System.out.println(suppliesOnHand.containsKey("computer"));

        suppliesOnHand.remove("computer");
        System.out.println(suppliesOnHand);
    }
}
