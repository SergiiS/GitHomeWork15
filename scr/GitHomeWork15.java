public class GitHomeWork15 {

    public String firstName;
    public String lastName;
    public String city;
    public String phoneNumber;
    public GitHomeWork15(String firstName, String lastName, String city, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String personInfo() {
        return "Зателефонувати громадянинові " + firstName + " " +
                lastName + " з міста " + city + " можна за номером " + phoneNumber + ".";
    }

    public static void main(String[] args) {
        GitHomeWork15 person1 = new GitHomeWork15("Will", "Smith", "New York", "2936729462846");
        GitHomeWork15 person2 = new GitHomeWork15("Jackie", "Chan", "Shanghai", "12312412412");
        GitHomeWork15 person3 = new GitHomeWork15("Sherlock", "Holmes", "London", "37742123513");

        System.out.println(person1.personInfo());
        System.out.println(person2.personInfo());
        System.out.println(person3.personInfo());
    }
}
