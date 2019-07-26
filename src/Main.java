import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] name = {"Tony Stark", "Stive Rogers", "Natasha Romonov"};

        for (int i=0; i<=2;i++) {
            switch (name[i]) {
                case "Tony Stark":
                    System.out.println("Доброе утро " + name[0]);
                    break;
                case "Stive Rogers":
                    System.out.println("Добрый день " + name[1]);
                    break;
                case "Natasha Romonov":
                    System.out.println("Добрый вечер " + name[2]);
                    break;
            }
        }



        // Задание на сообразительность

        name = Arrays.copyOf(name,4);
        name[3]="Bruce Banner";
        for (int i=0; i<=3;i++){
            switch (name[i]){
                case "Tony Stark":
                    System.out.println("Доброе утро " + name[0]);
                    break;
                case "Stive Rogers":
                    System.out.println("Добрый день " + name[1]);
                    break;
                case "Natasha Romonov":
                    System.out.println("Добрый вечер " + name[2]);
                    break;
                case "Bruce Banner":
                    System.out.println("Доброй ночи " + name[3]);
            }
        }



    }
}
