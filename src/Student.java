public class Student {
      String data;

    public Student(String data) {
          this.data = data;
    }
    public void PrintData()
    {
        this.toString();
    }

    @Override
    public String toString() {
        return "Student{" +
                "data='" + data + '\'' +
                '}';
    }
}
