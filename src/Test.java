import java.util.Scanner;


public class Test {

	
	public static void main(String[] args) {
	Scanner a = new Scanner(System.in);	
    System.out.println("How Many Numbers Do You Want to Enter ?");
    Queue b = new Queue();
    int c = a.nextInt();
    System.out.println("Please Enter The Numbers You Want To Sort :");
    for (int i = 0; i < c; i++) {
    b.addQueue(a.nextInt());
	}
    BinarySearchTree d = new BinarySearchTree();  
    for (int i = 0; i < c; i++) {
		d.insert(b.getFront());
    	b.deleteQueue();
	}
    System.out.println(d);
	}

}
