import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * initialization song list
         * and options
         */

        ArrayList<Song> songList = new ArrayList<Song>();
        Song song1 = new Song(songList.size() + 1, "Tu Principe", 2002, 230, "Urbano", "www.tuprincipe.com", "Canción de genero urbano" );
        songList.add(song1);
        Song song2 = new Song(songList.size() + 1, "La curiosidad", 2002, 150, "Urbano", "www.LaCuriosidad.com", "Canción de genero urbano" );
        songList.add(song2);

        int decision = 0;
        String decisions[] = new String[]{"1. Create new song", "2. Filter song by gender",
                "3. Filter by year", "0. Exit"};
        Scanner scan = new Scanner(System.in);
        do{
            String title;
            int date;
            float duration;
            String gender;
            String cover;
            String description;
            System.out.println("_________________");
            System.out.println("Select the option");
            for(int i = 0; i < decisions.length; i++){
                System.out.println(decisions[i] + " ");
            }
            decision = scan.nextInt();
            scan.skip("\n");
            switch (decision){
                case 1 :
                    System.out.println("Tell me the title: ");
                    title = scan.nextLine();
                    System.out.println("What year is the song from?: ");
                    date = scan.nextInt();
                    System.out.println("Tell me how long the song is (in seconds): ");
                    duration = scan.nextFloat();
                    scan.skip("\n");
                    System.out.println("What is the gender: ");
                    gender = scan.nextLine();
                    System.out.println("Link to find the cover: ");
                    cover = scan.nextLine();
                    System.out.println("Tell me about the song: ");
                    description = scan.nextLine();
                    Song song = new Song(songList.size()+1, title, date, duration, gender, cover,description);
                    songList.add(song);
                    System.out.println("Save Song");
                    break;
                case 2 :
                    System.out.println("Please, what is the gender that you want to find: ");
                    gender = scan.nextLine();
                    songList.stream()
                            .filter(song0 -> song0.getGender() == gender)
                            .forEach(System.out::println);
                    break;
                case 3 :
                    System.out.println("Please, what is the year that you want to find: ");
                    date = scan.nextInt();
                    scan.skip("\n");
                    songList.stream()
                            .filter(song0 -> song0.getDate() == date)
                            .forEach(System.out::println);
                    break;
                case 0 : System.out.println("Good Bye");
                    break;
            }

        }while (decision != 0);
    }

}
