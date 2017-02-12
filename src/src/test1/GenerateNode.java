package src.test1;

import java.util.LinkedList;

public class GenerateNode {

    public static LinkedList<Integer> generateNode() {
        LinkedList<Integer> listNode = new LinkedList<Integer>();
        for (int num = 1; num <= 10; num++) {
            listNode.add(num);
        }
        return listNode;
    }

    public static LinkedList<Integer> generateNullNode() {
        return null;
    }

    public static LinkedList<Integer> generateZeroNode() {
        LinkedList<Integer> listNode = new LinkedList<Integer>();
        return listNode;
    }
}
