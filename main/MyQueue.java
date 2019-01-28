package main;
import java.util.*;

public class MyQueue {
    public int[] queu;
    public int size;
    public int total;
    public int rear;
    public int front;

    public MyQueue()
    {
       this.size =10;
       this.total=0;
        this.front=-1;
        this.rear=-1;
        queu=new int[size];
    }
    boolean isFull(){
        if(front == 0 && rear==size-1)
      return false;
        else
            return true;
    }

    void enqueu(int i){
        if(!isFull()) {
            System.out.println("que is full");
        }
        else
        {
            rear++;
            front=0;
            if(rear>size)
                throw new IndexOutOfBoundsException("rear>size");
            else
            queu[rear]=i;
        }
        }

        boolean isEmpty(){
        if(front == -1)
        return true;
        else
            return false;
        }
        void  dequeu(){
        if(!isEmpty()){
          int ele=queu[front];
          for(int i=0;i<size-1;i++)
              queu[i]=queu[i+1];
               rear--;
        }
        else
            System.out.println("que is empty");

        }

        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter element in que");
        MyQueue q1=new MyQueue();
        for(int i=0;i<10;i++)
        {
            int a=sc.nextInt();
            q1.enqueu(a);
        }
            for(int i=0;i<10;i++)
            {
                System.out.println(q1.queu[i]+"\n");
            }


            q1.dequeu();
            for(int i=0;i<10;i++)
            {
                System.out.println(q1.queu[i]+"\n");
            }
        }



    }


