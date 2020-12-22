package alevel.lesson4.homework;


import java.util.Scanner;


public class Exercise1 {
    public static void main(String[] args) {


        System.out.println("Напечатайте текст длинной не более 30 символов на кириллице: ");


        System.out.println(output(input()));


    }


    public static String output(char inputArray[]) {


        String outputString;
        String outputStringArray[] = new String[30];


        for (int i = 0; i < 30; i++) {
            switch (inputArray[i]) {


                case 'а':
                    outputStringArray[i] = "a";
                    break;
                case 'б':
                    outputStringArray[i] = "b";
                    break;
                case 'в':
                    outputStringArray[i] = "v";
                    break;
                case 'г':
                    outputStringArray[i] = "g";
                    break;
                case 'д':
                    outputStringArray[i] = "d";
                    break;
                case 'е':
                    outputStringArray[i] = "ye";
                    break;
                case 'ё':
                    outputStringArray[i] = "yo";
                    break;
                case 'ж':
                    outputStringArray[i] = "zh";
                    break;
                case 'з':
                    outputStringArray[i] = "z";
                    break;
                case 'и':
                    outputStringArray[i] = "i";
                    break;
                case 'й':
                    outputStringArray[i] = "y";
                    break;
                case 'к':
                    outputStringArray[i] = "k";
                    break;
                case 'л':
                    outputStringArray[i] = "l";
                    break;
                case 'м':
                    outputStringArray[i] = "m";
                    break;
                case 'н':
                    outputStringArray[i] = "n";
                    break;
                case 'о':
                    outputStringArray[i] = "o";
                    break;
                case 'п':
                    outputStringArray[i] = "p";
                    break;
                case 'р':
                    outputStringArray[i] = "r";
                    break;
                case 'с':
                    outputStringArray[i] = "s";
                    break;
                case 'т':
                    outputStringArray[i] = "t";
                    break;
                case 'у':
                    outputStringArray[i] = "u";
                    break;
                case 'ф':
                    outputStringArray[i] = "f";
                    break;
                case 'х':
                    outputStringArray[i] = "kh";
                    break;
                case 'ц':
                    outputStringArray[i] = "ts";
                    break;
                case 'ч':
                    outputStringArray[i] = "ch";
                    break;
                case 'ш':
                    outputStringArray[i] = "sh";
                    break;
                case 'щ':
                    outputStringArray[i] = "shch";
                    break;
                case 'ъ':
                    outputStringArray[i] = "\"";
                    break;
                case 'ы':
                    outputStringArray[i] = "y";
                    break;
                case 'ь':
                    outputStringArray[i] = "\'";
                    break;
                case 'э':
                    outputStringArray[i] = "e";
                    break;
                case 'ю':
                    outputStringArray[i] = "yu";
                    break;
                case 'я':
                    outputStringArray[i] = "ya";
                    break;


                case 'А':
                    outputStringArray[i] = "A";
                    break;
                case 'Б':
                    outputStringArray[i] = "B";
                    break;
                case 'В':
                    outputStringArray[i] = "V";
                    break;
                case 'Г':
                    outputStringArray[i] = "G";
                    break;
                case 'Д':
                    outputStringArray[i] = "D";
                    break;
                case 'Е':
                    outputStringArray[i] = "Ye";
                    break;
                case 'Ё':
                    outputStringArray[i] = "Yo";
                    break;
                case 'Ж':
                    outputStringArray[i] = "Zh";
                    break;
                case 'З':
                    outputStringArray[i] = "Z";
                    break;
                case 'И':
                    outputStringArray[i] = "I";
                    break;
                case 'Й':
                    outputStringArray[i] = "Y";
                    break;
                case 'К':
                    outputStringArray[i] = "K";
                    break;
                case 'Л':
                    outputStringArray[i] = "L";
                    break;
                case 'М':
                    outputStringArray[i] = "M";
                    break;
                case 'Н':
                    outputStringArray[i] = "N";
                    break;
                case 'О':
                    outputStringArray[i] = "O";
                    break;
                case 'П':
                    outputStringArray[i] = "P";
                    break;
                case 'Р':
                    outputStringArray[i] = "R";
                    break;
                case 'С':
                    outputStringArray[i] = "S";
                    break;
                case 'Т':
                    outputStringArray[i] = "T";
                    break;
                case 'У':
                    outputStringArray[i] = "U";
                    break;
                case 'Ф':
                    outputStringArray[i] = "F";
                    break;
                case 'Х':
                    outputStringArray[i] = "Kh";
                    break;
                case 'Ц':
                    outputStringArray[i] = "Ts";
                    break;
                case 'Ч':
                    outputStringArray[i] = "Ch";
                    break;
                case 'Ш':
                    outputStringArray[i] = "Sh";
                    break;
                case 'Щ':
                    outputStringArray[i] = "Shch";
                    break;
                case 'Э':
                    outputStringArray[i] = "E";
                    break;
                case 'Ю':
                    outputStringArray[i] = "Yu";
                    break;
                case 'Я':
                    outputStringArray[i] = "Ya";
                    break;


                case '.':
                    outputStringArray[i] = ".";
                    break;
                case ' ':
                    outputStringArray[i] = " ";
                    break;
                case ',':
                    outputStringArray[i] = ",";
                    break;
                case ':':
                    outputStringArray[i] = ":";
                    break;
                case ';':
                    outputStringArray[i] = ";";
                    break;
                case '!':
                    outputStringArray[i] = "!";
                    break;
                case '?':
                    outputStringArray[i] = "?";
                    break;
                case '1':
                    outputStringArray[i] = "1";
                    break;
                case '2':
                    outputStringArray[i] = "2";
                    break;
                case '3':
                    outputStringArray[i] = "3";
                    break;
                case '4':
                    outputStringArray[i] = "4";
                    break;
                case '5':
                    outputStringArray[i] = "5";
                    break;
                case '6':
                    outputStringArray[i] = "6";
                    break;
                case '7':
                    outputStringArray[i] = "7";
                    break;
                case '8':
                    outputStringArray[i] = "8";
                    break;
                case '9':
                    outputStringArray[i] = "9";
                    break;
                case '0':
                    outputStringArray[i] = "0";
                    break;

            }

        }


        outputString = outputStringArray[0];
        for (int i = 1; i < 30; i++) {
            if (outputStringArray[i] != null)
            outputString += outputStringArray[i];
        }


        return outputString;

    }


    public static char[] input() {


        String inputString;
        char inputStringArray[] = new char[30];
        Scanner scanner = new Scanner(System.in);


        inputString = scanner.nextLine();


        if (inputString.length() > 30) {
            inputString = inputString.substring(0, 30);
        }


        for (int i = 0; i < inputString.length(); i++)
            inputStringArray[i] = inputString.charAt(i);


        return inputStringArray;
    }


}
