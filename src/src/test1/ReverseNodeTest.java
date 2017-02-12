package src.test1;

import org.junit.Test;
import junit.framework.TestCase;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseNodeTest extends TestCase {

    @Test
    public void testNormalList() {
        LinkedList<Integer> ExpectedList = new LinkedList<Integer>(Arrays.asList(3, 2, 1, 6, 5, 4, 9, 8, 7, 10));
        LinkedList<Integer> listNode = GenerateNode.generateNode();
        LinkedList<Integer> newListNode = ReverseNode.reverseNode(listNode, 3);
        assertEquals(ExpectedList.toString(), newListNode.toString());
    }

    @Test
    public void testNullList() {
        LinkedList<Integer> listNode = GenerateNode.generateNullNode();
        LinkedList<Integer> newListNode = ReverseNode.reverseNode(listNode, 3);
        assertEquals(null, newListNode);
    }

    @Test
    public void testZeroNode() {
        LinkedList<Integer> listNode = GenerateNode.generateZeroNode();
        LinkedList<Integer> newListNode = ReverseNode.reverseNode(listNode, 0);
        assertEquals(null, newListNode);
    }

    @Test
    public void testNegativeNode() {
        LinkedList<Integer> listNode = GenerateNode.generateNode();
        LinkedList<Integer> newListNode = ReverseNode.reverseNode(listNode, -1);
        assertEquals(null, newListNode);
    }

    @Test
    public void testNodeGreaterThanListLength() {
        LinkedList<Integer> ExpectedList = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        LinkedList<Integer> listNode = GenerateNode.generateNode();
        LinkedList<Integer> newListNode = ReverseNode.reverseNode(listNode, 11);
        assertEquals(ExpectedList.toString(), newListNode.toString());
    }
}
