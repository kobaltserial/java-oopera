public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Олег", "Александров", Gender.MALE, 180);
        Actor actor2 = new Actor("Александр", "Олегов", Gender.MALE, 175);
        Actor actor3 = new Actor("Александра", "Олегова", Gender.FEMALE, 165);

        Director director1 = new Director("Матвей", "Матвеев", Gender.MALE, 10);
        Director director2 = new Director("Ольга", "Ольгова", Gender.FEMALE, 7);

        String musicAuthor = "Сергей Зверев";
        String choreographer = "Боб Бобов";

        Show show = new Show("Спектакль 1", 120, director1);
        Opera opera = new Opera("Спектакль 2", 180, director2,
                musicAuthor, "Либретто оперы", 40);
        Ballet ballet = new Ballet("Спектакль 4", 150, director1,
                musicAuthor, "Либретто балета", choreographer);

        show.addActor(actor1);
        show.addActor(actor2);
        show.addActor(actor1);

        opera.addActor(actor1);
        opera.addActor(actor3);

        ballet.addActor(actor2);
        ballet.addActor(actor3);

        printShowInfo(show);
        printShowInfo(opera);
        printShowInfo(ballet);

        show.replaceActor(actor3, "Олегов");
        show.printActors();

        opera.replaceActor(actor2, "Несуществующий");

        opera.printLibretto();
        ballet.printLibretto();
    }

    private static void printShowInfo(Show show) {
        show.printDirector();
        show.printActors();
    }
}