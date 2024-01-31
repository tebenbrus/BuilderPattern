public class User{
    protected final String firstName;
    protected final String lastName;
    protected final String email;
    protected final String address;
    protected final String phone;
    protected final int age;

    User(UserBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
    }

    public static class UserBuilder{
        private final String firstName;
        private final String lastName;
        private final String email;
        private String address;
        private String phone;
        private int age;

        public UserBuilder(String firstName, String lastName, String email){
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }
        public UserBuilder address(String address){
            this.address = address;
            return this;
        }
        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }
        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);  
        }
    }


}
