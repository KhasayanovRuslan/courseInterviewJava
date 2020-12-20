//Создать builder для класса Person со следующими полями: String firstName, String lastName,
//        String middleName, String country, String address, String phone, int age, String gender
package homework1;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public static class Builder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private int age;
        private String gender;

        public Builder firstName(String value) {
            firstName = value;
            return this;
        }

        public Builder lastName(String value) {
            lastName = value;
            return this;
        }

        public Builder middleName(String value) {
            middleName = value;
            return this;
        }

        public Builder country(String value) {
            country = value;
            return this;
        }

        public Builder address(String value) {
            address = value;
            return this;
        }

        public Builder phone(String value) {
            phone = value;
            return this;
        }

        public Builder age(int value) {
            age = value;
            return this;
        }

        public Builder gender(String value) {
            gender = value;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.country = builder.country;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
        this.gender = builder.gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
