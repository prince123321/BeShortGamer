package com.beshortgamer.ndx;

public class HttpServer {
    public static int key_method(String key,String code){
        int a = Integer.parseInt(key);
        int method = 0;
        int b = Integer.parseInt(code);
        switch (a)
        {
            case 0:
                method = b * 3 +1;
                break;

            case 1:
                method = b * 2 +21;
                break;

            case 2:
                method = b * 3 +23;
                break;

            case 3:
                method = b * 1 +01;
                break;

            case 4:
                method = b * 12 +12;
                break;

            case 5:
                method = b * 2 +19;
                break;

            case 6:
                method = b * 3 +12;
                break;

            case 7:
                method = b * 1 +23;
                break;

            case 8:
                method = b * 4 +12;
                break;

            case 9:
                method = b * 3 +8;
                break;

            case 10:
                method = b * 3 +2;
                break;

            case 11:
                method = b * 1 +32;
                break;

            case 12:
                method = b * 2 +1;
                break;

            case 13:
                method = b * 1 +2;
                break;

            case 14:
                method = b * 2 +22;
                break;

        }
        return method;
    }
}
