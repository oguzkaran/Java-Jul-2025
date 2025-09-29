### C ve Sistem Programcıları Derneği
### Java ile Nesne Yönelimli Programlama
### Eğitmen: Oğuz KARAN

###### 28 Temmuz 2025 - 30 Temmuz 2025

> Java 1995 yılında Sun firması'nda çalışan `James Gosling` tarafından tasarlanmıştır. Sun firması daha sonra Oracle tarafından satın alınmıştır ve şu an Java aslında Oracle firmasına aittir. Java 1.0 versiyonu ile çıkmıştır. Şu an, 18 Mart 2025 itibariyle Java 24 son sürüm olarak ilan edilmiştir. Java ismi hem programlama diline hem de ortama verilen genel bir isimdir. Java'da yıllar içerisinde pek çok değişiklikler olmuştur. Bu anlamda bazı sürümler majör bazı eklentilerle ve değişikliklerle yayınlanmıştır. Majör değişiklikler genel olarak programlama yaklaşımının bile değişebilmesine yol açabilen değişiklikleri kapsar. Bu anlamda programlama dilinde ve ortamında da değişiklikler olabilmektedir. Java sürümleri içerisinde majör değişikliklerin en belirgin olduğu iki sürüm Java 5 ve Java 8 sürümleridir. Bu sürümlerde Java'ya hem ortam hem de programlama dili anlamında radikal eklentiler yapılmıştır. Bazı sürümlerde yine önemli eklentiler olabilir ancak bunların sayısı az olabilmektedir. Örneğin Java 7, Java 11, Java 17 ve Java 21 sürümleri bu şekildedir. Yine bazı sürümlerde çok önemli olmayan da değişiklikler olabilmektedir. Bazı sürümlerde eklenen değişiklikler **preview/experimental** denilen biçimdedir. Bu değişiklikler doğrudan kullanılamaz. Derleme işleminde bir takım switch'lerin verilmesi gerekir. 

##### Java Ortamının Temel Özellikleri

> **1. Ara kodlu Çalışma Sistemi:** C, C++ ve Go gibi dillerde yazılan kodlardan elde edilen (hangi aşamalardan geçilerek elde edildiği şu an için önemsizdir) `çalışabilir dosya (executable file)` sisteme (genel olarak işletim sistemi, donanım vb.) özgüdür ve bazı durumlarda yazılan kodlar her sisteme göre ayrı olabilmektedir. Eğer kod sistemden bağımsız olarak yani standart olarak yazılmışsa bile her sistem için ayrı executable file'lar elde edilmelidir. Oysa Java programlama dili ile yazılmış bir program derlendiğinde (compilation) elde edilen dosyanın içerisinde hiç bir sistemin dili olmayan yapay bir kod bulunur. Bu ara koda Java dünyasında **byte code (BC)** denilmektedir. **BC doğrudan çalıştırılamaz.** Çalıştırılabilmesi için ayrı bir uygulama gerekir. Bu uygulama BC'yi yorumlayarak makine koduna yani sisteme özgü koda dönüştürerek programı çalıştırır. Bu dönüştürme işlemine **JIT (Just In Time) compilation** denilmektedir. Geliştirme ve çalıştırma ortamında 3 tane temel kavram söz konusudur:
> - **JVM (Java Virtual Machine):** BC'yi makine koduna dönüştürür. JVM aslında BC'nin nasıl makine koduna dönüştürüleceğini tanımlayan soyut bir kavramdır.
>
> - **JRE (Java Runtime Environment):** Genel olarak Java ile yazılmış bir uygulamayı çalıştırmak (run) için gereken araçları ve uygulamaları içeren bir pakettir. Yani BC elde edildiğinde çalıştırılabilmesi için JRE'ye ihtiyaç vardır. 
> 
> - **JDK (Java Development Kit):** Geliştirme (development) araçlarını ve çalıştırma araçlarının bir çoğunu içeren bir pakettir. Buradaki çalıştırma araçları geliştirme aşamasında kullanılabilmektedir. 
> 
> Java 11 ile birlikte ticari kullanımlarda Oracle tarafından bazı değişikliklere gidilmiştir. Özet (genel) olarak şunlar söylenebilir: Java'da geliştirme ortamı ücretsizdir. Çalıştırma araçları kullanılan araca göre ücretlendirilebilmektedir. Tamamen ücretsiz olarak kullanılabilen çalıştırma araçları da mevcuttur. Bunlardan en tipik olanı `Open JRE`'dir. Burada anlatılanların detayları olduğu unutulmamalıdır. 
> 
> Java 11 ile `Long Term Support (LTS)` kavramı getirilmiştir. LTS sürümleri uzun süre desteklenen ve güncellemesi (hızlandırılması, hataların düzeltilmesi (bugfix) vb) uzun süre yapılan sürümlerdir. Java'da Java 8, 11, 17 ve 21 sürümleri LTS'dir. Ticari uygulamalarda genel olarak (hatta her zaman) LTS sürümleri kullanılır. 
> 
> Ara kodlu çalışma sisteminin en önemli avantajı geliştirilen uygulamaların genel olarak sistemden bağımsız olarak çalıştırılabilmesidir. Bu kavrama `Write Once Run Anywhere (WORA)` denilmektedir. Şüphesiz bunun da ayrıntıları ve istisnaları vardır. 
> 
> Ayrıca unutulmamalıdır ki ara kodlu çalışma sistemi az da olsa bir performans kaybına yol açar. Ancak Java'nın hedeflediği uygulamalar düşünüldüğünde bu kaybın pek de önemi yoktur.


**Anahtar Notlar:*** Aslında Java'da istenirse sisteme özgü çalışabilen bir executable file da son yıllarda elde edilebilmektedir. Bu işlem için genel olarak GraalVM kullanılmaktadır. GraalVM kullanımının belirli kısıtları olabilmektedir. GraalVM ve detayları `Java ile Uygulama 2` kursunda ele alınacaktır.
 
> **2. Hızlı Uygulama Geliştirme Ortamı:** Java `hızlı uygulama geliştirme (rapid application development)` ortamı sunar. Bu anlamda hem öğrenmesi kolaydır hem de ürün çabuk elde edilir.
> 
> **3. Geniş bir sınıf kütüphanesi:** Java'da oldukça geniş sınıf kütüphanesi bulunur. Dosya işlemleri, veritabanı işlemleri vb. işlemler için hazır sınıflar bulunur. Java'nın standart olarak kullanılan kütüphanelerine  `Java Standard Edition (Java SE)` denilmektedir. Ayrıca Java programlamada pratikte başka kişiler, organizasyonlar ve firmalar tarafından geliştirilmiş adeta standart gibi kullanılan pek çok kütüphane de bulunmaktadır.
> 
> **4. Güvenli çalışma ortamı:** Java'da yazılmış olan bir programın sisteme zarar verme olasılığı çok daha azdır. Yazılan bir program yüzünden yanlışlıkla sistemde bir problem olma olasılığı oldukça düşüktür.
##### Dil Kavramı

>İletişimde kullanılan sembollere dil (language) denir. Dilin kurallarına gramer denir. Bir olgu en az aşağıdaki iki özelliğe sahipse bir dildir:
>
>**- Syntax:** Dilin öğelerinin doğru dizilimine denir. Örneğin "I am a programmer" cümlesinde dilin öğeleri doğru dizilmiştir. Cümle "am a programmer I" biçiminde yazılmış olsaydı syntax olarak hatalı olurdu.
>
>**- Semantic:** Doğru dizilmiş öğelerin anlamına denir. Öğeler doğru dizilse bile cümle anlamlı değilse yine hatalıdır.
>
>Doğal dillerde (natural languages) syntax ve semantic dışında da öğeler bulunur. Bilgisayar bilimlerinde kullanılmak üzere tasarlanmış dillere **bilgisayar dilleri (computer languages)** denir. Bir bilgisayar dili **akış (flow)** içeriyorsa, o dile **programlama dili (programming language)** denir. Bu anlamda her programlama dili bir bilgisayar dilidir ancak her bilgisayar dili bir programlama dili olmayabilir. Örneğin, `XML` ve `HTML` programlama dilleri değildir ancak bilgisayar dilleridir. Bu anlamda Java akış içerdiğinden bir programlama dilidir. 
>
>Programlama dilleri zaman içerisinde birbirlerinden esinlenmişlerdir. Hatta bazı programlama kalıpları da bazı dillerden alınarak kullanılmaktadır. 
##### Programlama Dillerinin Sınıflandırılması

>Programlama dilleri çeşitli biçimlerde sınıflandırılabilse de genel olarak 3 şekilde sınıflandırma eğilimi söz konusudur:
>
>**- Seviyelerine göre sınıflandırma:** Programlama dilinin seviyesi (level) onun insan algısına yakınlığının bir ölçüsüdür. Yüksek seseviyeli diller (high level languages) hem dil özellikleri, hem de uygulama geliştirme anlamında insan algısına yakınlıkları dolayısıyla genel olarak daha kolay öğrenilirler. Düşük seviyeli diller (low level languages) makineye daha yakın dillerdir. Olabilecek en düşük seviyeli dil makine dilidir (machine language).
>
>**- Programlama modeline göre sınıflandıma:** Bir programı yazarken kullanılan genel model (paradigm) önemlidir. Bazı dillerde sınıf yoktur. Program çeşitli alt programların (function) bir araya getirilmesiyle yazılır. Bu modele `procedurel model` denir. Bazı dillerde sınıflar vardır ve programlar sınıflar kullanılarak yazılır. Bu modele `nesne yönelimli model (object oriented model)` denir. Bazı dillerde programlar matematiksel formül yazıyormuş gibi yazılır. Bu tarz programlama modeline `fonksiyonel model (functional model)` denir. Bazı diller birden fazla modeli desteklerler. Bu tarz dillere `multi-paradigm languages` denilmektedir. Birden fazla modeli destekleyen diller, modellerin tüm özelliklerini desteklemeyebilirler. 
>
>**- Kullanım alanına göre sınıflandırma:**  Dilin hangi alanlarda kullanılabileceğine göre sınıflandırmadır. Bazı diller birden fazla alanda kullanılabilirler. Bazı diller ise sadece bir alanda kullanılabilirler. Bu anlamda genel amaçlı diller, bilimsel ve mühendislik dilleri, veritabanı dilleri, oyun ve animasyon dilleri, yapay zeka dilleri vb. alanlar için diller söz konusu olabilmektedir.
>
>Buna göre Java, bilimsel ve mühendislik alanlarında, web uygulamalarında, yapay zeka uygulamalarında, mobil programlamada vb. kullanılabilen genel amaçlı, yüksek seviyeli, nesne yönelimli programlama modeli ile uygulama geliştirilebilen ve özellikle Java 8 ile birlikte fonksiyonel programlama modelinin de belirli ölçüde kullanılabildiği multi-paradigm bir dildir.
>

**Anahtar Notlar:** Bir dilin bir çok alanda kullanılması, pratikte de ilgili alanda kullanılacağı anlamına gelmez. Bir alanda daha etkin kullanılabilen bir dil varsa o dil daha fazla tercih edilebilir.

**Anahtar Notlar:** Yukarıda anlatılan kavramların detayları vardır. Zaman içerisinde anlaşılacaktır.

###### 4 Ağustos 2025
##### Temel Kavramlar

>Bu bölümde programlamada da kullanılan bazı kavramlar temel düzeyde olarak ele alınacaktır.

###### Çevirici Programlar, Derleyiciler ve Yorumlayıcılar

> Bir dilde yazılmış olan programı başka bir dile çeviren programlara **çevirici program (translator)** denir. Çevirici programlarda bir **kaynak dil (source language)** ve bir **hedef dil (target/destination language)** vardır. Kaynak dil yüksek seviyeli, hedef dil düşük seviyeli ise bu durumda çevirici programa **derleyici (compiler)** denir. Örneğin Java programlama dilinden Kotlin programlama diline dönüştürme yapan program bir translator, Java programlama dilinden BC'ye dönüştüren program ise bir derleyicidir. JVM'in BC'yi makine koduna dönüştürme faaliyeti de bir derleme işlemidir. Bu sebeple buna `JIT compilation` denir. Bazı dillerde yazılan programlar herhangi bir kod üretilmeden çalıştırılırlar. Bu tarz çalıştırma yapan programlara **yorumlayıcı (interpreter)** denir. Bazı diller hem derleyici ile hem de yorumlayıcı ile kullanılabilirler. Java pratikte derleyici ile kullanılan, Java 11 ile birlikte yorumlayıcı ile de kullanılabilebilen bir programlama dilidir. Yorumlayıcı ile kullanımı bu kursta ele alınmayacaktır. Yorumlayıcı ile kullanılan diller derleyici ile kullanılan dillere göre daha yavaş olma eğilimindedir. 

**Anahtar Notlar:** Bir uygulama tek bir java dosyasından oluşmak zorunda değildir. Hatta bir Java uygulaması yalnızca Java kodlarından da oluşmak zorunda değildir. Bu durumda farklı Java dosyaları ayrı ayrı derlenir. Hattı aynı dosyada bulunan farklı sınıflar bile ayrı ayrı derlenir. Bir ürün aslında tüm birimlerinin uygun şekilde derlenmesi ve ele alınması (handling) ile elde edilir. Bu işlem için genel olarak `build` terimi kullanılır. Build işlemi yalnızca derleme işlemi değildir. Yani bir uygulamanın ürün olarak elde edilme süreci build işlemidir. Burada anlatıların detayları konular içerisinde ele alınacaktır.

###### İşletim Sistemi
 
>İşletim sistemi (operating system) makinenin donanımını yöneten, bilgisayar ile kullanıcı arasında bir köprü oluşturan yazılımdır. Bir işletim sisteminin pek çok görevi vardır. Programları çalıştırmak, çeşitli cihazları ve aygıtları yönetmek, dosyaları ve dizinleri  (directory) organize etmek vb. görevler sayılabilir. İşletim sistemleri `genel olarak` iki gruba ayrılabilir: **masaüstü işletim sistemleri (desktop operating systems), mobil işletim sistemleri (mobile operating systems).** Şüphesiz başka çeşit işletim sistemleri de vardır. Popüler masaüstü işletim sistemleri `Windows, Mac OS X, Unix, Linux dağıtımları` gibi işletim sistemleridir. Popüler mobil işletim sistemleri `Android` ve `IOS`'dur.

###### Açık kaynak kodlu yazılım, özgür yazılım ve mülkiyete sahip yazılım

>`Özgür yazılım (free software)` ve `açık kaynak kodlu (open source) yazılımlar` arasında farklar olsa da genel olarak aşağıdaki ortak özelliklere sahiptirler:
>- Bedavadır. Kullanılabilmesi için herhangi bir lisans gerekmez.
>- Kaynak kodlar sahiplenilemez. Kaynak koda ekleme yapıldığında ya da bir kaynak kod kullanıldığında kodlar kapatılamaz. Onların da açılması gerekir.
>- Çoğaltılabilir, izin almadan kullanılabilir.
>
>Bunun tam tersi mülkiyete sahip (propriatery) yazlımlardır. Bu yazılımlar para verilerek kullanılır ve izin almadan çoğaltılamaz.

###### IDE (Integrated Development Environment)

>Derleyiciler ve yorumlayıcılar komut satırından çalışan ve basit arayüzlere sahip programlardır. Aslında teorik olarak bir uygulamadaki tüm Java dosyaları ve diğer dosyalar basit bir editör programla yazılıp komut satırından derlenebilir. Ancak bu, uygulama büyüdükçe zahmetli olmaya başlar. Bu da programcıya zaman kaybettirir. Bu amaçla pratikte yazılım geliştirmeyi kolaylaştırmak için IDE denilen yazılımlar kullanılır. IDE'lerde örneğin bir takım yardımlar veren editörler, tasarım araçları, test araçları, debug araçları vb. programcının geliştirme sırasında kullandığı araçlar bulunur. Java ile uygulama geliştirmede iki tane IDE yoğun olarak kullanılmaktadır: **Eclipse, IntelliJIDEA**. Biz kursumuzda belirli bir zaman (yaklaşık kursun yarısına kadar) Eclipse, sonrasında IntelliJIDEA kullanacağız.

##### Sembollerin İngilizce karşılıkları

| Sembol | İngilizce Karşılığı                                         |
| ------ | ----------------------------------------------------------- |
| +      | plus                                                        |
| -      | minus, hyphen, dash                                         |
| *      | asterisk                                                    |
| /      | slash                                                       |
| \      | backslash                                                   |
| .      | period, dot                                                 |
| ,      | comma                                                       |
| :      | colon                                                       |
| ;      | semicolon                                                   |
| “      | double quote                                                |
| '      | single quote                                                |
| (...)  | parenthesis left, right, opening, closing                   |
| [...]  | (square/brackets) parenthesis left, right, opening, closing |
| {...}  | curly brace left, right, opening, closing                   |
| =      | equal sign                                                  |
| &      | ampersand                                                   |
| ~      | tilda                                                       |
| @      | at                                                          |
| <...>  | less than, greater than, angular bracket                    |
| ^      | caret                                                       |
| \|     | pipe                                                        |
| _      | underscore                                                  |
| ?      | question mark                                               |
| #      | sharp, number sign                                          |
| %      | percent sign                                                |
| !      | exclamation mark                                            |
| $      | dollar sign                                                 |
| ...    | ellipsis                                                    |

##### JDK Kurulumu ve Bilgisayarın Java ile Geliştirme Yapmaya Hazır Hale Getirilmesi

>JDK'nın kurulumu için işletim sistemine göre aşağıdaki bağlantıdan `installer` program elde edilebilir: [https://www.oracle.com/tr/java/technologies/downloads/#java21](https://www.oracle.com/tr/java/technologies/downloads/#java21)
>
>Burada `LTS` olması açısında minimum `Java 17` kurulması önerilir. Bununla birlikte `Java 21` ile eklenen bazı özellikler de kursumuzda ele alınacağından `Java 21` kurulması daha iyi olabilmektedir. Kurulum aşamasından sonra `java` ve `javac` programları `-version` seçeneği ile çalıştırılarak versiyon kontrolü yapılabilir:

```java
java -version
javac -version
```

>Aşağıdaki `Hello, World` programını `JDK` kurulu bir bilgisayarda çalıştırmak için temel olarak aşağıdaki işlemleri sırasıyla yapınız
>
>1. Herhangi bir dizinde (directory) `csd` isimli bir dizin açılır. Buradaki `csd` isminin tamamı küçük harf olacak şekilde yazılacaktır.
>
>2. `csd` dizini içerisinde `App.java` isimli bir dosya açılır. Windows sisteminde uzantılar gizlenmişse görünür hale getirip uzantının `.java` olarak değiştirilmesi gerekir. Buradaki dosya isminin `App.java` biçiminde yazılması gerekir.
>
>3. Komut `yorumlayıcı program (command prompt/terminal/shell)` ile `csd` directory'sinin bulunduğu dizine geçilir. Dizin geçişi için `cd` komutu kullanılır. Örneğin `cd D:\Repositories\Java-Jul-2025\src\src-console`
>
>4. Herhangi bir editör program ile `App.java` dosyasının içerisine aşağıdaki programı yazınız.

```java
package csd;

class App {
    public static void main(String [] args)
    {
        System.out.println("Hello, World");
    }
}
```

>5. Komut yorumlayıcı programda, `csd` dizininin bulunduğu dizin içerisinde aşağıdaki komutları çalıştırarak derleme işlemi yapılır:

```java
javac csd/App.java -> Windows dışı sistemler için
javac csd\App.java -> Windows işletim sistemi için
```

> Derleme işleminde herhangi bir hata (error) mesajı alınmazsa derleme işlemi başarılıdır ve `App.class` isminde `BC` üretilir.
>
>6. Komut yorumlayıcı programda aşağıdaki biçimde byte code çalıştırılır:

```java
java csd.App
```

**Anahtar Notlar:** Yukarıdaki adımların detayları konular içerisinde ele alınacaktır. Genel duruma odaklanınız.

###### 6 Ağustos 2025

>Bir program için, Java programcısı açısından iki durum söz konusudur: **derleme zamanı (compile time), çalışma zamanı (runtime)**. Derleme zamanı, derleme sürecidir. Çalışma zamanı, programın çalışması sürecidir. Bu iki süreç, birbirileriyle ilişkili olsalar da ayrı zamanlar ve kavramlar oldukları unutulmamalıdır.

##### Derleyicinin Verdiği Mesajlar

>Derleyiciler koda ilişkin bazı **teşhis mesajları (diagnostics or diagnostic messages)** verebilirler. Derleyicilerin teşhis mesajları 3 gruba ayrılır:
>
>**- Gerçek hatalar (errors):** Syntax ya da semantic olarak geçersiz bir durumda derleyicinin verdiği mesajdır. Bu durumda `BC`  üretilmez. Bu durumda programcının hataya yol açan kodları düzeltmesi ve yeniden derleme işlemini yapması gerekir. 
>
>**- Uyarılar (warnings):** Programcının olası programlama hatalarına yönelik mesajlardır. Uyarı mesajları `BC'nin` üretimini engellemez. Bununla birlikte programcı derleyicinin uyarı mesajlarını dikkate almalıdır. Özel bir durum yoksa uyarı mesajlarına yol açan durumlar ortadan kaldırılmalıdır. Bazı durumlarda programcının geliştirme yaparken kullandığı `static kod analizi` araçları da derleyici dışında bazı uyarılar verebilirler. Programcı bunları da dikkate almalıdır ancak duruma göre hepsinin ortadan kaldırılması gerekmeyebilir. Pratikte bir ürünün nihai (release)  versiyonunda derleyicinin tüm uyarı mesajlarının ortadan kaldırılmış olması gerekir.
>
>**- Ölümcül hatalar (fatal error):** Derleme işleminin dahi tamamlanamadığı hatalardır. Örneğin, derlenecek dosyanın bulunamaması, erişim yetkisinin olmaması, diskte yer kalmaması vb durumlardır. Bu durumda programcı ölümcül hataya yol açan durum ya da durumları ortadan kaldırmalı ve derleme işlemini yapmalıdır. Yani ölümcül hata, koda ilişkin değildir. 
>
>Derleme işleminin herhangi bir uyarı mesajı vermeden başarılı olması durumunda derleyiciler genel olarak hiç bir mesaj vermeme eğilimindedir. Bununla birlikte bazı derleyiciler uyarı mesajı vermeden başarılı derleme durumunda, işlemin başarılı olduğuna ilişkin mesaj ya da firmaya ilişkin bilgilendirme mesajı verebilirler. Bu tip mesajlar `teşhis mesajı` kategorisine girmezler. Örneğin, kursumuzda da ağırlıklı olarak kullanacağımız `Oracle` firmasına ait `javac` derleyicisi bu durumda hiç bir mesaj vermemektedir. 

**Anahtar Notlar:** Programın çalışma zamanı sırasında oluşan hatalı durumlara **exception** ya da **runtime error** denilmektedir. `Exception handling` konusuna kadar, bir exception oluşması durumunda program `normal olmayan bir biçimde sonlanır (abnormal termination)` sonlanır olarak düşüneceğiz.

##### Atom Kavramı

>Programlama dilinin bölünemeyen en küçük birimine **atom (token)** denir. Java programlama dilinde bulunan atomlar şunlardır:
>
>**- Anahtar sözcükler (keywords/reserved words):** Derleyicinin, bildiği tanıdığı sözcüklerdir. Örneğin `Hello, world` programında `package, class, public, static, void` vb. Anahtar sözcükler tek başına değişken ismi olamazlar.
>
>**- Değişken atomlar (variables/identifiers):** İsmini programcının belirlediği ve belirli kurallara göre isimlendirilebilen atomlardır. Örneğin `Hello, world` programında `csd, App, main, String, args, System, out, println` değişken atomlardır.
>
>**- Sabitler (literals/constants):** Program içerisinde doğrudan yazılan değerlere denir. Örneğin, `100, 3.4` vb.
>
>**- Operatörler (operators):** Belirli bir işleme yol açan ve işlem sonucunda değer üreten atomlardır. Örneğin, `x + y` ifadesinde `+` bir operatördür. Yine `Hello, world` programında 

```java
System.out.println("Hello, world")
```

>ifadesinde `()` ve `.`  birer operatördür
>
>**- String sabitleri (strings/string literals):** İki tırnak içerisinde yazılan yazılara tırnakları ile birlikte `string literal` denir. Örneğin  `Hello, world` programında `"Hello, world"` bir string literal'dır.
>
>**- Ayraçlar (delimiters/punctuators):** Yukarıdakiler dışında kalan atomlardır. Örneğin  `Hello, world` programında `{}, main metodunun parantezleri vb.`

**Anahtar Notlar:** Derleme işlemi genel olarak **atomlara ayırma (tokenizing)** ile başlar.

**Anahtar Notlar:** Klavyeden basıldığında boşluk algısı yaratan karakterlere **whitespaces** denir. Klavyeden tuşlanabilen tipik `whitespaces` şunlardır: `SPACE, TAB(ULAR), ENTER`.
###### 11 Ağustos 2025

>Java'da kod yazım kuralları şu şekilde özetlenebilir:
>
>- Atomlar arasında istenildiği kadar boşluk (whitespace) bırakılabilir
>- Anahtar sözcükler ve değişken atomlar kendi aralarında bitişik yazılamazlar yani aralarında en az bir tane boşluk (whitespace) olmalıdır. Diğer tüm atomlar bitişik yazılabilirler.

>Atomlar arasında istenildiği kadar boşluk (whitespace) bırakılabilir

```java
package csd;

  

class App {

public

static

void main(String [] args)

{

System .

out.

println("Hello, world");

}

}
```


>Anahtar sözcükler ve değişken atomlar kendi aralarında bitişik yazılamazlar yani aralarında en az bir tane boşluk (whitespace) olmalıdır.

```java
package csd;

classApp { //error
	publicstatic void main(String [] args) //error
	{
	
		System.out.println("Hello, World");
	
	}
}
```

>Diğer tüm atomlar bitişik olarak yazılabilir

```java
package csd;class App{public static void main(String[]args){System.out.println("Hello, World");}}
```

>Yukarıdaki temel yazım kuralları sayesinde programcı daha **okunabilir/algılanabilir (readable)** kodlar yazabilmektedir. 

##### Yorum Satırları

>Programlamada derleyicinin görmezden geldiği kod parçalarına **yorum satıları (comment lines)** denir. Java'da iki çeşit yorum satırı yazılabilir. Yorum satırları okunabilirliği/algılanabilirliği olumsuz etkilemeyecek şekilde koda eklenmelidir.

```java
package csd;

class App {
    public static void main(String [] args) 
    {
        //Burası görmezden gelinecek
        System.out.println("Hello, World"); //Burası da görmezden gelinecek

        /*
        Burası da 
        görmezden gelinecek
        */ 
    }
}
```

##### Eclipse IDE Programı

>Eclipse, Java'nın ilk yıllarından beri `free` olarak kullanılabilen bir IDE programdır. Eclipse tümm masaüstü işletim sistemlerinde çalışabilen bir uygulamadır. Eclipse kurulum programı aşağıdaki bağlantıdan indirilip kurulabilir:

>[https://www.eclipse.org/downloads/](https://www.eclipse.org/downloads/)

>Biz kursumuzda Eclipse ile açılmış tek bir proje üzerinde çalışacağız. Eclipse ile bir `Hello, World` programını çalıştırmak üzere bir proje açmak için işlemler şu şekilde yapılabilir:
>1. Wokspace için bir dizin belirenir
>2. Bir Java projesi açılır. Örneğin File -> New -> Java Project seçilebilir
>3. Açılan pencerede proje ismi yazılmalıdır. Biz burada `Sample` ismini, vereceğiz. Yine bu pencerede JRE altındaki `Use an execution environment JRE` en az JavaSE 17 olarak seçilmelidir. Yine aynı pencerede `Module` altındaki `Create module-info.java file` seçeneği kaldırılmalıdır. 
>4. Bir java dosyası eklemek için src dizininde New -> Class menüsü seçilebilir.
>5. Açılan pencerede package text alanına csd, Name text alanına da App yazılmalıdır. 
>6. Bu işlemden sonra program yazılarak çalıştırılabilir. Çalıştırmak pek çok yöntem vardır. Herhangi bir tanesi tercih edilebilir. Program çalıştırıldığıda Eclipse kendi Console penceresi açarak ilgili çıktıları orada gösterir.
>
**Anahtar Notlar:**  Aslında çalıştırma işlemi derleme işleminden sonra yapılmaktadır. Eclipse'de `build automatically` seçili ise her kod yazımında build işlemi, dolayısıyla derleme işlemi yapılır ve error oluşmazsa arakod üretilir. Eğer `build automatically` seçili değilken çalıştırılırsa önce build işlemi yapılır sonra üretilen arakod çalıştırılır.

**Anahtar Notlar:** Bir IDE programda bir işlemi yapmanın birden fazla yöntemi olabilir ve genelde de birden fazla yönetimi vardır. Yukarıdaki proje açma aşamaları dışında da yöntemler bulunmaktadır.

##### Genel Biçim Açıklama Notasyonu

>Bir dilin kurallarının genel biçimlerini anlatmak için pek çok notasyon kullanılmaktadır. Biz kursumuzda genel olarak `açısal parantez-köşeli parantez tekniğini` kullanacağız. Bu teknikte zorunlu olarak bulunması gerekenler açıklamada açısal parantez içerisinde yazılır. Seçenekli (optional) olması durumunda köşeli parantez içerisinde yazılır. Ayrıca `//...` şeklinde kullanım durumunda `burada bir takım kodlar bulunabilir ancak şu an bizi ilgilendirmiyor` anlamında gelecektir. Genel biçimde doğrudan yazılan herşey orada olması gereken anlamındadır. Yaklaşık 20 yıldır programlamaya ilişkin kaynaklar bir konuyu anlatırken uydurma bazı isimlerkullanmaktadır. Bu isimler genel olarak `foo, bar, tar, zar, car vb.` Biz de bu isimleri zaman zaman kullanacağız. 

##### Bildirim (Declaration)

>Bir ismin derleyiciye tanıtılmasına denir.

##### Hello World Progrmının Genel Açıklaması

>Bir Java programı genel olarak paketlerden (package), paketler sınıflardan (class), sınıflar da metotlardan (method) oluşur. 
>
>Paket bildiriminin genel biçimi şu şekildedir:

```java
package <isim>;
```
>Burada paket ismi ileride ele alacağımız değişken isimlendirme kurallarına uygun olmalıdır. Paketler konusu ileride detaylı bir biçimde ele alınacaktır. Paketler konusunda kadar `csd` isimli paket altında çalışacağız. 

>Sınıf bildiriminin genel biçimi şu şekildedir:

```java
[bildirime ilişkin bazı anahtar sözcükler] class <isim> {
    //...
}
```

>Burada sınıf isminin yine değişken isimlendirme kurallarına uygun olması gerekir. Sınıf bildiriminin detayları konular içerisinde ele alınacaktır. Sınıf kavramı `Nesne Yönelimli Programlama (Object Oriented Programming)` tekniğinin temel taşlarından biridir. 

###### 13 Ağustos 2025

>Java'da alt programlara **metot (method)** denir. **Metot bildirimi (method declaration)** alt programın kodlarının yazılmasıdır. Bir metot bildirildikten sonra, kodlarının çalıştırılabilmesi için **çağrılması (call/invoke)** gerekir. Metot bildiriminin genel biçimi şu şekildedir:

```java
[erişim belirleyici] [static] <geri dönüş bilgisi> <metot ismi>([parametreler])
{
    //...
}
```

>Erişim belirleyici şunlardan biri olabilir: **public, protected, no-modifier, private.** İlgili konuya gelene kadar tüm metotlarımızı `public` olarak bildireceğiz. Bir metot **static** veya **non-static** olabilir. static anahtar sözcüğü ile bildirilen metotlar static, bildirilmeyenler non-static olurlar. İlgili konuya gelene kadar tüm metotları static olarak bildireceğiz. Bir metodun **geri dönüş değeri (return value)** olabilir ya da olmayabilir. Bir metodun geri dönüş değeri yoksa, geri dönüş bilgisi yerine **void** anahtar sözcüğü yazılır. Hiç bir şey yazılmaması geçersizdir. Bir metodun geri dönüş değerine ilişkin detaylar ileride ele alınacaktır. Metot ismi değişken isimlendirme kurallarına uygun herhangi bir isim olmalıdır. Bir metodun parametreleri olabilir ya da olmayabilir. Olmaması durumundan parantez içerisi boş bırakılır. Bir metodun parametre değişkenlerine ilişkin detaylar ileride ele alınacaktır. `{ ve }` arasında kalan kod bölümüne **metot gövdesi (method body)** denir. Metodun ne iş yaptığına ilişkin kodlar buraya yazılır.

>`static` bir metodun çağrılmasının genel biçimi şu şekildedir:

```java
[paket ismi].[sınıf ismi].<metot ismi>([argümanlar]);
```

Argüman kavramı ileride ele alınacaktır. **Bir metot çağrıldığında akış metodun kodlarına dallanır. Çağrılan metodun kodları çalıştırılır Metot çağrısı bittiğinde yani çağrılan metot sonlandığında, akış çağrılan noktaya geri döner.** Akış main metodundan başlar. Akışın başladığı main metoduna **entry point** denir. mainmetodu `java` programı tarafından (yani JVM tarafından) çağrılır. Özel bazı durumlar dışında main metodu bittiğinde program sonlanır. 
```java
package csd;

class App {
	public static void main(String [] args)
	{	
		System.out.println("Hello, world");
		csd.Sample.foo();
		csd.Sample.bar();		
		System.out.println("Good bye, world");
	}
}


class Sample {
	public static void foo()
	{
		System.out.println("I am foo");
	}
	
	public static void bar()
	{
	
		System.out.println("I am bar");
		csd.Mample.tar();
	}
}


class Mample {
	public static void tar()
	{
		System.out.println("I am tar");
	}
}

```

`print`ve `println` metotları aldıkları değerleri ekrana basmak için kullanılan standart metotlardır. Bu metotlar bir `imleç (cursor)` ile çalışırlar. İmlecin bulunduğu yere yazma yaparlar ve yazdıkları karakter sayısı kadar imleci ilerletirler. `print` metodu imleci son yazdığı karakterden sonrasında bırakır, `println` metodu ile imleci son yazdığı karakterden sonraki satırın (line) başında bırakır. 

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		System.out.print("Merhaba ");
		System.out.println("Nasılsın?");
		System.out.println("İyi misin?");
	}
}
```

**Anahtar Notlar:** `print` ve `println` metotları aslında non-static metotlardır. Aynı zamanda `System` sınıf, `out` `PrintStream` türünden bir `referanstır`. Buradaki detalar konular içerisinde ele alınacaktır.

**Anahtar Notlar:** Aslında teknik olarak `print` ve `println` metotları ekrana yazdıklarını bilmezler. Bu metotlar **standard output (stdout)** denilen bir dosyaya yazma yaparlar. `stdout` dosyası nereye yönlendirilmişse (redirection) yazma oraya yapılır. Bu durumda `stdout` ekrana yönlendirilmişse bu metotlar ekrana yazarlar. Kursumuzda basitleştirmek için `ekrana basma` ya da `ekrana yazma` biçiminde kullanılacaktır. Benzer şekilde klavyeden okuma yapan metotlar **standard input (stdin)** dosyasından okuma yaparlar. `stdin` dosyası klavyeye yönlendirilmişse okuma klavyeden yapılır. Kursumuzda basitleştirmek için `klavyeden okuma` biçiminde kullanılacaktır. Masaüstü işletim sistemlerinin hemen hepsinde default olarak stdout ekrana, stdin klavyeye yönlendirilmiştir. Ayrıca IDE programlar `stdout` dosyasını kendi console pencelerelerine gönderebilirler.


>Çağıran metodun (caller) ait olduğu sınıf ile çağrılan metodun ait olduğu sınıf aynı paket içerisindeyse, çağrı sırasında paket ismi kullanılmayabilir. Çağıran metot ile çağrılan metot aynı sınıf içerisindeyse çağrı sırasında paket ismi de kullanılmamışsa, sınıf ismi de kullanılmayabilir. 

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		System.out.println("Hello, world");
		Sample.foo();
		Sample.bar();		
		System.out.println("Good bye, world");
	}
}


class Sample {
	public static void foo()
	{
		System.out.println("I am foo");
		bar();
	}
	
	public static void bar()
	{	
		System.out.println("I am bar");
		Mample.tar();
	}
}


class Mample {
	public static void tar()
	{
		System.out.println("I am tar");
	}
}
```


###### 18 Ağustos 2025

##### Sayı Sistemleri

>Bu bölümde Bilgisayar Bilimlerinde kullanılan **sayı sistemleri (number systems)** temel düzeyde ele alınmıştır.
>Biz günlük hayatta 10'luk sistemi **(decimal system)** kullanmaktayız. 10'luk sistemde sayıları ifade etmek için 10 tane sembol vardır:
>
>		0
>		1
>		2
>		3
>		4
>		5
>		6
>		7
>		8
>		9
>10'luk sistemde sayının her bir basamağı 10'nun kuvvetleriyle çarpılıp toplanmaktadır. Örneğin:
>
>		123.25 = 3 * 10^0 + 2 * 10^1 + 1 * 10^2 + 2 * 10^-1 + 5 * 10^-2
>Halbuki bilgisayarlar 2'lik sistemi **(binary system)** kullanmaktadır. 2'lik sistemde sayıları ifade etmek için 2 sembol kullanılmaktadır:
>
>		0 
>		1
>2'lik sistemde sayının her bir basamağına **bit (binary digit)** denilmektedir. 2'lik sistemde sayının her basamağı 2'nin kuvvetiyle çarpılarak sayı elde edilir. **Bit (binary digit)** en küçük bellek birimidir. 8 bite 1 byte denilmektedir. Genellikle bitler 4'erli gruplanarak yazılırlar. Örneğin:
>
>		1010 0010
>		
>Burada 1 byte'lık bir bilgi vardır. `Byte` temel bellek birimidir.
>
>Byte da küçük bir birimdir. Kilo diğer bilimlerde "1000 katı" anlamına gelmektedir. Ancak bilgisayarlar 2'lik sistemi kullandığı için 1000 katı iyi bir kat değildir. Bu nedenle genel olarak Kilo byte için 2'nin 10'uncu kuvveti olan 1024 katı kullanılır. Yani 1KB (kısaca 1K) 1024 byte'tır. Mega diğer bilimlerde kilonun 1000 katıdır. Dolayısıyla milyon kat anlamına gelmektedir. Ancak bilgisayar bilimlerinde genel olarak mega kilonun 1024 katı olarak alınır. Bu durumda 1 MB = 1024 x 1024 (2^20) byte'dır. Giga ise meganın 1024 katıdır. Bu durumda 1 GB = 1024 x1024 x 1024 byte'tır ( 2^30). Giga'dan sonra tera, tera'dan sonra peta, ondan sonra da exa gelmektedir.
>
>1 byte içerisinde yazılabilecek en küçük ve en büyük sayılar şöyledir:
>
>		0000 0000 ---> 0
>		1111 1111 ---> 255
>1 byte içerisinde 1 ve 0'ların bütün permütasyonları 256 tanedir. 2 byte içerisinde en büyük sayıyı yazacak olsak şöyle olurdu:
>
>		1111 1111 1111 1111 ---> 65535
>Biz burada ikilik sistemde tamsayıları ifade ettik. Ama bütün sayıları pozitif kabul ettik. Pekiyi negatif tamsayılar nasıl ifade edilmektedir?
>
>Bugün negatif tam sayıların ifade edilmesi için **ikiye tümleyen (two's complement)** sistemi denilen bir sistem kullanılmaktadır. Bu sistemde pozitif ve negatif sayılar birbirlerinin ikiye tümleyenidirler. İkiye tümleyen **bire tümleyene (one's complement)** bir eklenerek bulunmaktadır. Bir sayının bire tümleyeni sayıdaki 0'ların 1, 1'lerin 0 yapılmasıyla bulunur. Bu durumda ikiye tümleyen şöyle hesaplanır. örneğin aşağıdaki sayının ikiye tümleyenini bulmaya çalışalım:
>
>		0101 0110
>Sayının bire tümleyenine bir ekleyeceğiz:
>
>		1010 1001 + 0000 0001 = 1010 1010
>
>Aslında ikiye tümleyeni bulmanın kolay bir yolu da vardır: Sayıda sağdan sola ilk 1 görene kadar ilk 1 dahil olmak üzere aynısı yazılarak ilerlenir. Sonra 0'lar 1, 1'ler 0 yapılarak devam edilir. Örneğin:
>
>		0101 0110
>		
>sayının ikiye tümleyenini tek hamlede bulalım:
>
>		1010 1010
>		
>Negatif tam sayıları ifade edebilmek için kullanılan ikiye tümleme sisteminde **en soldaki bit (the most significant bit)** işaret bitidir (sign bit). Bu bit 0 ise sayı pozitif, 1 ise negatiftir. **Negatif ve pozitif tam sayılar birbirlerinin ikiye tümleyenidir.** Örneğin bu sistemde +10 yazmak isteyelim. Bunu işaret 0 yaparak yazabiliriz:
>
>		0000 1010	--->	+10
>
>Şimdi -10 yazmak isteyelim. Bunun için +10'un ikiye tümleyenini alalım:
>
>		1111 0110	--->	-10
>		
>Bu sistemde +n ile -n toplandığında 0 elde edilir:
>
>		  0000 1010	+ 1111 0110 = 0000 0000
>		  
>Bu sistemde tek bir sıfır vardır. O da tüm bitleri 0 olan sıfırdır. Bu sistemde 1 byte içerisinde yazılabilecek en büyük pozitif sayı şöyledir:
>
>		0111 1111	--->	+127
>		
>Şimdi bunun ikiye tümleyenini alalım:
>
>		1000 0001	--->	-127
>Pekiyi en küçük (negatif) sayı nedir? Bu sistemde bir tane sıfır olduğuna göre 256 tane permütasyon eşit bölünemez. Demek ki ya pozitif sayılar ya negatif sayılar bir tane daha fazla olmak zorundadır. Bu sistemde ikiye tümleyeni olmayan iki sayı vardır:
>
>		0000 0000 
>		1000 0000
>Birincisi 0'dır. İkinci sayı -127'den bir eksik olan sayıdır. O halde bu sayının -128 kabul edilmesi daha uygundur.
>
>Demek ki bu sistemde n byte içerisinde yazılabilecek en büyük pozitif sayı ilk biti 0 olan diğer tüm birleri 1 olan sayıdır. En küçük (negatif) sayı ise ilk biti 1 olan diğer tüm bitleri 0 olan sayıdır. Örneğin bu sistemde iki byte ile yazabileceğimiz en büyük pozitif sayı şöyledir:
>
>		0111 1111 1111 1111	--->	+32767
>		
>En küçük negatif sayı ise şöyledir:
>
>		1000 0000 0000 000	--->	-32768
>Bu sisteme ilişkin tipik sorular ve yanıtları şöyledir:
>
>**SORU**: Bu sistemde +n sayısını nasıl yazarsınız?\
>**CEVAP:** En soldaki bit 0 yapılıp n sayısı 2'lik sistemde yazılır.
>
>**SORU:** Bu sistemde -n nasıl yazarsınız?\
>**CEVAP:** Yazabiliyorsanız doğrudan yazın. Ancak doğrudan yazamıyorsanız önce +n değerini yazın ve ikiye tümleyenini alın. Örneğin bu sistemde -1 yazalım. Önce +1 yazalım:
>
>		0000 0001	--->	+1
>Şimdi bunun ikiye tümleyenini alalım:
>
>		1111 1111	---->	-1
>		
>**SORU:** Bu sistemde bir sayının kaç olduğu bize sorulsa bunu nasıl yanıtlarız?\
>**CEVAP:** Eğer en soldaki bit 0 ise sayının değeri doğrudan hesaplanır. Eğer en soldaki bit 1 ise bu sayının negatif olduğunu gösterir. Bu durumda sayının ikiye tümleyeni alınır. Pozitifinden hareketle negatifi bulunur.
>Örneğin 1110 1110 sayısı kaçtır? Burada işaret biti 1 olduğuna göre sayı negatiftir. Negatif ve pozitif sayılar birbirlerinin ikiye tümleyenidirler. O zaman bu sayının ikiye tümleyenini alıp pozitifinden faydalanarak sayıyı bulalım:
>
>		0001 0010	--->	+18
>		
>o zaman bize sorulan sayı -18'dir.
>
>Bu sistemde örneğin 1 byte içerisinde yazılabilecek en büyük pozitif sayıya 1 ekleyelim:
>
>		0111 1111	--->	+127
>		1000 0000	--->	-128
>		
>Demek ki bu sistemde bir sayıyı üst limitten taşırırsak yüksek bir negatif sayıyla karşılaırız. Benzer şekilde alt limitten taşırırsak yüksek bir	pozitif sayı ile karşılaşırız
>
>Tamsayılar ikilik sistemde, **işaretsiz (unsigned)** ya da **işaretli (signed)** olarak yorumlanabilirler. İşaretsiz sistemde sayının en soldaki biti işaret biti olarak yorumlanmaz. Sayı herzaman sıfır ya da pozitiftir. İşaretli sistemde ise sayının en solundaki biti işaret bitidir. Sayı ikiye tümleyen aritmetiğine göre yorumlanır.
>
>**İşlemciler aslında genellikle işaretli ve işaretsiz ayırımını yapmazlar. Çünkü ikisi de aslında aynı biçimde işleme sokulmaktadır. Sonucun yorumu değişmektedir.**
>
>Pekiyi noktalı sayılar ikilik sistemde nasıl ifade edilmektedir? İşte insanlar noktalı sayıları ifade etmek için iki format geliştirmişlerdir. Bunlardan birine **sabit noktalı formatlar (fixed point formats)** diğerine **kayan noktalı formatlar (floating point formats)** denilmektedir. Sabit noktalı formatlar eski devirlerde basit bir mantıkla tasarlanmıştır. Bu formatlar bugün hala kullanılıyor olsa da büyük ölçüde artık bunların çağı kapanmıştır. Bugün kayan noktalı format denilen formatlar kullanılmaktadır.
>
>Sabit noktalı formatlarda noktalı sayı için n byte yer ayrılır. Noktanın yeri önceden bellidir. Örneğin sayı 4 byte ile ifade edilsin. Noktanın yeri de tam ortada olsun. Bu durumda sayının tam kısmı 2 byte ile noktalı kısmı 2 byte ile ifade edilir. Ancak sayının noktalı kısmı 2'nin negatif kuvvetleriyle kodlanmaktadır. Böylece iki sabit noktalı sayıyı paralel toplayıcılarla kolay bir biçimde toplayabiliriz: Örneğin bu sistemde 5.25 ile 6.25 sayılarını ifade edip toplayalım:
>
>		0000 0000 0000 0101 . 0100 0000 0000 0000	--->	5.25
>		0000 0000 0000 0110 . 0100 0000 0000 0000	--->	6.25
>		-----------------------------------------
>		0000 0000 0000 1011 . 1000 0000 0000 0000	--->	11.5
>Pekiyi bu yöntemin ne dezavantajı vardır? Yöntemin en önemli dezavantajı dinamik olmamasıdır.
>
>Sabit noktalı formatların dinamik olmaması nedeniyle kayan noktalı formatlar geliştirilmiştir. Bu formatlarda noktanın yeri sabit değildir. Noktanın yeri format içerisinde ayrıca tutulmaktadır. Noktalı sayının noktası yokmuş gibi ifade edilmesi durumunda sayının bu haline **mantis (mantissa)** denilmektedir. İşte kayan formatlarda sayı için ayrılan alanın bir bölümünde mantis bir bölümünde de "noktanın yeri" tutulmaktadır. Noktanın yerini belirleyen kısma **üstel kısım (exponential part)** denilmektedir. Tabii bir de sayının başında işaret biti bulunur. Bu durumda kayan noktalı bir sayının format aşağıdakine benzerdir:
>
>		`[işaret biti] [mantis] [noktanın yeri (exponential)]`
>		
>Bugün ağırlıklı kullanılan kayan noktalı format `IEEE 754` denilen formattır. Bu formatın üç farklı genişlikte biçimi vardır:
>
>		IEEE 754 - Short Real Format 	(4 byte)
>		IEEE 754 - Long Real Format 	(8 byte)
>		IEEE 754 - Extended Real Format (10 byte)
>		
>Bugün Intel, ARM, MIPS, Alpha, Power PC gibi yaygın işlemciler donanımsal olarak bu formatı desteklemektedir. Aynı zamanda bu format yaygın olarak Reel Sayı Ünitesi olmayan mikro denetleyicilerdeki derleyiciler tarafından da kullanılmaktadır.
>
>Kayan noktalı formatların (örneğin IEEE 754 formatının) en ilginç tarafı **yuvarlama hatası (rounding error)** denilen durumdur. Yuvarlama hatası	noktalı sayının tam olarak ifade edilemeyip onun yerine ona yakın bir sayının ifade edilmesiyle oluşan hatadır. Yuvarlama hatası sayıyı ilk kez depolarken de oluşabilir, aritmetik işlemlerin sonucunda da oluşabilir. Tabii noktalı sayıların bir bölümü bu formatta hiçbir yuvarlama hatasına maruz kalmadan ifade edilebilmektedir. Ancak bazı sayılarda bu hata oluşabilmektedir. Bu hatayı ortadan kaldırmanın yolu yoktur. Tabii sayı için daha fazla bir ayrılırsa yuvarlama hatasının etkisi de azalacaktır.
>	
>Yuvarlama hatalarından dolayı programlama dillerinde iki noktalı sayının tam eşitliğinin karşılaştırılması anlamlı değildir. Örneğin aşağıdaki işlemde	yuvarlama hatasından dolayı sayılar sanki eşit değişmiş gibi ele alınacaktır.
>
>		0.2 + 0.1 == 0.3 (false)
>		
>Pekiyi yuvarlama hatasının önemli olduğu ve bunun istenmediği tarzda uygulamalarda (örneğin finansal uygulamalarda, bilimsel birtakım uygulamalarda) ne yapmak gerekir? İşte bunun tek yolu noktalı sayıları kayan noktalı formatta tutmamak olabilir. Bazı programlama dillerinde noktalı sayıyı kayan noktalı formatta tutmayan böylece yuvarlama hatalarına maruz bırakmayan özel türler (örneğin C#'taki decimal) vardır. Ancak bu türler işlemciler tarafından desteklenmediği için yapay türlerdir. 
>
>Bilgisayar dünyasında çok kullanılan diğer bir sayı sistemi de 16'lık sistemdir. 16'lık sisteme İngilizce **hexadecimal system** denilmektedir. 16'lık sistemde sayıları ifade etmek için 16 sembol bulunmaktadır. İlk 10 sembol 10'luk sistemdeki sembollerden alınmıştır. Sonraki 6 sembol alfabetik karakterlerden alınmıştır:
>
>		0
>		1
>		2
>		3
>		4
>		5
>		6
>		7
>		8
>		9
>		A
>		B
>		C
>		D
>		E
>		F
>16'lık sistemdeki her bir basamağa **hex digit** denilmektedir. Örneğin:
>
>		1FC8
>		
>Burada 4 hex digit'lik bir sayı vardır. 16'lık sistemdeki bir sayıyı 10'luk sisteme dönüştürmek için her hex digit 16'nın kuvvetleriyle çarpılıp toplanır. Ancak 16'lık sistemdeki sayı kullanım gereği bakımından aslında 10'lu sisteme pek dönüştürülmez. 16'lık sistemdeki her bir hex digit 4 bit ile ifade edilebilmektedir:
>
>		0	0000
>		1	0001
>		2	0010
>		3	0011
>		4	0100
>		5	0101
>		6	0110
>		7	0111
>		8	1000
>		9	1001
>		A	1010
>		B	1011
>		C	1100
>		D	1101
>		E	1110
>		F	1111
>16'lık sistemden 2'lik sisteme dönüştürme yapmak çok kolaydır. Tek yapılacak şey bir hex digit'e karşılık üstteki tablodaki 4 biti getirmektir. Örneğin:
>
>		1FC9  =  0001 1111 1100 1001
>		FA3D  =  1111 1010 0011 1101
>		
>2'lik sistemdeki bir sayı da 16'lık sisteme çok kolay dönüştürülür. Tek yapılacak şey sayıyı dörderli gruplayıp ona karşı gelen hex digit'i yazmaktır. Örneğin:
>
>		1010 0001 1110 1000 0011 0101 = A1E835
>Bilgisayar dünyasında 16'lık sistem aslında 2'lik sistemin yoğun bir gösterimi olarak kullanılmaktadır. Yani 2'lik sistem çok yer kapladığı için kişiler 2'lik sistem yerine 16'lık sistemi kullanırlar. Bu nedenle belleği, dosyayı gösteren programlar bunları 2'lik sistem yerine 16'lık sistemde gösterirler.
>
>1 byte 2 hex digit ile ifade edilmektedir. Örneğin:
>
>		1A 23 5C 78
>		
>Burada 4 byte'lık bir bilgi vardır. Örneğin 2 byte içerisinde yazılabilecek en küçük negatif işaretli sayının hex karşılığı 8000 biçimindedir. Örneğin bir byte'lık işaretli sistemde yazılabilecek en büyük pozitif sayı 7F biçimindedir. İşareti tamsayı sisteminde 4 byte içerisinde -1 sayısı FFFFFFFF biçimindedir.

>Eskiden daha fazla kullanılıyor olsa da toplamda oldukça seyrek kullanılan diğer bir sayı sistemi de 8'lik sayı sistemidir. Bu sisteme İngilizce **octal system** denilmektedir. 8'lik sayı sistemindeki her bir basamağa **octal digit** denir. Octal digit sembolleri olarak 10'luk sistemin ilk 8 sembolü kullanılmaktadır:
>
>		0
>		1
>		2
>		3
>		4
>		5
>		6
>		7
>Her octal digit 3 bit ile ifade edilebilir:
>
>		0		000
>		1		001
>		2		010
>		3		011
>		4		100
>		5		101
>		6		110
>		7		111
>Bu durumda bir octal sayı 2'lik sisteme kolay bir biçimde dönüştürülebilir:
>
>		476		100 111 110
>		741		111	100	001
>Benzer biçimde 2'lik sistemdeki bir sayı da sağdan sola üçer bir gruplandırılarak 8'lik sisteme dönüştürülebilmektedir. Örneğin:
>
>		1011 1011	=  273
>		0111 1110	=  176
>		
>8'lik sistemde 2'lik sistemin yoğun bir gösterimi olarak kullanılmaktadır. Ancak 8'i tam ortalayamadığı için kullanımı seyrektir.

##### Tür Kavramı

>Bir değişkenin içerisindeki değerin ne kadar uzunlukta (length) tutulduğunu (yani değişken için bellekte ne kadar yer ayrılacağını) ve değerin hangi formatta tutulacağını belirten kavrama **tür (type)** denir. Java'nın **temel türleri (primitive/built-in/predefined types)** şunlardır:

| Tür ismi | Uzunluk (byte) | Sınır Değerler                                 |
| -------- | -------------- | ---------------------------------------------- |
| short    | 2              | `[-32768, 32767]`                              |
| int      | 4              | `[-2147483648, +2147483647]`                   |
| long     | 8              | `[-9223372036854775808, +9223372036854775807]` |
| byte     | 1              | `[-128, +127]`                                 |
| float    | 4              | `[±3.6 * 10-38, ±3.6 * 10+38]`                 |
| double   | 8              | `[±1.6 * 10-308, ±1.6 * 10+308]`               |
| char     | 2              | `[0, 65535]`                                   |
| boolean  | -              | `true, false`                                  |

>**Açıklamalar:**
>- Java'da temel türler birer anahtar sözcüktür.
>
>- short, int, long ve byte türlerine **tamsayı türleri (integer/integral types)** denir. 
>
>- Tamsayı türleri için işaretli sistemde ikiye aritmetiği kullanılır. 
>
>- Java'da işaretsiz tamsayı türü yoktur.
>
>- double ve float türlerine **gerçek sayı türleri (real types)** denir. 
>
>- Gerçek sayı türleri için `IEEE 754` standardı kullanılır. Bu sebeple bu türlere `floating point types` da denilmektedir. Bu türlerle yapılan işlemlerde daha önce anlatıldığı gibi yuvarlama hataları oluşabilir. Aşağıdaki demo örnekte işlemin sonucunun yuvarlanması dolayısıyla, toplam tam olarak 0.3 elde edilmez. Örneğe ilişkin kodların detayları şu an için önemsizdir.

>Aşağıdaki demo örneği çalıştırıp yuvarlama hatalarını gözlemleyiniz. Kodun detaylarını şu aşamada önemsemeyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		double a = 0.1, b = 0.2;
		double c;
		
		c = a + b;
		
		System.out.printf("%.20f%n", c);
		
		if (c == 0.3)
			System.out.println("Eşit");
		else
			System.out.println("Eşit değil");
	}
}
```
>Aşağıdaki demo örneği çalıştırıp yuvarlama hatalarını gözlemleyiniz. Kodun detaylarını şu aşamada önemsemeyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		float a = 0.1F, b = 0.2F;
		float c;
		
		c = a + b;
		
		System.out.printf("%.20f%n", c);
		
		if (c == 0.3)
			System.out.println("Eşit");
		else
			System.out.println("Eşit değil");
	}
}
```
>- Programlamada kullanılan karakterler bir tabloda tutulurlar. Bu tabloya karakter tablosu denir. Programlamada pek çok karakter tablosu kullanılmaktadır. Daha önceleri `ASCII` denilen ve 7 bit olarak tutulan ancak daha 8 bit olarak ele alınan bir karakter tablosu kullanılmaktaydı. Daha sonradan, dünyada kullanılan pek çok karakterin de tutulabilmesi için `UNICODE` isimli bir tablo kullanılmaya başlanmıştır. `UNICODE` tablosunun ilk 128 karakteri `ASCII` tablosu ile aynıdır. `UNICODE` tablosunun da çeşitleri vardır. char türü içerisinde tutulan sayı ilgili tabloda sıra numarası (code point) olarak yorumlanır. Yani char türü içerisinde tutulan sayı aslında ilgi karakterin sıra numarasına karlşılık gelir. Bu anlamda değerler işaretsiz 2 byte sınırları içerisindedir ancak bu tür işaretsiz tam sayı türü değildir. Bu durumda char türü `UNICODE` tablonun 2 byte ile tutulan karakterlerine uyumludur. Yazılar da aslında bilgisayar belleğinde 2'lik sistemde sayılar biçiminde tutulmaktadır. Bir yazıyı oluşturan elemanlara **karakter (character)** denilmektedir. İşte bir yazıda her bir karakter 2'lik sistemde bir sayı ile ifade edilir. Böylece yazı  aslında ikilik sistemde bir sayı dizisi gibi tutulmaktadır. İşte bir karakter için hangi sayının karşı geldiğini belirten tablolara **karakter tabloları (character table)** denilmektedir. Karakter tablosundaki karakter şekillerine **glyph** denilmektedir. Her karaktere tabloda bir sıra numarası verilmiştir. Buna da **code point (code point)** denilmektedir. Dünyanın ilk standart karakter tablosu `ASCII` (American Standard Code Information Interchange) denilen tablodur. `ASCII` tablosu aslında 7 bit bir tablodur. Dolayısıyla tabloda 128 tane glyph için code point bulundurulmuştur. `ASCII` dışında `IBM EBCDIC` tablosunu geliştirmiştir. Wang firması `WISCII` tablosunu kullanmıştır. `ASCII` tablosu Amerikalılar tarafından yalnızca İngilizce karakterleri ifade etmek için oluşturulmuştur. Bilgisayarlar yaygınlaşmaya başladığında farklı karakterlere sahip olan Türkiye gibi, Yunanistan gibi, Almanya gibi ülkeler bu `ASCII` tablosunu 8 bite çıkartıp elde edilen 128'lik yeni alanı kendi karakterlerini ifade etmek için kullanmışlardır. `ASCII` tablosunun ilk yarısı (yani [0, 128] numaraları karakterleri) standarttır. Ancak ikinci yarısı **code page (code page)** adı altında farklı ülkeler tarafından farklı yerleşimler yapılarak kullanılmaktadır. DOS zamanlarında Türkçe karakterler için `OEM 857` denilen code page kullanılıyordu. Daha sonra Microsoft Windows sistemlerinde Türkçe karakterler için `1254 code page`'i düzenledi. ISO, bu code page'leri standart hale getirmiştir. Bugün Türkçe karakterler `ISO` tarafından `ASCII 8859-9` code page'i ile düzenlenmiştir. `ASCII` tablosu ve onların code page'leri uzun süre kullanılmış ve hala kullanılmakta olsa da maalesef karışıklıklara yol açmaktadır. İşte ortalama 20 yıldır artık karakterleri 2 byte içerisinde ifade ederek dünyanın bütün dillerinin ve ortak sembollerinin tek bir tabloya yerleştirilmesi ile ismine [UNICODE](https://home.unicode.org) denilen bir tablo oluşturulmuştur. `UNICODE` tablo ISO tarafından `10646` ismiyle de bazı farklılıklarla standardize edilmiştir. `UNICODE` tablonun ilk 128 karakteri standart ASCII karakterleri, ikinci 128 karakteri `ISO 8859-9` code page'indeki karakterlerdir. Bir karakter tablosundaki code point'lerin ikilik sistemde ifade edilme biçimine **encoding** denilmektedir. ASCII code page'lerinde encoding doğrudan code point'in 1 byte'lık sayı karşılığıdır. Ancak `UNICODE` tablonun değişik encoding'leri kullanılmaktadır. `UNICODE` tablonun klasik encoding'i `UTF-16`'dır. Burada code point doğrudan 16 bit bir sayı biçiminde ifade edilir. `UTF-32` encoding'inde ise code point 32 bitlik bir sayı biçiminde ifade edilmektedir. Ancak `UNICODE` tablonun en yaygın kullanılan encoding'i `UTF-8` encoding'idir. `UTF-8` kodlamasında standart ASCII karakterler 1 byte ile, diğer karakterler 2 byte, 3 byte, 4 byte ve 5 byte ile kodlanabilmekedir. Türkçe karakterler `UTF-8` encoding'inde 2 byte yer kaplamaktadr. `UTF-8` encoding'i `UNICODE` bir yazının adeta sıkıştırılmış bir hali gibi düşünülebilir. Bugün pek çok programlama editörü default durumda dosyayı `UNICODE UTF-8` encoding'ine göre saklamaktadır.
>
>- boolean türü mantıksal olarak `doğru` ve `yanlış` kavramlarını temsil eden bir türdür. boolean türden bir değişken iki tane değer alabilir: **true, false**. Bu tür, örneğin flag değişkenlerde kullanılabilmektedir. Bu türün uzunluğu `Java Language Specification` dökumanında belirtilmemiştir. Yani derleyiciyi yazanlara bırakılmıştır (implementation defined/dependent). Zaten iki tane değer alabildiği için de ne kadar uzunlukta olduğunun Java programcısı açısından önemi yoktur.
>
>- Her ne kadar 8 tane temel tür olsa da programcı tamsayı türü kullanacağı zaman önce int türünü düşünmelidir, int türünün uygun olmadığı tamsayının gerektiği bir senaryoda (örneğin int türü sınırları dışındaki değerlerin de tutulması gerektiğinde) diğer türlerden uygun olanı seçilmelidir. Benzer şekilde gerçek sayılar için de öncelikle double türü tercih edilmeli, duruma göre float türü kullanılmalıdır. Bu anlamda int double türlerine **default types** da denilmektedir.
>
>- Java'da boolean türü dışında kalan diğer tüm temel türlerin uzunlukları standarttır yani sistemden sisteme farklılık göstermez. 
>
>- `int türüne `integer` denilmesi terminolojik olarak doğru değildir. `integer` kavramı Java'da tamsayılara verilen genel isimdir. `int` ise 4 byte'lık bir tamsayı (integer) türüdür. 

###### 20 Ağustos 2025

##### Değişkenler

>Bellekte ayrılan bir bölge ile işlem yapılmasını sağlayan isimlerdir. Bir değişken için bellekte yer ayrılması detayları ayrıca ele alınacaktır.

**Anahtar Notlar:** Her değişken atom bir değişken değildir. Burada anlatılan değişken aynı zamanda bir değişken atomdur. 

>Java'da bir isim bildirilmeden kullanılamaz. Değişken bildiriminin genel biçimi şu şekildedir:

```java
<tür> <isim>[= <ifade>];
```
>Her değişkenin bir türü vardır. Değişken ismi, `değişken isimlendirme kurallarına` uygun olmalıdır. Bir değişkene bildirim noktasında değer verilmesine **ilk değerleme (initialization)** denir. Bir değişkenin derleyici tarafından görülebildiği kod aralığına **faaliyet alanı (scope)** denir. Bir değişkenin bellekte kalma süresine yani yaratılması ile yok edilmesi arasındaki süreye **ömür (storage duration)**. Dikkat edilirse `scope derleme zamanına` ilişkin, `storage duration` ise `çalışma zamanına` ilişkindir. Storage duration kavramı adresler konusunda ele alınacaktır.
>
>Java'da 3 çeşit değişken vardır:
>- Yerel değişkenler (local variables)
>
>- Parametre değişkenleri (parameter variables)
>
>- Sınıf veri elemanları (class member variables)
>
>Bir metot içerisinde `{` ile `}` arasında kalan bölüme **blok (block)** denir. Bu anlamda metodun gövdesi de bir bloktur. Bir metot içerisinde istenildiği kadar `iç içe (nested)` ya da istenildiği kadar `ayrık (discrete/distinct)` blok olabilir. 

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		{
			//...
			{
				//...				
				{
					//...
				}
			}
			
			{
				//...				
			}
			//...
		}		
	}
}
```

##### Yerel Değişkenler

>Bir blok içerisinde içerisinde bildirilen değişkenlere **yerel değişkenler (local variables)** denir. Aynı yerde bildirilen yerel değişkenler aynı türdende bildirim, virgül ile ayrılacak şekilde yapılabilir. Yerel bir değişkenin faaliyet alanı bildirildiği yerden bildirildiği bloğun sonuna kadardır.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		int x, y, z;
		double t, u;
		
		//...
	}
}

class Sample {
	public static void foo()
	{
		int a, b = 20;
		double c = 4.5, d;
		
		//...
		
		{			
			int e, f;
			
			
			f = 45;
		}
		
		a = 10;
		
		e = 30; //error
	}
}
```
>Aynı faaliyet içerisinde aynı isimde yerel değişken bildirimi geçersizdir. Farklı faaliyet alanları içerisinde aynı isimde yerel değişkenlerin bildirimi geçerlidir

```java
class Sample {
	public static void foo()
	{
		int a;
		double a; //error
		
		{
			double a; //error
			
			int x;
			
			//...
		}
		
		{
			int x;
			
			//...
		}
		
		int x;
		
		//...
	}
}
```

>Farklı faaliyet alanları içerisinde aynı isimde yerel değişkenlerin bildirimi yapılabilmesi dolayısıyla aşağıdaki foo ve bar metotları içerisinde a ve b değişkenleri bildirilebilir ve farklı değişkenlerdir

```java
class Sample {
	public static void foo()
	{
		int a;
		double b;
		
		//...
	}
	
	public static void bar()
	{
		int a;
		double b;
		
		//...
	}
}
```
>`print` ve `println` metotları aldıkları bir değişkenin değerini ekrana basarlar

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		int a = 10;
		double b = 3.4;
		
		System.out.println(a);
		System.out.println(b);
	}
}
```

>**Java'da değer verilmememiş bir değişkenin kullanımı error oluşturur.** Yerel değişkenlere otomatik olarak değer verilmez. Yerel bir değişkenin kullanılabilmesi için, kullanılmadan önce en az bir kez programcı tarafından değer verilmiş olması gerekir. Özetle belirtmek gerekirse yerel bir değişkene değer verilmesi programcının sorumluluğundadır

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		int a;
		double b;
		
		b = 23.4;
		
		double c;
		
		c = a + b; //error
		
		System.out.println(a); //error
		System.out.println(b);
	}
}
```

###### 25 Ağustos 2025

##### Değişken İsimlendirme Kuralları

>Değişken isimlendirme kuralları tüm değişken atomlar için geçerlidir. Kurallar şunlardır:
>
>- Değişken isimleri bir rakam karakteri ile başlatılamaz. Uygun bir karakter ile başlatılıp istenildiği kadar rakam karakteri kullanılabilir.
>
>- Değişken isimlerinde alfabetik karakterler kullanılabilir.
>
>- Anahtar sözcükler tek başına değişken ismi olamazlar
**Anahtar Notlar:** Java'da daha sonra eklenen bazı sözcükler kullanım yerine göre anahtar sözcük ya da değişken ismi olarak derleyici tarafından ele alınabilmektedir. Aslında bu sözcükler `Java Language Specification (JLS)` dökumanında anahtar sözcükler listesine eklenmezler. Bu tip sözcüklere programlamada genel olarak `contextual keyword` terimi kullanılmaktadır.
>
>- Değişken isimlerinde `_ (underscore)` karakteri kullanılabilir. Değişken isimleri alttire ile başlatılabilir. Java 9 ile birlikte alttire karakterinin tek başına değişken ismi olarak kullanımı geçersiz hale gelmiştir. Bu anlamda Java 9 ile birlikte alttire karakteri tek başına bir anahtar sözcük (keyword/reserved word) durumuna gelmiştir. Aslında Java 1.8'den itibaren alttire karakterinin tek başına değişken ismi olarak kullanılmasının kalkacağı uyarı (warning) olarak verilmeye başlanmıştır.

**Anahtar Notlar:** Programlamada artık kullanılması önerilmeyen bir `şey` için **deprecated** ya da **obselete** terimi kullanılır. Deprecated olmanın çeşitli gerekçeleri olabilir. Programcı deprecated olan bir `şeyi` özel bir durum yoksa kullanmamalıdır. Deprecated olmanın gerekçeleri ve yerine kullanılacaklar çoğu dökumante edilir. Deprecated olan bir `şey` kullanıldığında hemen her durumda derleyici uyarı mesajı verir. Bu anlamda alttire karakterinin tek başına değişken ismi olarak kullanılması Java 1.8'den itibaren `deprecated` olmuştur. 
>
>- Değişken isimleri bir boşluk karakteri (whitespaces) içermez. 
>
>- Değişken isimleri büyük küçük harf duyarlıdır (case-sensitive). Aslında Java case-sensitive bir programlama dilidir. 
>
>- Değişken isimlerinde UNICODE karakterler kullanılabilir. Örneğin, değişken isimlerinde Türkçe karakterlerin kullanımı geçerlidir. 

**Anahtar Notlar:** Her ne kadar değişken isimlendirmede UNICODE karakterler kullanılabilse de programcı yalnızca İngilizce alfabedeki karakterleri tercih etmelidir. Hatta programcı İnglizce dışındaki her hangi bir dile özgü kelimeyi de isimlendirmede kullanmamalıdır. Yani kısacı değişken isimlerinde İngilizce tercih edilmesi önerilir.

>- Değişken isimlerinde `$` karakteri kullanılabilir. Değişken isimleri `$` karakteri ile başlatılabilir, `$` karakteri tek başına değişken ismi olarak kullanılabilir. Ancak `$` karakteri programcı tarafından değişken isimlendirmede kullanılmamalıdır. Derleyiciler bazı durumlarda byte code'a ilişkin dosyaya ve/veya byte code içerisinde isimler üretirler. Derleyciler ürettikleri isimlerde `$` karakterini de kullanırlar. Bu durumda programcının belirlediği isimlerde `$` karakteri kullanılmadığından isim çakışması oluşmaz. JLS dökumanında `$` karakterinin değişken isimlendirmede kullanılması ancak programcının kullanmaması gerekçesi (rationale) bu şekilde açıklanmıştır.
>
>- JLS'de değişken isimlerinin maksimum karakteri sayısı ile ilgili her hangi bir şey söylenmemiştir. Şüphesiz bir sınırı vardır ancak bu sınır oldukça fazla olma eğilimindedir. Dolayısıyla isimlendirme açısından bir sorun oluşturmaz

**Anahtar Notlar:** Değişken isimlerinin okunabilirlik/algılanabilirlik açısından **kolay telaffuz edilebilir, anlamlı ve yeterince uzunlukta** olması önerilir. Bu öneri bir `programming convention` olarak düşünülmelidir. Değişken isimlendirmede bazı teknikler de kullanılabilmektedir. Genel olarak programlama diline göre bir ya da birden fazla teknik kullanılabilmektedir.

##### Klavyeden Okuma İşlemleri

> Java'da klavyeden okuma yapmak (aslında `stdin` dosyasından okuma yapmak) için pek çok sınıf ve metot bulunmaktadır. Biz kursumuzda `Scanner` sınıfının `nextXXX` metotlarını kullanacağız. Belirli konulara gelene kadar bu kullanımları birer kalıp olarak düşüneceğiz. Dolayısıyla kullanılan kalıpların detayları konular içerisinde daha belirgin hale gelecektir. Kullanılan kalıplarda IDE'lerin static kod analizi araçları kullanıma göre uyarı verebilecektir. Bu uyarıları aksi belirtilmediği sürece dikkate almayacağız. Buradaki kalıplarda istenen tür dışında bir değer girilmesi durumunda exception oluşacaktır.
>
> Aşağıdaki kalıpta int türden değerler okunmaktadır. Bu kalıpta değerler aralarında en az bir tane whitespace karakter olcak şekilde okunabilir

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int total;
		
		total = a + b;
		
		System.out.println(total);	
	}
}
```

> Aşağıdaki kalıpta int türden değerler okunmaktadır. Bu kalıpta değerler aralarında ENTER karakteri ile ayrılacak şekilde girilmelidir. Diğer whitespace karakterlerin kullanımı durumunda bu kalıpta exception oluşur


```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Birinci sayıyı giriniz:");
		int a = Integer.parseInt(kb.nextLine());
		
		System.out.print("İkinci sayıyı giriniz:");
		int b = Integer.parseInt(kb.nextLine());
		int total;
		
		total = a + b;
		
		System.out.println(total);	
	}
}

```


> Aşağıdaki kalıpta double türden değerler okunmaktadır. Bu kalıpta değerler aralarında en az bir tane whitespace karakter olcak şekilde okunabilir

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double total;
		
		total = a + b;
		
		System.out.println(total);	
	}
}
```

> Aşağıdaki kalıpta double türden değerler okunmaktadır. Bu kalıpta değerler aralarında ENTER karakteri ile ayrılacak şekilde girilmelidir. Diğer whitespace karakterlerin kullanımı durumunda bu kalıpta exception oluşur


```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Birinci sayıyı giriniz:");
		double a = Double.parseDouble(kb.nextLine());
		
		System.out.print("İkinci sayıyı giriniz:");
		double b = Double.parseDouble(kb.nextLine());
		double total;
		
		total = a + b;
		
		System.out.println(total);	
	}
}
```


> Aşağıdaki kalıpta long türden değerler okunmaktadır. Bu kalıpta değerler aralarında en az bir tane whitespace karakter olcak şekilde okunabilir

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		long a = kb.nextLong();
		long b = kb.nextLong();
		long total;
		
		total = a + b;
		
		System.out.println(total);	
	}
}
```

> Aşağıdaki kalıpta long türden değerler okunmaktadır. Bu kalıpta değerler aralarında ENTER karakteri ile ayrılacak şekilde girilmelidir. Diğer whitespace karakterlerin kullanımı durumunda bu kalıpta exception oluşur


```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Birinci sayıyı giriniz:");
		long a = Long.parseLong(kb.nextLine());
		
		System.out.print("İkinci sayıyı giriniz:");
		long b = Long.parseLong(kb.nextLine());
		long total;
		
		total = a + b;
		
		System.out.println(total);	
	}
}
```

##### İfade Kavramı

>Sabitlerden, operatörlerden ve değişkenlerden oluşan bir kombinasyona **ifade (expression)** denir. Bir ifade yalnızca sabitlerden ve operatörlerden oluşuyorsa **sabit ifadesi (constant expression)** denir. Bir sabit ya da bir değişken tek başına bir ifade belirtir ancak bir operatör tak başına bir ifade belirtmez. Her ifadenin bir türü vardır. Bunun bir tane istisnası vardır, ileride ele alınacaktır.

##### 27 Ağustos 2025

##### Metotların Geri Dönüş Değerleri

> Bir metodun geri dönüş değeri bilgisi yerine bir tür yazılırsa, bu metodun **geri dönüş değeri (return valueI)** vardır denir. Tersine bir metodun geri dönüş değeri varsa, geri dönüş değeri bilgisi yerine tür yazılır. Bir metodun geri dönüş değeri varsa, o metodun çağrısı bittiğinde çağrılan noktaya bir değer ile geri döner. Metodun geri dönüş değeri yoksa, metot sonlandığında çağrılan noktaya yalnızca geri döner, yani bir değer ile geri dönmez. Bir metodun geri dönüş değeri varsa, geri dönüş değeri metot içerisinde **return deyimi (return statment)** ile oluşturulur. return deyiminin genel biçimi şu şekildedir:

```java
return [ifade];
```

>Genel biçimden de anlaşıldığı gibi, return deyimi ya tek başına ya da bir ifade ile kullanılabilmektedir. return deyimi kurallar dahilinde nasıl kullanılırsa kullanılsın, akış return deyimine geldiğinde metot sonlanır. Yani return deyiminin birinci görevi metodu sonlandırmaktır. return deyimi kurallar dahilinde bir ifade ile kullanılmışsa ifadenin değeri çağrılan noktaya aktarılır. Buna geri dönüş değeri denmesinin nedeni budur.

>Aşağıdaki demo örnekte `sum` metodunda kullanıcıdan int türden iki tane değer istmemiş ve toplam değerine geri dönülmüştür. `main` metodu içerisinde `sum` metodu çağrısı bir ifade içerisinde kullanılmış dolayısıyla geri dönüş değeri o ifadede işleme sokulmuştur

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		int result;
		
		result = NumberUtil.sum() * 3;
		
		//...
		
		System.out.println(result);
	}
}

class NumberUtil {
	public static int sum()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input two numbers:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int total;
		
		total = a + b;
		
		return total;		
	}
}
```

>Akış return deyimine geldiğinde, return deyimine ilişkin ifade hesaplanır ve elde edilen değere geri dönülür.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		int result;
		
		result = NumberUtil.sum() * 3;
		
		//...
		
		System.out.println(result);
	}
}

class NumberUtil {
	public static int sum()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input two numbers:");
		int a = kb.nextInt();
		int b = kb.nextInt();		

		return a + b;		
	}
}
```
>Bir metodun geri dönüş değeri varsa return tek başına (yani bir ifade olmadan) kullanılamaz.

```java
class NumberUtil {
	public static int sum()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input two numbers:");
		int a = kb.nextInt();
		int b = kb.nextInt();		

		return; //error
	}
}
```
>Bir metodun geri dönüş değeri varsa, akışın her noktasında değere geri dönebilmesi gerekir. Aksi durumda error oluşur. Yani derleyici açısından geri dönüş değeri olan bir metodun sonlandığı her noktada bir değere geri dönüyor olması gerekir

>Aşağıdaki demo örneği inceleyiniz

```java
class NumberUtil {
	public static int sum() //error
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input two numbers:");
		int a = kb.nextInt();
		int b = kb.nextInt();		
		
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
class NumberUtil {
	public static int sum() //error
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input two numbers:");
		int a = kb.nextInt();
		int b = kb.nextInt();		

	
		if (a > b)
			return a;
	}
}
```

>Bir metodun geri dönüş değeri başka bir metodun geri dönüş değeri olarak doğrudan yazılabilir.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		int result;
		
		result = Util.total();
		
		//...
		
		System.out.println(result);
	}
}


class Util {
	public static int total()
	{
		//...
		System.out.println("total");
		
		
		return NumberUtil.sum();
	}
}

class NumberUtil {
	public static int sum()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input two numbers:");
		int a = kb.nextInt();
		int b = kb.nextInt();		

		return a + b;
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		int result;
		
		result = Util.total();
		
		//...
		
		System.out.println(result);
	}
}


class Util {
	public static int total()
	{
		//...
		System.out.println("total");
		
		
		return NumberUtil.sum() * 2;
	}
}

class NumberUtil {
	public static int sum()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input two numbers:");
		int a = kb.nextInt();
		int b = kb.nextInt();		

		return a + b;
	}
}
```
>Bir metodun geri dönüş değeri varsa, çağrıda geri dönüş değerinin sentaks ve semantik açıdan işleme sokulması zorunlu değildir. Şüphesiz metodun yaptığı işin de buna yönelik olması gerekir.


>Aşağıdaki demo örnekte metodu çağıran programcı senaryo gereği yalnızca değerin ekrana basılması ile ilgilenmektedir. Bu durumda geri dönüş değerini işleme sokmamıştr. Örnekteki `sum` metodu toplam değerini ekrana basmamış olsaydı, geri dönüş değerini kullanmamak yani işleme sokmamak bu metot için anlamlı olur muydu?

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		NumberUtil.sum();
	}
}

class NumberUtil {
	public static int sum()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input two numbers:");
		int a = kb.nextInt();
		int b = kb.nextInt();		
		int total = a + b;
		
		System.out.println(total);

		return total;
	}
}
```
>Geri dönüş değeri olan metot çağrısında derleyici **geçici değişken (temporary variable)** yaratan ve duruma göre işleme sokan kodu üretir. Aşağıdaki demo örnekte 

```java
result = NumberUtil.sum() * 3;
```

>deyimi için derleyici yaklaşık olarak aşağıdaki gibi bir kodu üretir (yani byte code'a yazar). 

```java
int temp = NumberUtil.sum();

result = temp * 3;
```
```java
package csd;

class App {
	public static void main(String [] args)
	{	
		int result;
		
		result = NumberUtil.sum() * 3;
		
		//...
		
		System.out.println(result);
	}
}

class NumberUtil {
	public static int sum()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input two numbers:");
		int a = kb.nextInt();
		int b = kb.nextInt();		
		
		return a + b;		
	}
}
```

>Dikkat edilirse geri dönüş değeri olan bir metot çağrısı geçici değişkene yapılan bir aktarım ya da başka bir deyişle atama (assignment) işlemidir.

>Bir metodun geri dönüş değeri olmaması durumunda geri dönüş değeri bilgisi yerine **void** anahtar sözcüğü yazılır. Geri dönüş değeri olmayan metotlara **void metotlar (void methods)** denir. void bir metod sonlandığında çağrılan noktaya bir değer ile geri dönmez. Bu durumda void bir metot içerisinde return deyiminin ifade ile kullanılması error oluşturur.

```java
class NumberUtil {
	public static void printSum()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input two numbers:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int total = a + b;
		
		System.out.println(total);
		return total; //error		
	}
}
```

>void bir metot içerisinde return deyimi ifade olmadan yani tek başına istenirse sonlandırmak için kullanılabilir. Bu durumda void bir metot içerisinde return deyimi kullanımı zorunlu değildir. 

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		NumberUtil.printSum();
	}
}

class NumberUtil {
	public static void printSum()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input two numbers:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int total = a + b;
		
		if (total < 0)
			return;
		
		System.out.println(total);				
	}
}
```

>void bir metot çağrısı sanki geri dönüş değeri varmış gibi işleme sokulamaz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		int result = NumberUtil.printSum() * 2; //error
	} 
}

class NumberUtil {
	public static void printSum()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input two numbers:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int total = a + b;
		
		if (total < 0)
			return;
		
		System.out.println(total);				
	}
}
```

**Anahtar Notlar:** Bir metodun geri dönüş değeri o metodun çıktısıdır (output).

**Anahtar Notlar:** Java'da bir metot tek bir değere geri dönebilir. Birden fazla değer geri dönemez.

**Anahtar Notlar:** void bir metot çağrısı da bir ifadedir ancak bu ifadenin türü yoktur. void bir metot çağrısına **void expression** denir.

##### Metotların Parametre Değişkenleri

>Metodun isminden sonra parantez içerisinde bildirilen değişkenlere **metot parametre değişkenleri (method parameter variables)** denir. Metot parametre değişkenleri aralarında virgül atomu ile ayrılacak şekilde yazılırlar

```java
class NumberUtil {
	public static int sum(int a, int b)
	{
		return a + b;
	}
	
	public static int square(int a)
	{
		return a * a;
	}
	
	public static void printSum(int a, int b)
	{
		int result = a + b;
		
		System.out.println(result);
	}
}
```

>Metodun son parametresinden sonra virgül konması error oluşuturur

```java
class NumberUtil {
	public static int sum(int a, int b,) //error
	{
		return a + b;
	}
	
	public static int square(int a,) //error
	{
		return a * a;
	}
}
```

>Bir metodun parametre değişkenleri aynı türden olsa bile her biri için tür bilgisi yazılmalıdır. Aksı durumda error oluşur

```java
class NumberUtil {
	public static int sum(int a, b) //error
	{
		return a + b;
	}
}
```
>Metot parametre değişkenleri faaliyet alanı (scope) bakımından metot başında bildirilen yerel değişkenler gibidir. Yani tüm metot boyunca görülebilirdir. Metot gövdesi dışından görülebilir değildir. 

>Metot çağrılırken parametrelere geçilen ifadelere **argüman (arguments)** denir. Bu anlamda metodun parametreleri, metodun girdileri (input). Bir metodun kaç tane parametresi varsa o kadar sayıda argüman ile çağrılmalıdır. Parametre değişkenleri değerlerini metot çağrısında, ilgili parametreye geçilen argümana ilişkin ifadenin değeri olarak alırlar. Yani metot çağrısında önce argümanlara geçilen ifadeler hesaplar elde edilen değerler ilgili parametreler aktarılır. Bu durumda argümandan parametreye aktarım da bir değer verme yani atama işlemidir. 

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		int total = NumberUtil.sum(a, b);
		
		System.out.println(total);
		
		NumberUtil.printSum(a, b);
		
		int result = NumberUtil.square(a);
		
		System.out.println(result);
	} 
}

class NumberUtil {
	public static int sum(int a, int b) 
	{
		return a + b;
	}
	
	public static int square(int a) 
	{
		return a * a;
	}
	
	public static void printSum(int a, int b)
	{
		int result = a + b;
		
		System.out.println(result);	
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		int total = NumberUtil.sum(a, b, 10); //error
		
		
	} 
}

class NumberUtil {
	public static int sum(int a, int b) 
	{
		return a + b;
	}
	
	public static int square(int a) 
	{
		return a * a;
	}
	
	public static void printSum(int a, int b)
	{
		int result = a + b;
		
		System.out.println(result);	
	}
}
```

>Aşağıdaki demo örnekte önce argümanlara ilişkin ifadelerin değerleri hesaplanır, sonra elde edilen değerler parametrelere aktarılır

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		int total = NumberUtil.sum(a + 2, b * 3);
		
		System.out.println(total);
	} 
}

class NumberUtil {
	public static int sum(int a, int b) 
	{
		return a + b;
	}
}
```

>Aşağıdaki demo örneği inceleyiniz. Bu örnekte 

```java
System.out.println(NumberUtil.sum(a + 2, b * 3));
```

>deyimi kompact olarak yazılmıştır. Bu tarz kompakt ifadelerin yazımında okunabilirliğin/algılanabilirliğin olumsuz etkilenmemesine özen gösterilmelidir.
```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
			
		System.out.println(NumberUtil.sum(a + 2, b * 3));
	} 
}

class NumberUtil {
	public static int sum(int a, int b) 
	{
		return a + b;
	}
}
```

**Anahtar Notlar:** Java'da 3 yerde değer verme ya da başka bir deyişle atama işlemi söz konnusudur:
1. Atama operatörleri ile yapılan değer verme
2. Bir metodun geri dönüş değerinin geçici değişkene aktarımı
3. Argümanlardan parametrelere aktarım


###### Metotlar ne işe yarar? Problem çözümünde neden metotlar yazalım? 

>Bu sorunun cevabı aşağıdaki maddelerle özetlenebillir:
>
>- Bir işin çok fazla yerde yapılması durumu kod tekrarına yol açar. Yazılım geliştirmede temel prensiplerden biri **zorunlu olmadıkça kod tekrarı yapmamaktır.** Bu kavrama İngilizce olarak **Do not repeat yourself (DRY)** denilmektedir.Bu durumda programcı bir metot yazarak ilgili algoritmaya ilişkin kod tekrarını o metodu çağrırarak engellemiş olur
>
>- Bir problemin çözümü gerektiği her noktada metot çağırma yerine kod tekrarlayarak yapılmışsa, bu durumda programcı problemin çözümüne ilişkin kodda bir değişiklik yapmak istediğinde veya bir hata olduğunu farkediği düzeltmek istedğinde tekrarladığı her yerde bu değişikliği yapmak zorunda kalır. Halbuki bu metot yazılmış ve gereken yerlerde çağrılmış olursa sadece metot içerisinde değişiklik yazpılması yeterli olacaktır.
>
>- Bir problemin çözümünün bir metot olarak yazılması onun bağımsız olarak test edilip doğrulanması, varsa hataların farkedilip düzeltilmesini kolaylaştırabilmektedir.
>
>- Bir problemin çözümü gerektiği her noktada metot çağırma yerine kod tekrarlayarak yapılmışsa, kodun okunabilirliği/algılanabilirliği de azalabilir. Metot çağrısı okunabilirliği/algılanabilirliği artırır
>
>- Metotlar yazıldığında başka projelere de çeşitli yöntemlerle taşınarak kullanılabilir. Bu anlamda **code reusablity** açısından da önemlidir.
>
>- Metodu yazan programcı metodun nasıl yazıldığına ilişkin detayları bilmek zorunda değildir. Çünkü metodun çağrıldığı noktada nasıl yazıldığının önemi yoktur, ne iş yaptığının önemi vardır.

**Anahtar Notlar:** Yukarıda anlatılan gerekçelerin en temel çözümü metotlar yazmak ve çağırmak biçimindedir. İleride ele alacağımız başka tekniklerle birlikte daha yüksek seviyeli çözümler de göreceğiz.

###### 1 Eylül 2025

##### Formatlı Yazdırma İşlemleri

>Java'da formatlı yazdırma yazdırma yapmak için temel olarak **System.out.printf** metodu kullanılır. Bununla birlikte tamamen aynı işi yapan **System.out.format** isimli metot da kullanılabilmektedir. `printf` metodunun birinci parametresine argüman olarak bir yazı (string, string literal vb.) geçilmelidir. Metodun diğer paramtreleri istenilen sayıda ve türde olabilmektedir. Bu anlamda `printf` metodu `değişken sayıda argüman alan metottur(variable arguments/varargs method).` Bu tarz metotların nasıl yazılacağı bu bölümde ele alınmayacaktır. Metodun birinci parametresine geçilen yazı içerisinde özel bazı karakterler `%` karakteri ile birlikte kullanılabilmektedir. Bu özel karakterlere **format karakterleri (format specifiers)** denir. Bu format karakterleri `%` karakteri ile birlikte kullanıldıklarında **yer tutucu (place holder)** görevi görürler. Bir format karakteri özel bazıları dışında bir türe karşılık gelir ve o yer tutucu yerine metoda geçilen argümanın değeri yerleştirilerek formatlama işlemi yapılır. Format karakterlerinin bazıları şunlardır:

>**d:** Tamsayı türleri için kullanılır. Sayının decimal olarak formatlanmasını sağlar

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();	
		
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.println("Tekrar yapıyor musunuz?");
	} 
}
```

>**x veya X:** Tamsayı türleri için kullanılır. Sayının değerinin hxadecimal olarak formatlanmasını sağlar. Format karakterinin küçük veya büyük olmasına göre semboller sırasıyla küçük harf veya büyük harf olarak yazılırlar.

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();	
		
		System.out.printf("%x + %x = %x%n", a, b, a + b);
		System.out.printf("%X + %X = %X%n", a, b, a + b);
		System.out.println("Tekrar yapıyor musunuz?");
	} 
}
```

>**o:** Tamsayı türleri için kullanılır. Sayının değerinin octal olarak formatlanmasını sağlar.

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();	
		
		System.out.printf("%o + %o = %o%n", a, b, a + b);
		System.out.println("Tekrar yapıyor musunuz?");
	} 
}

```

>Tamsayılar formatlanırken **hizalama (alignment)** yapılabilmektedir. `%` ile format karakteri arasında pozitif bir tamsayı yazıldığında, yer tutucuya ilişkin değerin karakter sayısı o tanmsayı değerinden küçükse tamamlamak için `SPACE` karakteri yerleştirilir. Eğer hizalama için yazılan pozitif tamsayıdan önce sıfır yazılırsa tamamlamak için sıfır kullanılır.

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Tarih bilgisini giriniz (gün ay yıl):");
		int day = kb.nextInt();
		int month = kb.nextInt();
		int year = kb.nextInt();
		
		System.out.printf("%2d/%2d/%4d%n", day, month, year);
		System.out.printf("%02d/%02d/%04d%n", day, month, year);
		System.out.println("Tekrar yapıyor musunuz?");
	} 
}

```

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		System.out.printf("a = %08X%n", a);
		System.out.println("Tekrar yapıyor musunuz?");
	} 
}
```

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		long a = kb.nextLong();
		
		System.out.printf("a = %016X%n", a);
		System.out.println("Tekrar yapıyor musunuz?");
	} 
}
```

>**f:** Gerçek sayı türleri için kullanılır.

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();	
		
		System.out.printf("%f + %f = %f%n", a, b, a + b);
		System.out.println("Tekrar yapıyor musunuz?");
	} 
}
```

>Gerçek sayıların formatlanmasında `%` ile `f` arasında `.` ile birlikte bir negatif olmayan tamsayı yazıldığında, noktadan sonra kaç basamağın formatlanacağı bilgisidir. Geri kalan basamaklar bilimsel olarak yuvarlanır (round).

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();	
		
		System.out.printf("%.2f + %.2f = %.20f%n", a, b, a + b);
		System.out.println("Tekrar yapıyor musunuz?");
	} 
}
```
**c:** char türü için kullanılır.

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		char c = 45000;
		
		System.out.printf("c = %c%n", c);
		System.out.println("Tekrar yapıyor musunuz?");	
	} 
}
```

**b:** boolean türü için kullanılır.

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		boolean flag = true;
		
		System.out.printf("flag = %b%n", flag);
		System.out.println("Tekrar yapıyor musunuz?");	
	} 
}
```

**n:** İmleci bir sonraki satırın başına çekmek için kullanılır.

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();	
		
		System.out.printf("a = %.4f%nb = %.4f%n", a, b);
		System.out.println("Tekrar yapıyor musunuz?");
	} 
}
```
**`%`** `%` karakterinin formatlanması için kullanılır.


```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Oranı giriniz:");
		double ratio = kb.nextDouble();
		
		System.out.printf("Oran = %% %f%n", ratio);
		System.out.printf("Oran = %%%f%n", ratio);
		System.out.println("Tekrar yapıyor musunuz?");
	} 
}
```

>Format karakterlerine ilişkin argümanların türlerinin uyuşmaması durumunda exception oluşur.

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Oranı giriniz:");
		double ratio = kb.nextDouble();
		
		
		System.out.printf("Oran = %% %d%n", ratio);
		System.out.println("Tekrar yapıyor musunuz?");
	} 
}
```

**Anahtar Notlar:** Burada anlatılan format karakterlerinin diğer ayrıntıları konular içerisinde ele alınacaktır.

**Anahtar Notlar:** Burada anlatılan format karakterleri dışında da format karakteri vardır. Konular içerisinde ele alınacaktır.

**Anahtar Notlar:** `printf` metodu gibi kullanılan yani formatlamayı aynı şekilde yapabilen ancak ekrana basmayan çok önemli bazı metotlar vardır. Bu sebeple `printf` kullanımının bilinmesi Java programcısı açısından önemlidir. Bu çok önemli metotlar ileride ele alınacaktır.

>**Sınıf Çalışması:** Klavyeden girilen iki double türden sayının toplamını, farkını, çarpımını ve bölümünü aşağıdaki açıklamalara göre ekrana bastıran programı yazınız.
>
>**Açıklamalar:**
>- Sayılar noktadan sonra 4 basamağa kadar, sonuçlar ise noktadan sonra 7 basamağa kadar gösterilecektir
>
>- Ekran çıktıları girilen sayılar örneğin `0.1` ve `0.2` ise aşağıdaki biçimde olacaktır

```
0.1000 + 0.2000 = 0.3000000
0.1000 - 0.2000 = -0.1000000
...
```
>Diğer işlemler içinde benzer çıktılar olacaktır.

>**Çözüm:**

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		
		System.out.printf("%.4f + %.4f = %.7f%n", a, b, a + b);
		System.out.printf("%.4f - %.4f = %.7f%n", a, b, a - b);
		System.out.printf("%.4f * %.4f = %.7f%n", a, b, a * b);
		System.out.printf("%.4f / %.4f = %.7f%n", a, b, a / b);		
		System.out.println("Tekrar yapıyor musunuz?");
	} 
}
```

##### Bölme İşlemi

>Tamsayılarla bölme işleminde sonuç tamsayı olarak elde edilir. Yapılan işlemin sonucunda değerin noktadan sonraki kısmı atılır. Tamsayılarla bölme işleminde payda sıfır ise exception oluşur.

>Aşağıdaki demo örneği çeşitli değerler ile çalıştırıp sonuçları gözlemleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		System.out.printf("%d / %d = %d%n", a, b, a / b);
		System.out.println("Tekrar yapıyor musunuz?");
	} 
}
```

>`IEEE 754` formatında gerçek sayılar dışında özel bazı değerler de bulunur. Örneğin, `NaN, Infinity, -Infinity` değerleri sırasıyla `Not a Number, Positive Infinity, Negative Infinity` değerlerini temsil eder. Bu durumda gerçek sayılarla bölme işleminde payda sıfır, pay sıfır dışı bir değerse elde edilen sonuç, pay pozitif ise `Infinity`, nagatif ise `-Infinity` biçimindedir. Pay ve paydanın her ikisi birden sıfır ise sonuç `NaN` biçimindedir.

>Aşağıdaki demo örneği çeşitli değerler ile çalıştırıp sonuçları gözlemleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		
		System.out.printf("%f / %f = %f%n", a, b, a / b);
		System.out.println("Tekrar yapıyor musunuz?");
	} 
}
```

>`IEEE 754` formatında başka özel değerler de bulunur. Bunlar konular içerisinde ele alınacaktır. Genel olarak `NaN` Matematikteki belirsiziliği (indeterminate), `Infinity ve -Infinity` ise Matematikteki tanımsızlığı temsil eder. 

##### Standart Metotlar

>JavaSE'de standart olarak bildirilen pek çok metot bulunmaktadır. Programcı bir problemin çözümüne ilişkin işlem yapan standart metotlar varsa önce onları kullanmayı tercih etmelidir. Eğer yoksa bazı çok kullanılan kütüphanelerde varsa onları tercih etmelidir. Hala yoksa bu durumda programcı ilgili işlemleri yapan metotları yazmalıdır. Ancak bu durum, programcının kullandığı bir metodun, standart olsun ya da olmasın nasıl yazıldığını gözardı etmesi anlamına gelmemelidir. Programcının, programlama yaşamı boyunca hepsini olmasa da hazır olarak kullandığı metotların nasıl yazıldığını öğrenmesi gerekir. Bunun hemen yapılması gerekmez.  
>
>Standart metotların, metot kullanmaya da ek olarak avantajları şu şekilde özetlenebilir:
>- Testleri yapılmıştır ve yeterince etkin olarak yazılmıştır. Hatta duruma göre zamanla metodun etkinliği de artırılmış olabilir.
>
>- Taşınabilirdir. Yani, standart metotların çağrıldığı kodlar herhangi bir üçüncü parti koda ya da kütüphaneye ihtiyaç duymadan derlenebilir. 
>
>Bu durumda bir metodun **ne iş yaptığını** anlamak için tipik olarak bir dökumantasyon oluşturulur. JavaSE içerisinde bulunan standart metotların (ait olduğu sınıfların da) dökumantasyonu [https://docs.oracle.com/](https://docs.oracle.com/) bağlantısındaki çeşitli sayfalarda bulunmaktadır. Ancak yine de ilgili dökumantasyon tüm detayıyla açıklama yapmayabilir. Genel olarak Java dökumantasyonu konu hakkında fikir vermek için yazılır. Duruma göre programcı başka kaynaklardan öğrenmek zorunda kalabilir.

##### Matematiksel İşlemler Yapan Önemli Metotlar

>JavaSE'de Matematiksel işlemler yapan metotların büyük bölümü `Math` isimli bir sınıf içerisinde bildirilmiştir. Bu sınıf `java.lang` paketi içerisindedir.

**Anahtar Notlar:** `java.lang` paketi içerisinde bulunan sınıflara herhangi bir bildirim yapmadan ve paket ismi ile kombine etmeden doğrudan erişilebilir. Konunun ayrıntıları `paketler ve isim arama` konularında ele alınacaktır.

>`Math` sınıfı içerisinde bazı metotlar Matematiksel problemleri içeren algoritmalar dışında da pek çok yerde kullanılabilmektedir. Bazıları ise genelde Matematiksel problemleri içeren algoritmalarda kullanılmaktadır. Java'da Matematiksel işlemler gerektiğinde programcı önce bu sınıfa bakmalıdır, varsa bu sınıftakini kullanmalıdır. Yoksa duruma göre başka alternatifler aramalı ya da kendisi yine standart metotları kullanarak yazmalıdır. Burada pratikte Matematiksel olmayan problemlerde karşımıza çıkan önemli bazı elemanlar ele alınacaktır. Ele alınan elemanların detayları ve ele alınmayan metotlar ilgili dökumantasyondan incelenebilir.

>Math sınıfının `sqrt` metodu parametresi ile aldığı double türden değerin kareköküne geri döner: $$\sqrt{a}$$. Metot negatif değerler için `NaN` değerine geri döner.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		double a = kb.nextDouble();
		
		System.out.printf("sqrt(%f) = %f%n", a, Math.sqrt(a));
	} 
}
```

>Math sınıfının `pow` metodu parametresi ile aldığı a ve b değeri için $$a^b$$ değerine geri döner.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input two values:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		
		System.out.printf("pow(%f, %f) = %f%n", a, b, Math.pow(a, b));
	} 
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı, kartezyen düzlemde iki noktaya ilişkin koordinat bilgilerine göre Euclid uzaklığına geri dönen `distance` isimli metodu `PointUtil` isimli bir sınıf içerisinde aşağıdaki açıklamalara göre yazınız ve aşağıdaki kod ile test ediniz

>**Açıklamalar:**
>- Koordinat bilgileri double olarak tutulacaktır
>- Euclid uzuklığı formülü $$distance = \sqrt{(x_1 - x_2)^2 + (y_1 - y_2)^2}$$ biçimindedir.


>**Çözüm-1:**

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		PointUtilDistanceTest.run();
	} 
}

class PointUtilDistanceTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input ccordinates:");
		double x1 = kb.nextDouble();
		double y1 = kb.nextDouble();
		double x2 = kb.nextDouble();
		double y2 = kb.nextDouble();
		
		System.out.printf("Distance = %f%n", PointUtil.distance(x1, y1, x2, y2));
	}
}


class PointUtil {
	public static double distance(double x1, double y1, double x2, double y2) 
	{
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}
}
```

>**Çözüm-2:**

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		PointUtilDistanceTest.run();
	} 
}

class PointUtilDistanceTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input ccordinates:");
		double x1 = kb.nextDouble();
		double y1 = kb.nextDouble();
		double x2 = kb.nextDouble();
		double y2 = kb.nextDouble();
		
		System.out.printf("Distance = %f%n", PointUtil.distance(x1, y1, x2, y2));
	}
}


class PointUtil {
	public static double distance(double x1, double y1, double x2, double y2) 
	{
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
}
```

>Math sınıfının `PI` ve `E` isimli veri elemanları ile sırasıyla $$\pi$$ ve $$e$$ sayıları elde edilebilir. 

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		System.out.println(Math.PI);
		System.out.println(Math.E);
	} 
}
```

>Math sınıfının `abs` metotları aldıkları değerin mutlak değerine geri dönerler

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		double a = kb.nextDouble();
		
		System.out.printf("abs(%f) = %f%n", a, Math.abs(a));
	} 
}
```

>Math sınıfının `log` ve `log10` metotları. Bu metotlar, argümanlarına sıfır geçilmesi durumuna `-Infinity`, negatif geçilmesi durumunda `NaN` değerine geri dönerler.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		double a = kb.nextDouble();
		
		System.out.printf("log(%f) = %f%n", a, Math.log(a));
		System.out.printf("log10(%f) = %f%n", a, Math.log10(a));
	} 
}
```

>Math sınıfında herhangi bir tabana göre logaritma hesaplayan bir metot olmadığından Java programcısı aşağıdaki gibi bir metot yazarak kullanabilir

>Aşağıdaki demo örneği inceleyiniz
```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		double a = kb.nextDouble();
		
		System.out.printf("log(2, %f) = %f%n", a, MathUtil.log(2, a));	
	} 
}

class MathUtil {
	public static double log(double a, double b)
	{
		return Math.log(b) / Math.log(a);
	}
}
```

>Math sınıfının trigometrik işlemler yapan metotları (`sin, cos, tan, asin, acos, atan vb.`) radyan ölçü birimiyle çalışır. Bununla birlikte Math sınıfında derece-radyan arasındaki dönüşümler için kullanılabilen `toDegrees` ve `toRadians` metotları da bulunmaktadır.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input degree:");
		double a = kb.nextDouble();
		
		System.out.printf("sin(%f) = %f%n", a, Math.sin(Math.toRadians(a)));	
	} 
}
```

>Math sınıfının `min` ve `max` metotları parametreleri ile aldığı değerlerin sırasıyla en küçüğüne ve en büyüğüne geri döner. 

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input two numbers:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		
		System.out.printf("min(%f, %f) = %f%n", a, b, Math.min(a, b));
		System.out.printf("max(%f, %f) = %f%n", a, b, Math.max(a, b));
	} 
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input three numbers:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		
		System.out.printf("min(%d, %d, %d) = %d%n", a, b, c, MathUtil.min(a, b, c));
		System.out.printf("max(%d, %d, %d) = %d%n", a, b, c, MathUtil.max(a, b, c));
	} 
}

class MathUtil {
	public static int max(int a, int b, int c)
	{
		return Math.max(Math.max(a, b), c);
	}
	
	public static int min(int a, int b, int c)
	{
		return Math.min(Math.min(a, b), c);
	}
}
```
>Math sınıfının `round`, `rint`, `ceil` ve `floor` metotları tamsayıya yuvarlama işlemi yapan önemli metotlardır. `round` ve `rint` metotları bilimsel yuvarlama yaparlar. `round` metodunun double parametreli olanı long türden değere geri döner, `rint` metodu ise tamsayıya yuvarlanmış değerin double karşılığına geri döner. Bu iki metodun arasındaki diğer farklar dökumanlardan öğrenilebilir. `ceil` metodu sayıdan büyük veya eşit olan en küçük sayıya, `floor` metodu ise sayıdan küçük veya eşit olan en büyük sayıya geri döner.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a number:");
		double a = kb.nextDouble();
		
		
		System.out.printf("round(%f) = %d%n", a, Math.round(a));
		System.out.printf("rint(%f) = %f%n", a, Math.rint(a));
		System.out.printf("ceil(%f) = %f%n", a, Math.ceil(a));
		System.out.printf("floor(%f) = %f%n", a, Math.floor(a));
	} 
}
```

###### 8 Eylül 2025 - 10 Eylül 2025

##### Sabitler

>Program içerisinde doğrudan yazılan bir değere **sabit (literal/constant)** denir. Anımsanacağı gibi iki tırnak içerisindeki yazılara tırnaklarıyla birlikte `string literals` denir. **Sabitlerin de türleri vardır yani derleme aşamasında bir sabitin türü tespit edilir.**

**Anahtar Notlar:** Derleyicinin bir ifadenin türünü tespit etmesine İngilizce terim olarak **type inference/deduction** denir.

>Sabitlerin türleri aşağıdaki kurallara göre belirlenir:
>
>- Sayı nokta içermiyorsa, sonuna her hangi bir ek almamışsa ve int türü sınırları içerisinde kalıyorsa int türden bir sabittir. Sayı int türü sınırları dışındaysa error oluşur. Örneğin, 100, 234.
>
>- Sayı nokta içermiyorsa ve sonuna L (küçük veya büyük) ekini almışsa long türdendir. L son ekini alan bir sabit long türü sınırları dışındaysa error oluşur. Örneğin, 200L, 4000000000L. Küçük harf L sonekinin bazı yazı türlerinde 1(bir) rakamına benzerliğinden dolayı okunabilirlik/algılanabilirlik açısından kullanımı önerilmez.
>
>- Java'da byte ve short türden sabit yoktur.
>
>- Sayı nokta içeriyorsa ve sonuna her hangi bir ek almamışsa double türdendir. Örneğin, 0.1, 3.566, 7.899.
>
>- Sayı nokta içersin ya da içermesin sonuna D (küçük veya büyük) ekini almışsa double türdendir. Örneğin, 3.4D, 3D, 4d.
>
>- Sayı nokta içersin ya da içermesin sonuna F (küçük veya büyük) ekini almışsa float türdendir. Örneğin, 3.4F, 4f, 5F. Nokta içeren ve noktadan sonraki kısmının tamamı sıfır olmayan bir double türden sabitin sonuna F (küçük ya da büyük) eki getrildiğinde, değeri float türü ile temsil edilemiyorsa, temsil edilebilen en yakın değere yuvarlanır (rounding error).
>
>-  boolean türden iki tane sabit vardır: true, false.
>
>- Tek tırnak içerisinde yazılan karakterlere ilişkin sembollere tırnakları ile beraber **karakter sabitleri (character literals)** denir. Karakter sabitleri char türdendir. Tek tırnak içerisinde özel bazı durumlar dışında tek bir karakter yazılabilir. Aksi durumda error oluşur. Bir karakter sabiti, ilgili karakterin code point'ine karşılık gelir. Bu durumda char türden değişken içerisinde bir karakterin code point'i tutulabilir. Böylelikle **mantıksal olarak** char türü ile bir karakter tutulmuş olur. Bazı karakterler klavyedeki tuş kombinasyonları ile doğrudan yazılamazlar, bazı karakterler ise doğrudan ekrana basılamazlar (non-printable). Bu tarz karakterlere ilişkin sabitler, `\` karakteri ile birlikte özel bir karakter ile tek tırnak içerisinde yani bir karakter sabiti olarak yazılırlar. Sabitleri, ters bölü ile yazılabilen karakterlere **escape sequence characters** denir. Java'da desteklenen escape sequence karakter şunlardır:

| Karakter Sabiti | Karakter Sabiti Adı                          |
| --------------- | -------------------------------------------- |
| `'\n'`          | Line Feed (LF)                               |
| `'\r'`          | Carriage Return (CR)                         |
| `'\t'`          | Tabular (horizontal tab)                     |
| `'\f'`          | Form feed                                    |
| `'\b'`          | Backspace                                    |
| `'\''`          | Single quote                                 |
| `'\"'`          | Double quote (optional)                      |
| `'\\'`          | Back slash                                   |
| `'\0'`          | `null` character                             |
| `'\s'`          | special whitespace character (Since Java 12) |

**Anahtar Notlar:** Bazı escape sequence karakterlerin ekran çıktısına yansıması, kullanılan IDE'nin console penceresinde doğru gösterilmeyebilir. Bu sebeple aşağıdaki demo örnekleri ilgili işletim sisteminizin komut yorumlayıcı programı üzerinde çalıştırmanız ve gözlemlemeniz tavsiye edilir. 


>LF Karakter Sabiti Örneği

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		char c = '\n';
		
		System.out.print("Hi");
		System.out.print(c);
		System.out.println("How are you?");
	} 
}
```

>CR Karakter Sabiti Örneği

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		char c = '\r';
		
		System.out.print("Istanbul");
		System.out.print(c);
		System.out.print("bolu");
	} 
}
```

>Tek tırnak karakter sabiti `\` ile yazılmalıdır. Aksi durumda error oluşur. İki tırnak karakter sabiti doğrudan ya da `\` ile yazılabilmektedir.

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		char c1 = '\'', c2 = '"', c3 = '\"';
		
		System.out.printf("c1 = %c, c2 = %c, c3 = %c%n", c1, c2, c3);	
	} 
}
```

>Ters bölü karakterinin karakter sabiti de yine `\` ile yazılmalıdır. Aksi durumda error oluşur

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		char c = '\\';
		
		System.out.printf("c = %c%n", c);	
	} 
}
```

>Tab karakter sabiti

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		char c = '\t';
		
		System.out.printf("c = (%c)%n", c);	
	} 
}
```

>Backspace karakter sabiti

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		char c = '\b';
		
		System.out.print("Merhaba");
		System.out.print(c);
	} 
}
```

>Escape sequence karakterler genel olarak `string literal` içerisinde kendi anlamındadır

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		System.out.print("Merhaba\nNasılsın?");		
	} 
}
```

>string literal içerisinde ters bölü ile birlikte uygun olmayan bir escape sequence karakteri yazıldığında error oluşur

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		System.out.print("Merhaba\gNasılsın");	//error	
	} 
}
```

>Aşağıdaki demo örnekte string literal içerisindeki karakterler kendi anlamında olduğundan `C:\test\names.txt` yazısı elde edilemez

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		System.out.println("C:\test\names.txt");		
	} 
}
```

>Aşağıdaki demo örnekte string literal içerisindeki karakterler kendi anlamında olduğundan `C:\test\names.txt` yazısı elde edilir

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		System.out.println("C:\\test\\names.txt");		
	} 
}
```

>Aşağıdaki demo örnekte `\\192.168.1.197\test\names.txt` yazısı elde edilmiştir

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		System.out.println("\\\\192.168.1.107\\test\\names.txt");		
	} 
}
```

>Tek tırnak karakteri string literal içerisinde doğrudan ya da `\` ile kullanılabilir. Bu iki kullanım da tamamen aynı anlamdadır. İki tırnak karakeri string literal içerisinde yalnızca `\` ile kullanılabilmektedir

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		System.out.println("'C ve Sistem Programcıları Derneği'");
		System.out.println("\'C ve Sistem Programcıları Derneği\'");
		System.out.println("\"C ve Sistem Programcıları Derneği\"");
	} 
}
```
>Bir karakter sabiti `\u` ile birlikte sıra numarası yazılarak kullanılabilir. Burada sıra numarasının hexadecimal olarak ve 2 byte (4 hex digit) olarak yazılması gerekir. Aksi durumda error oluşur.


>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		char c = '\u0041';
		
		System.out.println(c);
	} 
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		char c = '\u12CE';
		
		System.out.println(c);
	} 
}
```

>Aslında `\u` yazımı değişken isimlendirmede de kullanılabilir. Ancak pratikte tercih edilmez.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		int \u03A3OfStudents = 10;
		
		System.out.println(\u03A3OfStudents);
	} 
}
```

>`\0` karakter sabiti, karakter tablosunun ilk karakterine (sıfır numaralı karakter) karşılık gelir. Bu karakter önemli bazı durumlarda karşımıza çıkmaktadır. Kullanımı ileride ele alınacaktır. `\s` karakter sabiti, Java 12 ile birlikte eklenen ve ismine **text block** denilen yeni bir string literal içerisinde kullanılabilmektedir. Text block ve dolayısıyla bu karakter sabiti ileride ele alınacaktır.

>Sayının noktadan sonraki kısmının tamamı sıfırsa, noktadan sonraki sıfır yazılmayabilir. Benzer şekilde sayının tam kısmı da sıfırsa noktadan önce sıfır yazılmayabilir. 


>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		System.out.println(67.);
		System.out.println(67.0);
		System.out.println(.67);
		System.out.println(0.67);
	} 
}
```

>Bir sabit üstel olarak gösterilebilir. Bu gösterime **bilimsel gösterim (scientific notation)** ya da **üstel gösterim (exponential notation)** denir. Üstel olarak gösterilen sabitler değerleri ne olursa olsun double türden dir.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		System.out.printf("%.0f%n", 6.02E22);
		System.out.printf("%.0f%n", 6.02E+22);
		System.out.printf("%.0f%n", 6.02e22);
		System.out.printf("%.0f%n", 6.02e+22);
		System.out.printf("%.24f%n", 6.02E-22);
		System.out.printf("%.24f%n", 6.02E-22);
		System.out.printf("%.24f%n", 6.02e-22);
		System.out.printf("%.24f%n", 6.02e-22);
	} 
}
```

>Tamsayı sabitleri `decimal`, `hexadecimal`, `octal` ve Java 7 ile birlikte `binary` olarak yazılabilmektedir. Bir sabit doğrudan yazıldığında decimal olarak ele alınır. Sabitin başında `0x (sıfır ve küçük veya büyük X)` yazılırsa hexadecimal, sıfır yazılırsa octal ve `0b (sıfır ve küçük veya büyük B)` yazılırsa binary olarak ele alınır. Yazılan sabitte, sayı sisteminde geçerli olmayan bir sembol kullanımı durumunda error oluşur

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		int a = 10;
		int b = 0xA;
		int c = 0XA;
		int d = 0xa;
		int e = 012;
		int f = 0b1010; //Since Java 7
		int g = 0B1010; //Since Java 7
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	} 
}
```

>Java 7 ile birlikte sabitlerin basamakları arasında alttire karakteri kullanılabilmektedir. Alttire karakteri yalnizca iki basamak arasında istenildiği kadar sayıda yazılabilmektedir. Örneğin, bir sabitin başında, sonunda ya da önek almışsa önekten sonra yazılması error oluşturur. Bu durumun tek bir istisnası vardır: Octal bir sabitin öneki ile (sıfır ile) sabit arasında alttire yazılabilir.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		int a = 1______________0;
		int b = 0b0000_1100_0011_1010;
		int c = 0_12;
		double d = 345_789.789_678;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	} 
}
```
##### Derleyicilerin Kod Optimizasyonu

>Derleyiciler **yazılan kodun algoritmasını değiştirmeden** kodun daha iyi çalışmasını sağlamaya çalışırlar. Yani buna yönelik kod üretir. Buna **derleyicilerin kod optimizasyonu (compiler code optimization)** denir. Derleyicilerin kod optimizasyonu genel olarak ikiye ayrılır: **speed optimization, size optimization**. Speed optimization hızlandırmak, size optimization ise üretilen kodun daha az yer kaplamasını sağlamak için yapılır. Hız optimizasyonunda derleyici yazılan algoritmanın daha hızlısını yazmaz. Yani derleyicilerin yazılan bir algoritmayı iyileştirmek gibi bir hedefi yoktur. Hızlandırma var olan algoritmayı değiştirmeden yapılır. Derleyicilerin pek çok optimizasyonu vardır. Konular içerisinde ele alınacaktır.

###### Constant Folding Optimization

>Derleyiciler sabit ifadelerinin (constant expressions) değerlerini hesaplayıp BC'ye yazarlar. Buna **constant folding optimization** denir. 

>Aşağıdaki demo örnekte `1` ile belirtilen ifadede bulunan sabit ifadesi hesaplanıp BC'ye yazılır.

```java
package csd;

class App {
	public static void main(String [] args)
	{		
		for (int i = 0; i < 100; ++i) {			
			double val = 6.02E23 * 2.4567; //1
			
			//...
		}
	}
}
```

###### 15 Eylül 2025

##### Temel Operatörler

>Belirli bir işleme yol açan ve bu işlem sonucunda bir değer üreten atomlara **operatör (operator)** denir. Bu bölümde temel operatörler ele alınacaktır. Bazı operatörler konular içerisinde, bazı operatörler `Java ile Uygulama Geliştirme 1` kursunda ele alınacaktır. 

>Bir operatör ile işleme giren ifadelere **operand** denir. 

>Bir operatörün öğrenilmesi, o operatör içim aşağıdaki özelliklerin öğrenilmesi anlamına gelir.

>**Operatörlerin Sınıflandırılması:** Bir operatörün aşağıdaki sınıflarmada nerede olduğu bilgisidir:
>
>1. İşlevlerine göre sınıflandırma: İşlevlerine göre operatörler şu şekilde sınıflandırılabilir:
>
>>- Artimetik Operatörler (Arithmetic Operators)
>>- Karşılaştırma Operatörleri (Comparison Operators)
>>- Mantıksal Operatörler (Logical Operators)
>>- Bitsel Operatörler (Bitwise Operators)
>>- Özel Amaçlı Operatörler (Special Purpose Operators)
>
>2. Operand sayısına göre sınıflandırma: Operand sayısına göre operatörler şu şekilde sınıflandırılabilir:
>
>>- Tek operandlı (unary)
>>- İki operandlı (binary)
>>- Üç operandlı (ternary)
>
>3. Operatörün konumuna göre sınıflandırma: Operatörün, operand ya da operandlarına göre nerede olduğu bilgisidir. Konumuna göre operatörler şu şekilde sınıflandırılabilir:
>
>>- Önek (prefix)
>>- Araek (infix)
>>- Sonek (postfix)
>
>**Operatörün Ürettiği Değer (Product Value):** Operatörün yaptığı işlem sonucunda elde edilen değerdir.
>
>**Operatörün Yan Etkisi (Side Effect):** Operatörün, operandının değerini değiştirip değiştirmemesi durumudur. Değiştiriyorsa yan etkisi vardır, değiştirmiyorsa yoktur.
>
>**Operatörün Kısıtı (Contraint):** Operatörün kullanımına ilişkin zorunluluklardır.
>
>**Operatörün Önceliği (Operator Precedence):** Bir ifadede önceliği olan operatörün genel olarak (ama her operatör için değil) önce işleme girmesidir. Bu durumun önemli bazı istisnaları vardır. 
Aslında terminolojik olarak **operatörün önceliği (operator precedence)** ve **işleme giriş sırası (order of evaluation)** her operatör için aynı şeyler değildir. Bazı operatörler öncelikli olmasına karşın işlem sıraları farklı olabilmektedir. Önceliğe ilişkin basit bir örnek şu şekilde verilebilir: 

```
a = b + c * d ifadesinin yapılış sırası şöyledir:
i1: c * d
i2: b + i1
i3: a = i2
```
>Bir işlemi önceliklendirmek için Matematikteki gibi ifade parantez içerisine alınır. Önceliklendirme parantezi de aslında bir operatördür:

```
a = (b + c) * d ifadesinin yapılış sırası şöyledir:
i1: b + c
i2: i1 * d
i3: a = i2
```

>Bazı operatörler aynı öncelik seviyesinde olabilirler. Bu durumda, aynı öncelik seviyesindeki operatörlerin nasıl ele alınacağı **associativity** denilen bir kavram ile belirlidir. Bu anlamda **left associative** ve **right associative** terimleri kullanılır. Örneğin

```
a = b + c - d ifadesinin yapılış sırası şöyledir:
i1: b + c
i2: i1 - d
i3: a = i2
```

###### Aritmetik Operatörler

>Aritmetik operatörler şunlardır: `+, -, *, /, %, -, +, --, ++`. Bu operatörlerin operandları boolean türden olamazlar. 

>`+, -, *, /, %` operatörleri iki operandlı (binary) ve araek (infix) durumundadır. Bu operatörler işlemin sonucuna ilişkin değeri üretirler. Bu operatörlerin yan etkileri yoktur. `/ ve *` operatörleri aynı öncelik grubundadır ve, aynı öncelik grubunda buluna `+ ve -` operatörlerinden önceliklidir. Bu iki grup da soldan sağa önceliklidir (left associative). 

```java
package csd;

class App {
	public static void main(String [] args)
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input two numbers:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);
	}
}
```

>Mod alma işlemi `%` atomu ile belirtilen operatör ile yapılır. Mod alma işlemi de aslında bölme yapılarak hesaplandığından bu operatör `* ve /` operatörleri ile aynı öncelik seviyesindedir. Bu operatör pratikte daha çok tamsayılarla kullanılsa da Java'da gerçek sayılarla da kullanılabilmektedir. Bu operatörün ikinci operandının negatif olmasının bir önemli yoktur. `n` pozitif bir tamsayı olmak üzere, bir sayının `n` sayısına göre modunu almakla `-n` sayısına göre modunu almak aynı sonucu verir. Operatörün birinci operandının pozitif olması durumunda ürettiği değer Matematikteki mod işlemi ile aynıdır ancak birinci operandının negatif olması durumunda, operandın pozitif değerine göre mod işlemi hesaplanır ve negatifi değer olarak üretilir. Yani bu operatörün birinci operandının negatif olması durumunda ürettiği değer Matematikteki ile aynı şekilde hesaplanmaz.

>Aşağıdaki demo örneği çeşitli değerler ile çalıştırıp sonuçları gözlemleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input two numbers:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		System.out.printf("%d %% %d = %d%n", a, b, a % b);
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı 3 basamaklı bir sayının basamakları toplamına geri dönen `sumOf3Digits`metodunu `NumberUtil` sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
>**Açıklamalar:**
>- Metot sayının 3 basamaklı olup olmadığını kontrol etmeyecektir
>- Metot negatif bir sayı için basamakları toplamını pozitif olarak döndürecektir.
>- Metot içerisinde döngü kullanılmayacaktır. Zaten gerek de yoktur.

>**Çözüm-1:** 

```java
package csd;

class App {
	public static void main(String [] args)
	{		
		NumberUtilSumOf3Digits.run();
	}
}

class NumberUtilSumOf3Digits {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		
		System.out.printf("Sum of digits of '%d' is %d%n", a, NumberUtil.sumOf3Digits(a));		
	}
}

class NumberUtil {
	public static int sumOf3Digits(int val)
	{
		int a = val / 100;
		int b = val / 10 % 10;
		int c = val % 10;
		
		return Math.abs(a + b + c);
		
	}
}
```

>**Çözüm-2:**

```java
package csd;

class App {
	public static void main(String [] args)
	{		
		NumberUtilSumOf3Digits.run();
	}
}

class NumberUtilSumOf3Digits {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		
		System.out.printf("Sum of digits of '%d' is %d%n", a, NumberUtil.sumOf3Digits(a));		
	}
}

class NumberUtil {
	public static int sumOf3Digits(int val)
	{
		int a = val / 100;
		int b = val % 100 / 10;
		int c = val % 10;
		
		return Math.abs(a + b + c);
		
	}
}
```
>**Çözüm-3:**

```java
package csd;

class App {
	public static void main(String [] args)
	{		
		NumberUtilSumOf3Digits.run();
	}
}

class NumberUtilSumOf3Digits {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		
		System.out.printf("Sum of digits of '%d' is %d%n", a, NumberUtil.sumOf3Digits(a));		
	}
}

class NumberUtil {
	public static int sumOf3Digits(int val)
	{
		return Math.abs(val / 100 + val % 100 / 10 + val % 10);	
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input two numbers:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		
		System.out.printf("%f %% %f = %f%n", a, b, a % b);
	}
}
```

>İşaret `-` operatörü tek operandlı (unary) ve önek (prefix) durumundadır. Bu operatör operandına ilişkin ifadenin değerinin ters işaretlisini üretir. Operatörün yan etkisi yoktur. Operatör ikinci öcelik seviyesindedir. Bu öncelik seviyesindeki operatörler `sağdan sola (right associative)` olarak ele alınırlar. İşaret `+` operatörü, operandı olan ifadenin değerinin aynısını üretir.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		int b;
		int c;
		
		b = -a;
		c = +a;
		
		System.out.printf("a = %d%nb = %d%nc = %d%n", a, b, c);		
	}
}
```

>Aslında teknik olarak doğrudan negatif sabit yoktur. Negatif bir sabit aslında bir sabite işaret `-` operatörünün uygulanmış biçimidir. 


**Anahtar Notlar:** Okunabilirlik/algılanabilirlik açısından genel olarak binary bir operatör ile operandları arasında bir yalnız bir tane `SPACE` karakteri yazılır. Unary bir operatör ile operandı genel olarak bitişik yazılır.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{		
		int a;
		
		a = - - - - - - - - - - - 3;
		
		System.out.printf("a = %d%n", a);
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{		
		int a = 2, b = 3, c;
		
		c = a - - - - - - - - - - b; 
		
		System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);
	}
}
```

>`++ (increment)` ve `-- (decrement)` operatörleri tek operandlı operatörleri. Bu operatörler hem önek hem de sonek durumunda kullanılabilirler. Bu operatörlerin operandları değişken olmalıdır. Bu operatörlerin yan etkisi vardır. Bu operatörlerin operandlarına ilişkin değişkenler, boolean türü dışında kalan temel türlerden biri olabilir. `++` operatörü operandına ilişkin ifadenin değerini bir artırır, `--` operatörü operandına ilişkin ifadenin değerini bir azaltır. Bu operatörler ister önek olarak ister sonek olarak kullanılsın yan etkilerini operandına yansıtırlar. 

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{		
		int a = 10;
		
		++a; //a = a + 1
		
		System.out.printf("a = %d%n", a);
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{		
		int a = 10;
		
		a++; //a = a + 1
		
		System.out.printf("a = %d%n", a);
	}
}
```

```java
package csd;

class App {
	public static void main(String [] args)
	{		
		int a = 10;
		
		--a; //a = a - 1
		
		System.out.printf("a = %d%n", a);
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{		
		int a = 10;
		
		a--; //a = a - 1
		
		System.out.printf("a = %d%n", a);
	}
}
```
>`++` operatörünün prefix kullanımında ürettiği değer (işleme giren değer) artırılmış değerdir, postfix kullanımında ürettiği değer artırılMAmış değerdir. Benzer şekilde, `--` operatörünün prefix kullanımında ürettiği değer (işleme giren değer) azaltılmış değerdir, postfix kullanımında ürettiği değer azaltılmaMAmış değerdir.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{		
		int a = 10;
		int b;
		
		b = ++a;
		
		System.out.printf("a = %d, b = %d%n", a, b); //a = 11, b = 11
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{		
		int a = 10;
		int b;
		
		b = a++;
		
		System.out.printf("a = %d, b = %d%n", a, b); //a = 11, b = 10
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{		
		int a = 10;
		int b;
		
		b = --a;
		
		System.out.printf("a = %d, b = %d%n", a, b); //a = 9, b = 9
	}
}
```
>Aşağıdaki demo örneği inceleyiniz
```java
package csd;

class App {
	public static void main(String [] args)
	{		
		int a = 10;
		int b;
		
		b = a--;
		
		System.out.printf("a = %d, b = %d%n", a, b); //a = 9, b = 10
	}
}
```

###### 22 Eylül 2025

>Java derleyicisi, soldan sağa ve yukarıdan aşağıya doğru, anlamlı en uzun ifadeyi atomlarına ayıracak (tokenizing) şekilde işlem yapar. Bu kurala **maximal/maximum munch** denir.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{		
		int x = 2, y = 3;
		int z;
		
		z = x+++y; //x++ + y
		
		System.out.printf("x = %d, y = %d, z = %d%n", x, y, z);
	}
}
```

>Aşağıdaki demo örnekte error oluşur

```java
package csd;

class App {
	public static void main(String [] args)
	{		
		int x = 2, y = 3;
		int z;
		
		z = x++y; //error
	}
}
```

>Aşağıdaki demo örnekte error oluşur

```java
package csd;

class App {
	public static void main(String [] args)
	{		
		int x = 2, y = 3;
		int z;
		
		z = x++++y; //error
		
		System.out.printf("x = %d, y = %d, z = %d%n", x, y, z);
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{		
		int x = 2; 
		int y;
		
		y = x++ - --x;
		
		System.out.printf("x = %d, y = %d%n", x, y);
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{		
		int x = 10, y = 3; 
		int z;
		
		z = x++ + --x / y++; 
		
		System.out.printf("x = %d, y = %d, z = %d%n", x, y, z); //x = 10, y = 4, z = 13
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		int a = 2;
		
		a = a++;
		
		System.out.printf("a = %d%n", a);
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		int a = 2;
		
		a = ++a;
		
		System.out.printf("a = %d%n", a);
	}
}
```

###### Karşılaştırma Operatörleri

>Temel karşılaştırma operatörleri 6 tanedir: `< > <= >= == !=`. Bu operatörler iki operandlı ve araek durumundadır. Bu operatörlerin ürettiği değer boolean türdendir. Karşılaştırma işlemi doğru ise `true`, yanlış ise `false` değerini üretir. Bu operatörlerin yan etkisi yoktur. `< > <= >=` operatörleri klasik büyüklük-küçüklük karşılaştırması yapan operatörler. `==` operatörü operandlarına ilişkin ifadelerin değerleri eşit ise `true`, değilse `false` değerini üretir. `!=` operatörü operandlarına ilişkin ifadelerin değerleri eşit değilse `true`, eşitse `false` değerini üretir. Bu operatörler, ilgili işleme göre karşılaştırılabilen türler ile kullanılabilmektedir. Örneğin, int türden iki değer `<` operatörü ile işleme sokulabilir ancak boolean türden iki değer `<` operatörü ile işleme sokulamaz. Yine örneğin, boolean türden iki değer `==` ve `!=` operatörleri ile işleme sokulabilir. 

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input two numbers:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		System.out.printf("%d < %d -> %b%n", a, b, a < b);
		System.out.printf("%d > %d -> %b%n", a, b, a > b);
		System.out.printf("%d <= %d -> %b%n", a, b, a <= b);
		System.out.printf("%d >= %d -> %b%n", a, b, a >= b);
		System.out.printf("%d == %d -> %b%n", a, b, a == b);
		System.out.printf("%d != %d -> %b%n", a, b, a != b);
	}
}
```

###### Metot Çağırma Operatörü 

>Java'da metot çağrısı, **metot çağırma operatörü (method call/invoke operator)** ile yapılır. Bu operatör, operatör öncelik tablosunun birinci seviyesindedir. Bu operatör, özel amaçlı, iki operandlı ve araek durumundadır. Bu operatör ile ilgili metot çağrılır ve metodun geri dönüş değeri varsa o değer üretilir. void bir metot çağrısı için bu operatöre ilişkin ifade `void ifadedir (void expression)`. void ifadelerin değeri olmaz. 

###### Mantıksal Operatörler

>Mantıksal operatörler şunlardır: `&& || !`. `&&` operatörü `mantıksal VE (logical AND)`, `||` operatörü `mantıksal VEYA (logical OR)`, `!` operatörü `mantıksal DEĞİL (logical NOT)` işlemlerini yaparlar. Bu operatörlerin operandları boolean türden olmalıdır. Aksi durumda error oluşur. Operatörlerin ürettiği değer boolean türdendir. Bu operatörlerin yan etkileri yoktur.


>`&& ve ||` operatörleri iki operandlı ve araek durumundadır. Bu operatörler `Mantık'taki` ilgili işlemleri yaparlar. Bu operatörlerin doğruluk tablosu (truth table) şu şekildedir:


|  a  |  b  | a `&&` b | a `\|\|`b |
| :-: | :-: | :------: | :-------: |
|  T  |  T  |    T     |     T     |
|  T  |  F  |    F     |     T     |
|  F  |  T  |    F     |     T     |
|  F  |  F  |    F     |     F     |


>Bu doğruluk tablosundan özetle şu sonuçlar çıkartılabilir:
>
>- `&&` işleminde operandlardan en az biri yanlışsa sonuç yanlıştır.
>
>- `||` işleminde operandlardan en az biri doğruysa sonuç doğrudur.

>`&&` işlemi `||` işlemine göre önceliktir. 

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		boolean result;
		
		result = Sample.foo() && Sample.bar();
		
		System.out.printf("result = %b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		boolean result;
		
		result = Sample.bar() || Sample.foo();
		
		System.out.printf("result = %b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
}
```

>**Bu operatörler doğru sonuca (yani Matematiksel olarak elde edilmesi gereken sonuca) en kısa yoldan ulaşmaya çalışırlar. Yani derleyici bu operatörlere ilişkin ifadeler için doğru sonuca en kısa yoldan ulaşacak kodları üretir. Bu sebeple bu operatörlerin bulunduğu ifadeler hesaplanmaya her zaman soldan başlanır.** Bu operatörlerin birinci operandları hesaplandığında elde edilen sonuç, ikinci operand hesaplansa bile değişmeyecekse, ikinci operand hesaplanmaz. Örneğin `&&` operatörünün birinci operandından elde edilen değer false ise ikinci operand hesaplanmaz. Benzer şekilde `||` operatörünün birinci operandından elde edilen değer true ise ikinci operand hesaplanmaz. Çünkü hesaplansa bile sonuç değişmez. Buna **kısa devre davranışı (short circuit behavior)** denir. 

>Aşağıdeki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		boolean result;
		
		result = Sample.bar() && Sample.foo();
		
		System.out.printf("result = %b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		boolean result;
		
		result = Sample.foo() || Sample.bar();
		
		System.out.printf("result = %b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
}
```

>Bu operatörler için doğru sonuca en kısa yoldan ulaşmak söz konusu olduğundan operatör önceliği (operator precedence) ile işleme giriş sırası (order of evaluation) ifadeye göre farklı olabilmektedir. Yani bu operatörlerin bulunduğu bir ifadede operatör önceliği ne olursa olsun, işleme giriş sırası hep soldan başlayacak şekilde yapılır ancak elde edilen sonuç operatör önceliğine uyularak elde edilen sonuç ile aynıdır. Yani bu operatörler kısa devre davranışını da kullanarak doğru sonuca en kısa yoldan ulaşırlar.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		boolean result;
		
		result = Sample.foo() || Sample.bar() && Sample.tar();
		
		System.out.printf("result = %b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
	
	public static boolean tar()
	{
		System.out.println("tar");
		
		return false;
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		boolean result;
		
		result = Sample.bar() && Sample.foo() || Sample.tar();
		
		System.out.printf("result = %b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
	
	public static boolean tar()
	{
		System.out.println("tar");
		
		return false;
	}
}
```
>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		boolean result;
		
		result = (Sample.foo() || Sample.bar()) && Sample.tar();
		
		System.out.printf("result = %b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
	
	public static boolean tar()
	{
		System.out.println("tar");
		
		return false;
	}
}
```

###### 24 Eylül 2025

>`&` (bitwise AND) ve `|` (bitwise OR) operatörleri tamsayılarla ve boolean türü ile kullanılabilen operatörlerdir. Bu operatörler tamsayılar ile kullanıldığında operandlara ilişkin değerlerin karşılıklı bitlerini ilgili işlemlere sokarlar ve ilgili sonucu üretirler. 

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		int a = 10; //0x0000000A <-> 00000000000000000000000000001010
		int b = 11; //0x0000000B <-> 00000000000000000000000000001011
		int c;
		
		c = a & b; //0x0000000A <-> 00000000000000000000000000001010
		
		System.out.printf("c = %d, c = %08X%n", c, c); 
		
		c = a | b; //0x0000000B <-> 00000000000000000000000000001011
		
		System.out.printf("c = %d, c = %08X%n", c, c);
	}
}

```

>`&` ve `|` operatörleri boolean türden ifadeler ile kullanıldıklarında mantıksal operatör karşılıkları olan operatörler (yani `&&` ve `||`) ile tek farkları kısa devre davranışının olmamasıdır. Diğer tüm özellkler aynıdır.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		boolean result;
		
		result = Sample.foo() | Sample.bar() & Sample.tar();
		
		System.out.printf("result = %b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
	
	public static boolean tar()
	{
		System.out.println("tar");
		
		return false;
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		boolean result;
		
		result = Sample.bar() & Sample.foo() | Sample.tar();
		
		System.out.printf("result = %b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
	
	public static boolean tar()
	{
		System.out.println("tar");
		
		return false;
	}
}
```

**Anahtar Notlar:** Bu operatörler ve diğer bitsel operatörlere ilişkin detaylar `Java ile Uygulama Geliştirme 1` kursunda ele alınacaktır.

>`!` (logical NOT) operatörü tek operandlı ve önek durumundadır. Operatörün yan etkisi yoktur. Bu operatör operandına ilişkin ifadenin değilini (yani true ise false, false ise true değerini) üretir. Bu operatörün doğruluk tablosu şu şekildedir:


|  a  |  !a |
| :-: | :-: |
|  T  |  F  |
|  F  |  T  |

>Aşağıdaki demo örnekte flag değerine göre işlemler yapılmış ve içerisindeki değer değiştirilmiştir

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		boolean flag = true;
		
		if (flag) {
			//...
		}
		else {
			//...
		}
		
		flag = !flag;
	}
}
```
>Atama operatörü (assignment operator) özel amaçlı, iki operandlı ve araek durumundadır. Operatörün birinci operandı bir değişken olmalıdır. Operatörün yan etkisi vardır, birinci operandına ilişkin değişkenin içerisine ikinci operandına ilişkin ifadenin değeri kopyalanır. Operatör sağdan sola önceliklidir. Operatörün ürettiği değer atanan değerdir. 

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		int a, b, c;
		
		a = b = c = 6;
		
		System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);
	}
}
```
>Aşağıdaki demo örnekte soldan sağa ikinci atama operatörünün operandı değişken olmadığından dolayı error oluşur

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		int a = 10, b = 20, c = 45;
		
		(a = b) = c = 6; //error
		
		System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);
	}
}
```

>Aşağıdaki demo örnek geçerlidir değil mi?

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		int a = 10, b = 20, c = 45;
		
		a = b = (c = 6);
		
		System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);
	}
}
```

>Aşağıdaki demo örnek geçerlidir değil mi?

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		int a = 10, b = 20, c = 45;
		
		a = (b = c = 6);
		
		System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);
	}
}
```
>Java'da bir grup `işlemli atama operatörü (compound/augmented assignment operator)` vardır. Bu operatörlerin genel biçimi şu şekildedir:

```java
<ifade1> <op>= <ifade2>
```

>Bu genel biçimin yaklaşık karşılığı şu şekildedir:

```java
<ifade1> = <ifade1> <op> <ifade2>
```
>Bu operatörler atama operatörleri olduğundan `ifade1`'in değişken olması zorunludur. Örneğin programcı

```java
a = a + b
```

ifadesinin

```java
a += b
```

>biçiminde yazabilir (hatta yazmalıdır). Aslında bu operatör okunabilirliği/algılanabilirliği artırması yanında bazı ifadelerin daha basit (yalın) olarak yazılmasını sağlar. 

**Anahtar Notlar:** Aslında işlemli atama operatörünün karşılığı olan yukarıdaki ifade biraz daha detaylıdır. Bu detaylar ileride ele alınacaktır.

>Aşağodaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		int a = 10, b = 20;
		
		a += b; //a = a + b;
		
		System.out.printf("a = %d, b = %d%n", a, b);
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		int a = 3, b = 4, c = 6;
		
		a *= b + c; //a = a * (b + c);	
		
		
		System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);
	}
}
```

###### Operatör Öncelik Tablosu

| Operatör                                | İlişkisi    |
| --------------------------------------- | ----------- |
| ( ) . [ ] new                           | Soldan sağa |
| + - ++ -- ! ~ ( )                       | Sağdan sola |
| * / %                                   | Soldan sağa |
| + -                                     | Soldan sağa |
| << >> >>>                               | Soldan sağa |
| > < >= <= instanceof                    | Soldan sağa |
| == !=                                   | Soldan sağa |
| &                                       | Soldan sağa |
| ^                                       | Soldan sağa |
| \|                                      | Soldan sağa |
| &&                                      | Soldan sağa |
| \|\|                                    | Soldan sağa |
| ?:                                      | Sağdan sola |
| = *= /= %= += -= <<= >>= &= ^= \|= >>>= | Sağdan sola |


##### Noktalı Virgül'ün İşlevi

>Noktalı virgül Java'da **sonlandırıcı karakter (terminator)** olarak klullanılır. Java'da başka sonlandırıcı karakter yoktur. Noktalı virgül genel olarak ifadeleri ve bazı deyimleri sonlandırmak için kullanılır.

##### Etkisiz İfadeler ve Erişilemeyen Kodlar

>Java'da **etkisiz ifadeler (code has no effect)** geçersizdir

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		int a = 3, b = 4;
		
		a + b; //error	
		
	}
}
```

>Derleyici akışın hiç bir zaman bir noktaya gelemeyeceğini anladığı kodlar için `genel olarak` error oluşturur. Bu tarz kodlara **unreachable codes** denir.

```java
class Util {
	public static int add(int a, int b)
	{
		return a + b;
		System.out.println("Unreachable code"); //error
	}
}
```

##### Deyimler

>Programın çalıştırılan parçalarına **deyim (statement)** denir. Bir program deyimlerin çalıştırılmasıyla çalışır. Java'da deyimler şunlardır:
>**Basit Deyimler (Simple Statements):** Bir ifadenin sonuna noktalı virgül konduğunda oluşan deyimdir. Örneğin
```java
a = b + c;
```
ya da 
```java
System.out.println("Hello world");
```
>Basit deyim çalıştırıldığında, o deyime ilişkin ifade hesaplanır
>
>>**Bileşik Deyimler (Compound Statements):** `{` ile `}` arasında kalan yani bir blok bileşik deyimdir. Bileşik deyim çalıştırıldığında blok içerisindeki deyimler sırasıyla çalıştırılır. Bir metodun gövdesi de aslında bileşik deyimdir. 
>
>**Bildirim Deyimleri (Declaration Statements):** Bir değişkenin bildirildiği deyimdir. Bileşik deyim çalıştırıldığında bellekte yer ayrılır.
>
>**Kontrol Deyimleri (Control Statements):** Akışa yön veren deyimlerdir. Her kontrol deyiminin kendine özgü çalıştırılma biçimi vardır. Dolayısıyla o deyim için ayrıca öğrenilmelidir. Java'da bazı kontrol deyimleri şunlardır: **return deyimi (return statement), if deyimi (if statement), döngü deyimleri (loop statments), break deyimi (break statement), continue deyimi (continue statment), switch deyimi (switch statement).**
>
>**Boş Deyim (Empty/null Statement):** Noktalı virgülün tek başına kullanılması ile oluşan deyimdir. Boş deyim çalıştırıldığında her hangi bir şey yapılmaz. 

##### Temel Kontrol Deyimleri

>Bu bölümde şu temel kontrol deyimleri ele alınacaktır: `if deyimi, döngü deyimleri (while, do-while, for), break deyimi, continue deyimi, switch deyimi (ve switch expression).`

###### if Deyimi

>Neredeyse tüm programlama dillerinde bulunan deyimdir. Bu deyim koşula bağlı olarak akışı yönlendirmeyi sağlar. if deyiminin genel biçimi şu şekildedir:

```java
if (<koşul ifadesi>)
	<deyim>
[
else
	<deyim>
]
```

>if deyiminde koşul ifadesi (condition expression/predicate) boolean türden olmalıdır. Aksi durumda error oluşur. if deyiminde koşul ifadesinin değeri true ise, doğru kısmına ilişkin deyim çalıştırılır, false ise varsa else kısmına ilişkin deyim (yani yanlış kısmına ilişkin deyim) çalıştırılır. if deyiminin else kısmı olmak zorunda değildir. if deyiminin else kısmı yoksa VE koşul ifadesinin değeri false ise akış if deyiminden sonraki deyimden devam eder. if deyimi (varsa) else kısmı ile beraber tek bir deyimdir. if deyimin doğru ve yanlış kısmına ilişkin deyimler, bildirim deyimi dışında her hangi bir deyim olabilir.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		
		if (a % 2 == 0)
			a /= 2;
		else
			a *= 2;
		
		System.out.printf("a = %d%n", a);
		
	}
}
```

>Aşağıdaki demo örneği inceleyiniz. Örnekte if deyiminin doğru ve yanlış kısımlarında bileşik deyim kullanılmıştır

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		
		if (a % 2 == 0) {
			System.out.printf("%d is even%n", a);
			a /= 2;		
		}
		else {
			System.out.printf("%d is odd%n", a);
			a *= 2;
		}
		
		System.out.printf("a = %d%n", a);
	}
}
```

**Anahtar Notlar:** if deyiminde (ve döngü deyimlerinde) basit deyimin kullanılabildiği durumlarda bazı programcılar yine bileşik deyim kullanmayı tercih ederler. Diğer bir deyişle bu tip durumlarda hiç bir zaman basit deyim kullanmazlar. Bazı programcılar ise basit deyimin kullanılabildiği yerlerde bileşik deyim kullanmamayı tercih ederler. Bu yaklaşımların her ikisi de normal ve doğru yaklaşımlardır. Bir programcı ya da bir bir geliştirme takımı bu yaklaşımların her hangi birisini tercih edebilir. Burada kötü yaklaşım karışık olarak kullanmaktır.

>Aşağıdaki demo örnekte else kısmı olmayan if deyimi kullanılmıştır

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		
		if (a % 2 == 0)			
			a /= 2;
		
		System.out.printf("a = %d%n", a);
	}
}
```

###### 29 Eylül 2025

>Aşağıdaki demo örnekte, if deyiminin doğru kımında yanlışlıkla noktalı virgül konmasından dolayı boş deyim kullanılmış olur. Bu durumda error oluşmaz.

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		
		if (a % 2 == 0);			
			a /= 2;
		
		System.out.printf("a = %d%n", a);
	}
}
```

>Aşağıdaki demo örnekte else'in ait olduğu bir if deyimi olmadığından error oluşur

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		
		if (a % 2 == 0);			
			a /= 2;
		else //error
			a *= 2;
		
		System.out.printf("a = %d%n", a);
	}
}
```
>Aşağıdaki demo örnekte else, içteki if deyime aittir. Bu duruma **dangling else** denir. Bu durumda programın doğru yazılmadığına dikkat ediniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		
		if (a > 0)
			if (a % 2 == 0)
				System.out.printf("%d is positive even number%n", a);
		else
			System.out.printf("%d should be positive%n", a);
	
	}
}
```

>Yukarıdaki demo örnek için dangling else durumundan dolayı oluşan hata bileşik deyim kullanılarak aşağıdaki gibi çözülebilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		
		if (a > 0) {
			if (a % 2 == 0)
				System.out.printf("%d is positive even number%n", a);
		}
		else
			System.out.printf("%d should be positive%n", a);
	
	}
}

```

>Aşağıdaki demo örnekte dangling else durumu yoktur

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		
		if (a > 0) 
			if (a % 2 == 0)
				System.out.printf("%d is positive even number%n", a);
			else 
				System.out.printf("%d is positive odd number%n", a);
		else
			System.out.printf("%d should be positive%n", a);
	
	}
}
```

>Aşağıdaki if deyiminin else kısmında başka bir if deyimi vardır

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		
		if (a > 0)
			System.out.printf("%d is a positive number%n", a);
		else
			if (a == 0)
				System.out.println("Zero");
			else
				System.out.printf("%d is a negative number%n", a);
	}
}
```

>Yukarıdaki demo örnek aşağıdaki gibi daha okunabilir/algılanabilir yazılabilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		
		if (a > 0)
			System.out.printf("%d is a positive number%n", a);		
		else if (a == 0)
			System.out.println("Zero");
		else
			System.out.printf("%d is a negative number%n", a);
	}
}
```
>Yukarıdaki örnek aşağıdaki gibi yazılsaydı, problemin senaryosu açısından bir problem olmayacaktı yani doğru çalışacaktı. Ancak koşullar ayrık (discrete/independent) olduğundan `else if` biçiminde yazılması, hem gereksiz kontrolleri engelleyecekti hem de daha okunabilir/algılanabilir olacaktı. Bu durumda ayrık koşulların `else if` biçiminde yazılması, ayrı olmayan koşullara ilişkin if deyimlerinin okunabilirliğini/algılanabilirliğini artırır.

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		
		if (a > 0)
			System.out.printf("%d is a positive number%n", a);		
		if (a == 0)
			System.out.println("Zero");
		if (a < 0)
			System.out.printf("%d is a negative number%n", a);
	}
}
```

>Aşağıdaki demo örnekte koşulların ayrık olmadığını gözlemleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		
		if (a > 10)
			System.out.printf("%d > 10%n", a);
		if (a > 13)
			System.out.printf("%d > 13%n", a);
		if (a > 21)
			System.out.printf("%d > 21%n", a);
	}
}
```
>boolean ifadelerin koşul ifadesinde `==` ve `!=` operatörleri ile kullanılması tavsiye edilmez. Bu durumda, `==` operatörü kullanmak yerine ifadenin doğrudan yazılması, `!=` operatörü kullanmak yerine ise ifadenin mantıksal değilinin (örneğin mantıksal değil operatörü ile) yazılması tavsiye edilir.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		
		Util.writeEvenStatusByFlag(a % 2 == 0);
	}
}

class Util {
	public static void writeEvenStatusByFlag(boolean even)
	{
		if (even) //if (even == true)
			System.out.println("Even");
		else
			System.out.println("Odd");			
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		
		Util.writeEvenStatusByFlag(a % 2 == 0);
	}
}

class Util {
	public static void writeEvenStatusByFlag(boolean even)
	{
		if (!even) //if (even == false)
			System.out.println("Odd");
		else
			System.out.println("Even");			
	}
}
```

**Anahtar Notlar:** Geri dönüş değeri boolean türden olan metotların isimlendirilmesinde `is, are, can` vb gibi önekler kullanılır. Örneğin, bir sayının asal olup olmadığını test eden bir metodun ismi `isPrime` olabilir. Eğer metot ismi bir fiil belirtiyorsa isimlendirme o fiilin çekimine göre yapılır. Örneğin bir cihazın bağlı olmadığını test eden bir metot `exists` ya da `deviceExists` biçiminde isimlendirilebilir.

>Aşağıdaki demo örnekte bulunan `isEven` metodunda if deyiminin doğru kısmında return deyimi olduğundan, koşulun doğru olması durumunda metot sonlanır. Bu durumda else gereksizdir.

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		
		if (NumberUtil.isEven(a))
			System.out.printf("%d is even%n", a);
		else
			System.out.printf("%d is odd%n", a);
	}
}


class NumberUtil {
	public static boolean isEven(int a)
	{
		if (a % 2 == 0)
			return true;
		else
			return false;
	}
}
```
>Yukarıdaki demo örnek aşağıdaki gibi yapılabilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		
		if (NumberUtil.isEven(a))
			System.out.printf("%d is even%n", a);
		else
			System.out.printf("%d is odd%n", a);
	}
}


class NumberUtil {
	public static boolean isEven(int a)
	{
		if (a % 2 == 0)
			return true;
		
		return false;
	}
}
```

>Yukarıdaki demo örnekte bulunan `isEven`metodu aşağıdaki gibi daha okunabilir/algılanabilir biçimde yazılabilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		
		if (NumberUtil.isEven(a))
			System.out.printf("%d is even%n", a);
		else
			System.out.printf("%d is odd%n", a);
	}
}


class NumberUtil {
	public static boolean isEven(int a)
	{
		return a % 2 == 0;
	}
}
```
>Demo örnekte `isEven` metodunun yazılmış olması durumunda `isOdd` metodu aşağıdaki gibi daha okunabilir/algılanabilir yazılabilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		
		if (NumberUtil.isOdd(a))
			System.out.printf("%d is odd%n", a);
		else
			System.out.printf("%d is even%n", a);
	}
}

class NumberUtil {
	public static boolean isEven(int a)
	{
		return a % 2 == 0;
	}
	
	public static boolean isOdd(int a)
	{
		return !isEven(a);
	}
}
```

>**Sınıf Çalışması:** Katsayıları klavyeden alınan ikinci dereceden bir denklemin köklerini bulup ekrana basan programı aşağıdaki açıklamalara göre yazınız
**Açıklamalar:**
- Program şu ana gördüklerimiz kullanılarak yazılacaktır.

- İkinci dereceden (quadratic) bir denklem

$$ax^2 + bx + c = 0$$

olsun. Buna göre delta $\Delta$ (discriminant)
$$\Delta = b^2 - 4ac$$
olarak belirlenir. Buna göre kökler şu şekilde hesaplanır:

1. Eğer $\Delta$ > 0 ise kökler
	$$x_1 = \frac{-b + \sqrt{\Delta}}{2a}$$
	$$x_2 = \frac{-b - \sqrt{\Delta}}{2a}$$

2. Eğer $\Delta$ = 0 ise kökler
	$$x_1 = x_2 = \frac{-b}{2a}$$

3. if $\Delta$ < 0 ise gerçek kök yok

- Yuvarlama hatalarını göz ardı ediniz.
  
- Program çıktısı, eğer iki kök varsa ayrı ayrı, çakışık kök varsa örneğin `x1 = x2 = 4` biçiminde yazılacaktır. Gerçek kök yok ise ekran çıktısı olarak `No real root` biçiminde olacaktır. 

>**Çözüm:**
```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		QuadraticEquationSolverApp.run();
	}
}

class QuadraticEquationSolverApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input coefficients:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double c = kb.nextDouble();
		
		EquationUtil.findQuadraticEquationRoots(a, b, c);
	}
}

class EquationUtil {
	public static void printQuadraticEquationRoots(double a, double b, double delta)
	{
		double sqrtDelta = Math.sqrt(delta);
		double x1 = (-b + sqrtDelta) / (2 * a);
		double x2 = (-b - sqrtDelta) / (2 * a);
		
		System.out.printf("x1 = %f%nx2 = %f%n", x1, x2);
	}
	
	public static void printQuadraticEquationRoot(double a, double b)
	{
		System.out.printf("x1 = x2 = %f%n", -b / (2 * a));
	}
	
	public static double calculateDelta(double a, double b, double c)
	{
		return b * b - 4 * a * c;
	}
	
	public static void findQuadraticEquationRoots(double a, double b, double c)
	{
		double delta = calculateDelta(a, b, c);
		
		if (delta > 0)
			printQuadraticEquationRoots(a, b, delta);
		else if (delta == 0)
			printQuadraticEquationRoot(a, b);
		else 
			System.out.println("No real root");
	}
}
```
>Yukarıdaki açıklamalarda program çıktısı ile ilgili bir zorunluluk belirtmeseydi aşağıdaki gibi de yapılabilirdi

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		QuadraticEquationSolverApp.run();
	}
}

class QuadraticEquationSolverApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input coefficients:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double c = kb.nextDouble();
		
		EquationUtil.findQuadraticEquationRoots(a, b, c);
	}
}

class EquationUtil {
	public static void printQuadraticEquationRoots(double a, double b, double delta)
	{
		double sqrtDelta = Math.sqrt(delta);
		double x1 = (-b + sqrtDelta) / (2 * a);
		double x2 = (-b - sqrtDelta) / (2 * a);
		
		System.out.printf("x1 = %f%nx2 = %f%n", x1, x2);
	}
	
	public static double calculateDelta(double a, double b, double c)
	{
		return b * b - 4 * a * c;
	}
	
	public static void findQuadraticEquationRoots(double a, double b, double c)
	{
		double delta = calculateDelta(a, b, c);
		
		if (delta >= 0)
			printQuadraticEquationRoots(a, b, delta);
		
		else 
			System.out.println("No real root");
	}
}
```
