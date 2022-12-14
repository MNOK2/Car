public abstract class Car {
    private final float _speed;
    private final float _gasLevelMax;
    private final float _gasMileage;
    private final int _tiresCount;
    private final int _doorsCount;
    private float _gasLevel;
    private float _mileage = 0.0f;

    protected Car(float speed, float gasLevelMax, float gasMileage, int tiresCount, int doorsCount) {
        if (speed < 0.0f || gasLevelMax < 0.0f || gasMileage < 0.0f || tiresCount < 0 || tiresCount < 0) throw new IllegalArgumentException();

        this._speed = speed;
        this._gasLevelMax = gasLevelMax;
        this._gasMileage = gasMileage;
        this._tiresCount = tiresCount;
        this._doorsCount = doorsCount;
        this.fuel();
    }

    public float speed() {
        return this._speed;
    }

    public float gasLevelMax() {
        return this._gasLevelMax;
    }

    public float gasMileage() {
        return this._gasMileage;
    }

    public int tiresCount() {
        return this._tiresCount;
    }

    public int doorsCount() {
        return this._doorsCount;
    }

    public float gasLevel() {
        return this._gasLevel;
    }

    public boolean isEmpty() {
        return this.gasLevel() <= 0.0f;
    }

    public final void fuel() {
        this._gasLevel = this._gasLevelMax;
    }

    public final void drive() {
        if (this.isEmpty()) throw new IllegalCallerException();

        float beforeGasLevel = this._gasLevel;
        float deltaGasLevel;

        this._gasLevel -= this._speed / this._gasMileage;
        if (this._gasLevel < 0.0f) this._gasLevel = 0.0f;
        deltaGasLevel = this._gasLevel - beforeGasLevel;
        this._mileage += this._gasMileage * -deltaGasLevel;
        System.out.println(String.format("ブーン ＾＾（%.1fkm走行！, 燃料: %.1f -> %.1f/%.1fL）", this._mileage, beforeGasLevel, this.gasLevel(), this.gasLevelMax()));
    }
}
