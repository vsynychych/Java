package Lesson7_LambdaExpressions;

import java.util.Objects;

public class Product {
    int age;
    int size;

    public Product() {
    }

    public Product(int age, int size) {
        this.age = age;
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return age == product.age && size == product.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, size);
    }

    @Override
    public String toString() {
        return "Product{" +
                "age=" + age +
                ", size=" + size +
                '}';
    }
}
