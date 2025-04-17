url per test su swagger online:
   "localhost:8080/swagger-ui/index.html"

# 📅 Codice Fiscale Info API 🇮🇹

Una semplice API REST per estrarre la **data di nascita** e l'**età** a partire da un **Codice Fiscale** italiano.

---

## 🚀 Funzionalità

🔍 Estrae:
- 📆 **Data di nascita**
- 🔢 **Età**

📎 A partire da un codice fiscale valido di **16 caratteri**.

---

## 🔗 Endpoint

### `GET /api/codice-fiscale/{cf}`

📥 **Parametri:**
- `cf` (String) — Codice Fiscale da elaborare (deve essere valido, 16 caratteri)

📤 **Risposta:**

```json
{
  "birthDate": "1999-03-02",
  "age": 26
}
```

### 📛 Errori:

Restituisce errore se il codice fiscale non è valido (es. lunghezza diversa da 16).

### 🧠 Come funziona?
## 📘 L'API sfrutta una logica per decodificare il CF secondo le regole italiane:

I primi 6 caratteri sono legati al nome e cognome

I successivi 8 codificano la data di nascita e il sesso

Gli ultimi 2 sono di controllo

## 🔠 La lettera del mese viene decodificata usando MonthEnum, che associa ciascuna lettera ad un numero di mese.

Esempio:
```
GENNAIO("A", 1),
FEBBRAIO("B", 2),
...
DICEMBRE("T", 12);
```

## 🛠️ Tech Stack
Java 17 ☕

Spring Boot ⚙️

OpenAPI / Swagger 📝

## 📂 Struttura del progetto
CFiscController — Espone l'endpoint REST

 - CodFiscService — Contiene la logica per estrarre i dati dal CF

 - PersonDataDto — DTO per rappresentare la risposta

 - MonthEnum — Enum per decodificare il mese dal CF

 - DateRetrieverUtil — Classe di utilità per calcolare la data di nascita (da implementare o collegare)

### 📬 Contatti
 - 👨‍💻 Sviluppato da Valerio Corallini A.K.A. SvalioZZ (on GitHub)
 - 📧 Email: corallini.valerio.1999@gmail.com
 - 📍 Italia

