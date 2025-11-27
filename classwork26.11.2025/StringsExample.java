public class StringsExample {

    public static void main(String[] args) {
        String str = "Hello world";

        System.out.println(str.length());
        int n = str.length();
        if(str.equals("123")) {
            System.out.println("Магия");
        }
        char[] chars = str.toCharArray();
        for(char x : chars) {
            System.out.print((char) (x+1));
        }
        System.out.println(str.toUpperCase());

        String s1 = str.substring(2, 9);
        System.out.println(s1);

        char a = str.charAt(4);
        System.out.println(a);

        if(str.contains("World")) {
            System.out.println("Реально есть world!");
        }

        String s2 = str.replace("o", "8");
        System.out.println(s2);

        if(str.startsWith("123")){

        }
        String[] words = str.split(" ");

        int n1 = str.indexOf('o');
        int n2 = str.lastIndexOf('o');

        System.out.println(n1 + ", " + n2);
    }
}
