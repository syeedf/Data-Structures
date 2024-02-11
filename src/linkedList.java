
class linkedList{
    private node head;
    private node tail; 

    public void insert(int data){
        node newNode= new node(data);
        if (head== null){
            head= newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail= newNode;
        }
    }
    public void delete(int data){
    node current = head; 
    node previous = null;
    while (current !=null) {
        if(current.data==data){
            if(previous==null){
                head = current.next;
            }
            else{
                previous.next=current.next;
            }
            break;
        }
        previous=current;
        current=current.next;
    }
}
    public void traverse(){
        node current =head;
        while (current!= null){
            System.out.println(current.data + " ");
            current=current.next;
        }
        System.out.println("No other nodes\n");
    }
}

