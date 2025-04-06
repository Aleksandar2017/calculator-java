## Izveštaj o LOC i analizi koda

### LOC (Lines of Code)

- Fajlovi: 2 (.java)
- Ukupno linija: 214  
  (od toga `Calculator.java`: 188, `Start.java`: 26)
- Mereno u:  
  Razvojnom okruženju **Visual Studio Code**, uz ugrađenu analizu broja linija.

---

### Neformalni pregled – Start.java

**Start.java – linija 9** – Scanner se inicijalizuje u svakoj iteraciji → predlog: inicijalizovati jednom, izvan while-petlje  
**Start.java – linija 15** – Unos korisnika ne proverava velika i mala slova → predlog: koristiti `.equalsIgnoreCase("exit")` 

---

### Neformalni pregled – Calculator.java

**Calculator.java – linija 18** – Metod `ToString()` vraća operatore bez garantovanog prioriteta → predlog: koristiti strukturu sa redosledom  
**Calculator.java – linija 34** – Izraz `0 + expression` bez navodnika može izazvati grešku → predlog: `"0" + expression`  
**Calculator.java – linija 64** – Preopšta obrada grešaka prilikom parsiranja → predlog: dodati informaciju o grešci ili logovanje  
**Calculator.java – metod `Calculate()` – linija 74** – Mnogo ponovljenog koda za svaku operaciju → predlog: refaktorisati korišćenjem posebne funkcije za operacije

---

### Statička analiza pomoću SonarLint (SonarQube pravila)

#### Calculator.java

- Linija 1 – [S1220] – Fajl nije u imenovanom paketu → predlog: dodati `package calculator;` ili odgovarajući naziv
- Linija 4 – [S1118] – Klasa sadrži samo statičke metode → predlog: dodati privatni konstruktor da bi se sprečilo instanciranje
- Linija 18 – [S1845/S100] – Metod `ToString()` može zbuniti zbog sličnosti sa `toString()` iz 'Object' klase → predlog: preimenovati u `getOperatorSymbols()`
- Linija 24 – [S100] – Ime `Run` ne prati Java naming convention → predlog: preimenovati u `run`
- Linija 70 – [S1488] – Promenljiva `textResult` je suvišna → predlog: direktno vratiti `Float.toString(...)`
- Linija 74 – [S100] – Ime metoda `Calculate` ne prati stil pisanja → predlog: `calculate`
- Linija 183 – [S3626] – Suvišan `return` → predlog: ukloniti

#### Start.java

- Linija 1 – [S1220] – Fajl nije u imenovanom paketu → predlog: dodati `package calculator;`
- Linija 6 – [S117] – Promenljiva `Expression` ne prati konvenciju imenovanja → predlog: `expression`
- Linija 8 – [S106] – Korišćenje `System.out.println()` → predlog: koristiti logovanje (npr. Java Logger)
- Linija 19 – [S106] – Ponavljeno korišćenje `System.out.println()` → predlog ostaje isti: koristiti logger

---

### Predlozi za poboljšanja i zaključci

- **Korišćenje imenovanih paketa**: Sve klase su u podrazumevanom paketu – preporuka je premeštanje u imenovani paket (npr. `package calculator;`)
- **Imenovanje metoda i promenljivih**: Pratiti Java naming convention → metode i promenljive u camelCase formatu (`Run` → `run`, `Expression` → `expression`)
- **Refaktorisanje metoda `Calculate()`**: Metod je dugačak i sadrži puno ponovljenog koda → predlog: izdvojiti operacije u posebne metode ili koristiti funkcionalni pristup
- **Logovanje umesto `System.out.println()`**: Za bolju kontrolu i održavanje, preporučuje se korišćenje Java Logger API-ja
- **Metod `ToString()`** u klasi `Operations` treba preimenovati da ne bi bio zbunjujući u odnosu na `toString()` iz 'Object' klase
- **Obrada grešaka**: Umesto `return "ERROR"` bez dodatnih informacija, korisno bi bilo prikazati jasniju poruku ili evidentirati grešku putem loga

---

### Dodatne informacije

Projekat uključuje `LICENSE` fajl sa MIT licencom, koja omogućava slobodno korišćenje, modifikaciju i distribuciju softvera.  
MIT licenca se ne uključuje u LOC izračun niti se analizira kao izvorni kod.