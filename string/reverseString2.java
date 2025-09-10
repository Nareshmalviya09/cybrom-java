package string;
public class reverseString2 {
    public static void main(String[] args) {
        String str = "madam";
        char arr[]=str.toCharArray();
        int start=0;
        int end=0;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            
            start++;
            end--;
        }
      for(int i=0;i<arr.length-1;i++)
       System.out.print(arr[i]);
    
}
    }
   
