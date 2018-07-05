import org.junit.Test;
import party.liyin.multicasthelper.MulticastHelper;

import java.io.IOException;

public class MulticastTest {
    @Test
    public void MulticastTest_1() throws IOException {
        MulticastHelper helper = new MulticastHelper("224.224.224.2", 9999);
        helper.setCallback((address,port,array) -> {
            System.out.println(new String(array));
            try {
                helper.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        helper.receiveMulticast();
        MulticastHelper.sendMulticast("224.224.224.2",9999,"Test".getBytes());
    }
}
