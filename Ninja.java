// overriding
public class Ninja {
    static public void main(String args[]){ 
        
        kakashi k=new kakashi();
        sasuke s=new sasuke();
        k.nama();
        k.jurus();
        s.nama();
        s.jurus();
    } 
} 
class kakashi{ 
    
    void nama(){ 
        
        System.out.println("kakashi");
    } 
    void jurus(){ 
        
        System.out.println("Chidori"); 
    } 
} 
class sasuke extends kakashi{ 
    void nama(){ 
        System.out.println("sasuke");
    }
    void jurus (){
        System.out.println("Chidori nagasi ");
    }
}