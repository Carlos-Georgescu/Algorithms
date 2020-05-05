package Tutoring.Session1LabB;

import java.util.*;

public class Club {
    private ArrayList<Member> members;

    public Club() {
        members = new ArrayList<Member>();
    }

    public void join(Member member) {
        if (member != null) {
            members.add(member);
        } else {
            throw new IllegalArgumentException("The member is null, it cannot be that");
        }
    }

    public int numberOfMembers() {
        return members.size();
    }

    public void showMembers() {
        for (Member member: members) {
            System.out.println(member.getFirstName() + " " + member.getLastName() + " joined in the month: " + member.getMonthJoined() + " of the year: " + member.getYearJoined());
        }
    }

    void showMembersByYear(int year) {
        Iterator<Member> iterator = members.iterator();
        while(iterator.hasNext()) {
            Member oneMember = iterator.next();
            if (oneMember.getYearJoined() == year) {
                System.out.println(oneMember.getFirstName() + " " + oneMember.getLastName() + " - " + oneMember.getYearJoined());
            }
        }
    }

    void removeMembersByYear(int year) {
        Iterator<Member> iterator = members.iterator();
        while(iterator.hasNext()) {
            Member oneMember = iterator.next();
            if (oneMember.getYearJoined() == year) {
                iterator.remove();
            }
        }
    }
}
