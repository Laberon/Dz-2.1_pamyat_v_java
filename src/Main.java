import java.util.Arrays;

public class Main {
    public static class person {
        public String name;
        public String surname;

        public person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        @Override
        public String toString() {
            return "person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }


        public void changePerson(person Person) {
            name = "Ilya";
            surname = "Lagutenko";
        }
    }
    public static Integer[] changeValue(Integer value[]) {
        value = new Integer[]{99};
        return value;
    }

    public static void main(String[] args) {
        Integer[] value = new Integer[]{3, 4};
        changeValue(value);
        System.out.println("value 2 = " + Arrays.toString(value));

        person Person = new person("Lyapis", "Trubetskoy");
        Person.changePerson(Person);
        System.out.println("Person.toString() = " + Person.toString());
    }
}