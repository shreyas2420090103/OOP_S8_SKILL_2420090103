public class StudentDashboard {
    public static void main(String[] args) {
        long rollNumber = 2420090103L;
        String name = "shreyas reddy";
        float marks = 85.75f;
        char gender = 'M';
        boolean isPass = true;

        System.out.println("------ Student Summary Slip ------");
        System.out.println("Roll Number   : " + rollNumber);
        System.out.println("Name          : " + name);
        System.out.println("Marks         : " + marks);
        System.out.println("Gender        : " + gender);
        System.out.println("Pass Status   : " + (isPass ? "Pass" : "Fail"));
        System.out.println("----------------------------------");
    }

}
