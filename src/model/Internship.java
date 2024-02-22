
package candidates;


/**
 *
 * @author nhs
 */
public class Internship extends Person {
    private String major;
    private String semester;
    private String uni;

    public Internship() {
    }

    public Internship(String major, String semester, String uni, String id, String firstName, String lastName, int birthday, String address, String phone, String email, String type) {
        super(id, firstName, lastName, birthday, address, phone, email, type);
        this.major = major;
        this.semester = semester;
        this.uni = uni;
    }

    

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    @Override
    public String toString() {
        System.out.printf("%s  |%-10s  |%-10s   |%-20s\n", super.toString(), major, semester, uni);
        return ""; 
    }
    
    
}
