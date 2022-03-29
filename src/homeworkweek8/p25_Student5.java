package homeworkweek8;

public class p25_Student5 {

        int id;
        String name;
        int age;

        //creating two arg constructor
       p25_Student5(int i, String n) {
            id = i;
            name = n;
        }

        //creating three arg constructor
        p25_Student5(int i, String n, int a) {
            id = i;
            name = n;
            age = a;
        }

        public void display() {
            System.out.println(id + " " + name + " " + age);
        }


    public static void main(String[] args) {
        p25_Student5 s1 = new  p25_Student5(111,"Karan");
        p25_Student5 s2 = new  p25_Student5(222,"Aryan",25);
        s1.display();
        s2.display();
    }




}
