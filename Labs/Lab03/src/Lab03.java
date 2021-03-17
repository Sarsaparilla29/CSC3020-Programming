
public class Lab03 {
  public static void main(String[] args) {
    Course obj = new Course("Java Programming");

    obj.addStudent("Jacob");
    obj.addStudent("Hannah");
    obj.addStudent("Emma");

    System.out.println("Number of students in " + obj.getCourseName() + ": " + obj.getNumberOfStudents());
    String[] arr = obj.getStudents();
    for(int i = 0; i < arr.length; i++) {
      if(i == obj.getNumberOfStudents() - 1)
        System.out.print(arr[i]);
      else
        System.out.print(arr[i] + ", ");
    }
    System.out.println();

    obj.dropStudent("Jacob");
    arr = obj.getStudents();
    System.out.println("Number of students in " + obj.getCourseName() + ": " + obj.getNumberOfStudents());
    for(int i = 0; i < arr.length; i++) {
      if(i == obj.getNumberOfStudents() - 1)
        System.out.print(arr[i]);
      else
        System.out.print(arr[i] + ", ");
    }
    
  }
}

class Course {
  private String courseName;
  private String[] students = new String[3];
  private int numberOfStudents;
    
  public Course(String courseName) {

    this.courseName = courseName;
  }
  
  public String getCourseName() {

    return courseName;
  }

  public int getNumberOfStudents() {

    return numberOfStudents;
  }  

  //Revise the getStudents method to return an array whose length is the same 
  //as the number of students in the course. 
  public String[] getStudents() {
    String[] tempArr = new String[numberOfStudents];
    for(int i = 0; i < numberOfStudents; i++) {
      tempArr[i] = students[i];
    }
    return tempArr;
  }
 

  //Revise the addStudent method to automatically increase the array size 
  public void addStudent(String student) {
    if (students.length == numberOfStudents) {
      String[] tempArr = new String[students.length + 3];
      System.out.print("Increase Capacity: ");
      for(int i = 0; i < students.length; i++) {
        tempArr[i] = students[i];
        System.out.print(tempArr[i]);
      }
      System.out.println();
      numberOfStudents++;
      students = tempArr;
    }
    students[numberOfStudents] = student;
    numberOfStudents++;
  }
  
  //Implement the dropStudent method.	
  public void dropStudent(String student) {
    boolean b = false;
    String[] tempArr = new String[students.length - 1];
      for(int i = 0; i < students.length; i++) {
        if(students[i] == student) {
          tempArr[i] = students[i+1];
          --numberOfStudents;
          b = true;
        }
        if (b == true & i + 1 < students.length) {
          tempArr[i] = students[i+1];
        }


      }
      students = tempArr;
      //String[] tempArr = new String[numberOfStudents];
      /*for (int i = 0; i < students.length; i++) {
        if(students[i] == " ") {
          tempArr[i] = students[i+1];
        }
        else {
          tempArr[i] = students[i];
        }

      }*/
      //students = tempArr;
      //numberOfStudents--;
  }
}