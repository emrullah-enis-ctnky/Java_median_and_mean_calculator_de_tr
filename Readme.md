# Median ve Aritmetik Ortalama Hesaplama

Bu proje, verilen üç sayının medyanını ve bir dizi içindeki sayıların aritmetik ortalamasını hesaplayan Java programını içerir.

## Kullanılan Fonksiyonlar

### 1. `median(int a, int b, int c)`
Bu fonksiyon, üç sayının medyanını (ortanca değerini) hesaplar.
- Medyan, üç sayıdan ortada olan değerdir.
- Karşılaştırmalar yapılarak hangi sayının ortanca olduğu belirlenir.

### 2. `median2(int a, int b, int c)`
Bu fonksiyon, üç sayının medyanını bulmak için farklı bir yöntem kullanır.
- Verilen üç sayı bir diziye atanır.
- Dizi sıralanır ve ortanca eleman döndürülür.

### 3. `mean(int numbers[])`
Bu fonksiyon, bir dizideki sayıların aritmetik ortalamasını hesaplar.
- Dizideki tüm elemanlar toplanır.
- Toplam, eleman sayısına bölünerek ortalama hesaplanır.
- **Not:** Tamsayı bölmesi kullanıldığından, ondalık kısım kaybolabilir.

## Olası Hatalar
1. **Tamsayı bölmesi:** Aritmetik ortalama hesaplanırken ondalıklı kısım kaybolabilir.
2. **Taşma (Overflow):** Büyük sayıların toplamı `int` sınırlarını aşabilir.
3. **Boş dizi:** Eğer dizi boşsa, sıfıra bölme hatası meydana gelebilir.
4. **Yuvarlama hatası:** Ondalıklı işlemler hassasiyet kaybına yol açabilir.

---

# Berechnung des Medians und des arithmetischen Mittels

Dieses Projekt enthält ein Java-Programm, das den Median von drei gegebenen Zahlen und das arithmetische Mittel eines Arrays berechnet.

## Verwendete Funktionen

### 1. `median(int a, int b, int c)`
Diese Funktion berechnet den Median von drei Zahlen.
- Der Median ist der mittlere Wert der drei Zahlen.
- Durch Vergleiche wird bestimmt, welche Zahl der Median ist.

### 2. `median2(int a, int b, int c)`
Diese Funktion verwendet eine alternative Methode zur Berechnung des Medians.
- Die drei gegebenen Zahlen werden in einem Array gespeichert.
- Das Array wird sortiert und das mittlere Element wird zurückgegeben.

### 3. `mean(int numbers[])`
Diese Funktion berechnet das arithmetische Mittel eines Arrays.
- Alle Elemente des Arrays werden addiert.
- Die Summe wird durch die Anzahl der Elemente geteilt, um den Mittelwert zu berechnen.
- **Hinweis:** Da eine ganzzahlige Division verwendet wird, geht der Nachkommaanteil verloren.

## Mögliche Probleme
1. **Ganzzahlige Division:** Beim Berechnen des arithmetischen Mittels können Nachkommastellen verloren gehen.
2. **Überlauf (Overflow):** Die Summe großer Zahlen kann den Wertebereich von `int` überschreiten.
3. **Leeres Array:** Wenn das Array leer ist, kann eine Division durch Null auftreten.
4. **Rundungsfehler:** Berechnungen mit Gleitkommazahlen können zu Präzisionsverlusten führen.

