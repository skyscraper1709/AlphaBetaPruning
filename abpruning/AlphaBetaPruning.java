package abpruning;
public class AlphaBetaPruning {
    public int getPrunedValue(Node r){        
        int rvalue = Max(r,-9999,9999);
        return rvalue;
    }    
    private int Max(Node r, int alpha, int beta) {        
        System.out.println("value : "+r.value);        
        if(r.childs.isEmpty()){
            return r.value;
        }        
        int v = -9999;
        while(!r.childs.isEmpty()){
            Node c = r.childs.remove(0);
            System.out.println("beta  : "+c.value);
            v = Math.max(v,Min(c,alpha,beta));
            
            if(v>=beta){ // cut-off 
                return v;
            }            
            alpha = Math.max(alpha, v);            
        }        
        return v;
    }    
    private int Min(Node r, int alpha, int beta) {     
        System.out.println(" value : "+r.value);        
        if(r.childs.isEmpty()){
            return r.value;
        }        
        int v = 9999;
        while(!r.childs.isEmpty()){
            Node c = r.childs.remove(0);
            System.out.println("alpha  : "+c.value);
            v = Math.min(v,Max(c,alpha,beta));
            
            if(v<=alpha){ //a cut-off 
                return v;
            }            
            beta= Math.min(beta, v);            
        }        
        return v;
    } 
}
