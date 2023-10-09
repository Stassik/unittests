package seminar_4.weather;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class WeatherReporterTest {

    //**
    // 4.3. Предположим, у вас есть класс WeatherService, который имеет метод getCurrentTemperature(),
    // обращающийся к внешнему API для получения информации о текущей температуре.
    // Вам нужно протестировать другой класс, WeatherReporter, который использует WeatherService.
    // Создайте мок-объект для WeatherService с использованием Mockito.
    // *

    @Test
    public void WeatherTest() {
        WeatherService weatherServiceMock = mock(WeatherService.class);
        when(weatherServiceMock.getCurrentTemperature()).thenReturn(23);
        WeatherReporter weatherReporter = new WeatherReporter(weatherServiceMock);
        assertThat(weatherReporter.generateReport()).isEqualTo("Текущая температура: 23 градусов.");
    }


}