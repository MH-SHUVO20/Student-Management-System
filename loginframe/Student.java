package loginframe;

public class Student {
    private String id;
    private String name;
    private String cgpa;
    private String address;
    private String dob;
    private String enrollmentDate;

    public Student(String id, String name, String cgpa, String address, String dob, String enrollmentDate) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.address = address;
        this.dob = dob;
        this.enrollmentDate = enrollmentDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCgpa() {
        return cgpa;
    }

    public void setCgpa(String cgpa) {
        this.cgpa = cgpa;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
}
