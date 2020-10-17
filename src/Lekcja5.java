public class Lekcja5 {
    public static void main(String[] args){
        int wiek = 14;
        if(wiek >= 18) {
            System.out.println("Pełnoletnia");
        }
        else{
            if(wiek >= 16){
                System.out.println("Możesz pracować");
            }
            else{

                System.out.println("Niepełnoletnia");
            }
        }
    }
}
