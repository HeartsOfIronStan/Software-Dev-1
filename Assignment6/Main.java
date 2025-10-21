public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Jacob", "2025", 3.0, 2432453);
        Student student2 = new Student("Stephanie", "2025", 3.74, 2498413);
        Student student3 = new Student("Jack", "2025", 2.65, 4328365);
        Student student4 = new Student("Fred", "2025", 3.42, 2453453);
        Student student5 = new Student("Lincoln", "2025", 3.0, 2432453);



        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println(student3.name);
        System.out.println(student4.name);
        System.out.println(student5.name);

        student1.HonorRoll();
        student2.HonorRoll();
        student3.HonorRoll();
        student4.HonorRoll();
        student5.HonorRoll();


        student1.freeLunch();
        student2.freeLunch();
        student3.freeLunch();
        student4.freeLunch();
        student5.freeLunch();

    }
}
