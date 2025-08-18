class findpair {
    public static void main(String[] args) {
        int arr[] = {8, 10, 15, 5, 9, 7, 4, 6};
        int target = 25;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }
}
