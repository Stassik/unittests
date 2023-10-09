package seminar_4.database;
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


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DataProcessorTest {


    @Test
    public void DataProcessorClassTest() {
        Database database = mock(Database.class);
        DataProcessor dataProcessor = new DataProcessor(database);

        List<String> result = new ArrayList<>(Arrays.asList("res1", "res2"));

        when(database.query("123")).thenReturn(result);

        assertEquals(dataProcessor.processData("123"), result);




    }




}