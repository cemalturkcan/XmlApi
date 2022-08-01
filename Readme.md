Bu projede https://postman.mobildev.com/#21bcdc90-ea01-4d97-92f3-878422b1fd77 sayfasında yer alan Mobildev XML API entegrasyonu yapılmıştır.


http://localhost:5050/getUser/restTemplate
veya
http://localhost:5050/getUser/feign

adresleri üzerinden 
```xml
<MainReportRoot>
    <UserName>{{apikey}}</UserName>
    <PassWord>{{apisecret}}</PassWord>
    <Action>4</Action>
</MainReportRoot>
```
Yukarıdaki HTTP Request Body ile istek atılabilir.

