public class Online_Courses {
    public static void main(String[] args) {
        Course c1 = new Course("Mathematics", "3 Months");
        OnlineCourse c2 = new OnlineCourse("Java Programming", "2 Months", "Udemy", true);
        PaidOnlineCourse c3 = new PaidOnlineCourse("Data Science", "6 Months", "Coursera", true, 5000, 20);

        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();
    }
}

class Course {
    String courseName;
    String duration;

    public Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration);
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, String duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayInfo() {
        System.out.println("Online Course: " + courseName + ", Duration: " + duration + 
                           ", Platform: " + platform + ", Recorded: " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    public PaidOnlineCourse(String courseName, String duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayInfo() {
        double finalFee = fee - (fee * discount / 100);
        System.out.println("Paid Online Course: " + courseName + ", Duration: " + duration +
                           ", Platform: " + platform + ", Recorded: " + isRecorded +
                           ", Fee: " + fee + ", Discount: " + discount + "%, Final Fee: " + finalFee);
    }
}
