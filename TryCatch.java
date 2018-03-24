public class TryCatch {
    public static void main(String[] args) {
        int[] arr = new int[10];
        try {
            System.out.println(arr[9001]);
        } catch (Throwable err) {
            System.out.println("Problem with code detected: " + err);
        }
    }
}
