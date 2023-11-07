package lotto.domain;

public class ProfitRate {

    private final double profitRate;

    public ProfitRate(long totalWinning, int deposit) {
        this.profitRate = profitRate(totalWinning, deposit);
    }

    private double profitRate(long totalWinning, int deposit) {
        return ((double) totalWinning / deposit) * 100;
    }

    public double getProfitRate() {
        return profitRate;
    }
}
