package EnumExamples;

public enum DBConnection {
    Instance;

    public void connect(){
        System.out.println("Connected");
    }

    public static void main(String[] args) {
        Instance.connect();
    }
}
