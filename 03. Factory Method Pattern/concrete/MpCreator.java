package concrete;

import java.util.Date;

import framework.Item;
import framework.ItemCreator;

public class MpCreator extends ItemCreator {

    @Override
    protected void createItemLog() {
        System.out.println("[" + new Date() + "] " + "Create a New Mp Potion");
    }

    @Override
    protected void requestItemInfo() {
        System.out.println("[" + new Date() + "] " + "Getting Info of Mp Potion");
    }

    @Override
    protected Item createItem() {
        return new MpPotion();
    }

}
