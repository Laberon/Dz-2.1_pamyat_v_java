import java.util.Arrays;

public class Main {


        public static int changeValue5(int value5) {
            value5 = 22;
            return value5;
        }
    public static Integer changeValue6(Integer value6) {
        value6 = 22;
        return value6;
    }

    public static Integer[] changeValue7(Integer value7[]) {
        value7 = new Integer[]{1, 2};
        return value7;
    }
    public static Integer[] changeValue8(Integer value8[]) {
        value8 = new Integer[]{99};
        return value8;
    }
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
            Person = new person("Ilya", "Lagutenko");// по задаче 9
            name = "Ilya";
            surname = "Lagutenko";
        }
    }

    public static void main(String[] args) {

        int value5 = 33;
        changeValue5(value5);
        System.out.println("value5 = " + value5);

        Integer value6 = 33;
        changeValue6(value6);
        System.out.println("value6 = " + value6);

        Integer[] value7 = {3, 4};
        changeValue7(value7);
        System.out.println("value7 = " + Arrays.toString(value7));

        Integer[] value8 = new Integer[]{3, 4};
        changeValue8(value8);
        System.out.println("value8 = " + Arrays.toString(value8));


        person Person = new person("Lyapis", "Trubetskoy");
        Person.changePerson(Person);
        System.out.println("Person.toString() = " + Person);
    }
}