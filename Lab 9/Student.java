public class Student {
    private String name;
    private String id;
    private double cgpa;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA! 0.0- 4.0.");
        }
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Rafi");
        student.setId("E253066");
        student.setCgpa(3.6);

        System.out.println("--- Student Details ---");
        System.out.println("Name: " + student.getName());
        System.out.println("ID  : " + student.getId());
        System.out.println("CGPA: " + student.getCgpa());
    }
}