package medium;

import data_structures.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily1123Test {

    Daily1123 daily1123;

    @BeforeEach
    void setUp() {
        daily1123 = new Daily1123();
    }

    @Test
    void lcaDeepestLeaves() {
        // given
        var first = new TreeNode(6);
        var second = new TreeNode(7);
        var third = new TreeNode(4);
        var fourth = new TreeNode(0);
        var fifth = new TreeNode(8);
        var sixth = new TreeNode(2, second, third);
        var seventh = new TreeNode(5, first, sixth);
        var eighth = new TreeNode(1, fourth, fifth);
        var root = new TreeNode(3, seventh, eighth);

        // when,then
        assertEquals(sixth, daily1123.lcaDeepestLeaves(root));

    }

    @Test
    void lcaDeepestLeavesSmallTree() {
        // given
        var first = new TreeNode(2);
        var second = new TreeNode(1, first, null);
        var third = new TreeNode(3);
        var root = new TreeNode(0, second, third);

        // when,then
        assertEquals(first, daily1123.lcaDeepestLeaves(root));

    }

}