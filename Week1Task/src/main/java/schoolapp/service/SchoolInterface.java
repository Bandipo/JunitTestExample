package schoolapp.service;

import schoolapp.pupils.Pupil;
import schoolapp.pupils.Student;
import schoolapp.staffs.Staff;

import java.util.List;

public interface SchoolInterface {
    void addStaff(Staff staff);
    List<Staff> getAllStaffs();
    void listAllStaffs();

    void addStudent(Pupil student);
    List<Pupil> getAllStudents();
    void listAllStudents();

}
