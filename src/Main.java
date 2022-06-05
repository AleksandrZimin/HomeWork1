public class Main {

    public static void main(String[] args) {
        Course c = new Course(120); // Создаем полосу препятствий
        Team team = new Team("Spartak", new Player2("Promes"), new Player3("Melkadze"), new Player1("Djikiya")); // Создаем команду
         c.doIt(team); // Просим команду пройти полосу

            System.out.println("\nWinners:");
            team.passedTheDistance();

            System.out.println("\nResult:");// Показываем результаты
            team.showResults();
        }
    }

