
public class Student {
    Speciality speciality;
    String name;
    int year;

    public Student(String name, Speciality speciality, int year){
        this.name=name;
        this.speciality=speciality;
        this.year=year;
    }

    public Student() {

    }

   public String getName(){

        return name;
}
    public Speciality getSpeciality(){
                return speciality;
    }
    public int getYear(){
        return year;
    }


    public void setName(String name){
        this.name=name;
    }
    public void setSpeciality(Speciality speciality){
       this.speciality=speciality;
    }
    public void setYear(int year){

        this.year=year;
    }

}

