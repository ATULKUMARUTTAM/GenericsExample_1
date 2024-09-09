public class GenClass <T>{
    T data;

    public GenClass(T data) {
        this.data = data;
    }

    public void PrintGenData()
    {
        System.out.println("Gen Class Data "+data);
    }

}
