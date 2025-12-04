package EnumExamples;

public enum level {
    Low(1),Medium(2),High(3);

    private final int code;

    level(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static void main(String[] args) {
        System.out.println(level.High.getCode());
    }
}
