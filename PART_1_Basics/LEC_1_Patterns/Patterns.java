package PART_1_Basics.LEC_1_Patterns;

public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        p22(n);

    }

    static void p1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    static void p4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }

    static void p5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    static void p7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void p8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - 2 * i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void p9(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - 2 * i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void p10(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            int stars = i + 1;
            if (i >= n) {
                stars = 2 * n - i - 1;
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void p11(int n) {
        for (int i = 0; i < n; i++) {

            int s = 1;
            if ((i + 1) % 2 == 0) {
                s = 0;
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(s);
                s = 1 - s;
            }
            System.out.println();
        }
    }

    static void p12(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1);
            }
            for (int j = 0; j < 2 * n - 2 * i - 2; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    static void p13(int n) {
        int m = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(m + " ");
                m++;
            }
            System.out.println();
        }
    }

    static void p14(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j < 'A' + i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void p15(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j < 'A' + n - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void p16(int n) {
        char a = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(a);
            }
            a++;
            System.out.println();
        }
    }

    static void p17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (char j = 'A'; j < 'A' + i + 1; j++) {
                System.out.print(j);
            }
            for (char j = (char) ('A' + i - 1); j >= 'A'; j--) {
                System.out.print(j);
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void p18(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = (char) ('A' + n - i - 1); j <= 'A' + n - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void p19(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * n - 2 * (i + 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p20(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            int stars = i + 1;
            if (i >= n) {
                stars = 2 * n - i - 1;
            }
            int space = 2 * n - 2 * i - 2;
            if (i >= n) {
                space = 2 * i + 2 - 2 * n;
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void p21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1) {
                    System.out.print("*");
                } else if (j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void p22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int bottom = (2 * n - 2) - i;
                int right = (2 * n - 2) - j;
                int x = n - (Math.min(Math.min(top, bottom), Math.min(left, right)));
                System.out.print(x);
            }
            System.out.println();
        }
    }

}
