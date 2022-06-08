package forAdvanced.ex1;

public class Pair<T extends Comparable> {

    private T left;
    private T right;

    public Pair(T left, T right) {
        this.left = left;
        this.right = right;
    }


    public int max() {
        return this.left.compareTo(this.right);
    }


    public void swap() {
        T temporary = this.left;
        this.left = this.right;
        this.right = temporary;
    }


    public T getLeft() {
        return left;
    }

    public void setLeft(T left) {
        this.left = left;
    }

    public T getRight() {
        return right;
    }

    public void setRight(T right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
