import com.ingyu.connection.AbstConnectionHelper;
import com.ingyu.connection.DefaultConnectionHelper;

public class Main {
    public static void main(String[] args) {
        AbstConnectionHelper helper = new DefaultConnectionHelper();

        helper.requestConnection("Some Infomation");
    }
}
