
package candidates;


/**
 *
 * @author nhs
 */
public class Experience extends Person {
    private int yearEx;
    private String proSkill;

    public Experience() {
    }

    public Experience(int yearEx, String proSkill, String id, String firstName, String lastName, int birthday, String address, String phone, String email, String type) {
        super(id, firstName, lastName, birthday, address, phone, email, type);
        this.yearEx = yearEx;
        this.proSkill = proSkill;
    }

    

    public int getYearEx() {
        return yearEx;
    }

    public void setYearEx(int yearEx) {
        this.yearEx = yearEx;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    

    @Override
    public String toString() {
        System.out.printf("%s  |%-20s  |%-20s\n",super.toString(), yearEx, proSkill);
        return ""; 
    }
    
    
    
}
