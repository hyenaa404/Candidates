
package candidates;


/**
 *
 * @author nhs
 */
public class Fresher extends Person {
    private String graduatedDate;
    private String rank;
    

    public Fresher() {
    }

    public Fresher(String graduatedDate, String rank, String id, String firstName, String lastName, int birthday, String address, String phone, String email, String type) {
        super(id, firstName, lastName, birthday, address, phone, email, type);
        this.graduatedDate = graduatedDate;
        this.rank = rank;
    }

    

    public String getGraduatedDate() {
        return graduatedDate;
    }

    public void setGraduatedDate(String graduatedDate) {
        this.graduatedDate = graduatedDate;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }


    @Override
    public String toString() {
        System.out.printf("%s  |%-20s  |%-10s\n", super.toString(),graduatedDate, rank);
        return ""; 
    }
    
    
}
