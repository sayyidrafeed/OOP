public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Rafee", 19);
        person.tampilData();

        System.out.println();

        Employee employee = new Employee("Djamil", 19, "2410512078");
        employee.tampilData();
    }
}