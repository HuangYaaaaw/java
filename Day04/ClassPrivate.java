package Day04;

public class ClassPrivate {
    int age;
    String name;
    public void setName(String n){
        name=n;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int n)
    {
        if(n>=18&&n<50)
        {
            age=n;
        }
        else{
            age=-1;
        }
    }
    public int getAge()
    {
        return age;
    }

}
