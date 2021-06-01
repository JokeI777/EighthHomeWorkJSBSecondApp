Всем привет )   
ДЗ по теме брокеры сообщений. Это последнее ДЗ и их больше не будет   
Запустить у себя RabbitMQ (через docker , либо установить на комп. Если не получиться, то можно попробовать другой брокер сообщения). Можно воспользоваться https://www.cloudamqp.com/plans.html (там есть бесплатный план)   
Написать два приложения которые будут общаться между собой    
Первое приложение:   
- включает http сервер. Должен обрабатывать запрос вида   
```
{
    "name": "Ivan",
    "login": "proso",
    "password": "123456",
    "phoneNumber": "79022658978"
}
```   
- в контроллере должен вызываться сервис который отправляет сообщение в брокер вида:   
```
{
    "id": 1234,
    "name": "Ivan",
    "phoneNumber": "79022658978"
}
```   
- в качестве ответа на http запрос контроллер должен возвращать ответное сообщение от второго приложения вида:   
```
{
    "id": 1234,
    "state": "VALID",
    "time": "2021-01-01T12:12:12"
}
```   
Второе приложение:   
- без HTTP сервера   
- должно принимать сообщение от первого приложения. Сообщение вида:   
```
{
    "id": 1234,
    "name": "Ivan",
    "phoneNumber": "79022658978"
}
```   
не забываем про валидацию входных данных  (не обязательно)   
если кто хочет, то может сделать сохранение этих данных в БД (не обязательно)   
Success_work:   
![Success_work](https://github.com/JokeI777/EighthHomeWorkJSBFirstApp/blob/master/Success_work.png)
Success_get:
![Success_get](https://github.com/JokeI777/EighthHomeWorkJSBFirstApp/blob/master/Success_get.png)