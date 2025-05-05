# Student API

## Описание
Это приложение предоставляет API для получения информации о студенческих группах из БГУИР. Оно использует Spring Boot для создания RESTful веб-сервиса, который взаимодействует с внешним API по адресу https://iis.bsuir.by/api/v1/student-groups.

## Запуск
1. Клонируйте репозиторий.
2. Соберите проект с помощью Maven.
3. Запустите приложение.
4. Проверьте, что приложение работает, перейдя по адресу http://localhost:8080/student-groups.

## Структура проекта
1. model/Group.java: Модель данных для группы.
2. dao/ScheduleDAO.java: Класс для взаимодействия с API БГУИР.
3. service/ScheduleService.java: Сервисный класс для обработки логики.
4. controller/ScheduleController.java: Контроллер для обработки запросов.
5. StudentApiApplication.java: Основной класс приложения.