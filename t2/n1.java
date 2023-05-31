package t1.t2;

// 4. Напишите программную реализацию бинарного дерева поиска
import java.util.Stack;

public class n1 {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insertNode(6);
        tree.insertNode(8);
        tree.insertNode(5);
        tree.insertNode(8);
        tree.insertNode(2);
        tree.insertNode(9);
        tree.insertNode(7);
        tree.insertNode(4);
        tree.insertNode(10);
        tree.insertNode(3);
        tree.insertNode(1);
        // отображение дерева:
        tree.printTree();
        // находим узел по значению и выводим его в консоли
        Node foundNode = tree.findNodeByValue(7);
        foundNode.printNode();
    }
    static class Node {
        private int value; // ключ узла
        private Node leftChild; // Левый узел потомок
        private Node rightChild; // Правый узел потомок

        public void printNode() { // Вывод значения узла в консоль
            System.out.println(" Выбранный узел имеет значение :" + value);
        }

        public int getValue() {
            return this.value;
        }

        public void setValue(final int value) {
            this.value = value;
        }

        public Node getLeftChild() {
            return this.leftChild;
        }

        public void setLeftChild(final Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return this.rightChild;
        }

        public void setRightChild(final Node rightChild) {
            this.rightChild = rightChild;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", leftChild=" + leftChild +
                    ", rightChild=" + rightChild +
                    '}';
        }
    }

    static class Tree {
        private Node rootNode; // корневой узел

        public Tree() { // Пустое дерево
            rootNode = null;
        }

        public Node findNodeByValue(int value) { // поиск узла по значению
            Node currentNode = rootNode; // начинаем поиск с корневого узла
            while (currentNode.getValue() != value) { // поиск покуда не будет найден элемент или не будут перебраны все
                if (value < currentNode.getValue()) { // движение влево?
                    currentNode = currentNode.getLeftChild();
                } else { //движение вправо
                    currentNode = currentNode.getRightChild();
                }
                if (currentNode == null) { // если потомка нет,
                    return null; // возвращаем null
                }
            }
            return currentNode; // возвращаем найденный элемент
        }
        public void insertNode(int value) { // метод вставки нового элемента
            Node newNode = new Node(); // создание нового узла
            newNode.setValue(value); // вставка данных
            if (rootNode == null) { // если корневой узел не существует
                rootNode = newNode;// то новый элемент и есть корневой узел
            }
            else { // корневой узел занят
                Node currentNode = rootNode; // начинаем с корневого узла
                Node parentNode;
                while (true) // мы имеем внутренний выход из цикла
                {
                    parentNode = currentNode;
                    if(value == currentNode.getValue()) {   // если такой элемент в дереве уже есть, не сохраняем его
                        return;    // просто выходим из метода
                    }
                    else  if (value < currentNode.getValue()) {   // движение влево?
                        currentNode = currentNode.getLeftChild();
                        if (currentNode == null){ // если был достигнут конец цепочки,
                            parentNode.setLeftChild(newNode); //  то вставить слева и выйти из методы
                            return;
                        }
                    }
                    else { // Или направо?
                        currentNode = currentNode.getRightChild();
                        if (currentNode == null) { // если был достигнут конец цепочки,
                            parentNode.setRightChild(newNode);  //то вставить справа
                            return; // и выйти
                        }
                    }
                }
            }
        }
        public void printTree() { // метод для вывода дерева в консоль
            Stack globalStack = new Stack(); // общий стек для значений дерева
            globalStack.push(rootNode);
            int gaps = 32; // начальное значение расстояния между элементами
            boolean isRowEmpty = false;
            String separator = "-----------------------------------------------------------------";
            System.out.println(separator);// черта для указания начала нового дерева
            while (isRowEmpty == false) {
                Stack localStack = new Stack(); // локальный стек для задания потомков элемента
                isRowEmpty = true;

                for (int j = 0; j < gaps; j++)
                    System.out.print(' ');
                while (globalStack.isEmpty() == false) { // покуда в общем стеке есть элементы
                    Node temp = (Node) globalStack.pop(); // берем следующий, при этом удаляя его из стека
                    if (temp != null) {
                        System.out.print(temp.getValue()); // выводим его значение в консоли
                        localStack.push(temp.getLeftChild()); // соохраняем в локальный стек, наследники текущего элемента
                        localStack.push(temp.getRightChild());
                        if (temp.getLeftChild() != null ||
                                temp.getRightChild() != null)
                            isRowEmpty = false;
                    }
                    else {
                        System.out.print("__");// - если элемент пустой
                        localStack.push(null);
                        localStack.push(null);
                    }
                    for (int j = 0; j < gaps * 2 - 2; j++)
                        System.out.print(' ');
                }
                System.out.println();
                gaps /= 2;// при переходе на следующий уровень расстояние между элементами каждый раз уменьшается
                while (localStack.isEmpty() == false)
                    globalStack.push(localStack.pop()); // перемещаем все элементы из локального стека в глобальный
            }
            System.out.println(separator);// подводим черту
        }
    }
}

//Основной класс n1 содержит вложенные классы Node и Tree. Давайте рассмотрим каждый из них:
//
//Класс Node:
//
//Представляет узел бинарного дерева и содержит поле value, которое хранит значение узла, а также ссылки на левого и правого потомков (leftChild и rightChild).
//Метод printNode() выводит значение узла в консоль.
//Вспомогательные геттеры и сеттеры обеспечивают доступ к полям класса.
//Метод toString() возвращает строковое представление узла.
//Класс Tree:
//
//Содержит поле rootNode, которое представляет корневой узел дерева.
//Конструктор Tree() создает пустое дерево, устанавливая значение rootNode равным null.
//Метод findNodeByValue() осуществляет поиск узла по значению. Он выполняет поиск, начиная с корневого узла, и движется влево или вправо в зависимости от значения. Возвращает найденный узел или null, если узел не найден.
//Метод insertNode() вставляет новый узел со значением в дерево. Если дерево пустое, устанавливается корневой узел. В противном случае, выполняется поиск места для вставки нового узла в соответствии с условиями бинарного дерева поиска.
//Метод printTree() осуществляет вывод дерева в консоль. Он использует стеки для обхода дерева в ширину и вывода значений узлов в правильном порядке.
//В методе main создается объект Tree, в него вставляются узлы с различными значениями, выводится дерево в консоль, а затем находится и выводится узел с заданным значением.
//
//Этот код демонстрирует базовую реализацию бинарного дерева поиска и его функциональности, таких как вставка, поиск и вывод дерева.

//https://javarush.com/groups/posts/3111-strukturih-dannihkh-dvoichnoe-derevo-v-java