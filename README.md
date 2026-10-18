# Programare Web cu Java

Acest repository conține exercițiile practice pentru laboratoarele de **Programare Web cu Java**, folosind Java, Maven și Spring Framework.

Fiecare laborator este organizat într-un folder separat și reprezintă un proiect Maven independent, cu propriile dependențe și exerciții.

## Structura repository-ului

```text
programare-web-cu-java/
├── lab1/
│   ├── pom.xml
│   └── src/
│       └── main/java/ro/example/lab1/
│           ├── exercise1/
│           ├── exercise2/
│           ├── exercise3/
│           └── exercise4/
├── README.md
└── .gitignore
```

**Laboratoare:**
- **Laboratorul 1:** Spring Core – Beans & Dependency Injection
- **Laboratorul 2:** Spring Core – Bean Scopes, Lazy Initialization & AOP *(în pregătire)*

## Cerințe generale

- Java JDK 21
- IntelliJ IDEA
- Maven (integrat în IntelliJ IDEA)
- Git (opțional, pentru clonarea repository-ului)

Dependențele Spring sunt gestionate automat prin Maven, conform fișierului `pom.xml` al fiecărui laborator.

## Cum pornim proiectul

1. Clonați repository-ul:

   ```bash
   git clone https://github.com/tbogdang99/programare-web-cu-java.git
   ```

   Alternativ, puteți descărca proiectul folosind **Code → Download ZIP** din GitHub.

2. Deschideți IntelliJ IDEA.
3. Selectați **File → Open** și alegeți folderul laboratorului dorit, de exemplu `lab1`.
4. Verificați că proiectul utilizează **JDK 21**.
5. Așteptați importarea proiectului Maven și descărcarea dependențelor din `lab1/pom.xml`.
6. Deschideți clasa `Main.java` din exercițiul dorit și rulați metoda `main()`.

**Important:** Fiecare exercițiu are propria clasă `Main.java` și poate fi rulat separat.

---

# Laboratorul 1 – Spring Core: Beans & Dependency Injection

## Obiective

La finalul laboratorului, studenții ar trebui să poată:

- Explica noțiunile de **Inversion of Control (IoC)** și **Dependency Injection (DI)**.
- Defini și utiliza bean-uri Spring.
- Folosi `ApplicationContext` pentru a recupera bean-uri.
- Înregistra componente prin `@Bean` și `@Component`.
- Realiza Dependency Injection prin constructor.
- Rezolva ambiguitățile folosind `@Primary` și `@Qualifier`.

## Exercițiul 1 – Dependency Injection fără Spring

**Scop:** Eliminarea dependenței directe dintre un serviciu și implementarea concretă pe care o utilizează.

**Cerințe:**

1. Identificați problema din `NotificationService`, unde `EmailNotificationSender` este instanțiat direct.
2. Refactorizați clasa pentru a primi un `NotificationSender` prin constructor.
3. Modificați `Main` pentru a crea și injecta dependența.
4. Implementați `SmsNotificationSender`.
5. Verificați că puteți schimba implementarea Email cu SMS fără să modificați clasa `NotificationService`.

**Concepte:** Tight Coupling, Interfaces, Constructor Injection.

## Exercițiul 2 – Spring Beans

**Scop:** Definirea și recuperarea bean-urilor din Spring ApplicationContext.

**Cerințe:**

1. Definiți un bean de tip `BankAccount` în `AppConfig`, folosind `@Bean`.
2. Recuperați bean-ul în `Main`, folosind `getBean()`.
3. Definiți un al doilea bean de același tip.
4. Observați ce se întâmplă când solicitați un bean doar după tip.
5. Recuperați un bean după nume.
6. Folosiți `@Primary` pentru a stabili bean-ul preferat.

**Concepte:** `@Configuration`, `@Bean`, `ApplicationContext`, `@Primary`.

## Exercițiul 3 – Component Scanning

**Scop:** Înregistrarea automată a componentelor Spring.

**Cerințe:**

1. Adnotați clasa `GreetingService` cu `@Component`.
2. Activați `@ComponentScan` în `AppConfig`.
3. Recuperați `GreetingService` din Spring Context.
4. Apelați metoda `greet("students")`.
5. Dezactivați temporar component scanning și observați comportamentul aplicației.

**Concepte:** `@Component`, `@ComponentScan`, `@Service`.

## Exercițiul 4 – Dependency Injection cu Spring

**Scop:** Gestionarea și injectarea automată a dependențelor folosind Spring.

**Cerințe:**

1. Înregistrați `EmailNotificationSender` și `SmsNotificationSender` drept componente Spring.
2. Adnotați `NotificationService` cu `@Service`.
3. Configurați `@ComponentScan`.
4. Recuperați `NotificationService` din Spring Context.
5. Observați problema existenței a două implementări pentru `NotificationSender`.
6. Rezolvați ambiguitatea folosind `@Qualifier`.
7. Experimentați și cu `@Primary`.

**Concepte:** Constructor Injection, Component Scanning, `@Service`, `@Qualifier`, `@Primary`.

## Observații

- Exercițiile conțin comentarii `TODO` care trebuie completate în timpul laboratorului.
- Nu este necesară o bază de date sau un server web.
- Fiecare exercițiu are o clasă `Main.java` separată.
- Exercițiile sunt concepute pentru a fi rezolvate progresiv, pornind de la noțiuni Java și continuând cu Spring Core.

---

## Laboratorul 2 – Spring Core: Bean Scopes & AOP

Exercițiile se găsesc în folderul `lab2`, un proiect Maven independent.

1. **Shopping Cart** – Singleton vs. Prototype și ObjectProvider.
2. **Recommendation Engine** – Eager vs. Lazy Initialization.
3. **Order Processing** – Spring AOP: Pointcuts și Advice.

Pentru rulare, deschideți `lab2` în IntelliJ IDEA,
configurați JDK 21 și rulați clasa `Main` a fiecărui exercițiu.

Exercițiile conțin comentarii TODO care trebuie completate.