public class Angka{
    public static void main(String[] args){
        int angka=0;

        for(int i=0; i<=100; i++){
            angka++;
            if(angka%2==0 && angka%3==0){
                System.out.println("Indonesia ");
            }else if(angka%2!=0){
                System.out.println("Ganjil ");
            }else if(angka%2==0){
                System.out.println(angka+ " ");
            }

        }
    }
}