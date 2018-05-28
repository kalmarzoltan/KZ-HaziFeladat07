1. Készítsen egy Jedi osztályt
A Jedinek lehet neve, szintje, erő és győzelmek száma.
Írjon egy InvalidJediException osztályt, ami checked exception.
Írjon egy JediProba osztályt, ami Jedi adatokat vár az argument listában. (Vagy csak hozz létre Jediket, és rakd listába)
Várja a Jedi nevét, szintjét és erejét.
Validálja a kapott adatokat:
- Elég argumentet kapott e? (RuntimeException)
- Név: 5-30 karakter hosszú szövegnek kell lennie
- Szint: Csak "padavan" és "mester" lehet
- Erő: 1-100 ig terjdő egész szám lehet.

Az adatokat ne a main metódusban validálja.
A valid adatokat egy listában tárolja.

2. Készítsen egy JediFightException checked exceptiont.

3. Készítsen a JediProba osztályban egy fight metódust, ami paraméterként 2 Jedi-t vár, eldönti, hogy melyik Jedi nyerte a párharcot, és visszatér a nyertes Jedivel.
Dobjon JediFightException-t, ha 
- A két paraméter ugyanaz az objektum
- Mester csak mesterrel, padavan csak padavannal harcolhat.
- Ha a két Jedi között több mint 30 erőpont különbség van.

Harc menete:
 - Adja össze a két erőpontot (első Jedi erőpontja = x, második Jedi erőpontja = y) és generáljon egy véletlen számot, (1, (x+y)) intervalumban.
 - Ha a véletlen szám (1, x) intervallum közzé esik, az első Jedi nyert, ha ((x + 1), (x + y)) intervallumban akkor a második Jedi nyert.

4. Növelje a nyertes Jedi győzelmeinek számát, majd írja ki a legtöbb győzelemmel rendelkező Jedi adatait.
