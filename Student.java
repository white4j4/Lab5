class Student {
  String name;
  double gpa;
  String major;

  String getName() 
  {
    return name;
  }

  double getGPA()
  {
    return gpa;
  }

  String getMajor()
  {
    return major;
  }

  void setName(String theName)
  {
    name = theName;
  }

  void setGPA(double theGPA)
  {
    gpa = theGPA;
  }

  void setMajor(String theMajor)
  {
    major = theMajor;
  }

  public void print()
   {
    System.out.println("The student's name is " + name + " The student's GPA is " + gpa + " The student's major is " + major);
  }

}