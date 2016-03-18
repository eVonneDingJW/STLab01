
package triangle;

public class Triangle {
	
    public int type (int a,int b,int c){
       
    	int type = 0;
        
        if(a + b > c && a + c > b && b + c > a){
            if(a == b && b == c){
                type = 1;
                System.out.println("等边三角形");
            }
            else if(a == b || b == c || a == c) {
            	type = 2;
                System.out.println("等腰三角形");
            }
            else{
            	type = 3;
                System.out.println("其他种类三角形");
            }
        }
        else{
        	type = -1;
            System.out.println("不能构成三角形");
        }
        return type;
    }
    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println(t.type(4, 4, 4));
    }
}