public class Main {
    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();

        System.out.println(adapter.twiceOf(100f));
        System.out.println(adapter.halfOf(71f));
        System.out.println(adapter.halfOf(50f));
        System.out.println(adapter.halfOf(171f));
        System.out.println(adapter.halfOf(200f));
    }
}
