class Pattern10 {
public static void main(String[]args) {
for(int i=1;i<=3;i++) {
for(int j=1;j<=3;j++) {
if(i==1||j==1||i==j-1) {
System.out.print("*");
}
else {
System.out.print("");
}
}
System.out.println();
}
}
}
/*
Compile time-success
Run time-
***
**
*
*/