import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Bir sayi girin: ");
      String str = scanner.nextLine();

      try {
        int sayi = Integer.parseInt(str);

        if (isAsal(sayi)) {
          System.out.println(sayi + " bir asal sayidir.");
        } else {
          System.out.println(sayi + " bir asal sayi değildir.");
        }
      } catch (NumberFormatException e) {
        System.out.println("Geçersiz bir sayi girdiniz.");
      }
    }
  }

  public static boolean isAsal(int sayi) {
    if (sayi <= 1) {
      return false;
    }

    for (int i = 2; i <= Math.sqrt(sayi); i++) {
      if (sayi % i == 0) {
        return false;
      }
    }

    return true;
  }
}
