package beans;

import java.io.InputStream;

public class Student {

    private String name;
    private String surname;
    private int age;
    private String className;

    public Student() {
    }

    public Student(String name, String surname, int age, String className) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String infoStudents() {
        return this.getName() + " " + this.getSurname() + " " + this.getAge() + " " + this.getClassName();
    }
    
    public static void outputOfFounded(){
        String txt = Util.InputUtil.requireText("Type name,surname or className");
        Student [] founded =findStudents(txt);
        for (int i = 0; i < founded.length; i++) {
//            Student st = Config.student[i];
            System.out.println(founded[i].infoStudents());
            
        }
       
    }

    public static Student[] findStudents(String txt) {
        
        int count = 0;
        for (int i = 0; i < Config.student.length; i++) {
            Student st = Config.student[i];
            if (st.getName().contains(txt) || st.getSurname().contains(txt) || st.getClassName().contains(txt)) {
                count++;
            }
        }
        Student[]  student=new Student[count];
        int found=0;
         for (int i = 0; i < Config.student.length; i++) {
            Student st = Config.student[i];
            if (st.getName().contains(txt) || st.getSurname().contains(txt) || st.getClassName().contains(txt)) {
                student[found++]=st;
            }
        }
         return student;

    }
}

