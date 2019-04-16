package ru.itis;

class Node<T> {
    private T value;
    private Node<T> left;
    private Node<T> right;
    private int level;

    public Node() {
        value = null;
        left = this;
        right = this;
        level = 0;
    }

    public Node(T value, Node<T> left, Node<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
        this.level = 1;
    }

    public Node(T value) {
        this(value, null, null);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
