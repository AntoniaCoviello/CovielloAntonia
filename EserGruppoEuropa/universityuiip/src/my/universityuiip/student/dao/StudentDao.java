
package my.universityuiip.student.dao;

import java.util.List;

import my.universityuiip.model.StudentModel;


public interface StudentDao
{

	public List<StudentModel> findStudentBySerialNumber(String serialnumber);


}
