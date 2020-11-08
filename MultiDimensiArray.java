package array;

public class MultiDimensiArray {
    public static void main(String[]args) {
        char[][] arrChar = new char[2][];
        arrChar[0] = new char [2];
        arrChar [1] = new char [3];
        
        //Dimensi 1 Yang Indeks nya 0 Memiliki panjang 2.
        arrChar [0][0] = 'A';
        arrChar [0][1] = 'B';
        
        //Dimensi 1 Yang Indeksnya 1 Memiliki Panjang 3.
        arrChar [1][0] = 'C';
        arrChar [1][1] = 'D';
        arrChar [1][2] = 'E';
        
        //Menampilkan Semua Data Dari Dimensi 1 Yang Memiliki Indeks 0.
        System.out.println("Dimensi 1 Dengan Indeks 0 Dan Dimensi 2 Dengan Indeks 0 = " + arrChar[0][0]);
        System.out.println("Dimensi 1 Dengan Indeks 0 Dan Dimensi 2 Dengan Indeks 1 = " + arrChar[0][1]);
        //Menampilkan Semua Data Dari Dimensi 1 Yang Memiliki Indeks 1.
        System.out.println("Dimensi 1 Dengan Indeks 1 Dan Dimensi 2 Dengan Indeks 0 = " + arrChar[1][0]);
        System.out.println("Dimensi 1 Dengan Indeks 1 Dan Dimensi 2 Dengan Indeks 1 = " + arrChar[1][1]);
        System.out.println("Dimensi 1 Dengan Indeks 0 Dan Dimensi 2 Dengan Indeks 2 = " + arrChar[1][2]);
    }
}
