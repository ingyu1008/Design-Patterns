package concrete;

import framework.Item;

public class HpPotion implements Item {

    @Override
    public void use() {
        System.out.println("Hp Potion Used!");
    }
}
