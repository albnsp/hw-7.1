public class Task03 {
    private long grivnas;
    private byte kopiykas;

    public Task03(long grivnas, byte kopiykas) {
        this.grivnas = grivnas;
        this.kopiykas = kopiykas;
    }

    public long getGrivnas() {
        return grivnas;
    }

    public byte getKopiykas() {
        return kopiykas;
    }

    public void setGrivnas(long grivnas) {
        this.grivnas = grivnas;
    }

    public void setKopiykas(byte kopiykas) {
        this.kopiykas = kopiykas;
    }

    public void display() {
        System.out.println(grivnas + "," + kopiykas);
    }

    public Task03 add(Task03 other) {
        long sumGrivnas = this.grivnas + other.grivnas;
        int sumKopiykas = this.kopiykas + other.kopiykas;

        if (sumKopiykas >= 100) {
            sumGrivnas += sumKopiykas / 100;
            sumKopiykas %= 100;
        }

        return new Task03(sumGrivnas, (byte) sumKopiykas);
    }

    public Task03 subtract(Task03 other) {
        long diffGrivnas = this.grivnas - other.grivnas;
        int diffKopiykas = this.kopiykas - other.kopiykas;

        if (diffKopiykas < 0) {
            diffGrivnas--;
            diffKopiykas += 100;
        }

        return new Task03(diffGrivnas, (byte) diffKopiykas);
    }

    public Task03 divide(double divisor) {
        double totalAmount = this.grivnas + this.kopiykas / 100.0;
        double resultAmount = totalAmount / divisor;

        long resultGrivnas = (long) resultAmount;
        byte resultKopiykas = (byte) ((resultAmount - resultGrivnas) * 100);

        return new Task03(resultGrivnas, resultKopiykas);
    }

    public Task03 multiply(double multiplier) {
        double totalAmount = this.grivnas + this.kopiykas / 100.0;
        double resultAmount = totalAmount * multiplier;

        long resultGrivnas = (long) resultAmount;
        byte resultKopiykas = (byte) ((resultAmount - resultGrivnas) * 100);

        return new Task03(resultGrivnas, resultKopiykas);
    }

    public int compare(Task03 other) {
        double thisAmount = this.grivnas + this.kopiykas / 100.0;
        double otherAmount = other.grivnas + other.kopiykas / 100.0;

        if (thisAmount < otherAmount) {
            return -1;
        } else if (thisAmount > otherAmount) {
            return 1;
        } else {
            return 0;
        }
    }
}