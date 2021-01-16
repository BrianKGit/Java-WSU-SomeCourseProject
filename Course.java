
/**
 * @author Brian Klein
 * Date: 9/6/2017
 * Program: Course.java
 * Description:
 */

import java.util.ArrayList;

public class Course {

    private String courseNumber;
    private String courseTitle;
    private int creditHours;
    private String location;

    //aggregation
    private Date startDate;
    private Date endDate;
    private Instructor instructor;
    private Book textBook;
    private ArrayList<Student> studentList;

    public Course() {
    }

    public Course(String courseNumber, String courseTitle, int creditHours, String location, Date startDate, Date endDate, Instructor instructor, Book textBook, ArrayList<Student> studentList) {
        this.courseNumber = courseNumber;
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.instructor = instructor;
        this.textBook = textBook;
        this.studentList = studentList;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Book getTextBook() {
        return textBook;
    }

    public void setTextBook(Book textBook) {
        this.textBook = textBook;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Course#: " + courseNumber + "\n" +
                "Course Title: " + courseTitle + "\n" +
                "Credit Hours: " + creditHours + "\n" +
                "Location: " + location + "\n" +
                "Start Date: " + startDate + "\n" +
                "End Date: " + endDate + "\n" +
                "Instructor: " + instructor + "\n" +
                "Text Book: " + textBook + "\n" +
                "Student List: " + studentList;
    }

}
