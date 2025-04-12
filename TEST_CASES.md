# 📋 Sistemsko Black Box Testiranje Kalkulatora

## 🧪 Test Cases 1 – Unos pogrešnih ili nepotpunih podataka

### 1.1 – Unos jednog celog broja
- **Ulaz:** `2`
- **Očekivano:** `ERROR ili 2`
- **Dobijeno:** `2.0`
- ✅ **Test: Prošao**
- 💬 Napomena: Očekivao sam samo 2, ali i 2.0 je sasvim korektno

### 1.2 – Unos jednog celog negativnog broja
- **Ulaz:** `-5`
- **Očekivano:** `ERROR ili -5`
- **Dobijeno:** `-5.0`
- ✅ **Test: Prošao**

### 1.3 – Nepotpuni izraz sa jednim brojem i operatorom
- **Ulaz:** `3+`
- **Očekivano:** `ERROR ili poruka za nepravilan format`
- **Dobijeno:** `3.0`
- ❌ **Test: Nije prošao**
- 💬 Napomena: Ovo je nekompletan izraz, očekuje se drugi operand

### 1.4 – Unos jednog decimalnog broja
- **Ulaz:** `5.23`
- **Očekivano:** `ERROR ili 5.23`
- **Dobijeno:** `5.23`
- ✅ **Test: Prošao**

### 1.5 – Unos slova umesto broja
- **Ulaz:** `a`
- **Očekivano:** `ERROR`
- **Dobijeno:** `ERROR`
- ✅ **Test: Prošao**

### 1.6 – Unos izraza sa slovom
- **Ulaz:** `5a+10`
- **Očekivano:** `ERROR ili poruka za nepravilan format`
- **Dobijeno:** `ERROR`
- ✅ **Test: Prošao**

### 1.7.1 – Unos specijalnog simbola
- **Ulaz:** `?`
- **Očekivano:** `ERROR`
- **Dobijeno:** `ERROR`
- ✅ **Test: Prošao**

### 1.7.2 – Unos izraza sa neprikladnim simbolom
- **Ulaz:** `5:+12`
- **Očekivano:** `ERROR ili poruka za nepravilan format`
- **Dobijeno:** `ERROR`
- ✅ **Test: Prošao**

### 1.7.3 – Unos izraza sa znakom jednakosti
- **Ulaz:** `10=10`
- **Očekivano:** `ERROR`
- **Dobijeno:** `ERROR`
- ✅ **Test: Prošao**

### 1.7.4 – Unos izraza sa programskim simbolom nejednakosti
- **Ulaz:** `7!=5`
- **Očekivano:** `ERROR`
- **Dobijeno:** `ERROR`
- ✅ **Test: Prošao**

### 1.8 – Unos praznog stringa
- **Ulaz:** `''`
- **Očekivano:** `ERROR ili poruka za unos praznog stringa`
- **Dobijeno:** `Obara aplikaciju`
- ❌ **Test: Nije prošao**
- 💬 Napomena: Prazan unos ne bi trebalo da obori aplikaciju – potrebno je validiranje unosa

## 🧪 Test Cases 2 – Izlaz iz programa

### 2.1 – Komanda "exit" (malim slovima)
- **Ulaz:** `exit`
- **Očekivano:** `izlaz iz programa`
- **Dobijeno:** `izlaz iz programa`
- ✅ **Test: Prošao**

### 2.2 – Komanda "Exit" (veliko slovo na početku)
- **Ulaz:** `Exit`
- **Očekivano:** `izlaz iz programa`
- **Dobijeno:** `ERROR, program ne izlazi`
- ❌ **Test: Nije prošao**
- 💬 Napomena: Korisnik ne mora da pazi na mala i velika slova, komanda treba da bude case-insensitive

## 🧪 Test Cases 3 – Aritmetički izrazi sa celim brojevima

### 3.1 – Osnovne operacije sa celim brojevima
- ℹ️ **Test:** 

### 3.1.1 – Sabiranje
- **Ulaz:** `3+5`
- **Očekivano:** `8`
- **Dobijeno:** `8.0`
- ✅ **Test: Prošao**

### 3.1.2 – Deljenje
- **Ulaz:** `10/2`
- **Očekivano:** `5`
- **Dobijeno:** `5.0`
- ✅ **Test: Prošao**

### 3.1.3 – Deljenje gde je deljenik manji
- **Ulaz:** `2/10`
- **Očekivano:** `0.2`
- **Dobijeno:** `0.2`
- ✅ **Test: Prošao**

### 3.1.4 – Oduzimanje
- **Ulaz:** `8-2`
- **Očekivano:** `6`
- **Dobijeno:** `6.0`
- ✅ **Test: Prošao**

### 3.1.5 – Oduzimanje gde je prvi broj manji
- **Ulaz:** `2-8`
- **Očekivano:** `-6`
- **Dobijeno:** `-6.0`
- ✅ **Test: Prošao**

### 3.1.6 – Množenje
- **Ulaz:** `4*3`
- **Očekivano:** `12`
- **Dobijeno:** `12.0`
- ✅ **Test: Prošao**

### 3.2 – Složeni izrazi bez zagrada
- ℹ️ **Test:** 

### 3.2.1 – Više operacija bez redosleda
- **Ulaz:** `10+15*25/5`
- **Očekivano:** `85`
- **Dobijeno:** `85.0`
- ✅ **Test: Prošao**

### 3.2.2 – Više operacija sa decimalnim rezultatom
- **Ulaz:** `2/100-35+25*50-99*101/12-5+15`
- **Očekivano:** `391.77`
- **Dobijeno:** `391.77002`
- ❌ **Test: Nije prošao**
- 💬 Napomena: Odstupanje zbog float preciznosti

### 3.3 – Složeni izrazi sa zagradama
- ℹ️ **Test:** 

### 3.3.1 – Zagrada na početku izraza
- **Ulaz:** `(10+25)/7-2`
- **Očekivano:** `3`
- **Dobijeno:** `ERROR`
- ❌ **Test: Nije prošao**
- 💬 Napomena: Zagrade nisu podržane

### 3.3.2 – Izraz sa više operacija unutar zagrade
- **Ulaz:** `5+(35-2*3+5)*10`
- **Očekivano:** `345`
- **Dobijeno:** `ERROR`
- ❌ **Test: Nije prošao**

### 3.3.3 – Više zagrada u izrazu sa decimalnim rezultatom
- **Ulaz:** `55+35/(5*4)+250/100*(300-245)+77-18`
- **Očekivano:** `253.25`
- **Dobijeno:** `ERROR`
- ❌ **Test: Nije prošao**

### 3.4 – Operacije sa velikim celim brojevima
- ℹ️ **Test:** 

### 3.4.1 – Sabiranje velikih brojeva
- **Ulaz:** `567890123987654+5`
- **Očekivano:** `567890123987659`
- **Dobijeno:** `5.678901E14`
- ❌ **Test: Nije prošao**
- 💬 Napomena: Gubitak preciznosti pri prikazu

### 3.4.2 – Množenje velikih brojeva
- **Ulaz:** `1234567*87654321`
- **Očekivano:** `108215132114007`
- **Dobijeno:** `1.0821513E14`
- ❌ **Test: Nije prošao**

### 3.4.3 – Oduzimanje velikih brojeva
- **Ulaz:** `987654-123456`
- **Očekivano:** `864198`
- **Dobijeno:** `864198.0`
- ✅ **Test: Prošao**

### 3.4.4 – Deljenje velikih brojeva
- **Ulaz:** `876543210/254`
- **Očekivano:** `3450957.5196850393`
- **Dobijeno:** `3450957.5`
- ❌ **Test: Nije prošao**

### 3.4.5 – Deljenje malog i velikog broja
- **Ulaz:** `254/654321`
- **Očekivano:** `0.0003881886719`
- **Dobijeno:** `3.8818867E-4`
- ✅ **Test: Prošao**

### 3.5 – Operacije sa decimalnim brojevima
- ℹ️ **Test:** 

### 3.5.1 – Sabiranje decimalnih brojeva
- **Ulaz:** `2.35+3.25`
- **Očekivano:** `5.6`
- **Dobijeno:** `5.6`
- ✅ **Test: Prošao**

### 3.5.2 – Sabiranje sa višedecimalnim brojem
- **Ulaz:** `2.4567890987+3.25`
- **Očekivano:** `5.7067890987`
- **Dobijeno:** `5.706789`
- ✅ **Test: Prošao**

### 3.5.3 – Množenje decimalnih brojeva
- **Ulaz:** `2.35*3.25`
- **Očekivano:** `7.6375`
- **Dobijeno:** `7.6375`
- ✅ **Test: Prošao**

### 3.5.4 – Množenje sa višedecimalnim vrednostima
- **Ulaz:** `9.8765432101*9.8765432101`
- **Očekivano:** `97.5461057809724`
- **Dobijeno:** `97.546104`
- ❌ **Test: Nije prošao**

### 3.5.5 – Deljenje decimalnih brojeva
- **Ulaz:** `8.25/2.5`
- **Očekivano:** `3.3`
- **Dobijeno:** `3.3`
- ✅ **Test: Prošao**

### 3.5.6 – Deljenje gde je deljenik manji
- **Ulaz:** `4.25/8.5`
- **Očekivano:** `0.5`
- **Dobijeno:** `0.5`
- ✅ **Test: Prošao**

### 3.5.7 – Deljenje decimalnih brojeva sa više decimala
- **Ulaz:** `9.8765432101/2.9876543210`
- **Očekivano:** `3.305785124028075`
- **Dobijeno:** `3.3057852`
- ❌ **Test: Nije prošao**

## 🧪 Test Cases 4 – Operacije sa nulom

### 4.1 – Sabiranje sa nulom
- **Ulaz:** `5+0`
- **Očekivano:** `5`
- **Dobijeno:** `5.0`
- ✅ **Test: Prošao**

### 4.2.1 – Oduzimanje nule od broja
- **Ulaz:** `5-0`
- **Očekivano:** `5`
- **Dobijeno:** `5.0`
- ✅ **Test: Prošao**

### 4.2.2 – Oduzimanje kada je nula prvi operand
- **Ulaz:** `0-5`
- **Očekivano:** `-5`
- **Dobijeno:** `-5.0`
- ✅ **Test: Prošao**

### 4.3 – Množenje sa nulom
- **Ulaz:** `5*0`
- **Očekivano:** `0`
- **Dobijeno:** `0.0`
- ✅ **Test: Prošao**

### 4.4 – Deljenje broja sa nulom
- **Ulaz:** `10/0`
- **Očekivano:** `ERROR ili poruka da deljenje sa nulom nije dozvoljeno`
- **Dobijeno:** `Infinity`
- ❌ **Test: Nije prošao**
- 💬 Napomena: Potrebno je jasno upozorenje korisniku da deljenje sa nulom nije dozvoljeno.

### 4.5 – Deljenje kada je deljenik nula
- **Ulaz:** `0/10`
- **Očekivano:** `0`
- **Dobijeno:** `0.0`
- ✅ **Test: Prošao**

## 🧪 Test Cases 5 – Operacije sa negativnim brojevima (minusne vrednosti)

### 5.1 – Aritmetički izraz počinje sa minusom
- **Ulaz:** `-4+7`
- **Očekivano:** `3`
- **Dobijeno:** `3.0`
- ✅ **Test: Prošao**

### 5.2 – Rezultat je negativan ceo broj
- **Ulaz:** `4-7`
- **Očekivano:** `-3`
- **Dobijeno:** `-3.0`
- ✅ **Test: Prošao**

### 5.3 – Oduzimanje od negativnog broja
- **Ulaz:** `-5-5`
- **Očekivano:** `-10`
- **Dobijeno:** `-10.0`
- ✅ **Test: Prošao**

### 5.4 – Rezultat je negativan decimalan broj
- **Ulaz:** `2.25-5.32`
- **Očekivano:** `-3.07`
- **Dobijeno:** `-3.0700002`
- ❌ **Test: Nije prošao**
- 💬 Napomena: Odstupanje je minimalno, ali postoji. Neprihvatljivo za naučne i finansijske proračune.

### 5.5 – Oduzimanje od negativnog decimalnog broja
- **Ulaz:** `-2.25-2.33`
- **Očekivano:** `-4.58`
- **Dobijeno:** `-4.58`
- ✅ **Test: Prošao**

### 5.6 – Izraz počinje sa negativnim decimalnim brojem
- **Ulaz:** `-2.55+4.25`
- **Očekivano:** `1.7`
- **Dobijeno:** `0.70000005`
- ❌ **Test: Nije prošao**

### 5.7 – Oduzimanje sa velikim negativnim decimalnim brojevima
- **Ulaz:** `-2.2345679876-3.9876543212`
- **Očekivano:** `-6.2222223088`
- **Dobijeno:** `-6.2222223 (zaokruženo)`
- ✅ **Test: Prošao**

### 5.8 – Množenje sa negativnim celim brojevima
- ℹ️ **Test:** 

### 5.8.1 – Prvi broj je negativan
- **Ulaz:** `-5*15`
- **Očekivano:** `-75`
- **Dobijeno:** `-75.0`
- ✅ **Test: Prošao**

### 5.8.2 – Drugi broj je negativan
- **Ulaz:** `-5*-5`
- **Očekivano:** `ERROR`
- **Dobijeno:** `ERROR`
- ✅ **Test: Prošao**

### 5.8.3 – Množenje sa dve zagrade
- **Ulaz:** `-5*(-5) ili (-5)*(-5)`
- **Očekivano:** `25`
- **Dobijeno:** `ERROR`
- ❌ **Test: Nije prošao**
- 💬 Napomena: Funkcionalnost zagrada nije podržana

### 5.9 – Deljenje sa negativnim brojevima
- ℹ️ **Test:** 

### 5.9.1 – Negativan deljenik
- **Ulaz:** `-10/2`
- **Očekivano:** `-5`
- **Dobijeno:** `-5.0`
- ✅ **Test: Prošao**

### 5.9.2 – Negativan delilac
- **Ulaz:** `10/-2`
- **Očekivano:** `ERROR`
- **Dobijeno:** `ERROR`
- ✅ **Test: Prošao**

### 5.9.3 – Deljenje sa zagradom
- **Ulaz:** `10/(-2)`
- **Očekivano:** `-5`
- **Dobijeno:** `ERROR`
- ❌ **Test: Nije prošao**

## 🧪 Test Cases 6 – Operacije sa procentima

### 6.1 – Procenat ispred broja
- **Ulaz:** `%25`
- **Očekivano:** `0.25 ili ERROR`
- **Dobijeno:** `ERROR`
- ✅ **Test: Prošao**

### 6.2 – Procenat nakon broja
- **Ulaz:** `25%`
- **Očekivano:** `0.25 ili ERROR`
- **Dobijeno:** `ERROR`
- ✅ **Test: Prošao**

### 6.3 – Procenat u izrazu sa množenjem
- **Ulaz:** `25%*100`
- **Očekivano:** `25 ili ERROR`
- **Dobijeno:** `ERROR`
- ✅ **Test: Prošao**
- 💬 Napomena: Poželjno je da funkcionalnost procenta bude podržana, jer se često koristi u svakodnevnim proračunima.

## 🧪 Test Cases 7 – Operacija "stepena broja"

### 7.1 – Kvadrat broja sa dve zvezdice (**)
- **Ulaz:** `3**2`
- **Očekivano:** `9 ili ERROR`
- **Dobijeno:** `ERROR`
- ✅ **Test: Prošao**

### 7.2 – Kub sa dve zvezdice (**)
- **Ulaz:** `2**3`
- **Očekivano:** `8 ili ERROR`
- **Dobijeno:** `ERROR`
- ✅ **Test: Prošao**

### 7.3 – Kvadrat sa simbolom ^
- **Ulaz:** `3^2`
- **Očekivano:** `9 ili ERROR`
- **Dobijeno:** `ERROR`
- ✅ **Test: Prošao**

### 7.4 – Kub sa simbolom ^
- **Ulaz:** `2^3`
- **Očekivano:** `8 ili ERROR`
- **Dobijeno:** `ERROR`
- ✅ **Test: Prošao**
- 💬 Napomena: Preporučuje se podrška za operaciju stepenovanja zbog česte primene u naučnim i tehničkim proračunima.

---

## 📌 Zapažanja i Preporuke

### 🔍 Zapažanja:
- ✅ Kalkulator uglavnom korektno izvršava osnovne aritmetičke operacije nad celim brojevima.
- ✅ Većina izraza sa decimalnim brojevima prolazi uspešno, uz minimalna odstupanja zbog korišćenja float ili double tipova.
- ❌ Zagrade nisu podržane u izrazu, što onemogućava izračunavanje složenijih izraza sa definisanim redosledom operacija.
- ❌ Deljenje sa nulom vraća `Infinity` umesto očekivanog `ERROR` ili informativne poruke.
- ❌ Podrška za procentualne izraze (`25%`) i stepenovanje (`^`, `**`) nije implementirana.
- ❌ Komanda `exit` je case-sensitive, što može zbuniti korisnika.
- 📉 Veliki brojevi (više od 13 cifara) i brojevi sa više od 10 decimala gube preciznost zbog ograničenja u numeričkim tipovima.

### ✅ Preporuke:
- 🛡️ Implementirati proveru za deljenje sa nulom sa eksplicitnom porukom: *"Deljenje sa nulom nije dozvoljeno."*
- 🧮 Dodati podršku za zagrade u aritmetičkim izrazima radi složenijih proračuna i kontrole redosleda operacija.
- 🔡 Omogućiti prepoznavanje komande `exit` nezavisno od velikih i malih slova (koristeći `equalsIgnoreCase` ili slično).
- 💰 Umesto `float`, koristiti `BigDecimal` za precizne decimalne operacije u finansijskim i naučnim proračunima.
- 📈 Razmotriti implementaciju podrške za:
  - Procente: `25%` kao `0.25`
  - Stepenovanje: `2^3`, `3**2`
- 🧾 Pojednostaviti ili zaokružiti decimalne rezultate na maksimalno 6 ili 9 decimala za prikaz korisniku.
- 🔬 Izbegavati naučnu notaciju u prikazu velikih rezultata kad god je moguće, radi bolje čitljivosti.

---