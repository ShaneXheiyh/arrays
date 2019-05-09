public class Arrays {
    public static void main(String[] args){
        int[] b = new int[]{7,6,5,8,12,4,6};
        int c = 8;
        //write here
        printMe(b);
        printSumByTwo(b);
        printGreaterThanSeven(b);
        checkIfIncluded(c,b);
        checkIfIncluded(22,b);


        String jeweles = "xJT";
        String stones = "jtfhgJlrXxJJxOTGH";

        int numberOfJeweles = countJeweles(jeweles, stones);
        System.out.println(numberOfJeweles);

        int[] reveredArray = revereArray(b);

        for(int el:reveredArray){
            System.out.println(el);
        }

        //create a person with 2 children
        //print the children
        String[] children = new String[]{"Bob", "Maria"};
        Person person1 = new Person(children);
        person1.printChildren();

    }

    public static void printMe(int[] x){
        for( int i = 0; i < x.length;i++ ){
            int b = multiplyByTwo(x[i]);
            System.out.println(b);
        }
    }

    public static int multiplyByTwo(int a){
        return a * 2;
    }

    public static void printSumByTwo(int[] c ){
        for( int i = 0; i < c.length - 1; i++ ){
            int sum = c[i] + c[i+1];
            System.out.println(sum);
        }

    }

    public static void printGreaterThanSeven( int[] x){
        for ( int i = 0; i < x.length; i++){
            if( x[i] > 7){
                System.out.println(x[i]);
            }

        }

    }

    public static void checkIfIncluded(int a, int[] array){
        boolean included = false;
        for ( int i = 0; i < array.length; i++){
            if(a == array[i]){
                included = true;
            }
        }
        System.out.println(included);

    }

    public static int countJeweles(String a, String b){
        int sum = 0;
        for ( int i = 0; i < a.length();i++){
            char charA = a.charAt(i);
            for ( int x = 0; x < b.length(); x++){
                if(charA == b.charAt(x)){
                    sum = sum + 1;
                }
            }
        }
        return sum;
    }

   public static int[] revereArray(int[] a){
        int[] b = new int[a.length];

        for(int i = 0; i < a.length; i++){
            b[a.length-1-i]=a[i];
        }
        return b;
   }
}
