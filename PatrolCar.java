public class PatrolCar extends Car implements SirenSounder {
    public PatrolCar(float speed, float gasLevelMax, float gasMileage, int tiresCount, int doorsCount) {
        super(speed, gasLevelMax, gasMileage, tiresCount, doorsCount);
    }

    @Override
    public String toString() {
        return String.format("=== パトカー ===\n速さ: %.1fkm/h\n燃料: %.1f/%.1fL\n燃費: %.1fkm/L\nタイヤの数: %d個\nドアの数: %d個", this.speed(), this.gasLevel(), this.gasLevelMax(), this.gasMileage(), this.tiresCount(), this.doorsCount());
    }

    @Override
    public void soundSiren() {
        System.out.println("ウーウー ＞ω＜");
    }
}
