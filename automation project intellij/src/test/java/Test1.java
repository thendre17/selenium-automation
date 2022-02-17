public class Test1 {
    public static void main(String[] args) {
        int n = 101;
        for (int i=1; i<=n; i++){
            System.out.println("Asta este dalmatianul numarul"+i);
        }

        int x=0;System.out.println(x);
        x += 2; System.out.println(x);
        x -= 1; System.out.println(x);
        x *= 6; System.out.println(x);
        x /= 3; System.out.println(x);
    }
}
/* exista 4 tipuri de operatori :
- operatori de atribuire (= , += , -=, *=, /=)
- operatori aritmetici (+. -, *, /, % - operatorul modulo care returneaza restul impartirii deimpartitului la impartitor, ++ - operator
de incrementare, -- - operator de decrementare)
- operatori de comparatie (==, !=, >, <, >=, <=)
- operatori logici (&& - operatorul "si", || - operatorul "sau", ! - operatorul "not")

Evaluarea operatorului && "si"
A&A = adevarat
A&F = fals
F&A = fals
F&F = fals

Evaluarea operatorului || "sau"
A||A = adevarat
A||F = adevarat
F||A = adevarat
F||F = fals

Evaluarea operatorului ! "not"
! va returna opusul rezultatului evaluarii

if (!x = 0){
System.out.println(x=0);
}
else {
System.out.println("x este diferit de 0");
}

 */
