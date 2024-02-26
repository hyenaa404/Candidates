package controller;

import candidates.*;
import util.Input;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.PersonList;

/**
 *
 * @author nhs
 */
public class Console {

    private String id;
    private String firstName;
    private String lastName;
    private int birthday;
    private String address;
    private String phone;
    private String email;
    private String type;
    private String major;
    private String semester;
    private String uni;
    private String graduatedDate;
    private String rank;
    private int yearEx;
    private String proSkill;

    PersonList personList = new PersonList();

    public static void main(String[] args) {
        Console cs = new Console();
        int option;
        while (true) {
        option = Menu.chooseInputOption();
            switch (option) {
                case 1 ->{
                    cs.inputPerson(1);
                }
                case 2 ->{
                    cs.inputPerson(2);
                }
                case 3 ->{
                    cs.inputPerson(3);
                }
                case 4 ->{
                    cs.searchList();
                }
                case 5 -> {
                    System.out.println("You selected to exit the program.");
                    System.exit(0);
                }
            }
        }
    }

    public Console() {
        Person e1 = new Experience(2, "leader", "UY91823", "Anna", "Hanna", 1984, "DN", "0192389823", "nhs@hana", "Experience");
        Person e2 = new Experience(3, "manage", "UF18233", "Eliot", "Fox", 1994, "QN", "0192389823", "nhs@hana", "Experience");
        Person f1 = new Fresher("20-07-2022", "good", "DE180292", "Alex", "Brown", 1999, "HN", "038989123", "alex@fpt", "Fresher");
        Person f2 = new Fresher("30-06-2022", "fair", "DF24324", "Graham", "Emmit", 1989, "HN", "038459123", "graham@123", "Fresher");
        Person i1 = new Internship("it", "fall", "FPT", "GU76556", "Lily", "Land", 1999, "QN", "019283912", "annn@123", "Internship");
        personList.addPerson(e1);
        personList.addPerson(e2);
        personList.addPerson(f1);
        personList.addPerson(f2);
        personList.addPerson(i1);
    }

    public void inputPerson(int n) {
        int op;
        System.out.print("Enter id: ");
        id = Input.inputId();
            System.out.print("Enter first name: ");
            firstName = Input.inputName();
            System.out.print("Enter last name: ");
            lastName = Input.inputName();
            System.out.print("Enter phone number: ");
            phone = Input.inputPhoneNumber();
            System.out.print("Enter email: ");
            email = Input.inputEmail();
            System.out.print("Enter year of birth: ");
            birthday = Input.inputBithYear();
            System.out.print("Enter address: ");
            address = Input.inputString();
        switch (n) {
            case 1 -> {
                    type = "Experience";
                    System.out.print("Enter year of experience: ");
                    yearEx = Input.inputYearEx();
                    System.out.println("Enter proffesional skill: ");
                    proSkill = Input.inputString();
                Person ex = new Experience(yearEx, proSkill, id, firstName, lastName, birthday, address, phone, email, type);
                personList.addPerson(ex);
            }
            case 2 -> {
                type = "Fresher";
                System.out.print("Enter rank of graduation (Exellence/ Good/ Fair/ Poor): ");
                rank = Input.inputRankOfGraduation();
                System.out.print("Enter graduated date (dd-mm-yyyy): ");
                graduatedDate = Input.inputDate();
                Person fr = new Fresher(graduatedDate, rank, id, firstName, lastName, birthday, address, phone, email, type);
                personList.addPerson(fr);
            }
            case 3 -> {
                type = "Internship";
                System.out.print("Enter major: ");
                major = Input.inputString();
                System.out.print("Enter semester: ");
                semester = Input.inputString();
                System.out.print("Enter University's name: ");
                uni = Input.inputName();
                Person it = new Internship(major, semester, uni, id, firstName, lastName, birthday, address, phone, email, type);
                personList.addPerson(it);

            }
        }
        System.out.println("Do you want to continue?\n1.Yes\n2.No");
        op = Input.inputOption(1, 2);
        if (op == 1) {
            inputPerson(n);
        }
    }

    public void displayList() {
        List<Person> psList = personList.getPersonList();
        System.out.println("\n------------Experience: ");
        System.out.printf("|%-10s  |%-20s  |%-10s  |%-10s  |%-15s  | %-10s  |%-10s  |%-20s  |%-20s\n", "ID", "Name", "Birthday", "Address", "Phone", "Email", "Type", "Year of experience", "Professional Skill");
        for (Person person : psList) {
            if (person instanceof Experience) {
                person.toString();
            }
        }
        System.out.println("\n------------Fresher: ");
        System.out.printf("|%-10s  |%-20s  |%-10s  |%-10s  |%-15s  | %-10s  |%-10s  |%-20s  |%-10s\n", "ID", "Name", "Birthday", "Address", "Phone", "Email", "Type", "Graduated Time", "Rank");
        for (Person person : psList) {
            if (person instanceof Fresher) {
                person.toString();
            }
        }
        System.out.println("\n------------Internship: ");
        System.out.printf("|%-10s  |%-20s  |%-10s  |%-10s  |%-15s  | %-10s  |%-10s  |%-10s  |%-10s  |%-20s\n", "ID", "Name", "Birthday", "Address", "Phone", "Email", "Type", "Major", "Semester", "University");
        for (Person person : psList) {
            if (person instanceof Internship) {
                person.toString();
            }
        }
    }

    public void searchList() {
        displayList();
        ArrayList<Person> searchList = new ArrayList<>();
        List<Person> psList = personList.getPersonList();
        System.out.println("--------------------------------------------------------------------------");
        System.out.print("Enter name to search: ");
        String nameTF = Input.inputName();
        System.out.print("Enter type of candidate (Experience/Frehser/Internship): ");
        String typeTF = Input.inputType();
        boolean isFind = false;
        for (Person person : psList) {
            if (person.getFirstName().contains(nameTF) || person.getLastName().contains(nameTF)) {
                if (person.getType().equalsIgnoreCase(typeTF)) {
                    searchList.add(person);
                    isFind = true;
                }
            }
        }
        if (isFind) {
            System.out.println("\n------------Search Result: ");
            for (Person person : searchList) {
                person.toString();
            }
        } else {
            System.out.println("Not found.");
        }

    }
}
