class loopQuestion{
    public static void main(String[] args) {
        //sum of odd number
        int sum=0;
        int i=1;
        // while(i<=20){
        //     sum = sum+i;
        //     System.err.println(i);
        //     i=i+2;
        // }
        // System.err.println(sum);

        //drow parten 
        //   *
        //   **
        //   ***
        for(int j= 1; j<=4;j++){
            for(int k = 4; k>=j;k--){
                System.err.print("*");
            }
            System.err.println("");
        }
    
    }
}