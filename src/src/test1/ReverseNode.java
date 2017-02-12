package src.test1;

import java.util.LinkedList;
import java.util.List;

public class ReverseNode {
    public static LinkedList<Integer> reverseNode(LinkedList<Integer> listNode, int k) {
        if (k <= 0) {
            return null;
        }
        if (listNode == null || listNode.size() == 0) {
            return null;
        } else {
            LinkedList<Integer> newListNode = new LinkedList<Integer>();
            List<Integer> tempNode;
            if (listNode.size() / k > 1) {
                int m = listNode.size() / k;
                for (int i = 0; i < m; i++) {
                    tempNode = listNode.subList(listNode.indexOf(i * k + 1), listNode.indexOf((i + 1) * k + 1));
                    BubbleSort.sort(tempNode);
                    newListNode.addAll(tempNode);
                }
                tempNode = listNode.subList(m * k, listNode.size());
                newListNode.addAll(tempNode);
            } else {
                newListNode.addAll(listNode);
            }
            return newListNode;
        }
    }
}
