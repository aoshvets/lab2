package com.example;

public class FenwickMain {

    public static void main(String[] args) {

        System.out.println("=== ТЕСТИРУЕМ FENWICK TREE (Дерево Фенвика) ===");

        int[] arr = {1, 2, 3, 4, 5};

        FenwickTree fenwickTree = new FenwickTree();
        fenwickTree.build(arr);

        System.out.println("\nПостроили дерево по массиву [1, 2, 3, 4, 5]");

        System.out.println("\nprefixSum(2) ? " + fenwickTree.prefixSum(2));
        System.out.println("(сумма элементов [1, 2, 3])");

        System.out.println("\nrangeSum(1, 3) ? " + fenwickTree.rangeSum(1, 3));
        System.out.println("(сумма элементов [2, 3, 4])");

        System.out.println("\nОбновляем arr[2] += 5");
        fenwickTree.update(2, 5);

        System.out.println("prefixSum(2) ? " + fenwickTree.prefixSum(2));
        System.out.println("(теперь arr[2] = 8, сумма [1, 2, 8] = 11)");

        System.out.println("\n=== ТЕСТ FENWICK TREE ЗАВЕРШЕН ===");
    }
}
