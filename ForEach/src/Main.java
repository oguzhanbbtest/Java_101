public class Main {
    public static void main(String[] args) {

        // int[]list ={1,2,3,4,5};

        // for(int i = 0; i < list.length; i++){ // tek boyutlu dizideki sayıları yazdırma
        // System.out.println(list[i]);

       /*int sum = 0;
       for (int i: list){   //tek boyut için for each kullanımı
           sum += i;
       }
        //System.out.println(sum); */
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for(int i= 0; i < matris.length ; i++){ // çok boyutlu diziler içindeki ifadeleri yazdırma
            for(int k = 0; k < matris[i].length ;k++){
                //System.out.print(matris[i][k]+" ");
            }
        }

        for(int[] row : matris){ // Çoklu dizileri yazdırmak içinde bu yöntemi kullanıyoruz
            for (int colm : row){
                System.out.print(colm+" ");
            }
            System.out.println();
        }

    }
}
