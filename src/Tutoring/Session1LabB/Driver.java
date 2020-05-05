package Tutoring.Session1LabB;

public class Driver {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[2]);
        int year = Integer.parseInt(args[3]);
        int secondMonth = Integer.parseInt(args[6]);
        int secondYear = Integer.parseInt(args[7]);


        Member secondMember = new Member(args[4], args[5], secondMonth, secondYear);
        //first member
        Member firstMember = new Member(args[0], args[1], month, year);

        Club newClub = new Club();
        newClub.join(firstMember);
        newClub.join(secondMember);

        System.out.println("All the members: ");

        newClub.showMembers();

        System.out.println("Total number of members: ");
        newClub.numberOfMembers();

        System.out.println("Members joining for the year of " + year);
        newClub.showMembersByYear(year);

        System.out.println("Removed members for the year " + year);
        newClub.removeMembersByYear(year);
        newClub.showMembers();

    }

}
