package TestPackage1;

public class Test6 {


    public static void main(String[] args) {


        int x = -1;
        String result = "";
        if (x < 0) {if (x == -1) result += "1"; else result += "2";}
        result += "3";
        switch(x) {
            case 1-3:
                result += "4";
            case 3-4:
                result += "5";
            case 4-7:
                result += "6";
                break;
            default:
                result += "7";
        }
        System.out.println(result);


        }
    }

