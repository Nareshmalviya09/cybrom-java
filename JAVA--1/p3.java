class p3{
    public static void main(String[] args) {
         for(int i=1;i<=5;i++){//row
            for(int j=i;j<5;j++){ //space
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){ //column
                System.out.print("*");
            }
            System.out.println();
         }
    }
}