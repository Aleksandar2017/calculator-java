SISTEMSKO BLACK BOX TESTIRANJE KALKULATORA

Test Cases 1 - Unos pogrešnih ili nekompletnih podataka

Case 1.1 – Unos jednog celog broja: 2 → ✅ 2.0 (Prošao)

Case 1.2 – Unos jednog celog negativnog broja: -5 → ✅ -5.0 (Prošao)

Case 1.3 – Nezavršen izraz: 3+ → ❌ 3.0 (Nije prošao)

Case 1.4 – Decimalni broj: 5.23 → ✅ 5.23 (Prošao)

Case 1.5 – Slovo: a → ✅ ERROR (Prošao)

Case 1.6 – Slovo u izrazu: 5a+10 → ✅ ERROR (Prošao)

Case 1.7.1 – Specijalan simbol: ? → ✅ ERROR (Prošao)

Case 1.7.2 – Simbol u izrazu: 5:+12 → ✅ ERROR (Prošao)

Case 1.7.3 – Jednakost: 10=10 → ✅ ERROR (Prošao)

Case 1.7.4 – Programska nejednakost: 7!=5 → ✅ ERROR (Prošao)

Case 1.8 – Prazan string: '' → ❌ Obara aplikaciju (Nije prošao)

Test Cases 2 - Izlaz iz programa

Case 2.1 – exit → ✅ Izlaz (Prošao)

Case 2.2 – Exit → ❌ ERROR (Nije prošao)

Test Cases 3 - Osnovne operacije sa celim brojevima

3.1.1 – 3+5 → ✅ 8.0 (Prošao)

3.1.2 – 10/2 → ✅ 5.0 (Prošao)

3.1.3 – 2/10 → ✅ 0.2 (Prošao)

3.1.4 – 8-2 → ✅ 6.0 (Prošao)

3.1.5 – 2-8 → ✅ -6.0 (Prošao)

3.1.6 – 4*3 → ✅ 12.0 (Prošao)

Test Cases 3.2 - Složeni izrazi bez zagrada

3.2.1 – 10+15*25/5 → ✅ 85.0 (Prošao)

3.2.2 – 2/100-35+25*50-99*101/12-5+15 → ❌ 391.77002 (Nije prošao)

Test Cases 3.3 - Složeni izrazi sa zagradama

3.3.1 – (10+25)/7-2 → ❌ ERROR (Nije prošao)

3.3.2 – 5+(35-2*3+5)*10 → ❌ ERROR (Nije prošao)

3.3.3 – 55+35/(5*4)+250/100*(300-245)+77-18 → ❌ ERROR (Nije prošao)

Test Cases 3.4 - Veliki brojevi

3.4.1 – 567890123987654+5 → ❌ 5.678901E14 (Nije prošao)

3.4.2 – 1234567*87654321 → ❌ 1.0821513E14 (Nije prošao)

3.4.3 – 987654-123456 → ✅ 864198.0 (Prošao)

3.4.4 – 876543210/254 → ❌ 3450957.5 (Nije prošao)

3.4.5 – 254/654321 → ✅ 0.0003881887 (Prošao)

Test Cases 3.5 - Decimalni brojevi

3.5.1 – 2.35+3.25 → ✅ 5.6 (Prošao)

3.5.2 – 2.4567890987+3.25 → ✅ 5.706789 (Prošao)

3.5.3 – 2.35*3.25 → ✅ 7.6375 (Prošao)

3.5.4 – 9.8765432101*9.8765432101 → ❌ 97.546104 (Nije prošao)

3.5.5 – 8.25/2.5 → ✅ 3.3 (Prošao)

3.5.6 – 4.25/8.5 → ✅ 0.5 (Prošao)

3.5.7 – 9.8765432101/2.9876543210 → ❌ 3.3057852 (Nije prošao)

Test Cases 4 - Operacije sa nulom

4.1 – 5+0 → ✅ 5.0 (Prošao)

4.2.1 – 5-0 → ✅ 5.0 (Prošao)

4.2.2 – 0-5 → ✅ -5.0 (Prošao)

4.3 – 5*0 → ✅ 0.0 (Prošao)

4.4 – 10/0 → ❌ Infinity (Nije prošao)

4.5 – 0/10 → ✅ 0.0 (Prošao)

Test Cases 5 - Negativni brojevi

-4+7 → ✅ 3.0 (Prošao)

4-7 → ✅ -3.0 (Prošao)

-5-5 → ✅ -10.0 (Prošao)

2.25-5.32 → ❌ -3.0700002 (Nije prošao)

-2.25-2.33 → ✅ -4.58 (Prošao)

-2.55+4.25 → ❌ 0.70000005 (Nije prošao)

-2.2345679876-3.9876543212 → ✅ -6.2222223 (Prošao)

-5*15 → ✅ -75.0 (Prošao)

-5*-5 → ✅ ERROR (Prošao)

-5*(-5) → ❌ ERROR (Nije prošao)

-10/2 → ✅ -5.0 (Prošao)

10/-2 → ✅ ERROR (Prošao)

10/(-2) → ❌ ERROR (Nije prošao)

Test Cases 6 - Procenti

%25 → ✅ ERROR (Prošao)

25% → ✅ ERROR (Prošao)

25%*100 → ✅ ERROR (Prošao)

Test Cases 7 - Stepenovanje

3**2 → ✅ ERROR (Prošao)

2**3 → ✅ ERROR (Prošao)

3^2 → ✅ ERROR (Prošao)

2^3 → ✅ ERROR (Prošao)

Zapažanja

Većina osnovnih aritmetičkih operacija funkcioniše ispravno.

Decimalni izrazi imaju odstupanja u preciznosti zbog float/double.

Zagrade nisu podržane, što otežava rad sa složenim izrazima.

Deljenje sa nulom vraća "Infinity" – nejasan rezultat.

Komanda exit je "case-sensitive".

Stepenovanje i procenti nisu podržani.

Veliki brojevi i decimalni izrazi sa više od 10 cifara gube tačnost.

Preporuke

Implementirati podršku za zagrade.

Dodati jasnu poruku za deljenje sa nulom.

Omogućiti exit nezavisno od velikih/malih slova.

Zameniti float sa BigDecimal za tačne izračune.

Implementirati podršku za stepene (^, **) i procente (%).

Izbegavati naučnu notaciju pri prikazu rezultata.

Zaokruživanje rezultata na najviše 6 do 9 decimala. 