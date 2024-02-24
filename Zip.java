public class Zip {
    
    public static void main(String[]args){
        
        String[] furniture = {"table", "chair", "rack", "shelf"};
        int[] price = {100, 50, 80, 40};
        zip(furniture, price);

    }

    public static void zip(String[] a, int[] b){
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
            System.out.println(b[i]);
        }
    }

}
