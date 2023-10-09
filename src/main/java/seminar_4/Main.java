package seminar_4;

import seminar_4.weather.WeatherReporter;
import seminar_4.weather.WeatherService;

public class Main {






    public static void main(String[] args) {
        // Создаем объект WeatherService. В реальной программе, этот класс
        // бы обращался к внешнему API для получения температуры.
        WeatherService weatherService = new WeatherService();

        // Создаем объект WeatherReporter, передаем ему WeatherService в конструктор.
        WeatherReporter weatherReporter = new WeatherReporter(weatherService);

        // Получаем отчет о погоде.
        String report = weatherReporter.generateReport();

        // Выводим отчет на консоль.
        System.out.println(report);

    }



































    /*
      4.5. Вам нужно написать тест с использованием моков для сервиса отправки сообщений.
      Условие: У вас есть класс MessageService с методом public void sendMessage(String message, String recipient),
      который отправляет сообщение получателю.
      Вам необходимо проверить правильность работы класса NotificationService,
      который использует MessageService для отправки уведомлений.
    */
//    public static void main(String[] args) {
//        MessageService messageService = new MessageService();
//        NotificationService notificationService = new NotificationService(messageService);
//
//        notificationService.sendNotification("Привет!", "Анна");
//    }


























    /*
        4.6.Вам требуется протестировать класс, который обрабатывает запросы к базе данных.
        Условие: У вас есть класс Database с методом public List<String> query(String sql),
        который выполняет SQL-запрос и возвращает результат.
        Вам необходимо проверить правильность работы класса DataProcessor, который использует
        Database для выполнения запроса и обработки результатов.

     */
//    public static void main(String[] args) {
//        // Создаём экземпляр класса Database
//        Database database = new Database();
//
//        // Создаём экземпляр класса DataProcessor, передавая в конструктор database
//        DataProcessor dataProcessor = new DataProcessor(database);
//
//        // Вызываем метод processData и выводим результаты
//        List<String> data = dataProcessor.processData("SELECT * FROM table");
//        for (String datum : data) {
//            System.out.println(datum);
//        }
//    }



















    /*
    * HW4.3. У вас есть класс BookService, который использует интерфейс BookRepository
    * для получения информации о книгах из базы данных.
    *  Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.
    * */
//    public static void main(String[] args) {
//        BookRepository repository = new InMemoryBookRepository();
//        BookService bookService = new BookService(repository);
//
//        Book book1 = bookService.findBookById("1");
//        System.out.println("Найдена книга: " + book1.getTitle() + " by " + book1.getAuthor());
//
//        List<Book> allBooks = bookService.findAllBooks();
//        System.out.println("Все книги:");
//        for (Book book : allBooks) {
//            System.out.println("- " + book.getTitle() + " от " + book.getAuthor());
//        }
//    }
}