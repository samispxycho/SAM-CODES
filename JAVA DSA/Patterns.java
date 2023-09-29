public class Patterns {

    static void First(int n) {

        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *  */

        for(int i = 0;i<n;i++){
            for(int j = 0; j <n;j++){
                System.out.print("* ");
            }
            System.out.println();
         }

    }


    static void Second(int n){

        /*
        *
        * *
        * * *
        * * * *
        * * * * *   */

        for(int i = 1; i<=n; i++){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void Third(int n){

        /*
            * * * * * 
            * * * * 
            * * * 
            * * 
            *               */


        for(int i = 1; i<=n; i++){
            for(int j = i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void Fourth(int n){

        /*

        _ _ _ _ _ *
        _ _ _ _ * *          here _ = space
        _ _ _ * * *
        _ _ * * * *
        _ * * * * *     */



        for(int i = 1;i<=n;i++){
            for(int j = i;j<=n;j++){
                System.out.print("  ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }


    static void Fifth(int n){

        /*
            * * * * *
            _ * * * *
            _ _ * * *
            _ _ _ * *
            _ _ _ _ *      */

        for(int i = 1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }

            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }


    static void Sixth(int n){

        /*
            _ _ _ _ _ *
            _ _ _ _ * * *
            _ _ _ * * * * *
            _ _ * * * * * * *
            _ * * * * * * * * *
         */

         for(int i = 0;i<=n;i++){

            for(int j = i;j<=n;j++)
                System.out.print("  ");

            for(int j = 1;j<=i;j++)
                System.out.print("* ");
            
            for(int j=2;j<=i;j++)           //or(j=1;j<i;j++)
                System.out.print("* ");

            System.out.println();
         }
    }


    static void Seventh(int n){

        /*
            * * * * * * * * *
              * * * * * * *
                * * * * *
                  * * *
                    *
         */

        for(int i=0;i<=n;i++){

            for(int j=1;j<=i;j++)
                System.out.print("  ");
            for(int j=i;j<=n;j++)
                System.out.print("* ");
            for(int j=i;j<n;j++)
                System.out.print("* ");

            System.out.println();
        }
    }


    static void Eighth(int n){

        for(int i=1;i<=n;i++){

            for(int j=i;j<=n;j++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            for(int j=1;j<i;j++)
                System.out.print("* ");


            System.out.println();
        }

        for(int i=2;i<=n;i++){

            for(int j=1;j<=i;j++)
                System.out.print("  ");
            for(int j=i;j<=n;j++)
                System.out.print("* ");
            for(int j=i;j<n;j++)
                System.out.print("* ");

            System.out.println();
        }
    }


    public static void main(String[] args) {

        //Here 5 represents the number of rows

        //First(5);
        //Second(5);
        //Third(5);
        //Fourth(5);
        //Fifth(5);
        //Sixth(5);
        //Seventh(5);
        //Eighth(5);
        
        
    }
}
