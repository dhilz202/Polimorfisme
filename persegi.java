public class persegi {
 /*Program overriding dan overload
 * karya IGBN. Satya Wibawa(1404505071)*/
 double sisi;
 
 //konstruktor persegi
 persegi(double s){
  this.sisi=s;
 }
 //fungsi luas persegi
 void luas(){
  System.out.println("Luas persegi adalah "+this.sisi*this.sisi);
 }
 //fungsi luas persegi (overloading)
 void luas(double s){
  /*overloading pada method luas 
  * dengan menambahkan parameter double*/
  this.sisi=s;
  System.out.println("(overloading)Luas persegi adalah "+(this.sisi*this.sisi));
 }
 
 public static void main (String args[]) {
  persegi A= new persegi(3);
  kubus B= new kubus(3);
  
  A.luas();
  B.luas();
  System.out.println("");
  System.out.println("");
  //overloading
  A.luas(5);
  B.luas(5);
  
 }
}
class kubus extends persegi{
  //konstruktor kubus
  kubus(double s){
   super(s);
  }
  
  /*overriding fungsi luas pada class persegi
   * menjadi fungsi luas permukaan kubus*/
  void luas(){
   /*overriding disini memodifikasi nilai return
   * pada fungsi luas*/
   System.out.println("Luas permukaan kubus adalah "+6*this.sisi*this.sisi);
  }
  
  //fungsi luas permukaan kubus (overloading)
  void luas(double s){
   /*overloading pada method luas 
   * dengan menambahkan parameter double*/
   this.sisi=s;
   System.out.println("(overloading)Luas permukaan kubus adalah "+(6*this.sisi*this.sisi));
  }
}

