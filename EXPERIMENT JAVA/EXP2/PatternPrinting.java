 class PatternPrinting {
    public static void main(String[] args) {
        
        System.out.println("tejus hans 24csu222\n");

        int rows = 5;

        // 1. Pyramid
        System.out.println("Pyramid:");
        for (int i = 1; i <= rows; i++) {
            for (int space = i; space < rows; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. Left Triangle
        System.out.println("\nLeft Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 3. Right Triangle
        System.out.println("\nRight Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int space = i; space < rows; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

       // 4. Diamond
System.out.println("\nDiamond:");

for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= (2 * i - 1); j++) {
        System.out.print("*");
    }

    System.out.println();
}
for (int i = rows - 1; i >= 1; i--) {
    
    for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
    }
 for (int j = 1; j <= (2 * i - 1); j++) {
        System.out.print("*");
    }
    System.out.println();
}

    }
}
