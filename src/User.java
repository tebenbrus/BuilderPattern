public class User{
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String address;
    private final String phone;
    private final int age;

    private User(UserBuilder builder){
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
        private final String address;
        private final String phone;
        private final int age;

        public UserBuilder(String firstName, String lastName, String email, String address, String phone,int age){
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.address = address;
            this.phone = phone;
            this.age = age;
        }
    }


}