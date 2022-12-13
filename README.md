# FP-OOP-5025211015
Final Project PBO B

Game 2️⃣0️⃣4️⃣8️⃣

➖➖➖➖➖➖➖➖➖➖➖

Planning 🔽
 
Saya berencana membuat game 2D menggunakan bahasa java. Tipe game yang ingin saya buat adalah game Puzzle Matematika. Game ini membutuhkan blok untuk menyimpan angka. Setiap blok angka dapat berpindah sesuai sumbu x dan y. Jika terdapat kedua blok yang memiliki besaran angka yang sama, maka blok tersebut akan menjadi satu blok utuh. Setiap blok yang telah menjadi blok utuh tersebut akan bernilai x kelipatan sesuai dengan banyaknya blok (x blok) yng memiliki nilai yang sama. Setiap pergerakan, blok akan turun mengisi puzzle yang kosong sesuai sumbu yang digerakkan. Game ini seperti game 2048, namun yang berbeda adalah blok yang menjadi satu dapat berasal dari lebih 2 blok, tidak hanya dari 2 blok saja.
 
➖➖➖➖➖➖➖➖➖➖➖
 
Final Result 🔽

 
<img width="313" alt="screen" src="https://user-images.githubusercontent.com/114115721/207231453-933aa7bf-ebd7-437e-b1f3-6083e575c9dd.png">

⛳ Gameplay : Pemain menggeser blok ke arah ⬅️➡️⬆️⬇️ menggunakan key WASD atau Panah

➖➖➖➖➖➖➖➖➖➖➖

Link Demo Video : https://youtu.be/kk_79HPUnRg

Reference       : https://its.id/m/ReferencePBO
 
➖➖➖➖➖➖➖➖➖➖➖

Implementation 🔽


1️⃣ Casting/Conversion

![image](https://user-images.githubusercontent.com/114115721/207232676-6576b254-8708-4157-8a24-ac476c97ee54.png)
![image](https://user-images.githubusercontent.com/114115721/207232884-4d9e7c52-53fc-4c99-b3cf-26ed88d587a7.png)

scr : Main.java

ket : Casting dilakukan pada bentuk perkalian dengan variable scale. Karena scale di awal didefinisikan sebagai float
 
 
2️⃣ Constructor

![image](https://user-images.githubusercontent.com/114115721/207237959-44ac7dc6-bf4c-4bb1-bdbf-d405c25422a6.png)
![image](https://user-images.githubusercontent.com/114115721/207238017-56348cb7-e5aa-404d-91db-52414c9e1343.png)

scr : MainScreen.java

ket : Constuctor dalam hal ini digunakan untuk membuat object screen yang akan ditampilkan sebagai mainScreen. Setelah user menekan tombol play, dibuat juga object main untuk ditampilkan sebagai gameScreen


3️⃣ Overloading

![image](https://user-images.githubusercontent.com/114115721/207233798-7806d333-711d-4b9b-afcf-1ed22f4a5b1e.png)

scr : GameObject.java

ket : Overloading digunakan di fungsi yang sama namun dengan pelemparan parameter yang berbeda, antara dengan atau tidaknya x.position dan y.position


4️⃣ Overriding

 ![image](https://user-images.githubusercontent.com/114115721/207233305-ac45477b-5f42-4647-b3c1-f764415a7f47.png)
![image](https://user-images.githubusercontent.com/114115721/207233359-6d40af57-8b28-4648-8cd8-1c0bf6a9a9e5.png)
![image](https://user-images.githubusercontent.com/114115721/207233534-f9196b10-1b8e-4079-8402-47ec2f52d0ae.png)

scr : WinBoard.java & LostBoard.java & Game.java

ket : Overiding digunakan untuk fungsi paintComponent dengan kondisi yang berbeda antara Win dan Lose


5️⃣ Encapsulation (❌)


6️⃣ Inheritance

![image](https://user-images.githubusercontent.com/114115721/207234231-613f07ff-5ce7-4620-9c66-165ed3df1504.png)
![image](https://user-images.githubusercontent.com/114115721/207234286-549df800-4442-439b-977b-6af30dd25490.png)
![image](https://user-images.githubusercontent.com/114115721/207234523-5762f8be-4d24-442f-a5b5-bfbacd24238d.png)

scr : LoseBoard.java-WinBoard.java & Game.java & MainScreen.java

ket : Inheritance terlihat pada fungsi extends untuk mengambil sifat dari fungsi classnya


7️⃣ Polymorphism

![image](https://user-images.githubusercontent.com/114115721/207234629-f57ad8c6-030a-470c-9479-0fbc4ea979bd.png)
![image](https://user-images.githubusercontent.com/114115721/207234839-360a653d-8b49-4918-a3b6-ceec4238fa7d.png)

scr : Game.java & LoseBoard.java-WinBoard.java

ket : Polymorphism digunakan dengan metode overiding yang memanggil fungsi yang sama untuk mendapatkan berbagai bentuk (Win/Lose)


8️⃣ ArrayList

![image](https://user-images.githubusercontent.com/114115721/207234936-77fda2ca-df20-40de-b1f7-691a5e29844a.png)

scr : Game.java

ket : Arraylist digunakan sebagai tempat untuk menyimpan sprite/object balok yang masih tersisa


9️⃣ Exception Handling

![image](https://user-images.githubusercontent.com/114115721/207235110-8f0296a1-fc6d-4df1-8e02-f48bafd76b6a.png)

scr : MainScreen.java

ket : Exception Handling menggunakan metode try-catch digunakan saat kondisi gambar dari background tidak terdeteksi(error) sehingga bisa memberikan keterangan


🔟 GUI

![image](https://user-images.githubusercontent.com/114115721/207236796-5c80d0cf-6e2b-4722-9ed9-88efa0e7a953.png)
![image](https://user-images.githubusercontent.com/114115721/207236836-598d1be0-c0bf-4a0a-9b66-2876107da88b.png)

scr : MainScreen.java

ket : MainScreen merupakan frame awal yang timbul ketika program di run, di sini saya membuat tombol play, highscore, dan menambahkan gambar sebagai background game


1️⃣1️⃣ Interface

![image](https://user-images.githubusercontent.com/114115721/207237332-1faf9b15-d591-4888-b1ee-18a4cfc7dbab.png)

scr : Game.java

ket : Interface di atas untuk melacak input yang diberikan oleh user, apakah ('Left', 'Right', 'Up', 'Down', 'Reset')


1️⃣2️⃣ Abstract Class

![image](https://user-images.githubusercontent.com/114115721/207235295-518ecdd7-cfd2-4321-91a8-904bc4d31b25.png)

scr : Game.java

ket : Abstract Class digunakan sebagai fungsi res() untuk mengoutputkan hasil score game nya apakah win atau lose, dengan menggunakan fungsi hs(untuk kondisional) dan fungsi res() untuk memberikan batas setelah beberapa kali percobaan


1️⃣3️⃣ Generics

![image](https://user-images.githubusercontent.com/114115721/207235599-c8f493e5-9ace-485f-92d9-fc11eca06b1f.png)
![image](https://user-images.githubusercontent.com/114115721/207235777-0393f7db-4db7-45a2-b6e4-9efa0ee1a087.png)

scr : MainScreen.java

ket : Generics Class di sini digunakan untuk menjadikan highscore ataupun string menjadi object yang dapat digunakan dalam fungsi otuput


1️⃣4️⃣ Collection (❌)


1️⃣5️⃣ Input Output 

![image](https://user-images.githubusercontent.com/114115721/207236157-cb52ac68-91c7-4c4a-b8c7-42f4806c175b.png)
![image](https://user-images.githubusercontent.com/114115721/207236241-1f10fecd-00c0-4b9e-8add-2fb2d8843431.png)

scr : Game.java

ket : Untuk input saya hanya menambahkan input untuk perintah reset dengan menekan keyboard 'R', Output yang diberikan berupa hasil dari game apakah menang atau kalah beserta score yang didapat juga score tertinggi yang berhasil diraih
