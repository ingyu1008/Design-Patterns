package framework;
public abstract class ItemCreator {
    public Item create(){
        Item item;
        
        requestItemInfo();
        item = createItem();
        createItemLog();

        return item;
    }

    protected abstract void createItemLog();
    protected abstract void requestItemInfo();
    protected abstract Item createItem();
}
