package EnumExamples;

public enum Role implements Permission {

    Admin{
        @Override
        public String Accesslevel() {
            return "Full Access: Read , Write , Delete";
        }
    },

    User{
        @Override
        public String Accesslevel() {
            return "Limited Access: Read , Write";
        }
    },

    Guest{
        @Override
        public String Accesslevel() {
            return "Read only access";
        }
    };

    public static void main(String[] args) {
        for(Role role: Role.values()){
            System.out.println(role+ " -> "+ role.Accesslevel() );
        }
    }
}
