package concrete;

import framework.Item;

public class MpPotion implements Item {

    @Override
    public void use() {
        System.out.println("Mp Potion Used!");
    }
}
