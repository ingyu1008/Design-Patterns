public class AdapterImpl implements Adapter {

    @Override
    public Float twiceOf(Float f) {
        return Math.doubled(f.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(Float f) {
        System.out.println("[DEBUG] half() invoked");
        return (float) Math.half(f.doubleValue());
    }
    
}
