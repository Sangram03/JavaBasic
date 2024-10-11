public class Stringbuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");

        System.out.println(sb);
        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);

        // insert
        sb.insert(0,'D');
        System.out.println(sb);

        //delete
        sb.delete(2, 3);
        System.out.println(sb);

        //append
        sb.append("S"); // str = str+"S";
        sb.append("t");
        sb.append("a");
        sb.append("c");
        sb.append("k");
        System.out.println(sb);
        System.out.println(sb.length());
    }
    
}
