package schoolapp.staffs;

import schoolapp.pupils.Applicant;
import schoolapp.pupils.Pupil;

public interface Admittable {
    void admitStudent(Staff principal, Pupil applicant);
}
