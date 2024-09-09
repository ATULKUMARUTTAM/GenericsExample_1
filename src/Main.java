public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome To Generic Class!!!!");

        //WithOut Generics
        PrintInteger i = new PrintInteger(10);
        i.PrintData();

        PrintFloat f = new PrintFloat(10.56f);
        f.PrintData();

        Student s = new Student("Atul");
        s.PrintData();



        //With generics class we do not required separate class for Integer, Float and Student
        GenClass<Integer> G_i = new GenClass<>(10);
        G_i.PrintGenData();

        GenClass<Float> G_f = new GenClass<>(10.6f);
        G_f.PrintGenData();

        Student s1 = new Student("Uttam");
        GenClass<Student> G_s = new GenClass<>(s1);
        G_s.PrintGenData();



    }
}