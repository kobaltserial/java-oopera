public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Пётр", "Петров", Gender.MALE, 175);
        Actor actor3 = new Actor("Анна", "Сидорова", Gender.FEMALE, 165);

        Director director1 = new Director("Сергей", "Режиссёров", Gender.MALE, 10);
        Director director2 = new Director("Ольга", "Постановкина", Gender.FEMALE, 7);

        Person musicAuthor = new Person("Пётр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Мариус", "Петипа", Gender.MALE);

        Show show = new Show("Обычный спектакль", 120, director1);
        Opera opera = new Opera("Евгений Онегин", 180, director2,
                musicAuthor, "Либретто оперы", 40);
        Ballet ballet = new Ballet("Лебединое озеро", 150, director1,
                musicAuthor, "Либретто балета", choreographer);

        show.addActor(actor1);
        show.addActor(actor2);
        show.addActor(actor1);

        opera.addActor(actor1);
        opera.addActor(actor3);

        ballet.addActor(actor2);
        ballet.addActor(actor3);

        System.out.println("Спектакль: " + show.getTitle());
        show.printDirector();
        show.printActors();

        System.out.println("Спектакль: " + opera.getTitle());
        opera.printDirector();
        opera.printActors();

        System.out.println("Спектакль: " + ballet.getTitle());
        ballet.printDirector();
        ballet.printActors();

        System.out.println("Спектакль: " + show.getTitle() + " после замены");
        show.replaceActor(actor3, "Петров");
        show.printActors();

        opera.replaceActor(actor2, "Несуществующий");

        opera.printLibretto();
        ballet.printLibretto();
    }
}