package myınteger;


public class MyInteger {
    private int sayi;

    public MyInteger(int sayi) {
        this.sayi=sayi;
    }

    public int getSayi() {
        return sayi;
    }
    public boolean isEven(){
        
        if(this.getSayi()%2!=0){
        return false;
        }
        return true;
    
    }
    public boolean isOdd(){
        if(this.getSayi()%2==0){
        return false;
        }
        return true;
    }
    
    public boolean isPrime(){
        for(int i=2;i<this.getSayi()/2;i++){
     if(this.getSayi()%i==0){
         return false;
     }
        }
        return true;
    }
    
    
    public boolean isEven(int sayi){
        
        if(sayi%2!=0){
        return false;
        }
        return true;
    
    }
    public boolean isOdd(int sayi){
        if(sayi%2==0){
        return false;
        }
        return true;
    }
    
    public boolean isPrime(int sayi){
        for(int i=2;i<sayi/2;i++){
     if(sayi%i==0){
         return false;
     }
        }
        return true;
    }
    
    
  public static boolean isEven(MyInteger nesne) {
    return nesne.getSayi() % 2 == 0;
}
  
   public static boolean isOdd(MyInteger nesne){
        if(nesne.getSayi()%2==0){
        return false;
        }
        return true;
    }
    
    public static boolean isPrime(MyInteger nesne){
        for(int i=2;i<nesne.getSayi()/2;i++){
     if(nesne.getSayi()%i==0){
         return false;
     }
        }
        return true;
    }

    public static int parseInt(char[] karakter) {
        String metin = new String(karakter);
        return Integer.parseInt(metin);
    }

    public static int parseInt(String metin) {
        return Integer.parseInt(metin);
    }
    public static void main(String[] args) {
        MyInteger t1=new MyInteger(6);
        MyInteger t3=new MyInteger(10);
        
        
        System.out.println(MyInteger.isEven(t3));
        System.out.println(t1.isEven());
        System.out.println(t1.isEven(7));
        
        char[] karakterDizisi = {'1', '2', '5'};
        System.out.println(MyInteger.parseInt(karakterDizisi));
    }

   
}
