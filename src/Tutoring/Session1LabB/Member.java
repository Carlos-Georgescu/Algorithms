package Tutoring.Session1LabB;

public class Member {
    public static final int FIRST_MONTH = 1;
    public static final int LAST_MONTH = 12;
    public static final int CURRENT_YEAR = 2019;

    private String firstName;
    private String lastName;
    private int monthJoined;
    private int yearJoined;


    /**
     *
     * @param first first name
     * @param last last name
     * @param month indicated month
     * @param year indicated year
     */
    public Member(String first, String last, int month, int year) {
        setFirstName(first);
        setMonthJoined(month);
        setYearJoined(year);
        setLastName(last);
    }



    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        if (!firstName.trim().isEmpty() && firstName != null) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("first name cannot be null or an empty String”");
        }
    }



    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        if (!lastName.trim().isEmpty() && lastName != null) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("last name cannot be null or an empty String");
        }
    }



    /**
     * @param monthJoined the monthJoined to set
     */
    public void setMonthJoined(int monthJoined) {
        if (monthJoined >= FIRST_MONTH && monthJoined <= LAST_MONTH) {
            this.monthJoined = monthJoined;
        } else {
            throw new IllegalArgumentException("Month is not in the specified field meeded");
        }

    }

    /**
     * @param yearJoined the yearJoined to set
     */
    public void setYearJoined(int yearJoined) {
        if (yearJoined > 0 && yearJoined <= CURRENT_YEAR) {
            this.yearJoined = yearJoined;
        } else {
            throw new IllegalArgumentException("The year value provided is not a valid input");
        }
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the yearJoined
     */
    public int getYearJoined() {
        return yearJoined;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the monthJoined
     */
    public int getMonthJoined() {
        return monthJoined;
    }

}
