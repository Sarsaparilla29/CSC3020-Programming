public class Question01J {
    public static void main(String[] args) {// 01234567890123456789
        //StringBuilder str = new StringBuilder("Welcome to Java Time");
        String s = "Welcome to Java Time";
                //"Write three statements to delete a substring from a string s of 20 characters," +
                //"starting at index 6 and ending with index 10. " +
                //"Use the delete method in the StringBuilder class.");
        StringBuilder str = new StringBuilder(s);
        //System.out.println(str.substring(6,10));
        /*for(int i = 0; i < 4; i++) {
            str.deleteCharAt(6);
        }*/
        str.delete(6,10);
        s = str.toString();
        System.out.println(s);

    }
}
