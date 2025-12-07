package EnumExamples;

public enum PaymentMode {

    CARD(1, "Card Payment"),
    UPI(2, "UPI Transfer"),
    CASH(3, "Cash Payment");

    private int id;
    private String description;

    PaymentMode(int id, String description){
        this.id = id;
        this.description = description;
    }

    public int getId(){
        return id;
    }

    public String getDescription(){
        return description;
    }

    // Method to print all payment modes
    public static void paymentmodes(){
        for(PaymentMode mode : PaymentMode.values()){
            System.out.println(mode.getId() + " : " + mode.getDescription());
        }
    }

    public static void main(String[] args) {
        paymentmodes(); // calling the method to test
    }

}
