package com.learning.number.range.proxy.initial;



import com.learning.number.range.proxy.initial.dto.BranchHospital;
import com.learning.number.range.proxy.initial.dto.Curriculum;
import com.learning.number.range.proxy.initial.dto.Hogwarts;
import com.learning.number.range.proxy.initial.dto.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentFactory {

    public static Student getStudent(){
       BranchHospital branchHospital= BranchHospital.builder().branchHospitalName("Gryffindor").deanName("Minerva McGonagall").build();
       Curriculum curriculum= Curriculum.builder().curriculumName("Potions").teacher("Severus Snape").build();
       List<Curriculum> curriculumList=new ArrayList<>();
       curriculumList.add(curriculum);
       Student student= Student.builder().studentName("Harry Potter").studentAge("17").branchHospital(branchHospital).curriculumList(curriculumList).build();
        return student;
    }

    public static Hogwarts  getsSchool(){
        List<Student> students=new ArrayList<>();
        students.add(getStudent());
        Hogwarts hogwarts= Hogwarts.builder().principal("Albus Dumbledore").studentList(students).build();
        return hogwarts;
    }
}
