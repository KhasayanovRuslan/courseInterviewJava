package homework1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .firstName("Иван")
                .lastName("Иванов")
                .middleName("Александр")
                .country("Russia")
                .phone("2575119453621")
                .address("Street dclkdhvhshid")
                .age(30)
                .gender("male")
                .build();

        System.out.println(person);
    }

}
