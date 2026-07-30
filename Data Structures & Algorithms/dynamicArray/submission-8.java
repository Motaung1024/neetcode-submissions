class DynamicArray {
    private int[] arr;
    int size;
    public DynamicArray(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (size == arr.length)   {
            resize();
        }

        arr[size] = n;
        size++;
    }

    public int popback() {
        int result = arr[size - 1];
        //arr[size - 1] = 0;
        size--;
        return result;
    }

    private void resize() {
        int[] copy = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++)    {
            copy[i] = arr[i];
        }

        arr = copy;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return arr.length;
    }
}
