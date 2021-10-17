package schoolapp.service.impl;

import schoolapp.pupils.Pupil;
import schoolapp.service.SchoolInterface;
import schoolapp.staffs.Staff;

import java.util.ArrayList;
import java.util.List;

public class School implements SchoolInterface {

    private List<Staff> schoolStaff;
    private List<Pupil> students;

    public School(){
        schoolStaff = new ArrayList<>();
        students = new ArrayList<>();
    }


    @Override
    public void addStaff(Staff staff) {
        schoolStaff.add(staff);

    }

    @Override
    public List<Staff> getAllStaffs() {
        return schoolStaff;
    }

    @Override
    public void listAllStaffs() {
       if(schoolStaff != null){
           schoolStaff.forEach(System.out::println);
       }

    }

    @Override
    public void addStudent(Pupil student) {
     students.add(student);
    }

    @Override
    public List<Pupil> getAllStudents() {
        return students;
    }

    @Override
    public void listAllStudents() {
    if(students != null){
        students.forEach(System.out::println);

    }
    }
}
