/*Group members 
 Kaniki Asanga Christine 17/272/BIT-j

*/
package org.iuea.oop.modall;

//creating the user class to hold users of the system
public class User {
    
    //creating the main method to make this class be able to run
    public static void main(String[]args){
        /*creating the admin that will be providing all the details of the course a student doing taking,
        and provide details of every courseUnit the student is taking*/
        Course Admin=new Course("student's course name","student's course code","student's course description",
                "courseUnit name","credit unit","courseUnit's description","courseUnit's content","courseUnit's code"
                ,"couseUnit's year");
        //creating a lecturer, this lecturer will provide information about the course he is teaching
        //here we assume 45=courseWork, 52=assignment, 85=practical, 55=presentation and 62=finalExam of a student
        Grades Lecturer=new Grades("courseUnit's name",45,52,85,55,62);
        
        //creating the first student, the student should enter this details as arguments
        Student student1=new Student("student's firstname","student's lastname","student's email","student's course name");
    }
}
