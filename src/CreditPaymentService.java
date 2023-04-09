public class CreditPaymentService {
    public int annuity(int credit, double percent, int months) {
        double monthRate = percent / 100 / 12;
        double kAnnuity = (monthRate * Math.pow(1 + monthRate, months)) / (Math.pow(1 + monthRate, months) - 1);
        double result = credit * kAnnuity;
        return (int) result;
    }
}
