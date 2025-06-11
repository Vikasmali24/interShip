package Demo;

public class SplitExample {
    public static void main(String[] args) {
        String str = "Hello? How are you? Good!";
        String[] result = str.split("\\?\\s?");
        for (String part : result) {
            System.out.println(part);
        }
    }
}
