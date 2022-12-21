package com.example.bungalaundry.database
/*
 * Copyright (c) 2019 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

object CheeseUtil {

  var CHEESES = arrayOf("Aarav", "Abian", "Abraham", "Aciel", "Adam", "Adelard", "Adelio", "Adhitama", "Aditya", "Adnan",
      "Adrian", "Adya","Agam", "Agler", "Aileen", "Aksa", "Aldari", "Alexi", "Aliando", "Alvaro", "Ansel", "Arkana", "Arsenio",
      "Arvin", "August", "Axel", "Azada", "Aziel", "Azri", "Azura", "Badar", "Bagas", "Bahri", "Baim", "Balin", "Baron", "Barry",
      "Bashar", "Basil", "Bastian", "Bayan", "Baylor", "Ben", "Brady", "Brandon", "Brian", "Buana", "Cakra", "Caleb", "Cana", "Candra",
      "Carel", "Carim", "Carlos", "Carya", "Cashel", "Cavan", "Cemal", "Chris", "Clovis", "Coman", "Cullen", "Dafa", "Daffin", "Daiyan",
      "Damar", "Damian", "Daniel", "Danish", "Dareen", "Darel", "Darius", "Dary", "David", "Dawud", "Drax", "Delana", "Delvin", "Deon",
      "Dermot", "Desmon", "Devan", "Dilan", "Ducan", "Dylan", "Dzaki", "Edwin", "Edzard", "Elard", "Eliot", "Eliseo", "Elvano", "Emery",
      "Emilio", "Ephraim", "Eric", "Ersya", "Ervin", "Evano", "Evans", "Ezra", "Fdlan", "Fahar", "Faid", "Faiz", "Faiq", "Fakhri", "Farel",
      "Faresta", "Faris", "Farzan", "Fatih", "Fauzan", "Felix", "Ferdi", "Fergus", "Finn", "Fintan", "Fransisco", "Frey", "Galaxy", "Galen",
      "Galih", "Gandhi", "Garett", "Garry", "Gavin", "Gaza", "Gerald", "Ghaffar", "Ghazi", "Ghibran", "Gilang", "Haddad", "Hafidh", "Haidar",
      "Haiyan", "Haris", "Harry", "Hart", "Hartigan", "Harun", "Hedy", "Horation", "Ian", "Ilham", "Iqbal", "Irfan", "Irsyad", "Ivan",
      "Ivander", "Ivar", "Jabar", "Jalil", "Jamal", "Janu", "Jarvis", "Jauzan", "Jazil", "Jupiter", "Kabir", "Kadim", "Kafa", "Kaili",
      "Kalandra", "Kamal", "Keanu", "Keenan", "Kendrick", "Kenzo", "Khalid", "Killian", "Kyler", "Labib", "Lais", "Lamont", "Latif", "Lemuel",
      "Liam", "Lukman", "Lutfi", "Lyman", "Maarif", "Mahir", "Majid", "Malik", "Mallory", "Maula", "Marva", "Michael", "Miftah", "Mody",
      "Mulin", "Naaman", "Nabil", "Nadim", "Nadira", "Naim", "Nanda", "Nasir", "Nathan", "Naufal", "Naya", "Oliv", "Omay", "Osi", "Osita",
      "Owen", "Paraz", "Pasha", "Pashi", "Pratu", "praya", "Qaid", "Qamar", "Qasim", "Qiya", "Quinn", "Quirin", "Raden", "Radi", "Raditya",
      "Rafi", "Rain", "Ratna", "Ratu", "Rasyi", "Rayyanza", "Saad", "Sadam", "Safwan", "Sakya", "Saleh", "Salma", "Salmi", "Sameet", "Samuel",
      "Seth", "Simon", "Taksa", "Theo", "Thomi", "Tony", "Tristan", "Tyaga", "Ubadah", "Ubayd", "Ulfat", "Ulfay", "Umair", "Umar", "Umayr",
      "Umayyarh", "Umran", "Usamah", "Usayd", "Usman", "Uzayr", "Wafa", "Wafi", "Wafiq", "Waheed", "Whhay", "Wahid", "Wajid", "Wali", "Wsaim",
      "Wasif", "Wildan", "Yafi", "Yhaya", "Yaqub", "Yaseen", "Yasir", "Yunus", "Yusuf", "Yazid", "Zeem", "Zafar", "Zaheer", "Zaim", "Zain",
      "Zakariya", "Zaki", "Zakir", "Zarrir", "Zayan", "Zayd", "Zeeshan", "Zohair", "Zubair", "Zufar")
}