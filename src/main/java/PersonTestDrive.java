public class PersonTestDrive {
    public static void main(String[] args) {

        Person p = new Person("Desire", "Doue");
        Pupil pupil = new Pupil("Barcola", "Dembouz", 12);
        Employee employee = new Employee("Oladipupo", "Damola", 20000);



        pupil.showName();

        pupil.showGPA();

        System.out.println(pupil.gpa);

        employee.showName();

        employee.showSalary();




    }





}
