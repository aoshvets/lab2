package com.example;

public class FenwickTree {
    private int n;
    private int[] bit;

    public void build(int[] arr) {
        n = arr.length;
        bit = new int[n + 1];
        for (int i = 0; i < n; i++) {
            updateInternal(i + 1, arr[i]);
        }
    }

    private void updateInternal(int i, int delta) {
        while (i <= n) {
            bit[i] += delta;
            i += i & -i;
        }
    }

    public void update(int index, int delta) {
        updateInternal(index + 1, delta);
    }

    public int prefixSum(int index) {
        int sum = 0;
        int i = index + 1;
        while (i > 0) {
            sum += bit[i];
            i -= i & -i;
        }
        return sum;
    }

    public int rangeSum(int left, int right) {
        return prefixSum(right) - (left > 0 ? prefixSum(left - 1) : 0);
    }
}
