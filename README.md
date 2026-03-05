# 🪙 CoinTrack Live

**CoinTrack** is a lightweight, real-time cryptocurrency ticker application for Android. It provides users with instantaneous price updates for the top 10 cryptocurrencies, fetched directly from the CoinGecko API.

Designed with a clean, modern user interface (UI) and optimized for performance, CoinTrack demonstrates core Android development principles, asynchronous networking, and efficient data parsing.

---

## 🔥 Latest Release (v1.0)

We are pleased to announce the initial stable release of **CoinTrack v1.0**.

This release marks the completion of our development sprint, featuring a fully functional real-time data pipeline, UI polish, and a custom brand identity.

### 🚀 Key Features in this Release:
* **Live Data Fetching:** Implemented asynchronous network calls using **OkHttp** to retrieve real-time data from the CoinGecko API.
* **Top 10 Cryptocurrencies:** Automatically tracks and displays the top 10 cryptocurrencies by market capitalization.
* **Modern UI:** Features a customized `RecyclerView` with elegant spacing, typography, and professional "headroom" padding for improved readability.
* **Custom Brand Identity:** Introduces a custom, modern "Data Node" app icon and visual branding.
* **Stabilization:** Resolved all initial network permission and thread management issues to ensure a smooth user experience.

### ⬇️ Download & Try:
You can download the compiled standalone APK file from our GitHub Releases page:

**[Download CoinTrack_v1.0.apk](https://github.com/doz6x9/CoinTrack/releases/tag/v1.0)**

*(Note: Since this is a debug build, you may need to enable "Install from Unknown Sources" on your Android device to install the APK.)*

---

## 🛠️ Technology Stack & Key Concepts

This project was built to demonstrate proficiency in modern Android Software Engineering:

* **Language:** Java
* **IDE:** Android Studio Panda 2
* **Networking:** **OkHttp 3.x** (for asynchronous HTTP requests)
* **UI Components:** `RecyclerView`, `LinearLayout`, `CardView`-like elevation.
* **Data Handling:** Native `org.json` parsing.
* **Multi-threading:** Implementation of `runOnUiThread()` to safely post background network results to the main UI thread, preventing app crashes.
* **Resource Management:** Adaptive and Legacy icon generation for optimal display across all device screen densities.

---



## 📸 Screenshots

|                App Icon                 |                                  Main Ticker (Live Data)                                   |
|:---------------------------------------:|:------------------------------------------------------------------------------------------:|
| ![App Icon](C:\Users\sudip\AndroidStudioProjects\CoinTrack\screenshots\app_icon.png) | <img alt="Main Screen" src="C:\Users\sudip\AndroidStudioProjects\CoinTrack\screenshots\main_ticker.png"/> |

---

## 🚀 Future Roadmap

This project provides a solid foundation for further expansion. Future feature considerations include:

- [ ] **Pull to Refresh:** Implement `SwipeRefreshLayout` to allow manual data updates.
- [ ] **Detailed View:** Create a detail screen for each coin showing a historical price graph (e.g., using **MPAndroidChart**).
- [ ] **Coin Icons:** Integrate the **Glide** or **Picasso** image library to load official coin logos dynamically.
- [ ] **Local Caching (Jetpack Room):** Implement a local SQLite database to cache data for offline viewing, reducing API calls.

---

## 👨‍💻 Author

Built by **Dip Sudipta Das** 

---

## 📜 License

This project is open-source and available under the **MIT License**.