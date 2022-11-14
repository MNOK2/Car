public class Truck extends Car {
    private final float _loadCapacity;

    public Truck(float speed, float gasLevelMax, float gasMileage, float loadCapacity, int tiresCount, int doorsCount) {
        super(speed, gasLevelMax, gasMileage, tiresCount, doorsCount);
        if (loadCapacity < 0.0f) throw new IllegalArgumentException();
        this._loadCapacity = loadCapacity;
    }

    public float loadCapacity() {
        return this._loadCapacity;
    }

    @Override
    public String toString() {
        return String.format("=== トラック ===\n速さ: %.1fkm/h\n燃料: %.1f/%.1fL\n燃費: %.1fkm/h\n最大積載量: %.1ft\nタイヤの数: %d個\nドアの数: %d個", this.speed(), this.gasLevel(), this.gasLevelMax(), this.gasMileage(), this.loadCapacity(), this.tiresCount(), this.doorsCount());
    }
}
