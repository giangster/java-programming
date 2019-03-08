import java.util.ArrayList;

public class ObjectsSailorProgram {
    public static void main(String[] args) {

        Sailor firstSailor = new Sailor("Frank", "frank@mail.com");
        Sailor secondSailor = new Sailor("Susan", "susan@mail.com");
        Sailor thirdSailor = new Sailor("John", "john@sailors.com");
        Sailor fourthSailor = new Sailor("Ann", "ann@sailors.com");

        Crew firstCrew = new Crew();
        Crew secondCrew = new Crew();

        firstCrew.addCrewMember(firstSailor);
        firstCrew.addCrewMember(secondSailor);
        firstCrew.addCrewMember(fourthSailor);

        secondCrew.addCrewMember(thirdSailor);
        secondCrew.addCrewMember(secondSailor);

        System.out.println("=== First crew ===\n" + firstCrew);
        System.out.println("=== Second crew ===\n" + secondCrew);

        secondSailor.setEmail("Susan@sailors.com");
        System.out.println("=== Second crew ===\n" + secondCrew);
    }
}

class Sailor {
    String name;
    String email;

    public Sailor(String name, String email) {
        this.name = name;
        this.email = email;
    }

    String getName() {
        return this.name;
    }

    String getEmail() {
        return this.email;
    }

    void setEmail(String email) {
        this.email = email;
    }
}

class Crew {
    ArrayList<Sailor> sailorList = new ArrayList<Sailor>();

    public Crew() {
        this.sailorList = sailorList;
    }

    public void addCrewMember(Sailor sailor) {
        sailorList.add(sailor);
    }

    public String toString() {
        String line1 = "";
        for (Sailor sailorObject : sailorList) {
            line1 = line1 + sailorObject.getName() + " (" + sailorObject.getEmail() + ")\n";
        }
        return line1;
    }

}
