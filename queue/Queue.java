 package queue;

 
public class Queue {
        private int[] elements=new int[8];
        private int size=0;
        private int index;

    public Queue() {
    }
    
    public int[] getElements() {
        return elements;
    }

   
    public int getSize() {
        return size;
    }

  
    public int getIndex() {
        return index;
    }
    public void enqueue(int v){

     
       if(getSize()==getElements().length){
       int sayi=getElements().length*2;
       int[] yeniDizi= new int[sayi];
       for(int i=0;i<getElements().length;i++){
           
           yeniDizi[i]=getElements()[i];
       }
       elements=yeniDizi;
      
       }
       elements[getSize()]=v;
           this.size++;

    }
  public int dequeue() {
        // 1. Kuyruğun en başındaki (ilk giren) elemanı alıyoruz
        int cikanEleman = elements[0];

        // 2. Arkada kalan tüm elemanları birer adım öne (sola) kaydırıyoruz
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        // 3. Kuyruktan biri çıktığı için toplam eleman sayısını 1 azaltıyoruz
        size--;

        // 4. Çıkan elemanı çağrıldığı yere geri döndürüyoruz
        return cikanEleman;
    }

     
    public static void main(String[] args) {
        Queue q=new Queue();
        for(int i=0;i<8;i++){
        q.enqueue(5);
        q.enqueue(6);
  
        }
              q.dequeue();
        for(int i=0;i<8;i++){
      
  
            System.out.println(q.getElements()[i]);
        }
                    System.out.println("Dzinini boyutu ="+q.size);

     }

   
    
}
