public class InsuranceStrategyVeryHigh extends InsuranceStrategy {
    public InsuranceStrategyVeryHigh() {
    }

    @Override
    public double getWeight() {
        return 0.02;
    }

    @Override
    public int getConstant() {
        return 105600;
    }

    @Override
    public int getAdjustment() {
        return 60000;
    }
}