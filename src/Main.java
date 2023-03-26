public class Main {
    public static void main(String[] args) {
        System.out.println("Разделение любой строки на 2 части:");
        String word = "ПРИВЕТИ";
        int mid = word.length() / 2;
        String firstHalf = word.substring(0,mid);
        String secondHalf = word.substring(mid);
        System.out.println(firstHalf + " " + secondHalf);
    }
}