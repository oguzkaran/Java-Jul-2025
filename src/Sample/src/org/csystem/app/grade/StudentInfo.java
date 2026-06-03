package org.csystem.app.grade;

import org.csystem.app.date.DateUtil;
import org.csystem.util.string.StringUtil;

public class StudentInfo {
    public String studentNumber;
    public String studentName;
    public String studentBirthDateStr;
    public String lectureName;
    public int midtermGrade;
    public int finalGrade;

    //...

    public static StudentInfo of(String str)
    {
        StudentInfo studentInfo = new StudentInfo();

        String [] info = StringUtil.split(str, ":");
        String [] birtDateInfo = StringUtil.split(info[2], "-");

        studentInfo.studentNumber = info[0];
        studentInfo.studentName = info[1];
        studentInfo.studentBirthDateStr = DateUtil.toDateStringEN(Integer.parseInt(birtDateInfo[2]), Integer.parseInt(birtDateInfo[1]), Integer.parseInt(birtDateInfo[0]));
        studentInfo.lectureName = info[3];
        studentInfo.midtermGrade = Integer.parseInt(info[4]);
        studentInfo.finalGrade = Integer.parseInt(info[5]);

        return studentInfo;
    }

    public double getGrade()
    {
        return midtermGrade * 0.4 + finalGrade * 0.6;
    }
}


