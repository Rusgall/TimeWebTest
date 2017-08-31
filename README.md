# TimeWebTest

Для запуска тестов на машине должно быть установленно:

1)Java 8

2)Maven

3)Скачан ChromeDriver(Путь до ChromeDriver зашит в программе, так что либо менять его в программе на нужный вам, либо положить его в  "D:/Ruslan/chromedriver_win32/chromedriver.exe")

4)Прописаны все нужные переменные среды

Качаем репозиторий

Заходим в корень проекта и прописываем команду mvn clean compile

Все готово для запуска тестов, теперь в том же месте прописываем mvn surefire-report:report и тесты начнут гоняться. Отчет можно будет посмотреть  в TimeWebProj\target\site\surefire-report.html

