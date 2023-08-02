public class Main {
    public static boolean shouldWakeUp(boolean havliyor, int saat) {
        if (saat >= 0 && saat <= 23 && havliyor) {
            return saat >= 20 || saat <= 8;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int birinci, int ikinci, int ucuncu) {
        return (birinci >= 13 && birinci <= 19) || (ikinci >= 13 && ikinci <= 19) || (ucuncu >= 13 && ucuncu <= 19);
    }

    public static boolean isCatPlaying(boolean isYaz, int sicaklik) {
        int ustLimit = isYaz ? 45 : 35;
        return sicaklik >= 25 && sicaklik <= ustLimit;
    }

    public static double area(double x, double y) {
        if (x >= 0 && y >= 0) {
            return x * y;
        } else {
            System.out.println("Kenarlar sifirdan buyuk olmai!");
            return -1;
        }
    }


    public static double area(double radius) {
        if (radius < 0) {
            System.out.println("Hatalı giriş: Yarıçap negatif olamaz!");
            return -1;
        }
        return radius * radius * Math.PI;
    }


    public static void main(String[] args) {
        System.out.println("shouldWakeUp----------------");
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 1));
        System.out.println("hasTeen----------------");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("isCatPlaying----------------");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

        System.out.println("RectangleArea----------------");
        System.out.println("Dikdortgenin Alani = " + area(14.0, 4.0));


        System.out.println(area(5.0));
        System.out.println(area(-1));


    }
}

