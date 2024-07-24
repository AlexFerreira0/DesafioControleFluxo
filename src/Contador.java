import java.util.Locale;
import java.util.Scanner;

public class Contador { 
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite o primeiro parâmetro");
    int parametroUm = scanner.next();

    System.out.println("Digite o segundo parâmetro");
    int parametroDois = scanner.next();

   system.out.println (parametroUm + parametroDois);

}
