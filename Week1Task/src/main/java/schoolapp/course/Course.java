package schoolapp.course;

import schoolapp.customexceptions.UnAuthourizedException;
import schoolapp.staffs.Staff;
import schoolapp.staffs.Teacher;

import java.util.Objects;

public class Course {
    private long id;
    private String title;
    private Staff teacher;

    public Course(long id, String title, Staff teacher) {
        this.id = id;
        this.title = title;
        if(teacher instanceof Teacher){
            this.teacher = teacher;
        }else {
            throw new IllegalArgumentException("supply Teacher as input");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return id == course.id && Objects.equals(title, course.title) && Objects.equals(teacher, course.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, teacher);
    }
}
