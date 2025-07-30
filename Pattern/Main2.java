
// // Example no.1 A
// class Main2{
//     public static void main(String[] args) {
//         int n=5;
//         int star=1;
//         int space=n;
//         int row=1;
//         while (row<=n) {
//             int j=1;
//             while (j<space) {
//                 System.out.print("  ");
//                 j++;
//             }
//             int i=1;
//             while (i<=star) {
//                 if(i==1 || i==star){
//                     System.out.print("* ");
//                 }else if(row==n/2+1){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//                 i++;
//             }
//             space--;
//             star+=2;
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// //         * 
// //       *   *
// //     * * * * *
// //   *           *
// // *               *






// // Example no.2 B
// class Main2 {
//     public static void main(String[] args) {
//         int n=5;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=n) {
//                 if(row==1 && i<n || row==n && i<n || row==n/2+1 && i<n){
//                     System.out.print("* ");
//                    i++;
//                 }else if(i==1){
//                     System.out.print("* ");
//                     i++;
//                 }else if(i==n && row>1){
//                     if(row==n/2+1 || row==n){
//                         System.out.print("  ");
//                     }else{
//                         System.out.print("* ");
//                     }
//                     i++;
//                 }else{
//                     System.out.print("  ");
//                     i++;
//                 }
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// // * * * *   
// // *       *
// // * * * *
// // *       *
// // * * * *








// // Example no.3 C
// class Main2{
//     public static void main(String[] args) {
//         int n=5;
//         int space=n/2+1;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=space) {
//                 System.out.print("  ");
//                 i++;
//             }
//             int j=1;
//             while (j<=3) {
//                 if(row==1 || row==n){
//                     System.out.print(" * ");
//                 }else if(j==1){
//                     System.out.print("*");
//                 }
//                 j++;
//             }
//             if(row>=n/2+1){
//                 space++;
//             }else{
//                 space--;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// //        *  *  * 
// //     *
// //   *
// //     *
// //        *  *  *










// // Example no.4 D
// class Main2{
//     public static void main(String[] args) {
//         int n=5;
//         int space=2;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=n) {
//                 if(i==1){
//                     System.out.print("* ");
//                 }
//                 i++;
//             }
//             int j=1;
//             while (j<space) {
//                 if(row==1 || row==n){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                  j++;
//             }
//             int k=1;
//             while (k==1) {
//                 System.out.print("*");
//                 k++;
//             }
//             if(row>n/2){
//                 space--;
//             }else{
//                 space++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// // * * *
// // *     *
// // *       *
// // *     *
// // * * *





// // Example no.5 E
// class Main2{
//     public static void main(String[] args) {
//         int n=5;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<n) {
//                 if(row==1 || row==n || row==n/2+1 || i==1){
//                     System.out.print("* ");
//                 }
//                 i++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // output-
// // * * * * 
// // *
// // * * * *
// // *
// // * * * *






// // Example no.6 F
// class Main2{
//     public static void main(String[] args) {
//         int n=5;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<n) {
//                 if(row==1 || i==1){
//                     System.out.print("* ");
//                 }else if(row==n/2+1){
//                     if(i==n-1){
//                         System.out.print("  ");
//                     }else{
//                         System.out.print("* ");
//                     }
//                 }
//                 i++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// // * * * * 
// // *
// // * * *
// // *
// // *









// // Example no.7 G
// class Main2{
//     public static void main(String[] args) {
//         int n=5;
//         int space=n/2+1;
//         int row=1;
//         while (row<=n) {
//             int j=1;
//             while (j<=space) {
//                 System.out.print("  ");
//                 j++;
//             }
//             int i=1;
//            while (i<=n) {
//                 if(row==1 || row==n){
//                     if(i==n){
//                         System.out.print("  ");
//                     }else{
//                         System.out.print("* ");
//                     }
//                 }else if(i==1){
//                     System.out.print("* ");
//                 }
//                 else if(row==n/2+1){
//                     if(i>2){
//                          System.out.print("* ");
//                     }else{
//                         System.out.print("    ");
//                     }
//                 }else if(i==n && row==n-1){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//                 i++;
//             }
//             if(row>=n/2+1){
//                 space++;
//             }else{
//                 space--;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // output-
// //       * * * *   
// //     *
// //   *     * * *
// //     *       *
// //       * * * *













// // Example no.8 H
// class Main2 {
//     public static void main(String[] args) {
//         int n=5;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=n) {
//                 if(i==1 || i==n || row==n/2+1){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                 i++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// // *       * 
// // *       *
// // * * * * *
// // *       *
// // *       *














// // Example no.9 I
// class Main2 {
//     public static void main(String[] args) {
//         int n=5;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=n) {
//                 if(row==1 && i>1 && i<n || row==n && i>1 && i<n){
//                     System.out.print("* ");
//                 }else if(i==n/2+1){
//                     System.out.print("* ");
//                 } else{
//                     System.out.print("  ");
//                 }
//                 i++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // output-
// //   * * *   
// //     *
// //     *
// //     *
// //   * * *






// // Example no.10 J
// class Main2 {
//     public static void main(String[] args) {
//         int n=5;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=n) {
//                 if(row==1 && i>2 || i==n || row==n && i>3 || row==n-1 && i==n/2+1){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//                 i++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // output-
//     // * * * 
//     //     *
//     //     *
//     // *   *
//     //   * *








// // Example no.11 K
// class Main2{
//     public static void main(String[] args) {
//         int n=5;
//         int row=1;
//         int space=n/2;
//         while (row<=n) {
//             int i=1;
//             while (i<=n) {
//                 if(i==1){
//                     System.out.print("* ");
//                 }
//                 i++;
//             }
//             int j=1;
//             while (j<=space) {
//                 System.out.print("  ");
//                 j++;
//             }
//             System.out.print("* ");
//             if(row<=n/2){
//                 space--;
//             }else{
//                 space++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // output-
// // *     * 
// // *   *
// // * *
// // *   *
// // *     *




// // Example no.12 L
// class Main2{
//     public static void main(String[] args) {
//        int n=5;
//        int row=1;
//        while (row<=n) {
//         int i=1;
//         while (i<=n) {
//             if(i==1 || row==n){
//                 System.out.print("* ");
//             }
//             i++;
//         }
//         row++;
//         System.out.println();
//        } 
//     }
// }
// // Output-
// // *   
// // *
// // *
// // *
// // * * * * *








// // Example no.13 M
// class Main2{
//     public static void main(String[] args) {
//         int n=5;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=n) {
//                 if(i==1 || i==n || row==2 && i!=n/2+1 || row==3 && i==n/2+1){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                 i++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// // *       * 
// // * *   * *
// // *   *   *
// // *       *
// // *       *










// // Example no.14 N
// class Main2 {
//     public static void main(String[] args) {
//         int n=5;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=n) {
//                 if(i==1 || i==n || row==i){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                 i++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// // *       * 
// // * *     *
// // *   *   *
// // *     * *
// // *       *










// // Example no.15 O
// class Main2 {
//     public static void main(String[] args) {
//         int n=5;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=n) {
//                 if(row==1 && i!=1 && i!=n || row==n && i!=1 && i!=n || 
//                     i==1 && row!=1 && row!=n || i==n && row!=1 && row!=n){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                 i++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// //   * * *   
// // *       *
// // *       *
// // *       *
// //   * * *





// // Example no.16 P
// class Main2 {
//     public static void main(String[] args) {
//         int n=5;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=n) {
//                 if(i==1 || row==1 && i<=n/2+1 || row==2 && i==n-1 || row==n/2+1 && i<=n/2+1){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                 i++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// // * * *     
// // *     *
// // * * *
// // *
// // *









// // Example no.17 Q
// class Main2 {
//     public static void main(String[] args) {
//         int n=5;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=n) {
//                  if(row==1 && i!=1 && i!=n || row==n-1 && i==n-1 || row==n && i!=1 && i!=n-1 || 
//                     i==1 && row!=1 && row!=n || i==n && row!=1 && row!=n-1){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                 i++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// //   * * *   
// // *       *
// // *       *
// // *     *
// //   * *   *







// // Example no.18 R
// class Main2 {
//     public static void main(String[] args) {
//         int n=5;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=n) {
//                 if(i==1 || row==1 && i<=n/2+1 || row==2 && i==n-1 
//                     || row==n/2+1 && i<=n/2+1 || row==n-1&& i==n/2+1
//                     || row==n && i==n-1){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                 i++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// // * * *     
// // *     *
// // * * *
// // *   *
// // *     *






// // Example no.19 S
// class Main2{
//     public static void main(String[] args) {
//         int n=5;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=n) {
//                 if(row==1 || row==n || row==n/2+1 
//                     || i==1 && row<=n/2+1 || i==n && row>=n/2+1){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                 i++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// // * * * * * 
// // *
// // * * * * *
// //         *
// // * * * * *





// // Example no.20 T
// class Main2 {
//    public static void main(String[] args) {
//     int n=5;
//     int row=1;
//     while (row<=n) {
//         int i=1;
//         while (i<=n) {
//             if(row==1 || i==n/2+1){
//                 System.out.print("* ");
//             }else{
//                 System.out.print("  ");
//             }
//             i++;
//         }
//         row++;
//         System.out.println();
//     }
//    } 
// }
// // output-
// // * * * * * 
// //     *
// //     *
// //     *
// //     *



// // Example no.21 U
// class Main2{
//     public static void main(String[] args) {
//         int n=5;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=n) {
//                 if(i==1 && row!=n || i==n && row!=n || row==n && i!=n && i!=1){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                 i++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-    
// // *       * 
// // *       *
// // *       *
// // *       *
// //   * * *







// // Example no.22 V
// class Main2{
//     public static void main(String[] args) {
//         int n=5;
//         int row=1;
//         int space=1;
//         int star=5;
//         while (row<=n) {
//             int i=1;
//             while (i<space) {
//                 System.out.print(" ");
//                 i++;
//             }
//             int j=1;
//             while (j<=star) {
//                 if(j==1 || j==star){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                 j++;
//             }
//             star--;
//             space++;
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// // *       * 
// //  *     *
// //   *   *
// //    * *
// //     *







// // Example no.23 W
// class Main2{
//     public static void main(String[] args) {
//         int n=5;
//         int row=1;
//         int space=1;
//         int space2=1;
//         int star=5;
//         while (row<=n) {
//             int i=1;
//             while (i<space) {
//                 System.out.print(" ");
//                 i++;
//             }
//             int j=1;
//             while (j<=star) {
//                 if(j==1 || j==star){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                 j++;
//             }
//              i=1;
//             while (i<space2) {
//                 System.out.print(" ");
//                 i++;
//             }
//              j=1;
//             while (j<=star) {
//                 if(j==1 || j==star){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                 j++;
//             }
//             star--;
//             space++;
//             space2+=2;
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// // *       * *       * 
// //  *     *   *     *
// //   *   *     *   *
// //    * *       * *
// //     *         *





// // Example no.24 X
// class Main2{
//     public static void main(String[] args) {
//         int n=5;
//         int space=1,star=n;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<space) {
//                System.out.print("  ");
//                i++;
//             }
//             int j=1;
//             while (j<=star) {
//                 if(j==1||j==star){
//                 System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//                 j++;
//             }
//             if(row<n/2+1){
//                 space++;
//                 star-=2;
//             }else{
//                 space--;
//                 star+=2;
//             }
//             row++;
//             System.out.println();
            
//         }
//     }
// }
// // Output-
// // *       * 
// //   *   *
// //     *
// //   *   *
// // *       *
















// // Example no.25 Y
// class Main2 {
//     public static void main(String[] args) {
//         int n=5;
//         int space=1;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<space) {
//                 System.out.print("  ");
//                 i++;
//             }
//             int j=1;
//             while (j<=n) {
//                 if(j==1 || row==1 && j==n || row==2 && j==n-2){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//                 j++;
//             }
//             if(row<=n/2){
//                 space++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// // *       * 
// //   *   *
// //     *
// //     *
// //     *



















// // Example no.26 Z
// class Main2{
//     public static void main(String[] args) {
//         int n=5;
//         int star=n;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=n) {
//                if(row==1 || row==n || i==star){
//                 System.out.print("* ");
//                }else{
//                 System.out.print("  ");
//                }
//                i++;
//             }
//             star--;
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// // * * * * * 
// //       *
// //     *
// //   *
// // * * * * *
































// 0-9
// // Example no.1 0
// class Main2{
//     public static void main(String[] args) {
//         int row=1;
//         int n=5;
//         while (row<=n) {
//             int i=1;
//             while (i<=n) {
//                 if(row==1 && i!=1 && i!=n ||row==n && i!=1 && i!=n 
//                    ||i==1 && row!=1 && row!=n ||i==n && row!=1 && row!=n ){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                 i++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// //   * * *   
// // *       *
// // *       *
// // *       *
// //   * * *


// // Example no.2 1
// class Main2{
//     public static void main(String[] args) {
//         int row=1;
//         int n=5;
//         while (row<=n) {
//             int i=1;
//             while (i<=n) {
//                 if(i==n/2+1 || row==n && i!=1 && i!=n || row==2 && i==n/2){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                 i++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// //     *     
// //   * *
// //     *
// //     *
// //   * * *



// // Example no.3 2
// class Main2{
//     public static void main(String[] args) {
//         int row=1;
//         int n=5;
//         int space=1;
//         while (row<=n) {
//             int j=1;
//             while (j<=space) {
//                 System.out.print("  ");
//                 j++;
//             }
//             j=1;
//             while (j<=n) {
//                 if(j==1||row==n){
//                     System.out.print("* ");
//                 }
//                 j++;
//             }      
//             if(row<n/2+1){
//                 space++;
//             }else{
//                 space--;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// //   * 
// //     *
// //        *
// //     *
// //   * * * * *





// // Example no.4 3
// class Main2{
//     public static void main(String[] args) {
//         int row=1;
//         int n=8;
//         int space=1;
//         while (row<=n) {
//             int i=1;
//             while (i<space) {
//                 System.out.print("  ");
//                 i++;
//             }
//             int j=1;
//             while (j<n) {
//                 if(j==1 && row!=n){
//                     System.out.print("* ");
//                 }
//                 j++;
//             }
//             if(row<=n/3){
//                 space++;
//             }else if(row>=n/2 && row<n/1.6){
//                 space++;
//             }else{
//                 space--;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// // * 
// //   *
// //     *
// //   *
// //     *
// //   *
// // *






// // Example no.5 4
// class Main2{
//     public static void main(String[] args) {
//         int row=1;
//         int n=5;
//         int space=4;
//         while (row<=n) {
//             int j=1;
//             while (j<=space) {
//                 System.out.print("  ");
//                 j++;
//             }
//             int i=1;
//             while (i<=n) {
//                 if(row==n/2+1 || i==n/2 && row<=n/2 || i==n/2 && row>=n/2){
//                     System.out.print("* ");
//                 }
//                 i++;
//             }
//             if(row>=n/2+1){
//                 space=n;
//             }else{
//                 space--;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// //         * 
// //       *
// //     * * * * *
// //           *
// //           *






// // Example no.6 5
// class Main2 {
//     public static void main(String[] args) {
//         int row=1;
//         int n=5;
//         while (row<=n) {
//             int i=1;
//             while (i<=n) {
//                 if(row==1 && i!=n || row==n/2+1 && i!=n || i==1 && row<n/2+1
//                    ||i==n && row==n-1 || row==n && i!=n){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                 i++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// // * * * *   
// // *
// // * * * *
// //         *
// // * * * *




// // Example no.7 6
// class Main2{
//     public static void main(String[] args) {
//         int row=1;
//         int n=5;
//         while (row<=n) {
//             int i=1;
//             while (i<n) {
//                 if(row==1 || row==n/2+1 || row==n || i==1 || i==n-1 && row>=n/2+1){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                 i++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// // * * * * 
// // *
// // * * * *
// // *     *
// // * * * *





// // Example no.8 7
// class Main2{
//     public static void main(String[] args) {
//         int row=1;
//         int n=5;
//         int star=n;
//         while (row<=n) {
//             int i=1;
//             while (i<=n) {
//                 if(row==1 || i==star){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                 i++;
//             }
//             star--;
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// // * * * * * 
// //       *
// //     *
// //   *
// // *




// // Example no.9 8
// class Main2{
//     public static void main(String[] args) {
//         int row=1;
//         int n=5;
//         while (row<=n) {
//             int i=1;
//             while (i<n) {
//                 if(row==1 || row==n || i==1 || i==n-1 || row==n/2+1){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                 i++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// // * * * * 
// // *     *
// // * * * *
// // *     *
// // * * * *




// // Example no.10 9
// class Main2{
//     public static void main(String[] args) {
//         int row=1;
//         int n=5;
//         while (row<=n) {
//             int i=1;
//             while (i<n) {
//                 if(row==1 || row==n || i==n-1 || row<=n/2+1 && i==1 || row==n/2+1){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                 i++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }
// // Output-
// // * * * * 
// // *     *
// // * * * *
// //       *
// // * * * *