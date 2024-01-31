public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Steven", "Asis", "steven.asis@neu.edu.ph")
                .address("Quezon City")
                .phone("09531051374")
                .age(21)
                .build();

        System.out.println("User Information");
        System.out.println("First name: " +user.firstName);
        System.out.println("Last name: " +user.lastName);
        System.out.println("Email: " +user.email);
        System.out.println("Address: " +user.address);
        System.out.println("Phone: " +user.phone);
        System.out.println("Age: " +user.age);
    }
}
