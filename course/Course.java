package course;


public class Course {

   private String courseName;
   private String[] students=new String[100];
   private int numberOfStudents;

    public Course(String courseName) {
        this.courseName=courseName;
    }
   

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    } 
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public void addStudents(String student){
        if(this.getNumberOfStudents()==students.length)
        {
        int sayi=students.length*2;
        String[] yeniDizi=new String[sayi];
        for(int i=0;i<students.length;i++){
            
            yeniDizi[i]=students[i];
            
        }
        students=yeniDizi;
        }
        students[this.getNumberOfStudents()]=student;
            this.numberOfStudents++;
    }
    public void dropStudents(int sayi){
        int j=0;
        String[] yeniDizi=new String[students.length-1];
    for(int i=0;i<students.length;i++){
    if(sayi==i){
    continue;
    }
    yeniDizi[j]=students[i];
   j++;
    }
    students=yeniDizi;
        
    }
    public void clear(){
    for(int i=0;i<students.length;i++){
        
        students[i]=null;
    }
    }
    

    
   
   
    
    public static void main(String[] args) {
        Course c1=new Course("DNA");
    for(int i=0;i<49;i++){
        c1.addStudents("Furkan");
        c1.addStudents("Ecrin");
        c1.addStudents("Yakup");
        c1.addStudents("Hasan");
        c1.addStudents("Fatih");
        }
        for(int i=0;i<c1.getStudents().length;i++){
    System.out.println(c1.students[i]);
}
    }
    

    
}
