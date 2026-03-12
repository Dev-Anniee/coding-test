import java.util.*;

class Main {
    static List<Integer> stack = new ArrayList<>();
    public static void push(int x){
            stack.add(x);
    }
    public static int pop(){
           if(stack.size()==0)
                return -1;
            return stack.remove(stack.size()-1);
    }
    public static void size(){
            System.out.println(stack.size());
    }
    public static int empty(){
            if(stack.size()==0)
                return 1;
            else 
                return 0;
    }
    public static int top(){
            if(stack.size()==0)
                return -1;
            return stack.get(stack.size()-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            String order = sc.next();
            if(order.equals("push")){
                int p = Integer.parseInt(sc.next());
                push(p);
            }
            else if(order.equals("pop")) System.out.println(pop());
            else if(order.equals("size")) size();
            else if(order.equals("empty")) System.out.println(empty());
            else if(order.equals("top")) System.out.println(top());
        }
    }
}