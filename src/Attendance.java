public class Attendance {

    private String name;
    private int age;
    private double time;

    public Attendance ( String name ,int age , double time){
        setName(name);
        setAge(age);
        setTime(time);
    }

    public String getName(){
        return name;
    }
        public void setName(String Name){
        this.name = Name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int Age){
        this.age = Age;
    }
    public double getTime(){
        return time;
    }
    public void setTime(double Time){
        this.time = Time;
    }

}
