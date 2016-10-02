package abpruning;

import java.util.ArrayList;
import java.util.List;

public class Main{    
    public static void main (String[]args){
        ArrayList<Node> lf = new ArrayList<>();//leaf node
        /*
        The Place Holder nodes
        */
        ArrayList<Node> a = new ArrayList<>();
        ArrayList<Node> b = new ArrayList<>();
        ArrayList<Node> c = new ArrayList<>();
        ArrayList<Node> d = new ArrayList<>();
        ArrayList<Node> e = new ArrayList<>();
        ArrayList<Node> f = new ArrayList<>();
//        ArrayList<Node> g = new ArrayList<>();
//        ArrayList<Node> h = new ArrayList<>();
//        ArrayList<Node> i = new ArrayList<>();
//        ArrayList<Node> j = new ArrayList<>();
//        ArrayList<Node> k = new ArrayList<>();
//        ArrayList<Node> l = new ArrayList<>();
        
        
        /* 
        The Place Holder for the Root Node
        */
        ArrayList<Node> z = new ArrayList<>();
        
        /*
        The RealNodes with VALUE
        */
           Node one = new Node(10,lf);
        Node two = new Node(11,lf);
        
        Node three = new Node(9,lf);
        Node four = new Node(12,lf);
        
        Node five = new Node(14,lf);
        Node six = new Node(15,lf);
        
        Node seven = new Node(2,lf);
        Node eight = new Node(3,lf);
        
        Node nine = new Node(5,lf);
        Node ten = new Node(6,lf);
        
        Node eleven = new Node(4,lf);
        Node twelve = new Node(3,lf); 
        
//        Node thirteen = new Node(21,lf);
//        Node fourteen = new Node(15,lf);
//        
//        Node fifteen = new Node(7,lf);
//        Node sixteen = new Node(13,lf);
//        
//        Node seventeen = new Node(1,lf);
//        Node eighteen = new Node(5,lf);
//        
//        Node nineteen = new Node(42,lf);
//        Node twenty = new Node(13,lf);
//        
//        Node twentyone = new Node(9,lf);
//        Node twentytwo = new Node(7,lf);
//        
//        Node twentythree = new Node(11,lf);
//        Node twentyfour = new Node(31,lf); 
        
        /* 
        Adding Nodes to PlaceHolders for Simplicity
        */
        a.add(one);
        a.add(two);      
        Node holderNode1 = new Node(0,a);
        
        
        b.add(three);
        b.add(four);        
        Node holderNode2 = new Node(0,b);
        
        
        c.add(five);
        c.add(six);
        Node holderNode3 = new Node(0,c);
        
         
        d.add(seven);
        d.add(eight);
        Node holderNode4 = new Node(0,d);
        
         
        e.add(nine);
        e.add(ten);
        Node holderNode5 = new Node(0,e);
        
        
        f.add(eleven);
        f.add(twelve);
        Node holderNode6 = new Node(0,f);
        
//        g.add(thirteen);
//        g.add(fourteen);      
//        Node holderNode7 = new Node(0,g);
//        
//        
//        h.add(fifteen);
//        h.add(sixteen);        
//        Node holderNode8 = new Node(0,h);
//        
//        
//        i.add(seventeen);
//        i.add(eighteen);
//        Node holderNode9 = new Node(0,i);
//        
//         
//        j.add(nineteen);
//        j.add(twenty);
//        Node holderNode10 = new Node(0,j);
//        
//         
//        k.add(twentyone);
//        k.add(twentytwo);
//        Node holderNode11 = new Node(0,k);
//        
//        
//        l.add(twentythree);
//        l.add(twentyfour);
//        Node holderNode12 = new Node(0,l);
        
        /*
        Adding all CHILDS to z(placeholder))
        */
        z.add(holderNode1);
        z.add(holderNode2);
        z.add(holderNode3);
        z.add(holderNode4);
        z.add(holderNode5);
        z.add(holderNode6);
//        z.add(holderNode7);
//        z.add(holderNode8);
//        z.add(holderNode9);
//        z.add(holderNode10);
//        z.add(holderNode11);
//        z.add(holderNode12);
        
        //Root's Holder Node
        Node mainHolderNode = new Node(0,z);       
        
        new Main().printList(z);
        
        AlphaBetaPruning run = new AlphaBetaPruning();
        int value = run.getPrunedValue(mainHolderNode);
        System.out.println("\n\n Final Value after pruning: "+value);
    }
    void printList(ArrayList z){
        System.out.println("Printing ALL 24 Node values....");
        for (Object z1 : z) {
            System.out.print(((Node) z1).childs.get(0));
            System.out.print(":" + ((Node) z1).childs.get(1));
            System.out.print("   ");
        }
        System.out.println();
    }
}
