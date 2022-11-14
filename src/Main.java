import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    static Player p1=new Player();
    static Gusser g=new Gusser();

    public static int player1num(){
        System.out.print("Mr."+p1.getPlayer1()+" enter the number:-");
        int a= sc.nextInt();
        return a;

    }
    public static int player2num(){
        System.out.print("Mr."+p1.getPlayer2()+" enter the number:-");
        int a= sc.nextInt();
        return a;

    }

    public static int player3num(){
        System.out.print("Mr."+p1.getPlayer3()+" enter the number:-");
        int a= sc.nextInt();
        return a;
    }

    public static void addPlayerNames(){
        System.out.print("enter player 1 name:-");
        String player1Name=sc.nextLine();
        p1.setPlayer1(player1Name);
        System.out.print("enter payer 2 name:-");
        String player2Name=sc.nextLine();
        p1.setPlayer2(player2Name);
        System.out.print("enter player 3 name:-");
        String player3Name=sc.nextLine();
        p1.setPlayer3(player3Name);
    }

    public static int addingPlayer1Number(){
        System.out.println(" -.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        System.out.print("MR. "+p1.getPlayer1()+" please enter your number:-");
        int player1Num=sc.nextInt();
        return player1Num;
    }

    public static int addingPlayer2Number(){
        System.out.println(" -.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        System.out.print("MR. "+p1.getPlayer2()+" please enter your number:-");
        int player2Num=sc.nextInt();
        return player2Num;
    }

    public static int addingPlayer3Number(){
        System.out.println(" -.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        System.out.print("MR. "+p1.getPlayer3()+" please enter your number:-");
        int player3Num=sc.nextInt();
        System.out.println(" -.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        return player3Num;
    }

    public static void addingGusserName(){
        System.out.print("please enter the gusser Name:-");
        String gusserName=sc.nextLine();
        g.setName(gusserName);

    }

    public static int addingGusserNumber(){
        System.out.println(" -------------------------------------------------");
        System.out.print("MR. Gusser "+g.getName()+" please enter your guess:-");
        int gusserNumber=sc.nextInt();
        sc.nextLine();
        return gusserNumber;
    }

    public static void checkResult(){
        int player1=addingPlayer1Number();
        int player2=addingPlayer2Number();
        int player3=addingPlayer3Number();
        int gusserguess=addingGusserNumber();

        if(gusserguess==player1 && gusserguess!=player2 && gusserguess!=player3){
            System.out.println("                                            --------------------------------            ");
            System.out.println("                                                |--- "+ p1.getPlayer1()+ " wins ---|             ");
        }else if(gusserguess==player2 && gusserguess!=player1 && gusserguess!=player3){
            System.out.println("                                            --------------------------------            ");
            System.out.println("                                                |--- "+ p1.getPlayer2()+ " wins ---|             ");
        }else if(gusserguess==player3 && gusserguess!=player1 && gusserguess!=player2){
            System.out.println("                                            --------------------------------            ");
            System.out.println("                                                |--- "+ p1.getPlayer3()+ " wins ---|             ");
        }else if(gusserguess==player1 && gusserguess==player2 && gusserguess==player3){
            System.out.println("                                            ------------------------------------------           ");
            System.out.println("                                                |--- Tie between "+ p1.getPlayer1()+ " and " +p1.getPlayer2()+" and "+p1.getPlayer3()+"  ---|             ");

        } else if (gusserguess==player1 && gusserguess==player2) {
            System.out.println("                                            ------------------------------------------            ");
            System.out.println("                                                |--- Tie between "+ p1.getPlayer1()+ " and " +p1.getPlayer2()+"  ---|             ");

        } else if (gusserguess==player1 && gusserguess==player3) {
            System.out.println("                                            ------------------------------------------            ");
            System.out.println("                                                |--- Tie between "+ p1.getPlayer1()+ " and "+p1.getPlayer3()+"  ---|             ");
        } else if (gusserguess==player2 && gusserguess==player3){
            System.out.println("                                            ------------------------------------------            ");
            System.out.println("                                                |--- Tie between "+p1.getPlayer2()+" and "+p1.getPlayer3()+"  ---|             ");
        }else{
            System.out.println("                                            |---nobody wins---|");
        }
    }


    public static void main(String[] args) {
        addPlayerNames();
        addingGusserName();
        boolean start=true;
        while(start){
            System.out.println("        ---------------------------------------------");
            System.out.println("        |1-start gussing number                     |\n"+
                    "        |2-Exit                                     |");
            System.out.println("        ---------------------------------------------");
            System.out.print("        |enter your choice:-");
            int choice=sc.nextInt();
            System.out.println("        ----------------------------------------------        ");
            switch(choice){
                case 1:
                    checkResult();
                    break;
                case 2:
                    start=false;
            }
        }








    }
}
