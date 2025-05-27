import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long iloczyn = 1;

        System.out.println("Wprowadzaj liczby (5 kończy program):");

        while (true) {
            int liczba = scanner.nextInt();

            if (liczba == 5) {
                break;
            }

            if (liczba % 2 != 0) {
                iloczyn *= liczba;
            }
        }

        System.out.println("Iloczyn liczb nieparzystych: " + iloczyn);
    }
}
// 1.Napisz program, który pozwala wprowadzić 5 liczb z klawiatury i znaleźć ich sumę i średnią.
// SumAndAverage.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        System.out.println("Wprowadź 5 liczb:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Liczba " + i + ": ");
            double num = scanner.nextDouble();
            sum += num;
        }
        double average = sum / 5;
        System.out.println("Suma: " + sum);
        System.out.println("Średnia: " + average);
        scanner.close();
    }
}

// 2.Napisz program, który wyświetla liczy pierwsze z 500 liczb naturalnych.
// MainPrimes500.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Liczby pierwsze wśród pierwszych 500 liczb naturalnych:");
        int count = 0;
        for (int num = 2; num <= 500; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Znaleziono " + count + " liczb pierwszych.");
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
// 3.Napisz program, który sprawdzi, czy liczba jest dodatnia czy ujemna.
// MainSignCheck.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        double num = scanner.nextDouble();
        if (num > 0) {
            System.out.println("Liczba jest dodatnia.");
        } else if (num < 0) {
            System.out.println("Liczba jest ujemna.");
        } else {
            System.out.println("Liczba jest równa zero.");
        }
        scanner.close();
    }
}
// 4.Napisz program, który pobierze od użytkownika trzy liczby i wypisze największą z nich.
// MainMaxOfThree.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj trzy liczby:");
        System.out.print("Liczba 1: ");
        double a = scanner.nextDouble();
        System.out.print("Liczba 2: ");
        double b = scanner.nextDouble();
        System.out.print("Liczba 3: ");
        double c = scanner.nextDouble();
        double max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("Największa liczba to: " + max);
        scanner.close();
    }
}
// 5.Napisz program, który składa się z dwóch funkcji obliczach silnię liczby podanej jako argument: w sposób iteracyjny i rekurencyjny.
// MainFactorial.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę do obliczenia silni: ");
        int n = scanner.nextInt();

        long iterativeResult = factorialIterative(n);
        long recursiveResult = factorialRecursive(n);

        System.out.println("Silnia (iteracyjnie) dla " + n + " to: " + iterativeResult);
        System.out.println("Silnia (rekurencyjnie) dla " + n + " to: " + recursiveResult);
        scanner.close();
    }

    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }
}
// 6. Napisz program, który znajduje Największą Wspólną Wielokrotność dwóch liczb.
// katalog: LCM/Main.java
import java.util.Scanner;

public class Main {
    private static long gcd(long a, long b) {
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    private static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        long x = sc.nextLong();
        System.out.print("Podaj drugą liczbę: ");
        long y = sc.nextLong();
        System.out.println("Najmniejsza wspólna wielokrotność: " + lcm(x, y));
        sc.close();
    }
}
// 7. Napisz program, który przelicza prędkość z m/s na km/h.
// katalog: SpeedConverter/Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj prędkość w m/s: ");
        double ms = sc.nextDouble();
        double kmh = ms * 3.6;
        System.out.printf("Prędkość w km/h: %.2f%n", kmh);
        sc.close();
    }
}
// 8. Napisz program, który będzie kalkulatorem walut z PLN na EUR i odwrotnie.
// katalog: CurrencyConverter/Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Aktualny kurs PLN→EUR (np. 4.50): ");
        double rate = sc.nextDouble();
        System.out.println("1) PLN→EUR   2) EUR→PLN");
        int opt = sc.nextInt();

        if (opt == 1) {
            System.out.print("Kwota w PLN: ");
            double pln = sc.nextDouble();
            System.out.printf("W EUR: %.2f%n", pln / rate);
        } else if (opt == 2) {
            System.out.print("Kwota w EUR: ");
            double eur = sc.nextDouble();
            System.out.printf("W PLN: %.2f%n", eur * rate);
        } else {
            System.out.println("Nieprawidłowy wybór.");
        }
        sc.close();
    }
}
// 9. Napisz program, który sprawdza czy dane słowo jest palindromem.
// katalog: Palindrome/Main.javab    
import java.util.Scanner;

public class Main {
    private static boolean isPalindrome(String s) {
        String clean = s.replaceAll("\\s+", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj słowo lub zdanie: ");
        String txt = sc.nextLine();
        System.out.println(isPalindrome(txt) ? "To jest palindrom." : "To nie jest palindrom.");
        sc.close();
    }
}
// 10. Napisz program, który losuje liczbę oczek (od 1 do 6) dla dwóch kostek i porównuje wynik. Ta sama liczba czek oznacza wygraną.
// katalog: DiceGame/Main.java
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int d1 = r.nextInt(6) + 1;
        int d2 = r.nextInt(6) + 1;
        System.out.println("Kostka 1: " + d1);
        System.out.println("Kostka 2: " + d2);
        System.out.println(d1 == d2
            ? "Wygrałeś! Obie kostki pokazują tę samą liczbę."
            : "Spróbuj ponownie – liczby różne.");
    }
}
//11. Napisz program, który na podstawie daty stwierdza czy jest to rok przestępny czy nie.

// katalog: LeapYear/Main.java
import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj rok: ");
        int year = sc.nextInt();
        System.out.println(Year.isLeap(year)
            ? year + " jest rokiem przestępnym."
            : year + " nie jest rokiem przestępnym.");
        sc.close();
    }
}
//12. Napisz program, który liczy obecny wiek osoby na podstawie jej daty urodzenia.
// katalog: AgeCalculator/Main.java
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj datę urodzenia (RRRR-MM-DD): ");
        String in = sc.nextLine();
        LocalDate birth = LocalDate.parse(in, DateTimeFormatter.ISO_LOCAL_DATE);
        Period age = Period.between(birth, LocalDate.now());
        System.out.printf("Masz %d lat, %d miesięcy i %d dni.%n",
                          age.getYears(), age.getMonths(), age.getDays());
        sc.close();
    }
}
//13.  Napisz program, który do określania płci osoby na podstawie jej peselu.
// Main.java
//10 cyfra to płeć parzysta męzczyzna, np kobieta
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj numer PESEL (11 cyfr): ");
        String pesel = sc.nextLine().trim();

        if (!pesel.matches("\\d{11}")) {
            System.out.println("Błędny format PESEL — powinien składać się z 11 cyfr.");
        } else {
            int genderDigit = Character.getNumericValue(pesel.charAt(9));
            String gender = (genderDigit % 2 == 1) ? "mężczyzna" : "kobieta";
            System.out.println("Płeć: " + gender);
        }

        sc.close();
    }
}
//14. Napisz program, który wylosuje dowolną liczbę całkowitą od 0 do 100, a następnie prosi użytkownika o jej zgadnięcie tak długo, aż ten poda poprawną wartość.
// Main.java
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int target = rand.nextInt(101); // losuje liczbę od 0 do 100
        Scanner sc = new Scanner(System.in);
        int guess = -1;

        System.out.println("Zgadnij liczbę od 0 do 100!");

        while (guess != target) {
            System.out.print("Twoja propozycja: ");
            if (!sc.hasNextInt()) {
                System.out.println("Proszę podać liczbę całkowitą.");
                sc.next(); // odrzucenie niepoprawnego wejścia
                continue;
            }
            guess = sc.nextInt();

            if (guess < target) {
                System.out.println("Za mało, spróbuj jeszcze raz.");
            } else if (guess > target) {
                System.out.println("Za dużo, spróbuj jeszcze raz.");
            } else {
                System.out.println("Gratulacje! Zgadłeś poprawnie: " + target);
            }
        }

        sc.close();
    }
}

//15.Napisz program, który wypisze długość danego łańcucha.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tekst: ");
        String tekst = scanner.nextLine();
        System.out.println("Długość: " + tekst.length());
    }
}
//16.Napisz program, który zlicza całkowitą liczbę znaków interpunkcyjnych w danym ciągu.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tekst: ");
        String tekst = scanner.nextLine();
        int count = 0;
        for (char c : tekst.toCharArray()) {
            if (",.!?;:".indexOf(c) != -1) count++;
        }
        System.out.println("Liczba znaków interpunkcyjnych: " + count);
    }
}

//17.Napisz program, który sprawdza, czy dwa ciągi są anagramem.
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszy ciąg: ");
        String a = scanner.nextLine();
        System.out.print("Podaj drugi ciąg: ");
        String b = scanner.nextLine();
        char[] arr1 = a.replaceAll("\\s+", "").toLowerCase().toCharArray();
        char[] arr2 = b.replaceAll("\\s+", "").toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2) ? "Anagram" : "Nie anagram");
    }
}











//18.Napisz program, który sprawdza, czy równanie jest równaniem liniowym.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj równanie (np. 2x+3=5): ");
        String rownanie = scanner.nextLine().replaceAll("\\s+", "");

        // Sprawdź czy zawiera "x", nie zawiera "x^", ani "x*x", ani "x2", itp.
        boolean zawieraX = rownanie.contains("x");
        boolean zawieraPotegowanie = rownanie.matches(".*x\\^\\d+.*") || rownanie.matches(".*x\\*x.*") || rownanie.matches(".*x\\d+.*");

        if (zawieraX && !zawieraPotegowanie && rownanie.contains("=")) {
            System.out.println("To może być równanie liniowe.");
        } else {
            System.out.println("To nie jest równanie liniowe.");
        }
    }
}
//19.Napisz program, który znajduje pierwiastki równania kwadratowego.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj a: ");
        double a = scanner.nextDouble();
        System.out.print("Podaj b: ");
        double b = scanner.nextDouble();
        System.out.print("Podaj c: ");
        double c = scanner.nextDouble();
        double delta = b*b - 4*a*c;
        if (delta > 0) {
            System.out.println("x1 = " + (-b + Math.sqrt(delta)) / (2*a));
            System.out.println("x2 = " + (-b - Math.sqrt(delta)) / (2*a));
        } else if (delta == 0) {
            System.out.println("x = " + (-b / (2*a)));
        } else {
            System.out.println("Brak pierwiastków rzeczywistych");
        }
    }
}













//20.Napisz program, który wyświetli wszystkie liczby Armstronga od 1 do 600 za pomocą pętli.
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 600; i++) {
            int n = i, sum = 0, digits = String.valueOf(i).length();
            while (n > 0) {
                int d = n % 10;
                sum += Math.pow(d, digits);
                n /= 10;
            }
            if (sum == i) System.out.println(i);
        }
    }
}
//21. Napisz program, który pozwala znaleźć najmniejszą liczbę spośród trzech liczb.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int b = scanner.nextInt();
        System.out.print("Podaj trzecią liczbę: ");
        int c = scanner.nextInt();
        int min = Math.min(a, Math.min(b, c));
        System.out.println("Najmniejsza: " + min);
    }
}
//22. Napisz program, który zlicza liczbę słów w ciągu znaków.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tekst: ");
        String tekst = scanner.nextLine();
        String[] slowa = tekst.trim().split("\\s+");
        System.out.println("Liczba słów: " + slowa.length);
    }
}















//23. Napisz program, który obliczy sumę cyfr w liczbie całkowitej.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();
        int suma = 0;
        while (liczba != 0) {
            suma += liczba % 10;
            liczba /= 10;
        }
        System.out.println("Suma cyfr: " + suma);
    }
}
//24. Napisz program, który sprawdza samogłoski i spółgłoski w podanym tekście.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tekst: ");
        String tekst = scanner.nextLine().toLowerCase();
        int samogloski = 0, spolgloski = 0;
        for (char c : tekst.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiouyąę".indexOf(c) != -1)
                    samogloski++;
                else
                    spolgloski++;
            }
        }
        System.out.println("Samogłoski: " + samogloski + ", Spółgłoski: " + spolgloski);
    }
}
//25. Napisz program, który odwraca kolejność cyfr w podanej liczbie całkowitej.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();
        int odwrocona = 0;
        while (liczba != 0) {
            odwrocona = odwrocona * 10 + liczba % 10;
            liczba /= 10;
        }
        System.out.println("Odwrócona liczba: " + odwrocona);
    }
}



//26. Napisz program, który przyjmuje liczby do momentu zakończenia przez użytkownika, a na końcu wyświetla największą i najmniejszą liczbę.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer min = null, max = null;
        System.out.println("Podawaj liczby (q - zakończ):");
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                if (min == null || n < min) min = n;
                if (max == null || n > max) max = n;
            } else if (sc.next().equalsIgnoreCase("q")) {
                break;
            }
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }
}

//27. Napisz program, który usuwa wszystkie spacje z łańcucha.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tekst: ");
        String tekst = scanner.nextLine();
        System.out.println("Bez spacji: " + tekst.replace(" ", ""));
    }
}
//28. Napisz program, który sprawdza, czy została podana liczba całkowita.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dane: ");
        String dane = scanner.nextLine();
        try {
            Integer.parseInt(dane);
            System.out.println("To liczba całkowita");
        } catch (NumberFormatException e) {
            System.out.println("To nie jest liczba całkowita");
        }
    }
}









//29.Napisz program, który wypisuje największą z trzech podanych liczb.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int b = scanner.nextInt();
        System.out.print("Podaj trzecią liczbę: ");
        int c = scanner.nextInt();
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Największa: " + max);
    }
}
//30. Napisz program, który wyświetla znaki wprowadzane z klawiatury aż do naciśnięcia klawisza 'k'.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char znak;
        System.out.println("Wprowadzaj znaki (zakończ przez 'k'):");
        do {
            String wejscie = scanner.nextLine();
            if (!wejscie.isEmpty()) {
                znak = wejscie.charAt(0);
                if (znak != 'k') {
                    System.out.println("Wprowadzono: " + znak);
                }
            } else {
                znak = 0;
            }
        } while (znak != 'k');
    }
}

//32. AF. Napisz program, który sumuje liczby nieparzyste. Liczba (5) kończy wprowadzanie danych.

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int sum = 0;
 int number;

 System.out.println("Enter numbers (5 to end):");

 while (true) {
 number = scanner.nextInt();

 if (number == 5) {
 break;
 }

 if (number % 2 != 0) {
 sum += number;
 }
 }

 System.out.println("Sum of odd numbers: " + sum);
 scanner.close();
 }
}









//33. AG. Napisz program, który sumuje liczby podzielne przez 5. Liczba (-5) kończy wprowadzanie danych.



import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int sum = 0;
 int number;

 System.out.println("Enter numbers (enter -5 to stop):");

 while (true) {
 number = scanner.nextInt();

 if (number == -5) {
 break;
 }

 if (number % 5 == 0) {
 sum += number;
 }
 }

        System.out.println("Sum of numbers divisible by 5: " + sum);
        scanner.close();
    }
}









//34. AH. Napisz program, który mnoży liczby parzyste. Liczba (-5) kończy wprowadzanie danych.






import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int product = 1; // Initialize product for multiplication
 int number;
 System.out.println("Enter even numbers to multiply (enter -5 to finish):");
 while (true) {
 number = scanner.nextInt(); // Read user input

 if (number == -5) {
 break; // End input on -5
 }

 if (number % 2 == 0) { // Check if the number is even
 product *= number; // Multiply even numbers
 }
 }

 System.out.println("The product of even numbers is: " + product);
 scanner.close(); // Close the scanner
 }
}








//35. AI. Napisz program, który mnoży liczby nieparzyste. Liczba (5) kończy wprowadzanie danych.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long iloczyn = 1;

        System.out.println("Wprowadzaj liczby (5 kończy program):");

        while (true) {
            int liczba = scanner.nextInt();

            if (liczba == 5) {
                break;
            }

            if (liczba % 2 != 0) {
                iloczyn *= liczba;
            }
        }

        System.out.println("Iloczyn liczb nieparzystych: " + iloczyn);
    }
}






//36. AJ. Napisz program, który mnoży liczby podzielne przez 9. Liczba (-5) kończy wprowadzanie danych.


import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int product = 1; // To store the product of numbers divisible by 9
 boolean hasValidInput = false; // Flag to check if there's any valid input
 System.out.println("Enter numbers (enter -5 to stop):");
 while (true) {
 int number = scanner.nextInt();
 if (number == -5) {
 break; // Exit the loop when -5 is entered
 }
 if (number % 9 == 0) {
 product *= number; // Multiply if number is divisible by 9
 hasValidInput = true; // Set flag to true if we have valid input
 }
 }
 if (hasValidInput) {
 System.out.println("Product of numbers divisible by 9: " + product);
 } else {
 System.out.println("No numbers divisible by 9 were entered.");
 }
 scanner.close(); // Close the scanner
 }
}













//37. AK. Napisz program, który zamienia małe litery na wielkie, a wielkie na małe


public class Main {
 public static void main(String[] args) {
 String input = "Darek Durtka jest GENIALNY";
 String swapped = swapCase(input);
 System.out.println("Original string: " + input);
 System.out.println("Swapped case: " + swapped);
 }
 public static String swapCase(String input) {
 StringBuilder result = new StringBuilder();
 for (char c : input.toCharArray()) {
 if (Character.isLowerCase(c)) {
 result.append(Character.toUpperCase(c));
 } else if (Character.isUpperCase(c)) {
 result.append(Character.toLowerCase(c));
 } else {
 result.append(c); // Zostaw inne znaki bez zmian
 }
 }
 return result.toString();
 }
}





//38. AL. Napisz program, który łączy dwa ciągi znaków.

public class Main {
 public static void main(String[] args) {
 String str1 = "msadsafnafnslafn ";
 String str2 = "moskal";
 String combined = str1 + str2;
 System.out.println(combined);
 }
}




//39. AM. Napisz program, który konwertuje wszystkie znaki we wprowadzonym ciągu na małe litery.


public class Main {
 public static void main(String[] args) {
 String input = "HELLO WORLD!";
 String lowercased = input.toLowerCase();
 System.out.println(lowercased);
 }
}










//40. AN. Napisz program, który zastępuje wszystkie znaki „d” znakami „f” we wprowadzonym łańcuchu.

public class Main {
 public static void main(String[] args) {
 String input = "Hello, dear dog!";
 String replaced = input.replace('d', 'f');
 System.out.println(replaced);
 }
}


//41. AO. Napisz program, który wypisuje znak o podanym indeksie z ciągu znaków


public class Main {
 public static void main(String[] args) {
 String input = "Hello, world!";
 int index = 7; // Example index
 char character = input.charAt(index);
 System.out.println(character);
 }
}


//42. AP. Napisz program, który usuwa określony znak z łańcucha.


public class Main {
 public static void main(String[] args) {
 String input = "Hello, world!";
 char toRemove = 'o';
 String result = input.replace(String.valueOf(toRemove), "");
 System.out.println(result);
 }
}



//43. AQ. Napisz program, który odwraca ciąg znaków.


public class Main {
 public static void main(String[] args) {
 String input = "Hello, world!";
 String reversed = new StringBuilder(input).reverse().toString();
 System.out.println(reversed);
 }
}




//44. AR. Napisz program, który sprawdza, czy liczba jest ujemna, zerowa czy dodatnia.

public class Main {
 public static void main(String[] args) {
 int number = 7; // Example number
 if (number > 0) {
 System.out.println("Positive");
 } else if (number < 0) {
 System.out.println("Negative");
 } else {
            System.out.println("Zero");
        }
    }
}




//45. AS. Napisz program, który odczytuje dodatnią liczbę całkowitą i liczy jej cyfry.


import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a positive integer: ");
 int number = scanner.nextInt();
 int count = String.valueOf(number).length();
 System.out.println("Number of digits: " + count);
 }
}



//46. AT. Napisz program, który sprawdza, czy trzy liczby są równe.


public class Main {
 public static void main(String[] args) {
 int a = 3, b = 3, c = 4; // Example numbers
 if (a == b && b == c) {
 System.out.println("All three numbers are equal.");
 } else {
 System.out.println("Not all numbers are equal.");
 }
 }
}


//47. AU. Napisz program, który sprawdza, czy trzy liczby są rosnące, czy malejące.


public class Main {
 public static void main(String[] args) {
 int a = 1, b = 2, c = 3; // Example numbers
 if (a < b && b < c) {
 System.out.println("Increasing");
 } else if (a > b && b > c) {
 System.out.println("Decreasing");
 } else {



 System.out.println("Neither");
 }
 }
}






//48. AV. Napisz program, który zamienia wszystkie znaki w łańcuchu na wielkie litery.


public class Main {
    public static void main(String[] args) {
        String input = "hello world!";
        String uppercased = input.toUpperCase();
        System.out.println(uppercased);
    }
}


//49. AW. Napisz program, który przycina wprowadzony łańcuch, usuwając spacje.


public class Main {
    public static void main(String[] args) {
        String input = "   Hello, world!   ";
        String trimmed = input.trim();
        System.out.println(trimmed);
    }
}

//50.Napisz program, który wyświetla podłańcuch między dwiema pozycjami.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie ciągu znaków od użytkownika
        System.out.print("Podaj ciąg znaków: ");
        String input = scanner.nextLine();

        // Pobranie pozycji początkowej
        System.out.print("Podaj początkową pozycję: ");
        int start = scanner.nextInt();

        // Pobranie pozycji końcowej
        System.out.print("Podaj końcową pozycję: ");
        int end = scanner.nextInt();

        // Sprawdzamy, czy podane pozycje są poprawne, aby nie zgłosić wyjątku
        if (start < 0 || end > input.length() || start >= end) {
            System.out.println("Błędne pozycje. Upewnij się, że 0 <= start < end <= długość ciągu.");
        } else {
            // Wyznaczenie podłańcucha metodą substring
            String substring = input.substring(start, end);
            System.out.println("Podłańcuch: " + substring);
        }

        scanner.close();
    }
}
//51. Napisz program, który zlicza samogłoski i spółgłoski w tablicy znakowej.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie od użytkownika słowa
        System.out.print("Podaj słowo: ");
        String word = scanner.nextLine().trim();

        int vowels = 0;
        int consonants = 0;

        // Iteracja po kolejnych znakach słowa
        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            // Sprawdzamy, czy znak jest literą
            if (Character.isLetter(ch)) {
                // Jeśli znak jest jedną z polskich samogłosek, zwiększamy licznik samogłosek
                if (ch == 'a' || ch == 'ą' || ch == 'e' || ch == 'ę' ||
                    ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
                    vowels++;
                } else {
                    // W przeciwnym przypadku, jeśli litera nie należy do samogłosek, inkrementujemy licznik spółgłosek
                    consonants++;
                }
            }
        }

        // Wyświetlenie wyników
        System.out.println("Liczba samogłosek: " + vowels);
        System.out.println("Liczba spółgłosek: " + consonants);

        scanner.close();
    }
}
//52. Napisz program, który pobiera numer dnia tygodnia (1-7) i wypisuje nazwę dnia.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Utworzenie obiektu Scanner do pobierania danych od użytkownika
        Scanner scanner = new Scanner(System.in);

        // Pobranie numeru dnia tygodnia od użytkownika
        System.out.print("Podaj numer dnia tygodnia (1-7): ");
        int numer = scanner.nextInt();

        // Przypisanie nazwy dnia za pomocą instrukcji switch
        switch (numer) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                // Informacja o błędnym numerze, gdy podana liczba nie mieści się w zakresie 1-7
                System.out.println("Nieprawidłowy numer. Podaj liczbę od 1 do 7.");
                break;
        }

        // Zamknięcie obiektu Scanner
        scanner.close();
    }
}
//53. Napisz program, który pobiera rok i sprawdza, czy jest przestępny.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieramy rok od użytkownika
        System.out.print("Podaj rok: ");
        int rok = scanner.nextInt();

        // Sprawdzamy, czy rok jest przestępny
        // Rok jest przestępny, jeśli jest podzielny przez 4 i niepodzielny przez 100,
        // lub jeśli jest podzielny przez 400.
        if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0)) {
            System.out.println("Rok " + rok + " jest przestępny.");
        } else {
            System.out.println("Rok " + rok + " nie jest przestępny.");
        }

        scanner.close();
    }
}
//54. Napisz program, który zlicza samogłoski w łańcuchu znaków.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie łańcucha znaków od użytkownika
        System.out.print("Podaj łańcuch znaków: ");
        String input = scanner.nextLine();

        int liczbaSamoglosek = 0;

        // Iteracja po każdym znaku w łańcuchu
        for (int i = 0; i < input.length(); i++) {
            // Pobranie danego znaku i zamiana na małą literę dla ułatwienia porównań
            char znak = Character.toLowerCase(input.charAt(i));
            // Sprawdzenie, czy dany znak jest samogłoską (uwzględnione są polskie samogłoski)
            if (znak == 'a' || znak == 'ą' || znak == 'e' || znak == 'ę' ||
                znak == 'i' || znak == 'o' || znak == 'u' || znak == 'y') {
                liczbaSamoglosek++;
            }
        }

        // Wyświetlenie wyniku
        System.out.println("Liczba samogłosek w łańcuchu: " + liczbaSamoglosek);

        scanner.close();
    }
}
//55. Napisz program, który sprawdza, czy dany ciąg jest palindromem.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie ciągu znaków od użytkownika
        System.out.print("Podaj ciąg znaków: ");
        String input = scanner.nextLine();

        // Normalizacja ciągu: usuwamy spacje i zamieniamy na małe litery
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Sprawdzamy, czy ciąg jest palindromem
        boolean isPalindrome = true;
        int length = normalized.length();
        for (int i = 0; i < length / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Wyświetlenie wyniku
        if (isPalindrome) {
            System.out.println("Ciąg \"" + input + "\" jest palindromem.");
        } else {
            System.out.println("Ciąg \"" + input + "\" nie jest palindromem.");
        }

        scanner.close();
    }
}
//56. Napisz program, który znajduje Największy Wspólny Dzielnik dwóch liczb metodą Euklidesa.
import java.util.Scanner;

public class Main {

    // Metoda zwracająca GCD (NWD) dwóch liczb wykorzystująca algorytm Euklidesa
    public static int gcd(int a, int b) {
        // Za pomocą pętli dopóki b nie będzie równe 0
        while (b != 0) {
            int remainder = a % b; // obliczenie reszty z dzielenia a przez b
            a = b;                // przypisanie wartości b do a
            b = remainder;        // przypisanie reszty do b
        }
        return a; // kiedy b będzie 0, a przechowuje NWD
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie pierwszej liczby od użytkownika
        System.out.print("Podaj pierwszą liczbę: ");
        int liczba1 = scanner.nextInt();

        // Pobranie drugiej liczby od użytkownika
        System.out.print("Podaj drugą liczbę: ");
        int liczba2 = scanner.nextInt();

        // Wywołanie metody gcd i przechowanie wyniku
        int wynik = gcd(liczba1, liczba2);

        // Wyświetlenie rezultatu
        System.out.println("Największy wspólny dzielnik liczb " + liczba1 + " i " + liczba2 + " wynosi: " + wynik);

        scanner.close();
    }
}
//57.Napisz program, który wypisuje liczby Catalana mniejsze od 1 000 000 oraz liczy, ile jest wśród nich liczb parzystych i nieparzystych.
public class Main {
    public static void main(String[] args) {
        int countEven = 0;
        int countOdd = 0;
        int index = 0;
        int catalan = 1; // C(0) = 1

        System.out.println("Liczby Catalana mniejsze od 1 000 000:");

        // Pętla wykonuje się dopóki aktualna liczba Catalana jest mniejsza od 1 000 000
        while (catalan < 1_000_000) {
            System.out.println("C(" + index + ") = " + catalan);

            // Sprawdzamy parzystość bieżącej liczby
            if (catalan % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }

            // Obliczanie następnej liczby Catalana wg wzoru:
            // C(n+1) = (2*(2*n + 1) * C(n)) / (n + 2)
            catalan = (2 * (2 * index + 1) * catalan) / (index + 2);
            index++;
        }

        System.out.println("\nLiczba liczb parzystych: " + countEven);
        System.out.println("Liczba liczb nieparzystych: " + countOdd);
    }
}
//58 . Napisz program, który sprawdza, czy liczba naturalna jest liczbą doskonałą.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Podana liczba musi być większa od 0.");
        } else {
            int sumaDzielników = 0;

            // Dla liczby naturalnej doskonałej wystarczy sprawdzić dzielniki od 1 do n/2
            // Ponieważ żaden dzielnik (poza n) nie może być większy niż n/2.
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sumaDzielników += i;
                }
            }

            if (sumaDzielników == n) {
                System.out.println("Liczba " + n + " jest doskonała.");
            } else {
                System.out.println("Liczba " + n + " nie jest doskonała.");
            }
        }

        scanner.close();
    }
}
//59. Napisz program, który dla liczby naturalnej wypisuje, ile ma cyfr i jaka jest ich suma.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę naturalną: ");
        int liczba = scanner.nextInt();
        int oryginalnaLiczba = liczba;

        // Zmienna do przechowywania liczby cyfr i sumy cyfr
        int liczbaCyfr = 0;
        int sumaCyfr = 0;

        // Specjalny przypadek: gdy liczba wynosi 0.
        if (liczba == 0) {
            liczbaCyfr = 1;
            sumaCyfr = 0;
        } else {
            // Dla liczby > 0 dzielimy ją przez 10 aż stanie się 0
            while (liczba > 0) {
                int cyfra = liczba % 10; // pobranie ostatniej cyfry
                sumaCyfr += cyfra;       // dodanie cyfry do sumy
                liczbaCyfr++;            // inkrementacja licznika cyfr
                liczba /= 10;            // usunięcie ostatniej cyfry
            }
        }

        System.out.println("Liczba " + oryginalnaLiczba + " ma " + liczbaCyfr + " cyfr.");
        System.out.println("Suma cyfr liczby " + oryginalnaLiczba + " wynosi: " + sumaCyfr + ".");
        scanner.close();
    }
}
//60. Napisz program, który tworzy pustą tablicę i wypełnia ją 5 losowymi liczbami z zakresu [−1, 1], wypisując je z indeksami.
import java.util.Random;

public class LosowaTablica {
    public static void main(String[] args) {
        // Tworzymy jedną tablicę z 5 elementami typu double
        double[] tablica = new double[5];

        // Inicjujemy generator liczb losowych
        Random random = new Random();

        // Wypełniamy tablicę losowymi liczbami z przedziału [-1, 1]
        for (int i = 0; i < tablica.length; i++) {
            // random.nextDouble() zwraca wartość z przedziału [0, 1),
            // więc aby otrzymać zakres [-1, 1], przeskalowujemy wynik:
            tablica[i] = -1 + 2 * random.nextDouble();
        }

        // Wypisujemy elementy tablicy wraz z ich indeksami
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("tablica[" + i + "] = " + tablica[i]);
        }
    }
}
//61. Napisz program, który znajduje podciąg powtarzający się więcej niż raz w ciągu.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ciąg znaków: ");
        String input = scanner.nextLine();

        String foundSubstring = "";
        boolean found = false;

        // Przeszukujemy wszystkie możliwe długości podciągów,
        // rozpoczynając od najdłuższej.
        for (int len = input.length(); len > 0; len--) {
            // Dla danej długości przeszukujemy wszystkie możliwe pozycje startowe.
            for (int i = 0; i <= input.length() - len; i++) {
                String sub = input.substring(i, i + len);
                // Sprawdzamy, czy dany podciąg pojawia się jeszcze gdzieś w ciągu,
                // zaczynając wyszukiwanie od pozycji i+1 (co umożliwia wykrycie także nakładających się wystąpień).
                if (input.indexOf(sub, i + 1) != -1) {
                    foundSubstring = sub;
                    found = true;
                    break; // Wychodzimy z pętli dla długości, bo znaleźliśmy najdłuższy dla tej długości
                }
            }
            if (found) {
                break; // Znaleziono najdłuższy powtarzający się podciąg – kończymy dalsze przeszukiwanie
            }
        }

        if (!foundSubstring.isEmpty()) {
            System.out.println("Znaleziony powtarzający się podciąg: " + foundSubstring);
        } else {
            System.out.println("Nie znaleziono podciągu, który powtarza się więcej niż raz.");
        }

        scanner.close();
    }
}
//62. Napisz program, który liczy średnią arytmetyczną i geometryczną 10 liczb.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int ILOSC_LICZB = 10;
        double suma = 0;
        double iloczyn = 1;

        System.out.println("Podaj " + ILOSC_LICZB + " liczb:");

        // Pobieramy 10 liczb od użytkownika
        for (int i = 1; i <= ILOSC_LICZB; i++) {
            System.out.print("Liczba " + i + ": ");
            double liczba = scanner.nextDouble();
            suma += liczba;
            iloczyn *= liczba;
        }

        // Obliczamy średnią arytmetyczną
        double sredniaArytmetyczna = suma / ILOSC_LICZB;

        System.out.println("\nŚrednia arytmetyczna wynosi: " + sredniaArytmetyczna);

        // Obliczamy średnią geometryczną, o ile iloczyn nie jest ujemny
        if (iloczyn < 0) {
            System.out.println("Nie można obliczyć średniej geometrycznej, ponieważ iloczyn liczb jest ujemny.");
        } else {
            double sredniaGeometryczna = Math.pow(iloczyn, 1.0 / ILOSC_LICZB);
            System.out.println("Średnia geometryczna wynosi: " + sredniaGeometryczna);
        }

        scanner.close();
    }
}
//63. Napisz program, który wypisuje liczby Armstronga w zakresie 1–100000.
public class Main {
    public static void main(String[] args) {
        System.out.println("Liczby Armstronga w zakresie 1-100000:");

        // Przechodzimy przez wszystkie liczby od 1 do 100000
        for (int num = 1; num <= 100000; num++) {
            // Ustalamy liczbę cyfr w danej liczbie
            int digitsCount = Integer.toString(num).length();
            int sum = 0;
            int temp = num;

            // Sumujemy każdą cyfrę podniesioną do potęgi digitsCount
            while (temp > 0) {
                int digit = temp % 10;
                int power = 1;
                for (int i = 0; i < digitsCount; i++) {
                    power *= digit;
                }
                sum += power;
                temp /= 10;
            }

            // Jeśli suma potęg cyfr równa się oryginalnej liczbie, jest to liczba Armstronga
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
//64. Napisz program, który sprawdza, czy liczba jest liczbą Armstronga.
import java.util.Scanner;

public class ArmstrongChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie liczby od użytkownika
        System.out.print("Podaj liczbę: ");
        int originalNumber = scanner.nextInt();

        // Obliczenie liczby cyfr (np. przy pomocy konwersji na String)
        int countDigits = String.valueOf(originalNumber).length();

        int temp = originalNumber; // kopia do modyfikacji
        int sumOfPowers = 0;

        // Dla każdej cyfry obliczamy jej wartość podniesioną do potęgi countDigits
        while (temp > 0) {
            int digit = temp % 10;
            sumOfPowers += Math.pow(digit, countDigits);
            temp /= 10;
        }

        // Sprawdzamy, czy liczba spełnia warunek Armstronga
        if (sumOfPowers == originalNumber) {
            System.out.println(originalNumber + " jest liczbą Armstronga.");
        } else {
            System.out.println(originalNumber + " nie jest liczbą Armstronga.");
        }

        scanner.close();
    }
}
//65. Napisz program, który sprawdza, czy numer jest poprawnym numerem ISBN-10.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj numer ISBN-10: ");
        String isbn = scanner.nextLine();

        // Usuwamy myślniki i spacje, aby uzyskać ciąg 10 znaków
        isbn = isbn.replace("-", "").replace(" ", "");

        // Sprawdzamy, czy długość wynosi dokładnie 10
        if (isbn.length() != 10) {
            System.out.println("Niepoprawny numer ISBN-10: liczba znaków musi wynosić 10.");
            scanner.close();
            return;
        }

        int sum = 0; // suma ważona
        // Przetwarzamy kolejne znaki ISBN
        for (int i = 0; i < 10; i++) {
            char c = isbn.charAt(i);
            int value;

            // Dla ostatniego znaku dozwolony jest znak 'X' lub 'x' (oznacza wartość 10)
            if (i == 9 && (c == 'X' || c == 'x')) {
                value = 10;
            } else if (Character.isDigit(c)) {
                value = c - '0';
            } else {
                System.out.println("Niepoprawny numer ISBN-10: znak '" + c + "' w pozycji " + (i + 1) + " jest nieprawidłowy.");
                scanner.close();
                return;
            }
            // Mnożymy wartość cyfry przez wagę (od 10 dla pierwszej pozycji do 1 dla ostatniej)
            sum += (10 - i) * value;
        }

        // Numer ISBN-10 jest poprawny, jeśli suma ważona jest podzielna przez 11
        if (sum % 11 == 0) {
            System.out.println("Podany numer ISBN-10 jest poprawny.");
        } else {
            System.out.println("Podany numer ISBN-10 jest niepoprawny.");
        }

        scanner.close();
    }
}
//66. Napisz program, który sprawdza, czy numer jest poprawnym numerem ISBN-13.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj numer ISBN-13: ");
        String isbn = scanner.nextLine();

        // Usuwamy myślniki i spacje, aby uzyskać ciąg 13 cyfr
        isbn = isbn.replace("-", "").replace(" ", "");

        // Sprawdzamy, czy ciąg ma dokładnie 13 znaków
        if (isbn.length() != 13) {
            System.out.println("Niepoprawny numer ISBN-13: ciąg musi zawierać 13 cyfr po usunięciu separatorów.");
            scanner.close();
            return;
        }

        // Upewniamy się, że ciąg składa się wyłącznie z cyfr
        for (int i = 0; i < isbn.length(); i++) {
            if (!Character.isDigit(isbn.charAt(i))) {
                System.out.println("Niepoprawny numer ISBN-13: zawiera niedozwolone znaki.");
                scanner.close();
                return;
            }
        }

        int sum = 0;
        // Obliczamy sumę ważoną dla pierwszych 12 cyfr
        for (int i = 0; i < 12; i++) {
            int digit = isbn.charAt(i) - '0';
            // Dla parzystych indeksów (0, 2, 4, ...) waga = 1, dla nieparzystych = 3
            if (i % 2 == 0) {
                sum += digit;
            } else {
                sum += digit * 3;
            }
        }

        int remainder = sum % 10;
        int checkDigit = (remainder == 0) ? 0 : (10 - remainder);

        // Pobieramy trzynastą cyfrę (cyfrę kontrolną) z wprowadzonego numeru
        int givenCheckDigit = isbn.charAt(12) - '0';

        // Sprawdzamy, czy obliczona cyfra kontrolna zgadza się z podaną
        if (checkDigit == givenCheckDigit) {
            System.out.println("Podany numer ISBN-13 jest poprawny.");
        } else {
            System.out.println("Podany numer ISBN-13 jest niepoprawny.");
        }

        scanner.close();
    }
}
//67. Napisz program, który sprawdza, czy liczba jest liczbą proniczną.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int n = scanner.nextInt();

        boolean isPronic = false;

        // Iterujemy po k zaczynając od 0 aż do momentu, gdy k*(k+1) przekroczy n.
        for (int k = 0; k * (k + 1) <= n; k++) {
            if (k * (k + 1) == n) {
                isPronic = true;
                break;
            }
        }

        if (isPronic) {
            System.out.println(n + " jest liczbą proniczną.");
        } else {
            System.out.println(n + " nie jest liczbą proniczną.");
        }

        scanner.close();
    }
}
//68. Napisz program, który sprawdza, czy liczba jest liczbą twardą.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int number = scanner.nextInt();
        int originalNumber = number; // zapamiętujemy oryginalną wartość

        int sumOfFactorials = 0;

        // Przetwarzamy każdą cyfrę liczby
        // (zakładamy, że liczba jest nieujemna)
        while (number > 0) {
            int digit = number % 10;        // pobieramy ostatnią cyfrę
            sumOfFactorials += factorial(digit); // dodajemy silnię tej cyfry
            number /= 10;                   // usuwamy ostatnią cyfrę
        }

        // Sprawdzamy, czy liczba jest "twarda" (czyli równa sumie silni swoich cyfr)
        if (sumOfFactorials == originalNumber) {
            System.out.println(originalNumber + " jest liczbą twardą.");
        } else {
            System.out.println(originalNumber + " nie jest liczbą twardą.");
        }

        scanner.close();
    }

    // Metoda pomocnicza obliczająca silnię liczby n
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
//69. Napisz program, który sprawdza, czy liczba jest deficytowa.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę naturalną: ");
        int n = scanner.nextInt();

        // Sprawdzamy, czy liczba jest dodatnia
        if (n < 1) {
            System.out.println("Podaj liczbę naturalną dodatnią.");
            scanner.close();
            return;
        }

        int sumaDzielnikow = 0;
        // Dzielniki właściwe liczby n to liczby od 1 do n/2 (n sam nie jest wliczany)
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sumaDzielnikow += i;
            }
        }

        if (sumaDzielnikow < n) {
            System.out.println("Liczba " + n + " jest deficytowa.");
        } else {
            System.out.println("Liczba " + n + " nie jest deficytowa.");
        }

        scanner.close();
    }
}
//70. Napisz program, który podaje liczbę dni w miesiącu.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj numer miesiąca (1-12): ");
        int month = scanner.nextInt();

        // Sprawdzamy poprawność wprowadzonego numeru miesiąca
        if (month < 1 || month > 12) {
            System.out.println("Niepoprawny numer miesiąca! Podaj liczbę od 1 do 12.");
        } else {
            // Tablica zawiera liczbę dni w kolejnych miesiącach (luty = 28 dni)
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            // Wyświetlamy liczbę dni dla podanego miesiąca
            System.out.println("Liczba dni w miesiącu " + month + " wynosi: " + daysInMonth[month - 1]);
        }

        scanner.close();
    }
}

-Napisz program, który pozwala wprowadzić 5 liczb z klawiatury i znaleźć ich sumę i średnią.

import java.util.Scanner;
public class Main 
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ile liczb chcesz dodać?");
    int numberOfNumbers = scanner.nextInt(); 
    double sum = 0; 
    for (int i = 0; i < numberOfNumbers; i++)
      { 
      System.out.println("Podaj liczbę " + (i + 1) + ":");
      double number = scanner.nextDouble(); 
      sum += number; 
    }
    System.out.println("Suma wynosi: " + sum);
    System.out.println("Średnia wynosi: " + (sum / numberOfNumbers));
    scanner.close();
  }
}
////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
public class Main 
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("podaj wartość");
    double a = scanner.nextDouble(); 
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    double d = scanner.nextDouble();
    double e = scanner.nextDouble();
    double suma = (a+b+c+d+e);
     System.out.println("Suma wynosi: " + suma  );
     System.out.println("Średnia wynosi;"+ (suma/5));
    scanner.close(); 
  }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-Napisz program, który wyświetla liczy pierwsze z 500 liczb naturalnych.

public class Main 
{
    public static void main(String[] args) 
    {
        int limit = 500; 
        System.out.println("Liczby pierwsze z pierwszych 500 liczb naturalnych:");

        for (int i = 2; i <= limit; i++) 
        {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }


    public static boolean isPrime(int num)
    {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-Napisz program, który sprawdzi, czy liczba jest dodatnia czy ujemna.

import java.util.Scanner;
public class Main 
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("podaj wartość");
    double a = scanner.nextDouble(); 
    if( a>0)
    {
      System.out.println("wartość dodatnai" + a);
    }
    else if(a<0)
    {
      System.out.println("wartość ujemna" + a);
    }
    scanner.close(); 
  }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-Napisz program, który pobierze od użytkownika trzy liczby i wypisze największą z nich.

import java.util.Scanner;
public class Main 
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj wartość");
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    if(a>=c && a>=b)
    {
      System.out.println("Największa liczba to: " + a );
    }
    else if(b>=c && b>a)
    {
      System.out.println("Największa liczba to: " + b );
    }
    else 
    {
      System.out.println("Największa liczba to: " + c); 
    }
    scanner.close(); 
  }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-Napisz program, który składa się z dwóch funkcji obliczach silnię liczby podanej jako argument: w sposób iteracyjny i rekurencyjny.



import java.util.Scanner;

public class Silnia {


    public static long silniaIteracyjnie(int n) {
        long wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }


    public static long silniaRekurencyjnie(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * silniaRekurencyjnie(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Wpisz liczbę:");
        int liczba = scanner.nextInt();


        long wynikIteracyjny = silniaIteracyjnie(liczba);
        System.out.println("Silnia liczby " + liczba + " (iteracyjnie) to: " + wynikIteracyjny);


        long wynikRekurencyjny = silniaRekurencyjnie(liczba);
        System.out.println("Silnia liczby " + liczba + " (rekurencyjnie) to: " + wynikRekurencyjny);


        scanner.close();
    }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-Napisz program, który znajduje Największą Wspólną Wielokrotność dwóch liczb.

public class Main 
{

//eukalidesa na nwd
    public static int nwd(int a, int b)
    {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    public static int nww(int a, int b) 
    {
        return Math.abs(a * b) / nwd(a, b);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj pierwszą liczbę: ");
        int liczba1 = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int liczba2 = scanner.nextInt();


        int wynik = nww(liczba1, liczba2);
        System.out.println("Największa Wspólna Wielokrotność (NWW) " + 
          liczba1 + " i " + liczba2 + " wynosi: " + wynik);

        scanner.close();
    }
}    
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-Napisz program, który przelicza prędkość z m/s na km/h.

import java.util.Scanner;
public class Main {
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Kalulator prędkości   ");
    System.out.println("Przelicz z m/s na km/h");
    System.out.println("Przelicz z km/h na m/s");
    System.out.println("Wybierz opcje: ");
    int wybór = scanner.nextInt();
    switch (wybór) 
    {
      case 1:
        System.out.println("Podaj wartość w m/s");
        double x = scanner.nextDouble();
        double waga = 3.6;
        double a = x * waga;

        System.out.println("Prędkość wynosi: " + a + "km/h");
        break;
      case 2:
       System.out.println("Podaj wartość w km/h:");
        double y = scanner.nextDouble();   
        double kurss= 3.6;
        double b= y/kurss;
        System.out.println(" Prędkość wynosi: " + b + "m/s");
        break;

    }
    if(wybór >= 3)
      {
        System.out.println("Patrz co klikasz");
      }
     scanner.close();
  }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

-Napisz program, który będzie kalkulatorem walut z PLN na EUR i odwrotnie.

import java.util.Scanner;
public class Main {
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Kantor  ");
    System.out.println("1.Euro na złoty ");
    System.out.println("2.Złoty na euro ");
    System.out.println("Wybierz opcje: ");
    int wybór = scanner.nextInt();
    switch (wybór) 
    {
      case 1:
        System.out.println("Podaj kwotę:");
        double x = scanner.nextDouble();
        double kurs = 4.5;
        double a = x * kurs;
        System.out.println(" Twoja kwota: " + (x) + "Eur na złotówki wynosi" + a + "zł");
        break;
      case 2:
       System.out.println("Podaj kwotę:");
        double y = scanner.nextDouble();   
        double kurss= 4.6;
        double b= y/kurss;
        System.out.println(" Twoja kwota: " + (y) + "Złoty na euro wynosi: " + b + "Eur");
        break;

    }
    if(wybór >= 3)
      {
        System.out.println("Patrz co klikasz");
      }
  }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-Napisz program, który sprawdza czy dane słowo jest palindromem

import java.util.Scanner;

public class Main 
{

    // Metoda sprawdzająca, czy słowo jest palindromem
    public static boolean czyPalindrom(String slowo)
 {
        int dlugosc = slowo.length();
        for (int i = 0; i < dlugosc / 2; i++) {
            if (slowo.charAt(i) != slowo.charAt(dlugosc - 1 - i)) 
{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

        // Pobieranie słowa od użytkownika
        System.out.print("Podaj słowo: ");
        String slowo = scanner.nextLine();

        // Sprawdzanie, czy słowo jest palindromem
        if (czyPalindrom(slowo)) {
            System.out.println("Słowo " + slowo + " jest palindromem.");
        } else {
            System.out.println("Słowo " + slowo + " nie jest palindromem.");
        }

        scanner.close();
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
--Napisz program, który liczy obecny wiek osoby na podstawie jej daty urodzenia

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Main {
  public static void main(String[] args) 
  {
   Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj dzień urodzenia: ");
    int dzien = scanner.nextInt();
    System.out.println("Podaj miesiąc urodzenia: ");
    int miesiac = scanner.nextInt();
    System.out.println("Podaj rok urodzenia: ");
     int rok = scanner.nextInt();
     LocalDate dataUrodzenia = LocalDate.of(rok, miesiac, dzien);
     LocalDate dzisiaj = LocalDate.now();
     Period wiek = Period.between(dataUrodzenia, dzisiaj);
     System.out.println("Twój wiek to: " + wiek.getYears() + " lat");
     scanner.close();
  }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Main
 {
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj");
        System.out.println("Podaj dzisiejszą datę w formacie dd-mm-yyyy:");

        int dzisiaj_dzien = scanner.nextInt();
        int dzisiaj_miesiac = scanner.nextInt();
        int dzisiaj_rok = scanner.nextInt();

        System.out.println("Podaj datę urodzenia w formacie dd-mm-yyyy:");

        int urodzenie_dzien = scanner.nextInt();
        int urodzenie_miesiac = scanner.nextInt();
        int urodzenie_rok = scanner.nextInt();

        int wiek = dzisiaj_rok - urodzenie_rok;

        if (urodzenie_miesiac > dzisiaj_miesiac || (urodzenie_miesiac == dzisiaj_miesiac && urodzenie_dzien > dzisiaj_dzien)) {
            wiek--;
        }

        System.out.println("Twój wiek to: " + wiek + " lat.");
    }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-Napisz program, który wylosuje dowolną liczbę całkowitą od 0 do 100, a następnie prosi użytkownika o jej zgadnięcie tak długo, aż ten poda poprawną wartość. 

import java.util.Random;
import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int wylosowanaLiczba = random.nextInt(101); 
        System.out.println("Zgadnij liczbę od 0 do 100:");
        int zgadywanaLiczba = -1;

        do 
        {
            System.out.print("Podaj swoją liczbę: ");
            zgadywanaLiczba = scanner.nextInt();

            if (zgadywanaLiczba < wylosowanaLiczba)
            {
                System.out.println("Podana liczba jest za mała.");
            } else if (zgadywanaLiczba > wylosowanaLiczba) {
                System.out.println("Podana liczba jest za duża.");
            } else
            {
                System.out.println("Gratulacje! Zgadłeś liczbę.");
            }
        } while (zgadywanaLiczba != wylosowanaLiczba);

        scanner.close();
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
--Napisz program, który losuje liczbę oczek (od 1 do 6) dla dwóch kostek i porównuje wynik. Ta sama liczba czek oznacza wygraną.

import java.util.Random;

public class Main
    {
    public static void main(String[] args) 
    {
        Random random = new Random();
        int kostka1 = random.nextInt(6) + 1;
        int kostka2 = random.nextInt(6) + 1; 

        System.out.println("Wynik rzutu pierwszą kostką: " + kostka1);
        System.out.println("Wynik rzutu drugą kostką: " + kostka2);
        if (kostka1 == kostka2) 
        {
            System.out.println("Wygrana! Obie kostki mają taką samą liczbę oczek.");
        } else
        {
            System.out.println("Przegrana. Kostki mają różne liczby oczek.");
        }
    }
 }
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
--Napisz program, który wypisze długość danego łańcucha.

mport java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj łańcuch znaków: ");
        String lancuch = scanner.nextLine();


        int dlugosc = lancuch.length();
        System.out.println("Długość podanego łańcucha: " + dlugosc);

        scanner.close();
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
--Napisz program, który sprawdza, czy równanie jest równaniem liniowym.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie równania od użytkownika
        System.out.print("Podaj równanie w postaci 'ax + b = c': ");
        String rownanie = scanner.nextLine();

        // Usunięcie białych znaków z równania
        rownanie = rownanie.replaceAll("\\s", "");

        // Sprawdzanie, czy równanie jest liniowe
        boolean czyLiniowe = czyRownanieLiniowe(rownanie);

        // Wyświetlanie wyniku
        if (czyLiniowe) {
            System.out.println("Podane równanie jest równaniem liniowym.");
        } else {
            System.out.println("Podane równanie nie jest równaniem liniowym.");
        }

        scanner.close();
    }

       public static boolean czyRownanieLiniowe(String rownanie)
 {
                if (!rownanie.contains("x")) 
{
            return false;
        }

              String[] strony = rownanie.split("=");


        if (strony.length != 2 || strony[0].indexOf('x') == -1 || strony[1].indexOf('x') == -1) {
            return false;
        }

               String[] lewaStrona = strony[0].split("x");

                try {
            Double.parseDouble(lewaStrona[0]);
        } catch (NumberFormatException e) 
{
            return false;
        }

               try 
{
            Double.parseDouble(lewaStrona[1]);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który znajduje pierwiastki równania kwadratowego.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj współczynniki równania kwadratowego ax^2 + bx + c = 0:");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();


        double delta = b * b - 4 * a * c;


        if (delta > 0) {
            double pierwiastekDelta = Math.sqrt(delta);
            double x1 = (-b + pierwiastekDelta) / (2 * a);
            double x2 = (-b - pierwiastekDelta) / (2 * a);
            System.out.println("Równanie ma dwa pierwiastki rzeczywiste:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Równanie ma jeden podwójny pierwiastek rzeczywisty:");
            System.out.println("x = " + x);
        } else {
            System.out.println("Równanie nie ma pierwiastków rzeczywistych.");
        }

        scanner.close();
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który zliczania liczbę słów w ciągu znaków.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj ciąg znaków: ");
        String ciag = scanner.nextLine();


        int liczbaSlow = zliczLiczbeSlow(ciag);


        System.out.println("Liczba słów w podanym ciągu: " + liczbaSlow);

        scanner.close();
    }


    public static int zliczLiczbeSlow(String ciag) {
        if (ciag == null || ciag.isEmpty()) {
            return 0;
        }
        String[] slowa = ciag.trim().split("\\s+");

        return slowa.length;
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-Napisz program, który na podstawie daty stwierdza czy jest to rok przestępny czy nie.

import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) 
  {
    System.out.println("Podaj rok: ");
    Scanner scanner = new Scanner(System.in);
    int rok = scanner.nextInt();
    if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0))
    {
      System.out.println("rok jest przestępny");
    } else 
    {
      System.out.println("rok nie jest przestępny");
    }



  }
} 
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który do określania płci osoby na podstawie jej peselu.

import java.util.Scanner;

public class Main 
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj PSEL:");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int d = scanner.nextInt();
    int e = scanner.nextInt();
    int f = scanner.nextInt();
    int g = scanner.nextInt();
    int h = scanner.nextInt();
    int y = scanner.nextInt();
    int szukana = scanner.nextInt();
    int z = scanner.nextInt();

     if( szukana % 2 == 0)
     {
       System.out.println("Kobieta:");
     } else if(szukana % 2 != 0)
     {
       System.out.println("mężczyzna:");
       scanner.close();
     } 
  }

}
------------------------------------------------------------------
import java.util.Scanner;

public class Main
    {


    public static String okreslPlec(String pesel)
    {

        if (pesel.length() != 11) {
            return "Nieprawidłowy numer PESEL.";
        }


        char znakPlec = pesel.charAt(9);


        int cyfraPlec = Character.getNumericValue(znakPlec);


        if (cyfraPlec % 2 == 0) 
        {
            return "Płeć: Kobieta";
        } else {
            return "Płeć: Mężczyzna";
        }
    }

    public static void main(String[] args)
        {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj numer PESEL: ");
        String pesel = scanner.nextLine();


        String plec = okreslPlec(pesel);
        System.out.println(plec);

        scanner.close();
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który zlicza sumę elementów macierzy.
import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj liczbę wierszy macierzy: ");
        int wiersze = scanner.nextInt();

        System.out.print("Podaj liczbę kolumn macierzy: ");
        int kolumny = scanner.nextInt();


        int[][] macierz = new int[wiersze][kolumny];


        System.out.println("Podaj elementy macierzy:");

        for (int i = 0; i < wiersze; i++) 
        {
            for (int j = 0; j < kolumny; j++) 
            {
                System.out.print("Podaj element [" + i + "][" + j + "]: ");
                macierz[i][j] = scanner.nextInt();
            }
        }

        int suma = 0;
        for (int i = 0; i < wiersze; i++)
            {
            for (int j = 0; j < kolumny; j++) 
            {
                suma += macierz[i][j];
            }
        }

        System.out.println("Suma elementów macierzy: " + suma);

        scanner.close();
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który zlicza całkowitą liczbę znaków interpunkcyjnych w danym ciągu.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj ciąg znaków: ");
        String ciag = scanner.nextLine();


        int liczbaZnakowInterpunkcyjnych = 0;
        for (int i = 0; i < ciag.length(); i++) {
            char znak = ciag.charAt(i);
            if (Character.isLetterOrDigit(znak)) {
                continue; 
            }

            if (znak == '!' || znak == '"' || znak == '#') {
                liczbaZnakowInterpunkcyjnych++;
            }
        }


        System.out.println("Liczba znaków interpunkcyjnych w podanym ciągu: " + liczbaZnakowInterpunkcyjnych);

        scanner.close();
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który pozwala znaleźć najmniejszą liczbę spośród trzech liczb.

import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        int liczba1 = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int liczba2 = scanner.nextInt();

        System.out.print("Podaj trzecią liczbę: ");
        int liczba3 = scanner.nextInt();


        int najmniejsza = liczba1;

        if (liczba2 < najmniejsza) {
            najmniejsza = liczba2;
        }

        if (liczba3 < najmniejsza) {
            najmniejsza = liczba3;
        }


        System.out.println("Najmniejsza liczba spośród podanych to: " + najmniejsza);

        scanner.close();
    }
}
-------------------------------------------------------Napisz program, który zliczania liczbę słów w ciągu znaków.

import java.util.Scanner;

public class Main
    {

    public static void main(String[] args) 
        {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ciąg znaków: ");
        String ciag = scanner.nextLine();
        int liczbaSlow = zliczLiczbeSlow(ciag);
        System.out.println("Liczba słów w podanym ciągu: " + liczbaSlow);

        scanner.close();
    }
    public static int zliczLiczbeSlow(String ciag) 
        {
        if (ciag == null || ciag.isEmpty())
        {
            return 0;
        }
        String[] slowa = ciag.trim().split("\\s+");

        return slowa.length;
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który obliczy sumę cyfr w liczbie całkowitej.

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();

        int suma = 0;
        liczba = Math.abs(liczba);

        while (liczba != 0) 
        {
            suma += liczba % 10;
            liczba /= 10;
        }

        System.out.println("Suma cyfr w podanej liczbie: " + suma);

        scanner.close();
    }
}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program w java który zamieni podane dwa elementy w tablicy znakowej.

import java.util.Arrays;

public class Main 
{
    public static void main(String[] args)
    {
        char[] tablica = {'a', 'b', 'c', 'd', 'e'};
        int indeks1 = 1;
        int indeks2 = 3;
        System.out.println("Tablica przed zamianą: " + Arrays.toString(tablica));
        zamienElementy(tablica, indeks1, indeks2);
        System.out.println("Tablica po zamianie: " + Arrays.toString(tablica));
    }
    public static void zamienElementy(char[] tablica, int indeks1, int indeks2) {
        if (indeks1 < 0 || indeks1 >= tablica.length || indeks2 < 0 || indeks2 >= tablica.length) {
            System.out.println("Błąd: Podane indeksy są poza zakresem tablicy.");
            return;
        }

        char temp = tablica[indeks1];
        tablica[indeks1] = tablica[indeks2];
        tablica[indeks2] = temp;
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Napisz program, który kopiuje wszystkie elementy jednej tablicy do drugiej.

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Pierwsza tablica
        int[] tablica1 = {1, 2, 3, 4, 5};

        // Tworzenie drugiej tablicy o tej samej wielkości co pierwsza
        int[] tablica2 = new int[tablica1.length];

        // Kopiowanie elementów z pierwszej do drugiej tablicy
        for (int i = 0; i < tablica1.length; i++) {
            tablica2[i] = tablica1[i];
        }

        // Wyświetlanie obu tablic
        System.out.println("Pierwsza tablica: " + Arrays.toString(tablica1));
        System.out.println("Druga tablica: " + Arrays.toString(tablica2));
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  //Napisz program, który posortuje tablicę liczb całkowitych w porządku rosnącym

    import java.util.Arrays;

    public class Main {

        public static void main(String[] args) {

            int[] tablica = {5, 3, 8, 4, 2, 7, 1, 6};


            System.out.println("Oryginalna tablica: " + Arrays.toString(tablica));


            sortujTablice(tablica);


            System.out.println("Tablica po sortowaniu: " + Arrays.toString(tablica));
        }


        public static void sortujTablice(int[] tablica) {
            Arrays.sort(tablica);
        }
    }
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // -Napisz program, który posortuje tablicę liczb całkowitych w porządku malejącym

    import java.util.Arrays;

    public class Main {

        public static void main(String[] args) {

            int[] tablica = {5, 3, 8, 4, 2, 7, 1, 6};


            System.out.println("Oryginalna tablica: " + Arrays.toString(tablica));


            sortujTabliceMalejaco(tablica);


            System.out.println("Tablica po sortowaniu malejącym: " + Arrays.toString(tablica));
        }


        public static void sortujTabliceMalejaco(int[] tablica) {
            int n = tablica.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (tablica[j] < tablica[j + 1]) {

                        int temp = tablica[j];
                        tablica[j] = tablica[j + 1];
                        tablica[j + 1] = temp;
                    }
                }
            }
        }
    }

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Zadanie 2.1: Hello World
        System.out.println("Hello World!!!");

        // Zadanie 2.2: Wypisywanie liczby
        int number = 42;
        System.out.println("Wartość zmiennej: " + number);

        // Zadanie 2.3: Suma
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        double a = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę:");
        double b = scanner.nextDouble();
        double sum = a + b;
        System.out.println("Suma: " + sum);

        // Zadanie 2.4: Kalkulator
        System.out.println("Wybierz operację: 1 - suma, 2 - różnica, 3 - iloczyn, 4 - iloraz");
        int operation = scanner.nextInt();
        System.out.println("Podaj pierwszą liczbę:");
        double x = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę:");
        double y = scanner.nextDouble();
        double result = 0;
        switch (operation) {
            case 1:
                result = x + y;
                break;
            case 2:
                result = x - y;
                break;
            case 3:
                result = x * y;
                break;
            case 4:
                if (y != 0)
                    result = x / y;
                else
                    System.out.println("Nie można dzielić przez zero!");
                break;
            default:
                System.out.println("Niepoprawny wybór operacji.");
        }
        if (operation >= 1 && operation <= 4) {
            System.out.println("Wynik: " + result);
        }

        // Zadanie 2.5: Liczby parzyste
        System.out.println("Liczby parzyste do 100:");
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }

        // Zadanie 2.6: Test liczby pierwszej
        System.out.println("Podaj liczbę do sprawdzenia czy jest liczbą pierwszą:");
        int numToCheck = scanner.nextInt();
        boolean isPrime = true;
        if (numToCheck <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numToCheck); i++) {
                if (numToCheck % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime)
            System.out.println(numToCheck + " jest liczbą pierwszą.");
        else
            System.out.println(numToCheck + " nie jest liczbą pierwszą.");
    }
}
****************8SZYBKIE INFO************
Pan Tomasz Rak na zaliczeniu daje do napisania program, każydy wybiera jaką ocene chce dostać i wybiera numerk (Na naszym roku tematy programów były podane na e-elerningu i takie bez zmian były na zaliczeniu). W trakcie zaliczenia można korzytsać z interentu bez problemów byle by jawnie na jego oczach nie kopiować z CHATU AI XD.Żeby nie zdać trzeba być *DEBILEM*.

    Przykładowe programy
             |
             |
            \_/      

-Napisz program, który pozwala wprowadzić 5 liczb z klawiatury i znaleźć ich sumę i średnią.

import java.util.Scanner;
public class Main 
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ile liczb chcesz dodać?");
    int numberOfNumbers = scanner.nextInt(); 
    double sum = 0; 
    for (int i = 0; i < numberOfNumbers; i++)
      { 
      System.out.println("Podaj liczbę " + (i + 1) + ":");
      double number = scanner.nextDouble(); 
      sum += number; 
    }
    System.out.println("Suma wynosi: " + sum);
    System.out.println("Średnia wynosi: " + (sum / numberOfNumbers));
    scanner.close();
  }
}
////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
public class Main 
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("podaj wartość");
    double a = scanner.nextDouble(); 
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    double d = scanner.nextDouble();
    double e = scanner.nextDouble();
    double suma = (a+b+c+d+e);
     System.out.println("Suma wynosi: " + suma  );
     System.out.println("Średnia wynosi;"+ (suma/5));
    scanner.close(); 
  }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-Napisz program, który wyświetla liczy pierwsze z 500 liczb naturalnych.

public class Main 
{
    public static void main(String[] args) 
    {
        int limit = 500; 
        System.out.println("Liczby pierwsze z pierwszych 500 liczb naturalnych:");

        for (int i = 2; i <= limit; i++) 
        {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }


    public static boolean isPrime(int num)
    {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-Napisz program, który sprawdzi, czy liczba jest dodatnia czy ujemna.

import java.util.Scanner;
public class Main 
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("podaj wartość");
    double a = scanner.nextDouble(); 
    if( a>0)
    {
      System.out.println("wartość dodatnai" + a);
    }
    else if(a<0)
    {
      System.out.println("wartość ujemna" + a);
    }
    scanner.close(); 
  }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-Napisz program, który pobierze od użytkownika trzy liczby i wypisze największą z nich.

import java.util.Scanner;
public class Main 
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj wartość");
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    if(a>=c && a>=b)
    {
      System.out.println("Największa liczba to: " + a );
    }
    else if(b>=c && b>a)
    {
      System.out.println("Największa liczba to: " + b );
    }
    else 
    {
      System.out.println("Największa liczba to: " + c); 
    }
    scanner.close(); 
  }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-Napisz program, który składa się z dwóch funkcji obliczach silnię liczby podanej jako argument: w sposób iteracyjny i rekurencyjny.



import java.util.Scanner;

public class Silnia {


    public static long silniaIteracyjnie(int n) {
        long wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }


    public static long silniaRekurencyjnie(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * silniaRekurencyjnie(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Wpisz liczbę:");
        int liczba = scanner.nextInt();


        long wynikIteracyjny = silniaIteracyjnie(liczba);
        System.out.println("Silnia liczby " + liczba + " (iteracyjnie) to: " + wynikIteracyjny);


        long wynikRekurencyjny = silniaRekurencyjnie(liczba);
        System.out.println("Silnia liczby " + liczba + " (rekurencyjnie) to: " + wynikRekurencyjny);


        scanner.close();
    }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-Napisz program, który znajduje Największą Wspólną Wielokrotność dwóch liczb.

public class Main 
{

//eukalidesa na nwd
    public static int nwd(int a, int b)
    {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    public static int nww(int a, int b) 
    {
        return Math.abs(a * b) / nwd(a, b);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj pierwszą liczbę: ");
        int liczba1 = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int liczba2 = scanner.nextInt();


        int wynik = nww(liczba1, liczba2);
        System.out.println("Największa Wspólna Wielokrotność (NWW) " + 
          liczba1 + " i " + liczba2 + " wynosi: " + wynik);

        scanner.close();
    }
}    
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-Napisz program, który przelicza prędkość z m/s na km/h.

import java.util.Scanner;
public class Main {
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Kalulator prędkości   ");
    System.out.println("Przelicz z m/s na km/h");
    System.out.println("Przelicz z km/h na m/s");
    System.out.println("Wybierz opcje: ");
    int wybór = scanner.nextInt();
    switch (wybór) 
    {
      case 1:
        System.out.println("Podaj wartość w m/s");
        double x = scanner.nextDouble();
        double waga = 3.6;
        double a = x * waga;

        System.out.println("Prędkość wynosi: " + a + "km/h");
        break;
      case 2:
       System.out.println("Podaj wartość w km/h:");
        double y = scanner.nextDouble();   
        double kurss= 3.6;
        double b= y/kurss;
        System.out.println(" Prędkość wynosi: " + b + "m/s");
        break;

    }
    if(wybór >= 3)
      {
        System.out.println("Patrz co klikasz");
      }
     scanner.close();
  }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

-Napisz program, który będzie kalkulatorem walut z PLN na EUR i odwrotnie.

import java.util.Scanner;
public class Main {
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Kantor  ");
    System.out.println("1.Euro na złoty ");
    System.out.println("2.Złoty na euro ");
    System.out.println("Wybierz opcje: ");
    int wybór = scanner.nextInt();
    switch (wybór) 
    {
      case 1:
        System.out.println("Podaj kwotę:");
        double x = scanner.nextDouble();
        double kurs = 4.5;
        double a = x * kurs;
        System.out.println(" Twoja kwota: " + (x) + "Eur na złotówki wynosi" + a + "zł");
        break;
      case 2:
       System.out.println("Podaj kwotę:");
        double y = scanner.nextDouble();   
        double kurss= 4.6;
        double b= y/kurss;
        System.out.println(" Twoja kwota: " + (y) + "Złoty na euro wynosi: " + b + "Eur");
        break;

    }
    if(wybór >= 3)
      {
        System.out.println("Patrz co klikasz");
      }
  }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-Napisz program, który sprawdza czy dane słowo jest palindromem

import java.util.Scanner;

public class Main 
{

    // Metoda sprawdzająca, czy słowo jest palindromem
    public static boolean czyPalindrom(String slowo)
 {
        int dlugosc = slowo.length();
        for (int i = 0; i < dlugosc / 2; i++) {
            if (slowo.charAt(i) != slowo.charAt(dlugosc - 1 - i)) 
{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

        // Pobieranie słowa od użytkownika
        System.out.print("Podaj słowo: ");
        String slowo = scanner.nextLine();

        // Sprawdzanie, czy słowo jest palindromem
        if (czyPalindrom(slowo)) {
            System.out.println("Słowo " + slowo + " jest palindromem.");
        } else {
            System.out.println("Słowo " + slowo + " nie jest palindromem.");
        }

        scanner.close();
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
--Napisz program, który liczy obecny wiek osoby na podstawie jej daty urodzenia

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Main {
  public static void main(String[] args) 
  {
   Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj dzień urodzenia: ");
    int dzien = scanner.nextInt();
    System.out.println("Podaj miesiąc urodzenia: ");
    int miesiac = scanner.nextInt();
    System.out.println("Podaj rok urodzenia: ");
     int rok = scanner.nextInt();
     LocalDate dataUrodzenia = LocalDate.of(rok, miesiac, dzien);
     LocalDate dzisiaj = LocalDate.now();
     Period wiek = Period.between(dataUrodzenia, dzisiaj);
     System.out.println("Twój wiek to: " + wiek.getYears() + " lat");
     scanner.close();
  }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Main
 {
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj");
        System.out.println("Podaj dzisiejszą datę w formacie dd-mm-yyyy:");

        int dzisiaj_dzien = scanner.nextInt();
        int dzisiaj_miesiac = scanner.nextInt();
        int dzisiaj_rok = scanner.nextInt();

        System.out.println("Podaj datę urodzenia w formacie dd-mm-yyyy:");

        int urodzenie_dzien = scanner.nextInt();
        int urodzenie_miesiac = scanner.nextInt();
        int urodzenie_rok = scanner.nextInt();

        int wiek = dzisiaj_rok - urodzenie_rok;

        if (urodzenie_miesiac > dzisiaj_miesiac || (urodzenie_miesiac == dzisiaj_miesiac && urodzenie_dzien > dzisiaj_dzien)) {
            wiek--;
        }

        System.out.println("Twój wiek to: " + wiek + " lat.");
    }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-Napisz program, który wylosuje dowolną liczbę całkowitą od 0 do 100, a następnie prosi użytkownika o jej zgadnięcie tak długo, aż ten poda poprawną wartość. 

import java.util.Random;
import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int wylosowanaLiczba = random.nextInt(101); 
        System.out.println("Zgadnij liczbę od 0 do 100:");
        int zgadywanaLiczba = -1;

        do 
        {
            System.out.print("Podaj swoją liczbę: ");
            zgadywanaLiczba = scanner.nextInt();

            if (zgadywanaLiczba < wylosowanaLiczba)
            {
                System.out.println("Podana liczba jest za mała.");
            } else if (zgadywanaLiczba > wylosowanaLiczba) {
                System.out.println("Podana liczba jest za duża.");
            } else
            {
                System.out.println("Gratulacje! Zgadłeś liczbę.");
            }
        } while (zgadywanaLiczba != wylosowanaLiczba);

        scanner.close();
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
--Napisz program, który losuje liczbę oczek (od 1 do 6) dla dwóch kostek i porównuje wynik. Ta sama liczba czek oznacza wygraną.

import java.util.Random;

public class Main
    {
    public static void main(String[] args) 
    {
        Random random = new Random();
        int kostka1 = random.nextInt(6) + 1;
        int kostka2 = random.nextInt(6) + 1; 

        System.out.println("Wynik rzutu pierwszą kostką: " + kostka1);
        System.out.println("Wynik rzutu drugą kostką: " + kostka2);
        if (kostka1 == kostka2) 
        {
            System.out.println("Wygrana! Obie kostki mają taką samą liczbę oczek.");
        } else
        {
            System.out.println("Przegrana. Kostki mają różne liczby oczek.");
        }
    }
 }
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
--Napisz program, który wypisze długość danego łańcucha.

mport java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj łańcuch znaków: ");
        String lancuch = scanner.nextLine();


        int dlugosc = lancuch.length();
        System.out.println("Długość podanego łańcucha: " + dlugosc);

        scanner.close();
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
--Napisz program, który sprawdza, czy równanie jest równaniem liniowym.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie równania od użytkownika
        System.out.print("Podaj równanie w postaci 'ax + b = c': ");
        String rownanie = scanner.nextLine();

        // Usunięcie białych znaków z równania
        rownanie = rownanie.replaceAll("\\s", "");

        // Sprawdzanie, czy równanie jest liniowe
        boolean czyLiniowe = czyRownanieLiniowe(rownanie);

        // Wyświetlanie wyniku
        if (czyLiniowe) {
            System.out.println("Podane równanie jest równaniem liniowym.");
        } else {
            System.out.println("Podane równanie nie jest równaniem liniowym.");
        }

        scanner.close();
    }

       public static boolean czyRownanieLiniowe(String rownanie)
 {
                if (!rownanie.contains("x")) 
{
            return false;
        }

              String[] strony = rownanie.split("=");


        if (strony.length != 2 || strony[0].indexOf('x') == -1 || strony[1].indexOf('x') == -1) {
            return false;
        }

               String[] lewaStrona = strony[0].split("x");

                try {
            Double.parseDouble(lewaStrona[0]);
        } catch (NumberFormatException e) 
{
            return false;
        }

               try 
{
            Double.parseDouble(lewaStrona[1]);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który znajduje pierwiastki równania kwadratowego.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj współczynniki równania kwadratowego ax^2 + bx + c = 0:");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();


        double delta = b * b - 4 * a * c;


        if (delta > 0) {
            double pierwiastekDelta = Math.sqrt(delta);
            double x1 = (-b + pierwiastekDelta) / (2 * a);
            double x2 = (-b - pierwiastekDelta) / (2 * a);
            System.out.println("Równanie ma dwa pierwiastki rzeczywiste:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Równanie ma jeden podwójny pierwiastek rzeczywisty:");
            System.out.println("x = " + x);
        } else {
            System.out.println("Równanie nie ma pierwiastków rzeczywistych.");
        }

        scanner.close();
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który zliczania liczbę słów w ciągu znaków.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj ciąg znaków: ");
        String ciag = scanner.nextLine();


        int liczbaSlow = zliczLiczbeSlow(ciag);


        System.out.println("Liczba słów w podanym ciągu: " + liczbaSlow);

        scanner.close();
    }


    public static int zliczLiczbeSlow(String ciag) {
        if (ciag == null || ciag.isEmpty()) {
            return 0;
        }
        String[] slowa = ciag.trim().split("\\s+");

        return slowa.length;
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-Napisz program, który na podstawie daty stwierdza czy jest to rok przestępny czy nie.

import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) 
  {
    System.out.println("Podaj rok: ");
    Scanner scanner = new Scanner(System.in);
    int rok = scanner.nextInt();
    if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0))
    {
      System.out.println("rok jest przestępny");
    } else 
    {
      System.out.println("rok nie jest przestępny");
    }



  }
} 
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który do określania płci osoby na podstawie jej peselu.

import java.util.Scanner;

public class Main 
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj PSEL:");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int d = scanner.nextInt();
    int e = scanner.nextInt();
    int f = scanner.nextInt();
    int g = scanner.nextInt();
    int h = scanner.nextInt();
    int y = scanner.nextInt();
    int szukana = scanner.nextInt();
    int z = scanner.nextInt();

     if( szukana % 2 == 0)
     {
       System.out.println("Kobieta:");
     } else if(szukana % 2 != 0)
     {
       System.out.println("mężczyzna:");
       scanner.close();
     } 
  }

}
------------------------------------------------------------------
import java.util.Scanner;

public class Main
    {


    public static String okreslPlec(String pesel)
    {

        if (pesel.length() != 11) {
            return "Nieprawidłowy numer PESEL.";
        }


        char znakPlec = pesel.charAt(9);


        int cyfraPlec = Character.getNumericValue(znakPlec);


        if (cyfraPlec % 2 == 0) 
        {
            return "Płeć: Kobieta";
        } else {
            return "Płeć: Mężczyzna";
        }
    }

    public static void main(String[] args)
        {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj numer PESEL: ");
        String pesel = scanner.nextLine();


        String plec = okreslPlec(pesel);
        System.out.println(plec);

        scanner.close();
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który zlicza sumę elementów macierzy.
import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj liczbę wierszy macierzy: ");
        int wiersze = scanner.nextInt();

        System.out.print("Podaj liczbę kolumn macierzy: ");
        int kolumny = scanner.nextInt();


        int[][] macierz = new int[wiersze][kolumny];


        System.out.println("Podaj elementy macierzy:");

        for (int i = 0; i < wiersze; i++) 
        {
            for (int j = 0; j < kolumny; j++) 
            {
                System.out.print("Podaj element [" + i + "][" + j + "]: ");
                macierz[i][j] = scanner.nextInt();
            }
        }

        int suma = 0;
        for (int i = 0; i < wiersze; i++)
            {
            for (int j = 0; j < kolumny; j++) 
            {
                suma += macierz[i][j];
            }
        }

        System.out.println("Suma elementów macierzy: " + suma);

        scanner.close();
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który zlicza całkowitą liczbę znaków interpunkcyjnych w danym ciągu.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj ciąg znaków: ");
        String ciag = scanner.nextLine();


        int liczbaZnakowInterpunkcyjnych = 0;
        for (int i = 0; i < ciag.length(); i++) {
            char znak = ciag.charAt(i);
            if (Character.isLetterOrDigit(znak)) {
                continue; 
            }

            if (znak == '!' || znak == '"' || znak == '#') {
                liczbaZnakowInterpunkcyjnych++;
            }
        }


        System.out.println("Liczba znaków interpunkcyjnych w podanym ciągu: " + liczbaZnakowInterpunkcyjnych);

        scanner.close();
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który pozwala znaleźć najmniejszą liczbę spośród trzech liczb.

import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        int liczba1 = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int liczba2 = scanner.nextInt();

        System.out.print("Podaj trzecią liczbę: ");
        int liczba3 = scanner.nextInt();


        int najmniejsza = liczba1;

        if (liczba2 < najmniejsza) {
            najmniejsza = liczba2;
        }

        if (liczba3 < najmniejsza) {
            najmniejsza = liczba3;
        }


        System.out.println("Najmniejsza liczba spośród podanych to: " + najmniejsza);

        scanner.close();
    }
}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który zliczania liczbę słów w ciągu znaków.

import java.util.Scanner;

public class Main
    {

    public static void main(String[] args) 
        {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ciąg znaków: ");
        String ciag = scanner.nextLine();
        int liczbaSlow = zliczLiczbeSlow(ciag);
        System.out.println("Liczba słów w podanym ciągu: " + liczbaSlow);

        scanner.close();
    }
    public static int zliczLiczbeSlow(String ciag) 
        {
        if (ciag == null || ciag.isEmpty())
        {
            return 0;
        }
        String[] slowa = ciag.trim().split("\\s+");

        return slowa.length;
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który obliczy sumę cyfr w liczbie całkowitej.

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();

        int suma = 0;
        liczba = Math.abs(liczba);

        while (liczba != 0) 
        {
            suma += liczba % 10;
            liczba /= 10;
        }

        System.out.println("Suma cyfr w podanej liczbie: " + suma);

        scanner.close();
    }
}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program w java który zamieni podane dwa elementy w tablicy znakowej.

import java.util.Arrays;

public class Main 
{
    public static void main(String[] args)
    {
        char[] tablica = {'a', 'b', 'c', 'd', 'e'};
        int indeks1 = 1;
        int indeks2 = 3;
        System.out.println("Tablica przed zamianą: " + Arrays.toString(tablica));
        zamienElementy(tablica, indeks1, indeks2);
        System.out.println("Tablica po zamianie: " + Arrays.toString(tablica));
    }
    public static void zamienElementy(char[] tablica, int indeks1, int indeks2) {
        if (indeks1 < 0 || indeks1 >= tablica.length || indeks2 < 0 || indeks2 >= tablica.length) {
            System.out.println("Błąd: Podane indeksy są poza zakresem tablicy.");
            return;
        }

        char temp = tablica[indeks1];
        tablica[indeks1] = tablica[indeks2];
        tablica[indeks2] = temp;
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Napisz program, który kopiuje wszystkie elementy jednej tablicy do drugiej.

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Pierwsza tablica
        int[] tablica1 = {1, 2, 3, 4, 5};

        // Tworzenie drugiej tablicy o tej samej wielkości co pierwsza
        int[] tablica2 = new int[tablica1.length];

        // Kopiowanie elementów z pierwszej do drugiej tablicy
        for (int i = 0; i < tablica1.length; i++) {
            tablica2[i] = tablica1[i];
        }

        // Wyświetlanie obu tablic
        System.out.println("Pierwsza tablica: " + Arrays.toString(tablica1));
        System.out.println("Druga tablica: " + Arrays.toString(tablica2));
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  //Napisz program, który posortuje tablicę liczb całkowitych w porządku rosnącym

    import java.util.Arrays;

    public class Main {

        public static void main(String[] args) {

            int[] tablica = {5, 3, 8, 4, 2, 7, 1, 6};


            System.out.println("Oryginalna tablica: " + Arrays.toString(tablica));


            sortujTablice(tablica);


            System.out.println("Tablica po sortowaniu: " + Arrays.toString(tablica));
        }


        public static void sortujTablice(int[] tablica) {
            Arrays.sort(tablica);
        }
    }
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // -Napisz program, który posortuje tablicę liczb całkowitych w porządku malejącym

    import java.util.Arrays;

    public class Main {

        public static void main(String[] args) {

            int[] tablica = {5, 3, 8, 4, 2, 7, 1, 6};


            System.out.println("Oryginalna tablica: " + Arrays.toString(tablica));


            sortujTabliceMalejaco(tablica);


            System.out.println("Tablica po sortowaniu malejącym: " + Arrays.toString(tablica));
        }


        public static void sortujTabliceMalejaco(int[] tablica) {
            int n = tablica.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (tablica[j] < tablica[j + 1]) {

                        int temp = tablica[j];
                        tablica[j] = tablica[j + 1];
                        tablica[j + 1] = temp;
                    }
                }
            }
        }
    }
//pasieka chuj.exe

//choinka
import java.util.Scanner;

public class Choinka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę wierszy (wysokość choinki): ");
        int wysokosc = scanner.nextInt();

        System.out.println("\nOto Twoja choinka:\n");

        for (int i = 1; i <= wysokosc; i++) {
            // Spacje
            for (int j = 1; j <= (wysokosc - i); j++) {
                System.out.print(" ");
            }
            // Gwiazdki
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Opcjonalny pień choinki
        if (wysokosc > 1) {
            for (int i = 1; i < wysokosc; i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        scanner.close();
    }
}

//polowa choinki w lewo sciete
import java.util.Scanner;

public class PolChoinki {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę wierszy (wysokość pół-choinki): ");
        int wysokosc = scanner.nextInt();

        System.out.println("\nOto Twoja pół-choinka:\n");

        for (int i = 1; i <= wysokosc; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
//polowa choinki w prawo sciete
import java.util.Scanner;

public class PolChoinkiOdbicie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę wierszy (wysokość pół-choinki): ");
        int wysokosc = scanner.nextInt();

        System.out.println("\nOto Twoja odbita pół-choinka:\n");

        for (int i = 1; i <= wysokosc; i++) {
            // Spacje z lewej
            for (int j = 1; j <= (wysokosc - i); j++) {
                System.out.print(" ");
            }
            // Gwiazdki
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}

// odwrocona choinka w prawo sciete
import java.util.Scanner;

public class OdwroconaPolChoinki {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę wierszy (wysokość pół-choinki): ");
        int wysokosc = scanner.nextInt();

        System.out.println("\nOto Twoja odwrócona pół-choinka z odbiciem:\n");

        for (int i = wysokosc; i >= 1; i--) {
            // Spacje z lewej
            for (int j = 1; j <= (wysokosc - i); j++) {
                System.out.print(" ");
            }
            // Gwiazdki
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
// odwrocona choinka w lewo sciete
import java.util.Scanner;

public class OdwroconaPolChoinkiLewa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę wierszy (wysokość pół-choinki): ");
        int wysokosc = scanner.nextInt();

        System.out.println("\nOto Twoja odwrócona pół-choinka w lewo:\n");

        for (int i = wysokosc; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
//Napisz program wypisujący wartość zmiennej zadeklarowanej w kodzie programu. W języku java

public class Main {
    public static void main(String[] args) {
        int liczba = 42; // Deklaracja i inicjalizacja zmiennej
        System.out.println("Wartość zmiennej to: " + liczba); // Wypisanie wartości
    }
}
//Napisz program, który pobierze od użytkownika dwie liczby (a, b), a następnie wyświetli sumę. 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Obiekt do odczytu danych

        System.out.print("Podaj pierwszą liczbę (a): ");
        int a = scanner.nextInt(); // Odczyt pierwszej liczby

        System.out.print("Podaj drugą liczbę (b): ");
        int b = scanner.nextInt(); // Odczyt drugiej liczby

        int suma = a + b; // Obliczenie sumy

        System.out.println("Suma liczb a + b = " + suma); // Wyświetlenie wyniku

        scanner.close(); // Zamknięcie skanera
    }
}
//Użytkownik najpierw wpisuje cyfrę: (1 – dla sumy, 2 – dla różnicy, 3 – dla iloczynu, 4 – dla ilorazu); następnie dwie liczby typu zmiennoprzecinkowego. Program ma wypisać wynik działania zależnie od tego co wybrał użytkownik. Należy dodać zabezpieczenie przed dzieleniem przez 0. 

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz operację:");
        System.out.println("1 – Suma");
        System.out.println("2 – Różnica");
        System.out.println("3 – Iloczyn");
        System.out.println("4 – Iloraz");
        System.out.print("Twój wybór: ");
        int wybor = scanner.nextInt();

        System.out.print("Podaj pierwszą liczbę: ");
        double a = scanner.nextDouble();

        System.out.print("Podaj drugą liczbę: ");
        double b = scanner.nextDouble();

        switch (wybor) {
            case 1:
                System.out.println("Wynik: " + (a + b));
                break;
            case 2:
                System.out.println("Wynik: " + (a - b));
                break;
            case 3:
                System.out.println("Wynik: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Wynik: " + (a / b));
                } else {
                    System.out.println("Błąd: Dzielenie przez zero!");
                }
                break;
            default:
                System.out.println("Nieprawidłowy wybór operacji.");
        }

        scanner.close();
    }
}

//Napisz program wyświetlający liczby parzyste w zakresie do 100. Użyj pętli for. 
public class ParzysteDo100 {
    public static void main(String[] args) {
        System.out.println("Liczby parzyste od 0 do 100:");

        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}
//Napisz program, który sprawdzi czy wprowadzona przez użytkownika liczba jest liczbą pierwszą. 
import java.util.Scanner;

public class CzyPierwsza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();

        if (liczba <= 1) {
            System.out.println("Liczba nie jest pierwsza.");
        } else {
            boolean pierwsza = true;

            for (int i = 2; i <= Math.sqrt(liczba); i++) {
                if (liczba % i == 0) {
                    pierwsza = false;
                    break;
                }
            }

            if (pierwsza) {
                System.out.println("Liczba jest pierwsza.");
            } else {
                System.out.println("Liczba nie jest pierwsza.");
            }
        }

        scanner.close();
    }
}

//Wyświetlić tabliczkę mnożenia
public class TabliczkaMnozenia {
    public static void main(String[] args) {
        System.out.println("Tabliczka mnożenia (1–10):");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
//Program liczący silnię.
import java.util.Scanner;

public class Silnia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą nieujemną: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Silnia nie jest zdefiniowana dla liczb ujemnych.");
        } else {
            long silnia = 1;
            for (int i = 2; i <= n; i++) {
                silnia *= i;
            }
            System.out.println("Silnia z " + n + " to: " + silnia);
        }

        scanner.close();
    }
}