public class Person {
    String[] children;

    public Person( String[] a ){
        this.children = a;
    }
    public void printChildren(){
        for ( int i =0; i < this.children.length; i++){
            System.out.println(this.children[i]);
        }

    }

}
