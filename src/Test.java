public class Test {
    public static void main(String[] args) {
        PaymentType pt = PaymentType.CREDITCARD;
        //System.out.println(pt);
        PaymentType[] paymentTypes = PaymentType.values();
        for (PaymentType paymentType: paymentTypes ) {
            System.out.println(paymentType+"\t"+paymentType.ordinal()+"\t"+paymentType.getFee());

        }
    }
}
