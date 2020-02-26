public class Sam {


    public int let(String s) {
        try {

            if (s.equals("I"))
                return 1;
            else if (s.equals("II"))
                return 2;
            if (s.equals("III"))
                return 3;
            else if (s.equals("IV"))
                return 4;
            if (s.equals("V"))
                return 5;
            else if (s.equals("VI"))
                return 6;
            if (s.equals("VII"))
                return 7;
            else if (s.equals("VIII"))
                return 8;
            else if (s.equals("IX"))
                return 9;
            else if (s.equals("X"))
                return 10;
        }catch (Exception e){
            System.out.println("Ошибка");
        }


        return 0;

    }
}
