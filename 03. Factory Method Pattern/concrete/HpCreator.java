package concrete;

import java.util.Date;

import framework.Item;
import framework.ItemCreator;

public class HpCreator extends ItemCreator {

    @Override
    protected void createItemLog() {
        System.out.println("[" + new Date() + "] " + "Create a New Hp Potion");
    }

    @Override
    protected void requestItemInfo() {
        System.out.println("[" + new Date() + "] " + "Getting Info of Hp Potion");
    }

    @Override
    protected Item createItem() {
        return new HpPotion();
    }

}
