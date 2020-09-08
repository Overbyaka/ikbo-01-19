public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball(10.5, "red", 1.3,4.5);
        b.kickBall(3.1,5.7);
        System.out.println(b.toString());
    }
}
