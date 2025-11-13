class t1{

    public static void main(String []arg){
           int arr[] = {1, 2, 3,4,5, 4,5};
            int target = 9;
            int c=0;
             for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target && c<1) {
                    c++; 
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                     
                }
            }
        }
    }
}
   