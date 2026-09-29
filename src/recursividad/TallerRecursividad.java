package recursividad;
import java.util.Scanner;
public class TallerRecursividad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("------ TALLER DE RECURSIVIDAD ------");

        System.out.print("Ingrese un numero para calcular su factorial: ");
        int numero1 = entrada.nextInt();
        System.out.println("Resultado: " + factorial(numero1));

        System.out.print("\nIngrese un numero para la sumatoria: ");
        int numero2 = entrada.nextInt();
        System.out.println("Resultado: " + sumatoriaHastaN(numero2));

        System.out.print("\nIngrese un numero para la sumatoria armonica: ");
        int numero3 = entrada.nextInt();
        System.out.println("Resultado: " + armonica(numero3));

        System.out.print("\nIngrese un numero para invertirlo: ");
        int numero4 = entrada.nextInt();
        System.out.println("Resultado: " + invertir(numero4, 0));

        System.out.print("\nIngrese un numero para sumar sus digitos: ");
        int numero5 = entrada.nextInt();
        System.out.println("Resultado: " + sumarDigitos(numero5));

        System.out.print("\nIngrese un numero que es la base: ");
        int base = entrada.nextInt();
        System.out.print("Ingrese un numeroque es el exponente: ");
        int exponente = entrada.nextInt();
        System.out.println("Resultado: " + potencia(base, exponente));

        System.out.print("\nIngrese el primer numero para MCD: ");
        int m = entrada.nextInt();
        System.out.print("Ingrese el segundo numero para MCD: ");
        int n = entrada.nextInt();
        System.out.println("Resultado MCD: " + mcd(m, n));

        System.out.print("\nIngrese el numero dividendo: ");
        int a = entrada.nextInt();
        System.out.print("Ingrese el numero divisor: ");
        int b = entrada.nextInt();
        System.out.println("Resultado Cociente: " + cociente(a, b));

        System.out.print("\nIngrese un numero para multiplicar: ");
        int numA = entrada.nextInt();
        System.out.print("Ingrese el segundo numero para multiplicar: ");
        int numB = entrada.nextInt();
        System.out.println("Resultado Multiplicacion: " + multiplicar(numA, numB));
        
        int[] vector = {1, 2, 3, 4, 5};
        System.out.println("\nSuma de vector {1,2,3,4,5}: " + sumarVector(vector, 0));

        int[][] matriz = {{1, 2}, {3, 4}};
        System.out.println("Suma de matriz {{1,2},{3,4}}: " + sumarMatriz(matriz, 0, 0));

        System.out.println("Fibonacci en posicion 6: " + fibonacci(6));
        System.out.println("Ackermann(1, 2): " + ackermann(1, 2));

        entrada.close();
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sumatoriaHastaN(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumatoriaHastaN(n - 1);
    }

    public static double armonica(int n) {
        if (n <= 1) {
            return 1.0;
        }
        return (1.0 / n) + armonica(n - 1);
    }

    public static int invertir(int n, int aux) {
        if (n == 0) {
            return aux;
        }
        return invertir(n / 10, aux * 10 + (n % 10));
    }

    public static int sumarDigitos(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumarDigitos(n / 10);
    }

    public static int potencia(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * potencia(base, exp - 1);
    }

    public static int mcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        return mcd(n, m % n);
    }

    public static String copiarCadena(String cad, int i) {
        if (i >= cad.length()) {
            return "";
        }
        return cad.charAt(i) + copiarCadena(cad, i + 1);
    }

    public static int cociente(int a, int b) {
        if (a < b) {
            return 0;
        }
        return 1 + cociente(a - b, b);
    }

    public static int multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + multiplicar(a, b - 1);
    }

    public static int sumarVector(int[] vec, int i) {
        if (i >= vec.length) {
            return 0;
        }
        return vec[i] + sumarVector(vec, i + 1);
    }

    public static int sumarMatriz(int[][] mat, int f, int c) {
        if (f >= mat.length) {
            return 0;
        }
        if (c >= mat[f].length) {
            return sumarMatriz(mat, f + 1, 0);
        }
        return mat[f][c] + sumarMatriz(mat, f, c + 1);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        if (m > 0 && n == 0) {
            return ackermann(m - 1, 1);
        }
        return ackermann(m - 1, ackermann(m, n - 1));
    }
    
        
    
}
