package studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class StudentBuilder {
	List<Student> list = new ArrayList<Student>();

	public boolean addStudent(Student s) {
		for (Student st : list) {
			if (st.getId() == s.getId()) {
				return false;

			}
		}
		list.add(s);
		return true;
	}

	public Student getStudent(int id) {
		for (Student s : list) {
			if (s.getId() == id) {
				return s;
			}
		}
		return null;

	}

	public boolean removeStudent(int id) {
		Student temp = null;
		boolean find = false;
		for (Student s : list) {
			if (s.getId() == id) {
				temp = s;
				find = true;
			}
		}
		if (find) {
			list.remove(temp);
		}
		return find;

	}

	public void replaceStudent(int id, Student newStd) {
		removeStudent(id);
		addStudent(newStd);
	}

	public void printAllStudents() {

		System.out.println();
		System.out.println("The students are:");
		for (Student s : list) {
			System.out.println(s);
		}
	}

	public Student updateStudentBranch(int id, Branch br) {
		Student temp = null;
		for (Student st : list) {
			if (st.getId() == id) {
				st.setBranch(br);
				temp = st;
				break;
			}
		}
		return temp;
	}

}
