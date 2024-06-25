import java.util.LinkedList;
import java.util.Queue;

public class BuildTreePreOrder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static class BinaryTree {
        static int index = -1;

        public Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public void preOrderTraversal(Node root) {
            if (root == null) {
                System.out.print(-1 + ",");
                return;
            }

            System.out.print(root.data + ",");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);

        }

        public void inOrderTraversal(Node root) {
            if (root == null) {
                System.out.print(-1 + ",");
                return;
            }

            inOrderTraversal(root.left);
            System.out.print(root.data + ",");
            inOrderTraversal(root.right);

        }

        public void postOrderTraversal(Node root) {
            if (root == null) {
                System.out.print(-1 + ",");
                return;
            }

            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + ",");

        }

        public void levelOrderTraversal(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);

            while (!queue.isEmpty()) {
                Node currNode = queue.remove();
                if (currNode == null) {
                    System.out.println();
                    if (queue.isEmpty()) {
                        break;
                    } else {
                        queue.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        queue.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        queue.add(currNode.right);
                    }
                }
            }

        }

        public int nodeCount(Node root) {
            if (root == null) {
                return 0;
            }

            int leftNodes = nodeCount(root.left);
            int rightNodes = nodeCount(root.right);

            return leftNodes + rightNodes + 1;
        }

        public int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }

            int leftNodesTotal = sumOfNodes(root.left);
            int rightNodesTotal = sumOfNodes(root.right);

            return leftNodesTotal + rightNodesTotal + root.data;
        }

        public int heightOfTree(Node root) {
            if (root == null) {
                return 0;
            }

            int leftSubtreeHeight = heightOfTree(root.left);
            int rightSubtreeHeight = heightOfTree(root.right);

            int nodeHeight = Math.max(leftSubtreeHeight, rightSubtreeHeight) + 1;

            return nodeHeight;
        }

        public int diameterOfTree(Node root) { // time - O(n^2)
            if (root == null) {
                return 0;
            }

            int leftSubTreeDiameter = diameterOfTree(root.left);
            int rightSubTreeDiameter = diameterOfTree(root.right);
            int diameter = heightOfTree(root.left) + heightOfTree(root.right) + 1;

            return Math.max(diameter, Math.max(leftSubTreeDiameter, rightSubTreeDiameter));
        }

        public TreeInfo diameterOfTree2(Node root) { // time - O(n)
            if (root == null) {
                return new TreeInfo(0, 0);
            }

            TreeInfo leftSubTree = diameterOfTree2(root.left);
            TreeInfo rightSubTree = diameterOfTree2(root.right);

            int myHeight = Math.max(leftSubTree.height, rightSubTree.height) + 1;

            int diameterLeft = leftSubTree.diameter;
            int diameterRight = rightSubTree.diameter;
            int totalDiameter = leftSubTree.height + rightSubTree.height + 1;

            int diameter = Math.max(Math.max(diameterRight, diameterLeft), totalDiameter);

            TreeInfo myInfo = new TreeInfo(myHeight, diameter);
            return myInfo;
        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("\nroot: " + root.data);
        System.out.println("\npreOrderTraversal: ");
        tree.preOrderTraversal(root);
        System.out.println("\n\ninOrderTraversal: ");
        tree.inOrderTraversal(root);
        System.out.println("\n\npostOrderTraversal: ");
        tree.inOrderTraversal(root);
        System.out.println("\n\nlevelOrderTraversal: ");
        tree.levelOrderTraversal(root);
        System.out.println("\nnodeCount: " + tree.nodeCount(root));
        System.out.println("sumOfNodes: " + tree.sumOfNodes(root));
        System.out.println("heightOfTree: " + tree.heightOfTree(root));
        System.out.println("diameterOfTree: " + tree.diameterOfTree(root));
        System.out.println("diameterOfTree2: " + tree.diameterOfTree2(root).diameter);
    }
}
