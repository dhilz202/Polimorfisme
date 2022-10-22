//overloading
public class shinobi {
    void nama(){ 
        
        System.out.println("Naruto");
    } 
    static public void main(String args[]){ 
        
        shinobi s=new shinobi(); 
        ninja n=new ninja(); 
        s.nama(); 
        n.nama("Sasuke"); 
    } 
} 
class ninja{ void nama(String nama){ 
        
        System.out.println(nama); 
    } 
}


