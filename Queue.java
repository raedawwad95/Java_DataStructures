public class Queue {
   // your code is here
	int []queue=new int[5] ;
	int x=0;
    public void push(int pushedElement){
       //your code is here
    	
    	queue[x]=pushedElement;
    	x++;
    }
    public void pop(){
    	for(int i=0;i<queue.length-1;i++){
    		queue[i]=queue[i+1];
    	}
    	x--;
        //your code is here
    }
	public void display(){
        //your code is here
		for(int i=0;i<queue.length;i++){
    		System.out.println(queue[i]);
    	}
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Queue q = new Queue();
    	q.push(10);
    	q.push(20);
    	q.push(102);
    	q.push(202);
    	q.pop();
    	q.push(30);
    	q.push(2);
    	q.display();
    	
    }

}