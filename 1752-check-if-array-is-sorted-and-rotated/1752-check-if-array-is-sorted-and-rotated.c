bool check(int* A, int n) {
    int k = 0;
    for (int i = 0; i < n; ++i) {
        if (A[i] > A[(i + 1) % n]) {
            k++;
        }
        if (k > 1) {
            return false;
        }
    }
    return true;
}