class fibonaci{
    public static void main(String[] args) {
        int first =0;
        int sec = 1;
        int n =10;


        for(int i=1;i<n;i++){
            int nxt = first + sec;
            first =sec;
            sec= nxt;
        }
    }
}