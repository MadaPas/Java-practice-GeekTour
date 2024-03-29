package earlyjava.inheritance.grades;

public class CourseGradesMain {

    public static void main(String[] args) {
        GradedActivity labActivity = new GradedActivity(75);
        PassFailExam pfExam = new PassFailExam(10, 3, 6);
        Essay essay = new Essay(25, 15, 13, 27);
        FinalExam fExam = new FinalExam(10, 4);

        CourseGrades c = new CourseGrades();

        c.setLab(labActivity);
        c.setPassFailExam(pfExam);
        c.setEssay(essay);
        c.setFinalExam(fExam);

        System.out.println(c);
    }
}
