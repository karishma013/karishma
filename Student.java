public class Student{
    private String name;
    public String getName() {
        return name;
    }
    private  void setName(String name) {
        this.name=name;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Student obj= new Student();
        obj.setName("Karishma");
        System.out.println(obj.getName());

    }

}
