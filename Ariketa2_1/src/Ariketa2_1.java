public class Ariketa2_1 {
    public static void main(String[] args) {
        int zenbakia = 1;
        int batura = 0;  

        while (zenbakia <= 5) {
            batura += zenbakia;
            zenbakia++;
        }
        System.out.println("Zenbaki guztien batura da: " + batura);
    }
}
