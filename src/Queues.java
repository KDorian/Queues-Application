import java.util.Arrays;
import java.util.Stack;

public class Queues {

    int size;
    int [] Array;
    int front = 0;
    int rear = -1;
    int itemCount = 0;

    Queues(int size){

        this.size = size;
        Array = new int[size];
    }

    Queues(){

        size = 10;
        Array = new int[size];
    }

    public int peek(){

        return Array[front];
    }

    public boolean isEmpty(){

        return itemCount == 0;
    }

    public boolean isFull(){

        return itemCount == size;
    }

    public void setSize(int size){

        this.size = size;
        Array = new int[size];
    }

    public int size(){

        return itemCount;
    }

    public void insert(int data){

        if(!isFull()){

            if(rear == size-1){

                rear = -1;
            }

            Array[++rear] = data;
            itemCount++;
        }
    }

    public int removeData(){

        Array[front] = 0;
        int data = Array[front++];

        if(front == size){
            front = 0;
        }
        if(itemCount>0){

            itemCount--;
        }
        return data;
    }

    @Override
    public String toString(){

        return Arrays.toString(Array);
    }

}
