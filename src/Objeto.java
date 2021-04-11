public class Objeto {
    public Objeto() {
    }
    public int TablaMult(int x, int y){
        int n=x; String cad="";   
        if(y>0 && x>0){
           y--;
           x = x + TablaMult(x,y);
           System.out.println( n + "X" + (y+1) + "=" + x); 
           return x;  
        }
        return 0;
    }
}
