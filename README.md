# FP-OOP-5025211015
Final Project PBO B

Game 2️⃣0️⃣4️⃣8️⃣

➖➖➖➖➖➖➖➖➖➖➖

Planning 🔽
 
Saya berencana membuat game 2D menggunakan bahasa java. Tipe game yang ingin saya buat adalah game Puzzle Matematika. Game ini membutuhkan blok untuk menyimpan angka. Setiap blok angka dapat berpindah sesuai sumbu x dan y. Jika terdapat kedua blok yang memiliki besaran angka yang sama, maka blok tersebut akan menjadi satu blok utuh. Setiap blok yang telah menjadi blok utuh tersebut akan bernilai x kelipatan sesuai dengan banyaknya blok (x blok) yng memiliki nilai yang sama. Setiap pergerakan, blok akan turun mengisi puzzle yang kosong sesuai sumbu yang digerakkan. Game ini seperti game 2048, namun yang berbeda adalah blok yang menjadi satu dapat berasal dari lebih 2 blok, tidak hanya dari 2 blok saja.
 
➖➖➖➖➖➖➖➖➖➖➖
 
Final Result 🔽


 ![Group 1458](https://user-images.githubusercontent.com/114115721/207251495-3c7fbc44-fd86-49dd-9d69-f4019b356d8d.png)


⛳ Gameplay : Pemain menggeser blok ke arah ⬅️➡️⬆️⬇️ menggunakan key WASD atau Panah

➖➖➖➖➖➖➖➖➖➖➖

Link Demo Video : https://youtu.be/kk_79HPUnRg

Reference       : https://its.id/m/ReferencePBO

Keterangan      : di contributors terdapat 2 akun, akun tersebut merupakan akun saya yang satu lagi, dikarenakan saya memakai aplikasi sourcetree untuk push n pull dari laptop, saya baru tersadar jika akun github yang terhubung dengan aplikasi source tree merupakan akun saya yang kedua 🙏
 
 
➖➖➖➖➖➖➖➖➖➖➖

Implementation 🔽


1️⃣ Casting/Conversion

https://github.com/daf2a/FP-OOP-5025211015/blob/67e736e49a5c603b2c858d32f870eb2f2d11bee0/FP-PBO-5025211015-2048/src/pkg2048/Main.java#L35-L41

scr : Main.java

ket : Casting dilakukan pada bentuk perkalian dengan variable scale. Karena scale di awal didefinisikan sebagai float
 
 
2️⃣ Constructor

https://github.com/daf2a/FP-OOP-5025211015/blob/67e736e49a5c603b2c858d32f870eb2f2d11bee0/FP-PBO-5025211015-2048/src/pkg2048/MainScreen.java#L19-L49

scr : MainScreen.java

ket : Constuctor dalam hal ini digunakan untuk membuat object screen yang akan ditampilkan sebagai mainScreen. Setelah user menekan tombol play, dibuat juga object main untuk ditampilkan sebagai gameScreen


3️⃣ Overloading

https://github.com/daf2a/FP-OOP-5025211015/blob/67e736e49a5c603b2c858d32f870eb2f2d11bee0/FP-PBO-5025211015-2048/src/pkg2048/gameobject/GameObject.java#L26-L53

scr : GameObject.java 

ket : Overloading digunakan di fungsi yang sama namun dengan pelemparan parameter yang berbeda, antara dengan atau tidaknya x.position dan y.position


4️⃣ Overriding

https://github.com/daf2a/FP-OOP-5025211015/blob/67e736e49a5c603b2c858d32f870eb2f2d11bee0/FP-PBO-5025211015-2048/src/pkg2048/game/Game.java#L75-L88

scr : Game.java

ket : Overiding digunakan untuk fungsi paintComponent dengan kondisi yang berbeda antara Win dan Lose


5️⃣ Inheritance

https://github.com/daf2a/FP-OOP-5025211015/blob/67e736e49a5c603b2c858d32f870eb2f2d11bee0/FP-PBO-5025211015-2048/src/pkg2048/game/LoseBoard.java#L13-L24

https://github.com/daf2a/FP-OOP-5025211015/blob/67e736e49a5c603b2c858d32f870eb2f2d11bee0/FP-PBO-5025211015-2048/src/pkg2048/game/Game.java#L75-L88

scr : LoseBoard.java-WinBoard.java & Game.java & MainScreen.java

ket : Inheritance terlihat pada fungsi extends untuk mengambil sifat dari fungsi classnya


6️⃣ Polymorphism

https://github.com/daf2a/FP-OOP-5025211015/blob/67e736e49a5c603b2c858d32f870eb2f2d11bee0/FP-PBO-5025211015-2048/src/pkg2048/game/LoseBoard.java#L13-L22

https://github.com/daf2a/FP-OOP-5025211015/blob/67e736e49a5c603b2c858d32f870eb2f2d11bee0/FP-PBO-5025211015-2048/src/pkg2048/game/WinBoard.java#L13-L22

scr : LoseBoard.java-WinBoard.java

ket : Polymorphism digunakan dengan metode overiding yang memanggil fungsi yang sama untuk mendapatkan berbagai bentuk (Win/Lose)


7️⃣ ArrayList

https://github.com/daf2a/FP-OOP-5025211015/blob/67e736e49a5c603b2c858d32f870eb2f2d11bee0/FP-PBO-5025211015-2048/src/pkg2048/game/Game.java#L36-L42

scr : Game.java

ket : Arraylist digunakan sebagai tempat untuk menyimpan sprite/object balok yang masih tersisa


8️⃣ Exception Handling

https://github.com/daf2a/FP-OOP-5025211015/blob/67e736e49a5c603b2c858d32f870eb2f2d11bee0/FP-PBO-5025211015-2048/src/pkg2048/MainScreen.java#L37-L41

scr : MainScreen.java

ket : Exception Handling menggunakan metode try-catch digunakan saat kondisi gambar dari background tidak terdeteksi(error) sehingga bisa memberikan keterangan


9️⃣ GUI

https://github.com/daf2a/FP-OOP-5025211015/blob/67e736e49a5c603b2c858d32f870eb2f2d11bee0/FP-PBO-5025211015-2048/src/pkg2048/MainScreen.java#L19-L86

scr : MainScreen.java

ket : MainScreen merupakan frame awal yang timbul ketika program di run, di sini saya membuat tombol play, highscore, dan menambahkan gambar sebagai background game


🔟 Interface

https://github.com/daf2a/FP-OOP-5025211015/blob/67e736e49a5c603b2c858d32f870eb2f2d11bee0/FP-PBO-5025211015-2048/src/pkg2048/game/Game.java#L156-L178

scr : Game.java

ket : Interface di atas untuk melacak input yang diberikan oleh user, apakah ('Left', 'Right', 'Up', 'Down', 'Reset')


1️⃣1️⃣ Abstract Class

https://github.com/daf2a/FP-OOP-5025211015/blob/67e736e49a5c603b2c858d32f870eb2f2d11bee0/FP-PBO-5025211015-2048/src/pkg2048/game/Game.java#L75-L102

scr : Game.java

ket : Abstract Class digunakan sebagai fungsi res() untuk mengoutputkan hasil score game nya apakah win atau lose, dengan menggunakan fungsi hs(untuk kondisional) dan fungsi res() untuk memberikan batas setelah beberapa kali percobaan


1️⃣2️⃣ Generics

https://github.com/daf2a/FP-OOP-5025211015/blob/67e736e49a5c603b2c858d32f870eb2f2d11bee0/FP-PBO-5025211015-2048/src/pkg2048/MainScreen.java#L25-L29

https://github.com/daf2a/FP-OOP-5025211015/blob/67e736e49a5c603b2c858d32f870eb2f2d11bee0/FP-PBO-5025211015-2048/src/pkg2048/MainScreen.java#L61-L63

scr : MainScreen.java

ket : Generics Class di sini digunakan untuk menjadikan highscore ataupun string menjadi object yang dapat digunakan dalam fungsi otuput


1️⃣3️⃣ Input Output 

https://github.com/daf2a/FP-OOP-5025211015/blob/67e736e49a5c603b2c858d32f870eb2f2d11bee0/FP-PBO-5025211015-2048/src/pkg2048/game/Game.java#L44-L48

https://github.com/daf2a/FP-OOP-5025211015/blob/67e736e49a5c603b2c858d32f870eb2f2d11bee0/FP-PBO-5025211015-2048/src/pkg2048/game/Game.java#L90-L116

scr : Game.java

ket : Untuk input saya hanya menambahkan input untuk perintah reset dengan menekan keyboard 'R', Output yang diberikan berupa hasil dari game apakah menang atau kalah beserta score yang didapat juga score tertinggi yang berhasil diraih
