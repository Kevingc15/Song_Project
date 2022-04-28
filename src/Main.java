import java.util.ArrayList;
import java.util.Locale;
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
        Song song3 = new Song(songList.size() + 1, "Amarte así", 1980, 300, "Romantico", "www.CamiloSesto.com", "Canción de Camilo Sesto" );
        songList.add(song3);
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
            /**
             * What is the desition
             * of the user
             */
            switch (decision){
                /**
                 * 1: Create a new song
                 */
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

                /**
                 * Filter by gender
                 */
                case 2 :
                    System.out.println("Please, what is the gender that you want to find: ");
                    gender = scan.nextLine();
                    songList.stream()
                            .filter(songF -> songF.getGender().equalsIgnoreCase(gender))
                            .forEach(System.out::println);
                    break;

                /**
                 * Filter by year
                 */
                case 3 :
                    System.out.println("Please, what is the year that you want to find: ");
                    date = scan.nextInt();
                    scan.skip("\n");
                    songList.stream()
                            .filter(songF -> songF.getDate() == date)
                            .forEach(System.out::println);
                    break;

                /**
                 * Exit
                 */
                case 0 : System.out.println("Good Bye");
                    break;
            }

        }while (decision != 0);
    }

}
