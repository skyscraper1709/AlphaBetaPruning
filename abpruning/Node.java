package abpruning;

import java.util.List;

public class Node {
    int value;
    List <Node> childs;   
    
    Node(int value, List<Node> childs){
        this.value = value;
        this.childs=childs;
    }
    public String toString(){
     return ""+value;   
    }
    
}

