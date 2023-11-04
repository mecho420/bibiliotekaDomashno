import java.util.List;

public class TestLibrary {
    public static void main(String[] args) {
        Edition[] editions = new Edition[4];
        editions[0] =new Books("Pod Igoto",true,"Ivan Vazov",1887);
        editions[1] =  new Newspapers("Trud",true,"1 march 1936");
        editions[2] = new Books();
        editions[3] = new Newspapers();

        Library library1 = new Library("Ivan Vazov","Republica street","Monday - Friday from 8am to 5pm", List.of(editions));
        Books book2 = new Books("Pod Igoto",true,"Ivan Vazov",1887);
        library1.search(book2);
        for (int i = 0; i < editions.length; i++) {
            System.out.println(editions[i].getDetails());
        }
    }
}