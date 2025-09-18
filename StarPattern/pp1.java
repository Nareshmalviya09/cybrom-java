package StarPattern;

class pp1{
    public static void main(String[]arg){
        for (int r=1; r<=5;r++){
            for(int c =1; c<=9;c++){
                if (c>=6-r && c<=4+r){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();  
        }
    }
}