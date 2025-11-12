// 🎓 5. College Admission
// Scenario:
// A student qualifies for admission if their marks are above 70 and they passed the entrance test.
// Task:
// Take marks and entrance result (True/False) as input and print “Admitted” or “Not Admitted”.

class Collage{
    private int studentMarks;
    private boolean enterncePassed;
    
    Collage(int studentMarks,boolean enterncePassed){
        this.studentMarks=studentMarks;
        this.enterncePassed=enterncePassed;
    }
    
    public String checkAdimission(){
        if(studentMarks>=70&&enterncePassed){
            return "Admitted";
        }else{
            return "Not Admitted";
        }
    }
}
class CollageAdmission{
    public static void main (String[] args) {
        Collage student1=new Collage(90,true);
        
        System.out.println("Result:"+student1.checkAdimission());
        
        
        Collage student2=new Collage(70,true);
        System.out.println("Result:"+student2.checkAdimission());
    }
}