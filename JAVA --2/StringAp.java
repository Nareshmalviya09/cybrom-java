public class StringAp {
    public static void main(String[] args) {
      StringBuilder s= new StringBuilder("naresh");

      
    //    to get element
      System.out.println(s.charAt(1));

    // set char of index at 0
    s.setCharAt(0, 'p');
    System.out.println(s);

    // to insert the cha
    s.insert(1, 'n');
    System.out.println(s);

        // to delete char

    s.delete(0,1);
    System.out.println(s);
    }
}
