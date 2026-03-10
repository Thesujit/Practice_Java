public class stackbottom {
    public static void pushatbottom (stack <Integer> s, int data) {
        if(s.isempty()){
            s.push(data);
            return;
        }
        int top  = s.pop();
        pushAtbottom(s, data);
        s.push(top);
    }
    public static void main(String[] args){
        stack <Integer> s = new stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushatbottom(5,4);
        while(s.isempty())
        {
            System.out.println(s.pop());
        }

    }
}