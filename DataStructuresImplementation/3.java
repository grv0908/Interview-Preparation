class QueueUsingArray{
    private int[] element;
    private int front;
    private int rear;
    private int size;
    
    public QueueUsingArray(int size){
         element = new int[size];
         front = -1;
         rear = 0;
         size = 0;
    }
    
    public void enqueue(int data){
        if(size == element.length )
           throw new Exception();
         
        element[rear] = data;
        rear = (rear + 1)%element.length;
        size++;
        if(front == -1)
          front = 0;
    }
    
    public int dequeue(){
        if(size == 0)
           throw new Exception();
        
        int data = element[front];
        front = (front + 1)%element.length;
        size--;
        if(size == 0)
        {
            front = -1;
            rear = 0;
        }
        return data;
    }
    
    public boolean isFull(){
        return size == element.length;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int size(){
        return size;
    }
    
}
