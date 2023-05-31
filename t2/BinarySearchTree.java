package t1.t2;

public class BinarySearchTree {
    private Node root;  // Корневой узел дерева

    private class Node {
        private int key;
        private Node left;
        private Node right;

        public Node(int key) {
            this.key = key;
            left = null;
            right = null;
        }
    }

    public BinarySearchTree() {
        root = null;
    }

    // Метод для вставки нового значения в дерево
    public void insert(int key) {
        root = insertRec(root, key);
    }

    // Рекурсивный метод для вставки значения в дерево
    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    // Метод для поиска значения в дереве
    public boolean search(int key) {
        return searchRec(root, key);
    }

    // Рекурсивный метод для поиска значения в дереве
    private boolean searchRec(Node root, int key) {
        if (root == null || root.key == key) {
            return root != null;
        }

        if (key < root.key) {
            return searchRec(root.left, key);
        } else {
            return searchRec(root.right, key);
        }
    }

    // Метод для удаления значения из дерева
    public void delete(int key) {
        root = deleteRec(root, key);
    }

    // Рекурсивный метод для удаления значения из дерева
    private Node deleteRec(Node root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key);
        } else {
            // Узел со значением key найден

            // Случай 1: Узел без потомков или с одним потомком
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Случай 2: Узел с двумя потомками
            root.key = minValue(root.right);  // Находим минимальное значение в правом поддереве
            root.right = deleteRec(root.right, root.key);  // Удаляем минимальное значение из правого поддерева
        }

        return root;
    }

    // Вспомогательный метод для нахождения минимального значения в дереве
    private int minValue(Node root) {
        int minVal = root.key;
        while (root.left != null) {
            minVal = root.left.key;
            root = root.left;
        }
        return minVal;
    }

    // Метод для вывода содержимого дерева в порядке возрастания
    public void inorderTraversal() {
        inorderRec(root);
    }

    // Рекурсивный метод для вывода содержимого дерева в порядке возрастания
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Вставка значений в дерево
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Поиск значений в дереве
        System.out.println("30 найдено: " + bst.search(30));
        System.out.println("45 найдено: " + bst.search(45));

        // Удаление значения из дерева
        bst.delete(40);

        // Вывод содержимого дерева
        System.out.print("Содержимое дерева: ");
        bst.inorderTraversal();
    }
}
//В этой реализации бинарного дерева поиска:
//
//Класс BinarySearchTree содержит внутренний класс Node, представляющий узел дерева с полем key для хранения значения и ссылками на левого и правого потомков.
//Конструктор BinarySearchTree инициализирует корень дерева значением null.
//Метод insert позволяет вставлять новые значения в дерево. Реализована рекурсивная вставка значения с помощью приватного метода insertRec.
//Метод search выполняет поиск значения в дереве. Реализована рекурсивная проверка с помощью приватного метода searchRec.
//Метод delete позволяет удалить значение из дерева. Реализована рекурсивная удаление значения с помощью приватного метода deleteRec.
//Метод minValue находит минимальное значение в дереве, используя правое поддерево.
//Метод inorderTraversal выполняет обход дерева в порядке возрастания и выводит значения на экран.
//В методе main демонстрируется использование класса BinarySearchTree с примером вставки значений, поиска, удаления и вывода содержимого дерева.