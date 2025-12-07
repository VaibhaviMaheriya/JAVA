package EnumExamples;

public enum Status {

    NEW("N"),
    IN_PROGRESS("P"),
    DONE("D");

    private String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public static Status from(String value){
        for(Status status : Status.values()){
            if(status.value.equalsIgnoreCase(value)){
                return status;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        String input = "D";

        Status status = Status.from(input);

        if(status != null){
            System.out.println("Converted : "+status);
        }
        else{
            System.out.println("Invalid Value");
        }

    }

}
