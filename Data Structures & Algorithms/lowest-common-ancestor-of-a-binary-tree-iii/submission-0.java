/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        Node p1 = p;
        Node q1 = q;

        while(p1 != q1) {
            p1 = (p1 == null) ? q : p1.parent;
            q1 = (q1 == null) ? p : q1.parent;
        }

        return p1;
    }
}