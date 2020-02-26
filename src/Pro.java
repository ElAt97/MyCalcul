public class Pro {


    public int Pro(String x, String y, String s) {

        return nan(x, y, s);

    }

    public int nan(String x, String y, String s) {
        String l= " +";

        int b = 0;
        try {


            int f = Integer.parseInt(x);
            int a = Integer.parseInt(y);


            int[] un = {f, a};



                if (un[0] <= 10 & un[0] >= 1) {
                    if (un[1] <= 10 & un[1] >= 1) {

                        switch (s) {
                            case "+":
                                b = f + a;

                                break ;
                            case "-":
                                b = f - a;
                                break;
                            case "/":
                                b = f / a;
                                break;
                            case "*":
                                b = f * a;
                                break;
                                default:
                                    System.out.println(" Не те ");
                                    break;
                        }
                        System.out.println(b);
                        return b;

                    }
                    else
                    {
                        System.out.println(" Слагаемое(ые) не должно(ы) быть меньшее  1 и больше 10");
                    }
                }else{
                    System.out.println("Слагаемое(ые) не должно(ы) быть  меньше 1 и больше 10");
                }


        }
        catch (NumberFormatException e){
            System.out.println("Не то значение ");
        }



  return  b;
    }
}