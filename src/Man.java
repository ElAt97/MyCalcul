public class Man {
    public static void main(String[] args) {


    }
    public int Nan(String s,String  a,String z){
        Sam sam =new Sam();
        switch (z) {
            case "+":
                if (sam.let(s) == 0){
                    System.out.println("ощибка");
                } else if(sam.let(a)== 0){
                    System.out.println("Ошибка");}
                else {
                  //  System.out.println(sam.let(s)+sam.let(a));

                 return (sam.let(s)+sam.let(a));
                }

                break;
                case "-":
                    if (sam.let(s) == 0){
                        System.out.println("ощибка");
                    } else if(sam.let(a)== 0){
                    System.out.println("Ошибка");}
                    else {
              //  System.out.println(sam.let(s)-sam.let(a));
                        return (sam.let(s)-sam.let(a));
                        }
                break;
                case "/":
                    if (sam.let(s) == 0){
                        System.out.println("ощибка");
                    } else if(sam.let(a)== 0){
                        System.out.println("Ошибка");}
                    else {
                        //System.out.println(sam.let(s)/sam.let(a));
                        return (sam.let(s)/sam.let(a));
                    }
                break;
                case "*":
                    if (sam.let(s) == 0){
                        System.out.println("ощибка");
                    } else if(sam.let(a)== 0){
                        System.out.println("Ошибка");}
                    else {
                        //System.out.println(sam.let(s)*sam.let(a));
                        return (sam.let(s)*sam.let(a));

                    }
                break;

        }
        return 0;
    }






}
