
public class App {
    public static void main(String[] args) throws Exception {

        linkedList numberLine= new linkedList();

        numberLine.insert(9);
        numberLine.insert(10);
        numberLine.insert(0);
        numberLine.insert(8);
        numberLine.traverse();
        numberLine.delete(10);
        numberLine.traverse();


    }
}
