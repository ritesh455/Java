// Example no.1
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int n=sc.nextInt();
//         int row=1;
//         while (row<=n) {
//             int col=1;
//             while(col<=n){
//                 System.out.print("* ");
//                 col++;
//             }
//             System.out.println("");
//             row++;
//         }
//     }
// }
// OUTPUT-
// Enter a number: 

// 4
// * * * * 
// * * * *
// * * * *
// * * * *



// Example no.1
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter number: ");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// 4
// * * * * 
// * * * *
// * * * *
// * * * *







// Example no.2
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         int row=1;
//         while(row<=n){
//             int col=1;
//             while(col<=row){
//                 System.out.print("* ");
//                 col++;
//             }
//             System.out.println("");
//             row++;
//         }
//     }
// }

// 4
// * 
// * *
// * * *
// * * * *

// Example no.2
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// 4
// * 
// * *
// * * *
// * * * *






// Example no.3
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         int row=1;
//         while(row<=n){
//             int col=n;
//             while(col>=row){
//                 System.out.print("* ");
//                 col--;
//             }
//             System.out.println();
//             row++;
//         }
//     }
// }

// 5
// * * * * * 
// * * * *
// * * *
// * *
// *

// Example no.3
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=n;j>=i;j--){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// 4
// * * * * 
// * * *
// * *
// *





// Example no.4
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         int row=1;
//         while (row<=n) {
//             int col=n;
//             while (col>=row) {
//                 System.out.print("  ");
//                 col--;
//             }
//             int k=1;
//             while (k<=row) {
//                 System.out.print("* ");
//                 k++;
//             }
//             System.out.println();
//             row++;
//         }
//     }
// }

// 4
//         * 
//       * *
//     * * *
//   * * * *

// Example no.4
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter number: ");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=n;j>=i;j--){
//                 System.out.print("  ");
//             }
//             for(int k=1;k<=i;k++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// 5
//           * 
//         * *
//       * * *
//     * * * *
//   * * * * * 






// Example no.5
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter number: ");
//         int n=sc.nextInt();
//         int row=1;
//         while(row<=n){
//             int col=1;
//             while (col<row) {
//                 System.out.print("  ");
//                 col++;
//             }
//             int right=n;
//             while(right>=row){
//                 System.out.print("* ");
//                 right--;
//             }
//             System.out.println();
//             row++;
//         }
//     }
// }

// 5
// * * * * * 
//   * * * *
//     * * *
//       * *
//         *

// Example no.5
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter number: ");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<i;j++){
//                 System.out.print("  ");
//             }
//             for(int k=n;k>=i;k--){
//                 System.out.print("$ ");
//             }
//             System.out.println();
//         }
//     }
// }

// 5
// $ $ $ $ $ 
//   $ $ $ $
//     $ $ $
//       $ $
//         $ 






// Example n.6
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int row=1;
//         while (row<=n) {
//             int col=1;
//             while (col<row) {
//                 System.out.print("       ");
//                 col++;
//             }
//             int right=n;
//             while (right>=row) {
//                 System.out.print("*  ");
//                 right--;
//             }
//             System.out.println();
//             row++;
//         }
//     }
// }

// 5
// *  *  *  *  *  
//        *  *  *  *
//               *  *  *
//                      *  *
//                             *

// Example mo.6
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=1;
//         int star=n;
//         for(int row=1;row<=n;row++){
//             for(int i=1;i<=space;i++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=star;j++){
//                 System.out.print("*  ");
//             }
//             space+=3;
//             star--;
//             System.out.println();
//         }
//     }
// }

// 5
//   *  *  *  *  *  
//         *  *  *  *
//               *  *  *
//                     *  *
//                           *









// Example no.7
// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number: ");
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (n>j && j >= 2 && i >= 2 && n>i) {
//                     System.out.print("  ");
//                 }
//                  else {
//                     System.out.print("* ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// 4
// * * * * 
// *     *
// *     *
// * * * *


// Example no.7
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int star=n;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=star) {
//                 if(row==1||row==n||i==1||i==n){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                 i++;
//             }
//             row++;
//             // star++;
//             System.out.println();
//         }
//     }
// }

// 5
// * * * * * 
// *       *
// *       *
// *       *
// * * * * *








// Example no.30
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
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

// 5
// *       * 
//   *   *
//     *
//   *   * 
// *       *

// Example no.30
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=1,star=n;
//         for(int row=1;row<=n;row++){
//             for(int i=1;i<=space;i++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=star;j++){
//                 if(j==1||j==star){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             if(row<n/2+1){
//                 space++;
//                 star-=2;
//             }else{
//                 space--;
//                 star+=2;
//             }
//             System.out.println();
//         }
//     }
// }

// 5
//   *       * 
//     *   *
//       *
//     *   *
//   *       *








// Example no.9
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n-1;
//         int star=1;
//         int row=1;
//         while (row<=n) {
//             int col=1;
//             while(col<=space){
//                 System.out.print("  ");
//                 col++;
//             }
//             int k=1;
//             while(k<=star){
//                 System.out.print("* ");
//                 k++;
//             }
//             row++;
//             space--;
//             star+=2;
//             System.out.println();
//         }
//     }
// }

// 5
//         * 
//       * * *
//     * * * * *
//   * * * * * * *
// * * * * * * * * *


// Example no. 9
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int star=1,space=n-1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=space;j++){
//                 System.out.print("  ");
//             }
//             for(int k=1;k<=star;k++){
//                 System.out.print("* ");
//             }
//             star+=2;
//             space--;
//             System.out.println();
//         }
//     }
// }

// 5
//         * 
//       * * *
//     * * * * *
//   * * * * * * *
// * * * * * * * * *








// Example no.10
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=0,star=n*2-1;
//         int i=1;
//         while (i<=n) {
//             int j=1;
//             while (j<=space) {
//                 System.out.print("  ");
//                 j++;
//             }
//             int k=1;
//             while (k<=star) {
//                 System.out.print("* ");
//                 k++;
//             }
//             i++;
//             space++;
//             star-=2;
//             System.out.println();
//         }
//     }
// }

// 5
// * * * * * * * * * 
//   * * * * * * *
//     * * * * *
//       * * *
//         *


// Example no.10
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=0,star=n*2-1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=space;j++){
//                 System.out.print("  ");
//             }
//             for(int k=1;k<=star;k++){
//                 System.out.print("* ");
//             }
//             space++;
//             star-=2;
//             System.out.println();
//         }
//     }
// }

// 5
// * * * * * * * * * 
//   * * * * * * *
//     * * * * *
//       * * *
//         *







// Example no.11
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n-1,star=1;
//         int i=1;
//         while (i<=n) {
//             int j=1;
//             while (j<=space) {
//                 System.out.print("  ");
//                 j++;
//             }
//             int k=1;
//             while (k<=star) {
//                 if(k%2==0){
//                     System.out.print("  ");
//                 }else{
//                     System.out.print("* ");
//                 }
//                 k++;
//             }
//             space--;
//             star+=2;
//             i++;
//             System.out.println();
//         }
//     }
// }

// 4
//       * 
//     *   *
//   *   *   *
// *   *   *   *

// Example no.11
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n-1,star=1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=space;j++){
//                 System.out.print("  ");
//             }
//             for(int k=1;k<=star;k++){
//                 if(k%2==0){
//                     System.out.print("  ");
//                 }else{
//                     System.out.print("* ");
//                 }
//             }
//             space--;
//             star+=2;
//             System.out.println();
//         }
//     }
// }

// 4
//       * 
//     *   *
//   *   *   *
// *   *   *   *







// Example no. 12
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n-1,star=1;
//         int i=1;
//         while (i<=n) {
//             int j=1;
//             while (j<=space) {
//                 System.out.print("  ");
//                 j++;
//             }
//             int k=1;
//             while (k<=star) {
//                 if(k%2==0){
//                     System.out.print("! ");
//                 }else{
//                     System.out.print("* ");
//                 }
//                 k++;
//             }
//             i++;
//             space--;
//             star+=2;
//             System.out.println();
//         }
//     }
// }

// 4
//       * 
//     * ! *
//   * ! * ! *
// * ! * ! * ! *

// Example no.12
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n-1,star=1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=space;j++){
//                 System.out.print("  ");
//             }
//             for(int k=1;k<=star;k++){
//                 if(k%2==0){
//                     System.out.print("! ");
//                 }else{
//                     System.out.print("* ");
//                 }
//             }
//             space--;
//             star+=2;
//             System.out.println();
//         }
//     }
// }

// 4
//       * 
//     * ! *
//   * ! * ! *
// * ! * ! * ! *






// Example no.13
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int star=1;
//         int i=1;
//         while(i<=n*2-1){
//             int j=1;
//             while (j<=star) {
//                 System.out.print("* ");
//                 j++;
//             }
//             if(i<n){
//                 star++;
//             }else{
//                 star--;
//             }
//             i++;
//             System.out.println();
//         }
//     }
// }

// 4
// * 
// * *
// * * *
// * * * *
// * * *
// * *
// *


// Example no.13
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int star=1;
//         for(int i=1;i<=n*2-1;i++){
//             for(int j=1;j<=star;j++){
//                 System.out.print("* ");
//             }
//             if(i<n){
//                 star++;
//             }else{
//                 star--;
//             }
//             System.out.println();
//         }
//     }
// }

// 4
// * 
// * *
// * * *
// * * * *
// * * *
// * *
// *







// Example no.14
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n-1,star=1;
//         int i=1;
//         while (i<=n*2-1) {
//             int j=1;
//             while (j<=space) {
//                 System.out.print("  ");
//                 j++;
//             }
//             int k=1;
//             while (k<=star) {
//                 System.out.print("* ");
//                 k++;
//             }
//             if(i<n){
//                  space--;
//                 star++;
//             }else{
//                 space++;
//                 star--;
//             }
//             i++;
//             System.out.println();
//         }
//     }
// }

// 4
//       * 
//     * *
//   * * *
// * * * *
//   * * *
//     * * 
//       *


// Example no. 14
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n-1,star=1;
//         for(int i=1;i<=n*2-1;i++){
//             for(int j=1;j<=space;j++){
//                 System.out.print("  ");
//             }
//             for(int k=1;k<=star;k++){
//                 System.out.print("* ");
//             }
//             if(i<n){
//                 star++;
//                 space--;
//             }else{
//                 star--;
//                 space++;
//             }
//             System.out.println();
//         }
//     }
// }

// 4
//       * 
//     * *
//   * * *
// * * * *
//   * * *
//     * *
//       *





// Example no. 15
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=0,star=n;
//         int i=1;
//         while (i<=n*2-1) {
//             int k=1;
//             while (k<=space) {
//                 System.out.print("  ");
//                 k++;
//             }
//             int j=1;
//             while (j<=star) {
//                 System.out.print("*  ");
//                 j++;
//             }
//             if(i<n){
//                 star--;
//                 space+=3;
//             }else{
//                 star++;
//                 space-=3;
//             }
//             i++;
//             System.out.println();
//         }
//     }
// }

// 4
// *  *  *  *  
//       *  *  *
//             *  *
//                   *
//             *  *  
//       *  *  *
// *  *  *  *

// Example no. 15
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=0,star=n;
//         for(int i=1;i<=n*2-1;i++){
//             for(int j=1;j<=space;j++){
//                 System.out.print("  ");
//             }
//             for(int k=1;k<=star;k++){
//                 System.out.print("*  ");
//             }
//             if(i<n){
//                 space+=3;
//                 star--;
//             }else{
//                 space-=3;
//                 star++;
//             }
//             System.out.println();
//         }
//     }
// }

// 4
// *  *  *  *  
//       *  *  *
//             *  *
//                   *
//             *  *
//       *  *  *  
// *  *  *  *




// Example no.16
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n-1,star=n;
//         int i=1;
//         while (i<=n*2-1) {
//             int j=1;
//             while (j<=space) {
//                 System.out.print("  ");
//                 j++;
//             }
//             int k=1;
//             while (k<=star) {
//                 System.out.print("* ");
//                 k++;
//             }
//             if(i<n){
//                 space--;
//                 star--;
//             }else{
//                 space++;
//                 star++;
//             }
//             i++;
//             System.out.println();
//         }
//     }
// }

// 4
//       * * * * 
//     * * *
//   * *
// *
//   * *
//     * * *
//       * * * *

// Example no.16
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n-1,star=n;
//         for(int i=1;i<=n*2-1;i++){
//             for(int j=1;j<=space;j++){
//                 System.out.print("  ");
//             }
//             for(int k=1;k<=star;k++){
//                 System.out.print("* ");
//             }
//             if(i<n){
//                 space--;
//                 star--;
//             }else{
//                 space++;
//                 star++;
//             }
//             System.out.println();
//         }
//     }
// }

// 4
//       * * * * 
//     * * *
//   * *
// *
//   * *
//     * * *
//       * * * *




// Example no.17
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int star=n/2;
//         int space=1;
//         int i=1;
//         while (i<=n) {
//             int j=1;
//             while (j<=star) {
//                 System.out.print("* ");
//                 j++;
//             }
//             int k=1;
//             while (k<=space) {
//                 System.out.print("  ");
//                 k++;
//             }
//             int d=1;
//             while (d<=star) {
//                 System.out.print("* ");
//                 d++;
//             }
//             if (i<n/2+1) {
//                 star--;
//                 space+=2;
//             }else{
//                 star++;
//                 space-=2;
//             }
//             i++;
//             System.out.println();
//         }
//     }
// }

// 7
// * * *   * * * 
// * *       * *
// *           *

// *           *
// * *       * *
// * * *   * * *


// Example no.17
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int star=n/2,space=1;
//         for(int row=1;row<=n;row++){
//             for(int i=1;i<=star;i++){
//                 System.out.print("* ");
//             }
//             for(int j=1;j<=space;j++){
//                 System.out.print("  ");
//             }
//             for(int k=1;k<=star;k++){
//                 System.out.print("* ");
//             }
//             if(row<n/2+1){
//                 star--;
//                 space+=2;
//             }else{
//                 star++;
//                 space-=2;
//             }
//              System.out.println();
//         }
//     }
// }

// 7
// * * *   * * * 
// * *       * *
// *           *

// *           *
// * *       * *
// * * *   * * *







// Example no. 18
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int star=n/2+1,space=0;
//         int row=1;
//         while (row<=n){
//             int j=1;
//             while (j<=star) {
//                 System.out.print("* ");
//                 j++;
//             }
//             int k=1;
//             while (k<=space) {
//                 System.out.print("  ");
//                 k++;
//             }
//             int i=1;
//             while (i<=star) {
//                 System.out.print("* ");
//                 i++;
//             }
//             if(row<n/2+1){
//                 star--;
//                 space+=2;
//             }else{
//                 star++;
//                 space-=2;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }

// 7
// * * * * * * * * 
// * * *     * * *
// * *         * *
// *             *
// * *         * *
// * * *     * * *
// * * * * * * * *


// Example no.18
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int star=n/2;
//         int space=1;
//         for(int i=1;i<=n;i++){
//             if(i==1||i==n){
//             for(int j=1;j<=n;j++){
//                 System.out.print("* ");
//             }
//         }else{
//             for(int a=1;a<=star;a++){
//                 System.out.print("* ");
//             }
//             for(int k=1;k<=space;k++){
//                 System.out.print("  ");
//             }
//             for(int d=1;d<=star;d++){
//                 System.out.print("* ");
//             }
//             if(i<n/2+1){
//                 star--;
//                 space+=2;
//             }else{
//                 star++;
//                 space-=2;
//             }
//         }
//             System.out.println();
//         }
//     }
// }

// 7
// * * * * * * * 
// * * *   * * *
// * *       * *
// *           *
// * *       * *
// * * *   * * *
// * * * * * * *





// Example no. 19
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n/2+1;
//         int star=1;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=space) {
//                 System.out.print("  ");
//                 i++;
//             }
//             int j=1;
//             while (j<=star) {
//                 System.out.print("* ");
//                 j++;
//             }
//             if(row<n/2+1){ star+=2;
//             space--;
//             }else{
//                  star-=2;
//             space++;
//             }      
//             row++;
//             System.out.println();
//         }
//     }
// }

// 5
//       * 
//     * * *
//   * * * * *
//     * * *
//       *


// Example no.19
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n/2+1;
//         int star=1;
//         for(int row=1;row<=n;row++){
//             for(int i=1;i<=space;i++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=star;j++){
//                 System.out.print("* ");
//             }
//             if(row<n/2+1){
//                 star+=2;
//                 space--;
//             }else{
//                 star-=2;
//                 space++;
//             }
//             System.out.println();
//         }
//     }
// }

// 5
//       * 
//     * * *
//   * * * * *
//     * * *
//       *







// Example np.20
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n/2;
//         int star=1;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=space) {
//                 System.out.print("  ");
//                 i++;
//             }
//             int j=1;
//             while (j<=star) {
//                 if(j==1||j==star){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                 j++;
//             }
//             if (row<n/2+1) {
//                 star+=2;
//                 space--;
//             }else{
//                 star-=2;
//                 space++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }

// 7
//       * 
//     *   *
//   *       *
// *           * 
//   *       *
//     *   *
//       *


// Example no.20
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n/2;
//         int star=1;
//         for(int row=1;row<=n;row++){
//             for(int i=1;i<=space;i++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=star;j++){
//                 if(j==1||j==star){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             if(row<n/2+1){
//                 space--;
//                 star+=2;
//             }else{
//                 space++;
//                 star-=2;
//             }
//             System.out.println();
//         }
//     }
// }

// 7
//       * 
//     *   *
//   *       *
// *           *
//   *       *
//     *   *
//       *






// Example no. 21
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int star=1,space=n*2-2;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=star) {
//                 System.out.print("* ");
//                 i++;
//             }
//             int j=1;
//             while (j<=space) {
//                 System.out.print("  ");
//                 j++;
//             }
//             int k=1;
//             while (k<=star) {
//                 System.out.print("* ");
//                 k++;
//             }
//             star++;
//             space-=2;
//             row++;
//             System.out.println();
//         }
//     }
// }

// 5
// *                 * 
// * *             * *
// * * *         * * *
// * * * *     * * * *
// * * * * * * * * * *


// Example no.21
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int star=1,space=n*2-2;
//         for(int row=1;row<=n;row++){
//             for(int i=1;i<=star;i++){
//                 System.out.print("* ");
//             }
//             for(int j=1;j<=space;j++){
//                 System.out.print("  ");
//             }
//             for(int k=1;k<=star;k++){
//                 System.out.print("* ");
//             }
//             space-=2;
//             star++;
//             System.out.println();
//         }
//     }
// }

// 5
// *                 * 
// * *             * *
// * * *         * * *
// * * * *     * * * *
// * * * * * * * * * *





// Example no.22
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int star=n;
//         int space=1;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=star) {
//                 System.out.print("* ");
//                 i++;
//             }
//             int j=1;
//             while (j<space) {
//                 System.out.print("  ");
//                 j++;
//             }
//             int k=1;
//             while (k<=star) {
//                 System.out.print("* ");
//                 k++;
//             }
//             star--;
//             space+=2;
//             row++;
//             System.out.println();
//         }
//     }
// }

// 5
// * * * * * * * * * * 
// * * * *     * * * *
// * * *         * * *
// * *             * *
// *                 *


// Example no.22
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int star=n;
//         int space=1;
//        for(int row=1;row<=n;row++){
//             for(int i=1;i<=star;i++){
//                 System.out.print("* ");
//             }
//             for(int j=1;j<space;j++){
//                 System.out.print("  ");
//             }
//             for(int k=1;k<=star;k++){
//                 System.out.print("* ");
//             }
//             star--;
//             space+=2;
//             System.out.println();
//         }
//     }
// }

// 5
// * * * * * * * * * * 
// * * * *     * * * *
// * * *         * * *
// * *             * *
// *                 *





// Example no. 23
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int row=1,space=n-1,star=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=space) {
//                 System.out.print("  ");
//                 i++;
//             }
//             int j=1;
//             while (j<=star) {
//                 System.out.print("1 ");
//                 j++;
//             }
//             space--;
//             star+=2;
//             row++;
//             System.out.println();
//         }
//     }
// }

// 4
//       1 
//     1 1 1
//   1 1 1 1 1
// 1 1 1 1 1 1 1

// Example no.23
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n-1;
//         int star=1;
//         for(int row=1;row<=n;row++){
//             for(int i=1;i<=space;i++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=star;j++){
//                 System.out.print("1 ");
//             }
//             space--;
//             star+=2;
//             System.out.println();
//         }
//     }
// }

// 4
//       1 
//     1 1 1
//   1 1 1 1 1
// 1 1 1 1 1 1 1




// Example no.24
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n-1,star=1;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=space) {
//                 System.out.print("  ");
//                 i++;
//             }
//             int j=1;
//             while (j<=star) {
//                 System.out.print(row+" ");
//                 j++;
//             }
//             star+=2;
//             space--;
//             row++;
//             System.out.println();
//         }
//     }
// }

// 5
//         1 
//       2 2 2
//     3 3 3 3 3
//   4 4 4 4 4 4 4
// 5 5 5 5 5 5 5 5 5


// Example no.24
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n-1,star=1;
//         for(int row=1;row<=n;row++){
//             for(int i=1;i<=space;i++) {
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=star;j++) {
//                 System.out.print(row+" ");
//             }
//             star+=2;
//             space--;
//             System.out.println();
//         }
//     }
// }

// 5
//         1 
//       2 2 2
//     3 3 3 3 3
//   4 4 4 4 4 4 4
// 5 5 5 5 5 5 5 5 5



// Example no. 25
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n-1,star=1,num=1;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=space) {
//                 System.out.print("\t");
//                 i++;
//             }
//             int j=1;
//             while (j<=star) {
//                 System.out.print(num+"\t");
//                 j++;
//                 num++;
//             }
//             space--;
//             star+=2;
//             row++;
//             System.out.println();
//         }
//     }
// }

// 5
//                                 1
//                         2       3       4
//                 5       6       7       8       9
//         10      11      12      13      14      15      16
// 17      18      19      20      21      22      23      24      25

// Example no.25
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n-1,star=1,num=1;
//         for(int row=1;row<=n;row++){
//             for(int i=1;i<=space;i++){
//                 System.out.print("\t");
//             }
//             for(int j=1;j<=star;j++){
//                 System.out.print(num+"\t");
//                 num++;
//             }
//             space--;
//             star+=2;
//             System.out.println();
//         }
//     }
// }

// 5
//                                 1
//                         2       3       4
//                 5       6       7       8       9
//         10      11      12      13      14      15      16
// 17      18      19      20      21      22      23      24      25





// Example no.26
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n-1,star=1;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=space) {
//                 System.out.print("  ");
//                 i++;
//             }
//             int j=1;
//             while (j<=star) {
//                 System.out.print(j+" ");
//                 j++;
//             }
//             space--;
//             star+=2;
//             row++;
//             System.out.println();
//         }
//     }
// }

// 5
//         1 
//       1 2 3
//     1 2 3 4 5
//   1 2 3 4 5 6 7
// 1 2 3 4 5 6 7 8 9

// Example no. 26
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n-1,star=1;
//         for(int row=1;row<=n;row++){
//             for(int i=1;i<=space;i++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=star;j++){
//                 System.out.print(j+" ");
//             }
//             star+=2;
//             space--;
//             System.out.println();
//         }
//     }
// }

// 5
//         1 
//       1 2 3
//     1 2 3 4 5
//   1 2 3 4 5 6 7
// 1 2 3 4 5 6 7 8 9




// Example no 27
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n-1,star=1;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=space) {
//                 System.out.print("  ");
//                 i++;
//             }
//             int j=1;
//             int num=1;
//             while (j<=star) {
//                 if(j<star/2+1){
//                     System.out.print(num+" ");
//                     num++;
//                 }else{
//                     System.out.print(num+" ");
//                     num--;   
//                 }
//                j++;
//             }
//             space--;
//             star+=2;
//             row++;
//             System.out.println();
//         }
//     }
// }

// 5
//         1 
//       1 2 1
//     1 2 3 2 1
//   1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1

// Example no. 27
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n-1,star=1;
//         for(int row=1;row<=n;row++){
//             for(int i=1;i<=space;i++){
//                 System.out.print("  ");
//             }
//             int num=1;
//             for(int j=1;j<=star;j++) {
//                 if(j<star/2+1){
//                     System.out.print(num+" ");
//                     num++;
//                 }else{
//                     System.out.print(num+" ");
//                     num--;   
//                 }
//             }
//             space--;
//             star+=2;
//             System.out.println();
//         }
//     }
// }

// 4
//       1 
//     1 2 1
//   1 2 3 2 1
// 1 2 3 4 3 2 1




// Example no. 28
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n-1,star=1;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=space) {
//                 System.out.print("  ");
//                 i++;
//             }
//             int j=1;
//             int num=row;
//             while (j<=star) {
//                 System.out.print(num+" ");
//                 if(j<star/2+1){
//                     num++;
//                 }else{
//                     num--;
//                 }
//                 j++;
//             }
//             star+=2;
//             space--;
//             row++;
//             System.out.println();
//         }
//     }
// }

// 4
//       1 
//     2 3 2
//   3 4 5 4 3
// 4 5 6 7 6 5 4


// Example no.28
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n-1,star=1;
//         for(int row=1;row<=n;row++){
//             for(int i=1;i<=space;i++){
//                 System.out.print("  ");
//             }
//             int num=row;
//             for(int j=1;j<=star;j++){
//                 System.out.print(num+" ");
//                 if(j<star/2+1){
//                     num++;
//                 }else{
//                     num--;
//                 }
//             }
//             star+=2;
//             space--;
//             System.out.println();
//         }
//     }
// }

// 4
//       1 
//     2 3 2
//   3 4 5 4 3
// 4 5 6 7 6 5 4 






// Example no. 29
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n-1,star=1;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             while (i<=space) {
//                 System.out.print("  ");
//                 i++;
//             }
//             int j=1;
//             while (j<=star) {
//                 if(j==1||j==star){
//                     System.out.print(row+" ");
//                 }else{
//                     System.out.print("0 ");
//                 }
//                 j++;
//             }
//             space--;
//             star+=2;
//             row++;
//             System.out.println();
//         }
//     }
// }

// 4
//       1 
//     2 0 2
//   3 0 0 0 3
// 4 0 0 0 0 0 4


// Example no. 29
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int space=n-1,star=1;
//         for(int row=1;row<=n;row++){
//             for(int i=1;i<=space;i++) {
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=star;j++) {
//                 if(j==1||j==star){
//                     System.out.print(row+" ");
//                 }else{
//                     System.out.print(0+" "); 
//                 }
//             }
//             space--;
//             star+=2;
//             System.out.println();
//         }
//     }
// }

// 4
//       1 
//     2 0 2
//   3 0 0 0 3
// 4 0 0 0 0 0 4





// Example no.30
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             int star=n;
//             while (i<=n) {
//                 System.out.print(star+" ");
//                 star--;
//                 i++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }

// 5
// 5 4 3 2 1 
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1


// Example no.30
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int row=1;row<=n;row++){
//             int star=5;
//             for(int i=1;i<=n;i++){
//                 System.out.print(star+" ");
//                 star--;
//             }
//             System.out.println();
//         }
//     }
// }

// 5
// 5 4 3 2 1 
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1






// Example no.31
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int star=n;
//         int row=1;
//         while (row<=n) {
//             int i=1;
//             int num=5;
//             while (i<=n) {
//                 if(i==star){
//                     System.out.print("* ");
//                     star--;
//                 }else{
//                     System.out.print(num+" ");
//                 }
//                 num--;
//                 i++;
//             }
//             row++;
//             System.out.println();
//         }
//     }
// }

// 5
// 5 4 3 2 * 
// 5 4 3 * 1
// 5 4 * 2 1
// 5 * 3 2 1
// * 4 3 2 1


// Example no.31
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int star=n;
//         for(int row=1;row<=n;row++){
//             int num=5;
//             for(int i=1;i<=n;i++){
//                 if(i==star){
//                     System.out.print("* ");
//                     star--;
//                 }else{
//                     System.out.print(num+" ");
//                 }
//                 num--;              
//             }
//             System.out.println();
//         }
//     }
// }

// 5
// 5 4 3 2 * 
// 5 4 3 * 1
// 5 4 * 2 1
// 5 * 3 2 1
// * 4 3 2 1
