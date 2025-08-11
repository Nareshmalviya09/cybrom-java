class abc{
    public static void main(String[]arg){
        char ch = 'a';
        for (int r=1; r<=5;r++){
            for(int c =1; c<=9;c++){
                if (c<=r){
                    System.out.print((char)(c+64) +" ");
                }
                else System.out.print(" ");
            }
            System.out.println();  
        }
    }
}