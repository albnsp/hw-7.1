public class Task05 {
    private double realPart;
    private double imaginaryPart;

    public Task05(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Task05(int realPart, int imaginaryPart) {
        this.realPart = (double) realPart;
        this.imaginaryPart = (double) imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public Task05 add(Task05 other) {
        double newRealPart = this.realPart + other.realPart;
        double newImaginaryPart = this.imaginaryPart + other.imaginaryPart;
        return new Task05(newRealPart, newImaginaryPart);
    }

    public Task05 subtract(Task05 other) {
        double newRealPart = this.realPart - other.realPart;
        double newImaginaryPart = this.imaginaryPart - other.imaginaryPart;
        return new Task05(newRealPart, newImaginaryPart);
    }

    public Task05 multiply(Task05 other) {
        double newRealPart = this.realPart * other.realPart - this.imaginaryPart * other.imaginaryPart;
        double newImaginaryPart = this.realPart * other.imaginaryPart + this.imaginaryPart * other.realPart;
        return new Task05(newRealPart, newImaginaryPart);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Task05 other = (Task05) obj;
        return Double.compare(other.realPart, realPart) == 0 && Double.compare(other.imaginaryPart, imaginaryPart) == 0;
    }

}
