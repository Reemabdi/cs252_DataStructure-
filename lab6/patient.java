package lab6;

public class patient {
   
    static int id;
    int age;
    static String name ;
   

    public patient(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
       
    }

    
    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  

    @Override
    public String toString() {
        return String.format("ID: 000%d,Name: %s , Age: %d , " ,id, name , age);
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    
    
}
