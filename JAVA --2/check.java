class check{
   public static void main(String[] args) {
        String str = "NAreSH";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 'a' && c <= 'z') {
                result = result+ (char)(c - 32); // lowercase → uppercase
            } else if (c >= 'A' && c <= 'Z') {
                result =result+ (char)(c + 32); // uppercase → lowercase
            } 
        }

        System.out.println(result);
    }
}
