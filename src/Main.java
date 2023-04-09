public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Ежемесячный платеж в течение 12 месяцев:");
        System.out.println(service.annuity(1_000_000, 9.99, 12));

        System.out.println("Ежемесячный платеж в течение 24 месяцев:");
        System.out.println(service.annuity(1_000_000, 9.99, 24));

        System.out.println("Ежемесячный платеж в течение 36 месяцев:");
        System.out.println(service.annuity(1_000_000, 9.99, 36));
    }
}