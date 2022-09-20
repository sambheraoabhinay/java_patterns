public class Patterns2 {

    //INVERTED ROTATED HALF PYRAMID----------------------------------------------------------------

    public static void inverted_rotated_half_pyramid(int n){
        //outer
        for (int i = 1; i<=n; i++){
            //spaces
            for(int j = 1; j<=n-i; j++ ){
                System.out.print("  ");
            }

            //stars
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //INVERTED HALF PYRAMID WITH NUMBERS--------------------------------------------------------


    public static void inverted_half_pyramid_withNumbers(int n){
        for (int i=1; i<=n; i++){
            //inner numbers
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //FLOYDS TRIANGLE PATTERN-------------------------------------------------------------

    public static void floydsTriangle(int n){
        //outer
        int counter = 1;
        for(int i=1; i<=n; i++){
            //inner- how many times will counter be printed

            for(int j=1; j<=i; j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();

        }
    }

    //ZERO ONE TRIANGLE PATTERN---------------------------

    public static void zero_one_triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }

// BUTTERFLY PATTERN------------------------------------------------

    public static void butterfly(int n){
        //first half
        for(int i=1; i<=n; i++){
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            //spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }

            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //2nd half

        for(int i=n; i>=1; i--){
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            //spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }

            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //SOLID RHOMBUS PATTERN-----------------------------------------
    public static void solid_rhombus(int n) {
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=(n-i); j++) {
                System.out.print("  ");
            }
            
            //stars
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    //HOLLOW RHOMBUS PATTERN-----------------

    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }

            //hollow rectangle - stars
            for(int j=1; j<=n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        //1st half
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=(n-i); j++) {
                System.out.print("  ");
            }

            //stars
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        //2nd half
        for(int i=n; i>=1; i--) {
            //spaces
            for(int j=1; j<=(n-i); j++) {
                System.out.print("  ");
            }

            //stars
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    //Number Pyramid PATTERN-----------------

    public static void numberPyramid(int n) {
        //outer loop
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //numbers
            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }

    //PALINDROMIC PATTERN with numbers-----------------

    public static void palindromicPatternWithNumbers(int n) {
        //outer loop
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //descending
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }

            //ascending
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main (String[] args){
        //inverted_rotated_half_pyramid(6);
        //inverted_half_pyramid_withNumbers(5);
        //floydsTriangle(6);
        //zero_one_triangle(5);
        //butterfly(7);
        //solid_rhombus(5);
        //hollow_rhombus(40);
        //diamond(4);
        //numberPyramid(5);
        palindromicPatternWithNumbers(5);

    }
    
}
