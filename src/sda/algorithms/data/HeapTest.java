package sda.algorithms.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeapTest {

    @Test
    public void test_parent() {
        Heap heap = new Heap(null);
        assertEquals(0, heap.parent(1));
        assertEquals(0, heap.parent(2));
        assertEquals(1, heap.parent(3));
        assertEquals(1, heap.parent(4));
        assertEquals(2, heap.parent(5));
        assertEquals(2, heap.parent(6));
    }

    @Test
    public void test_left() {
        Heap heap = new Heap(null);
        assertEquals(1, heap.left(0));
        assertEquals(3, heap.left(1));
        assertEquals(5, heap.left(2));
        assertEquals(7, heap.left(3));
        assertEquals(9, heap.left(4));
    }

    @Test
    public void test_right() {
        Heap heap = new Heap(null);
        assertEquals(2, heap.right(0));
        assertEquals(4, heap.right(1));
        assertEquals(6, heap.right(2));
        assertEquals(8, heap.right(3));
        assertEquals(10, heap.right(4));
    }


}
