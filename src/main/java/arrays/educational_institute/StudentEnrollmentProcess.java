package arrays.educational_institute;

record Course(Integer id, String name, Double fee) {

}

record Offer(String offerText) {
}

record EducationInstitute(Course[] courses, Offer[] offers) {
    public void enrollStudentInCourse(int courseId, String studentName) {
        for (int i = 0; i < courses.length; i++) {
            if (courseId == courses[i].id()) {
                System.out.println(studentName + "enrolled in " + courses[i].name());
            }
        }

        System.out.println("Course with ID " + courseId + "not found.");
    }
}

record Student(String sName, EducationInstitute institute) {
    public void viewCoursesAndFees() {
        for (Course courses : institute().courses()) {
            System.out.println(courses.id() + " : " + courses.name() + " :" + courses.fee());
        }

    }

    public void viewOffers() {
        for (Offer offers : institute.offers()) {
            System.out.println(offers.offerText());
        }
    }

    public void enrollInCourse(int courseId, String studentName) {
        for (Course course : institute().courses()) {
            if (course.id() == courseId) {
                System.out.println(studentName + "  Enrolled in " + course.name());
break;
            } else {
                System.out.println("Course with ID " + courseId + " not found.");
            }
        }
    }
}

public record StudentEnrollmentProcess() {
    public static void main(String[] args) {
        Course[] courses = new Course[3];
        courses[0] = new Course(111, "java", 30000D);
        courses[1] = new Course(222, "advance java", 50000D);
        courses[2] = new Course(333, "Html ", 60000D);
        Offer[] offers = new Offer[2];
        offers[0] = new Offer("20% discount on all course");
        offers[1] = new Offer("please atleast on course");
        EducationInstitute nit = new EducationInstitute(courses, offers);

        Student s1 = new Student("rajesh", nit);
        s1.viewCoursesAndFees();
        s1.viewOffers();
        s1.enrollInCourse(111, "rajesh");
    }
}
