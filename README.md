#  Social Spark App

## IMAD5112 Assignment 1 | 2026

**Student Name:** Ali Abbas Gaffar 
**Student Number:** ST10497389 
**Course:** Introduction to Mobile Application Development (IMAD5112)

---

## 📱 App Overview

**Social Spark** is a native Android app built with Kotlin that helps users stay socially connected throughout their busy day. The app suggests small but meaningful social "spark" actions based on the time of day the user is currently in.

The app was designed for **Cora**, who struggles to maintain social connections during busy days. Social Spark simplifies this by providing a quick, fun suggestion that only takes a minute or two to carry out.

---

## 🎯 Purpose of the App

Modern life is busy, and it's easy to forget to check in with the people we care about. Social Spark solves this problem by:

- Giving users a simple, low-effort social action they can do right now
- Making the experience fun and engaging with an attractive UI
- Removing the decision fatigue of "who should I reach out to and how?"

---

## 🔧 Features

| Feature | Description |
|---|---|
| Time input | User types their current time of day |
| Smart suggestions | App returns a personalised social spark based on input |
| Error handling | App gives helpful feedback for unrecognised input |
| Reset button | One tap clears everything and starts fresh |
| Logging | App logs all key events for debugging (visible in Logcat) |

below is an example of the app in action:

<img width="259" height="564" alt="image" src="https://github.com/user-attachments/assets/ab32fad2-d0c8-4079-a61f-bd620f89a3d2" />


---

## 💡 Social Spark Suggestions

| Time of Day | Suggestion |
|---|---|
| Morning | Send a "Good morning" text to a family member |
| Mid-morning | Reach out to a colleague with a quick "Thank you" |
| Afternoon | Share a funny meme or interesting link with a friend |
| Afternoon Snack Time | Send a quick "thinking of you" message |
| Dinner | Call a friend or relative for a 5-minute catch-up |
| After Dinner / Night | Leave a thoughtful comment on a friend's post |

---

## 🎨 Design Considerations

The app uses a dark theme with a red accent colour (`#E94560`) to create a modern, energetic feel that matches the app's purpose of sparking social energy.

**Colour palette:**
- Background: `#1A1A2E` (Deep navy)
- Card surfaces: `#16213E` and `#0F3460` (Layered blues)  
- Accent: `#E94560` (Energetic red)
- Text: `#FFFFFF` and `#A0A0C0`

**UX decisions:**
- A hints section at the bottom shows users exactly what to type, reducing frustration
- The result card is hidden until needed, keeping the interface clean
- Error messages are friendly and instructive, not punishing

Below is a screenshot of the UI:

<img width="265" height="565" alt="image" src="https://github.com/user-attachments/assets/5dab4d00-f044-41ae-b784-6f4f1b5df1d4" />


---

## 🛠️ How to Run the App

1. Clone this repository:
git clone : https://github.com/AliAbbasGaffar/IMAD5112-Assignment-1
2. Open the project in **Android Studio** 
3. Wait for Gradle to sync
4. Run on an emulator (API 24 or higher) or a physical Android device
5. Type a time of day and tap **GET MY SPARK**

---

## 🔄 GitHub Actions

This project uses **GitHub Actions** for automated building. Every time code is pushed to the `main` branch, GitHub automatically:

1. Sets up a Java 17 environment on an Ubuntu server
2. Builds the app using Gradle 
3. Runs all unit tests

This ensures the code always builds correctly and not just on my own computer.

The workflow file is located at: `.github/workflows/build.yml`


## 🧪 Testing

Manual testing was conducted on a **Pixel 6 emulator (API 34)**:

| Test Case | Input | Expected Output | Result |
|---|---|---|---|
| Valid morning input | "Morning" | Morning spark suggestion | ✅ Pass |
| Valid dinner input | "Dinner" | Dinner spark suggestion | ✅ Pass |
| Empty input | (nothing) | Error: "You forgot to type..." | ✅ Pass |
| Invalid input | "xyz" | Error with valid options list | ✅ Pass |
| Reset button | Click Reset | All fields cleared | ✅ Pass |
| Case sensitivity | "MORNING" | Morning spark suggestion | ✅ Pass |

Logging (using Android's `Log` class) was used throughout development to trace execution and confirm correct behaviour in Logcat.

---

## 🎬 Video Demonstration

[CLICK HERE TO WATCH THE APP DEMO](YOUR_YOUTUBE_LINK_HERE)

*The video demonstrates all features of the app including: time input, spark suggestions for each time period, error handling, and the reset function.*

---

## 📚 References

Android Developers, 2026. Build your first Android app in Kotlin. [online] Available at: https://developer.android.com/training/basics/firstapp [Accessed 22 May 2026].

Ghaleb, T.A., Abduljalil, O. and Hassan, S., 2024. CI/CD configuration practices in open-source Android apps: An empirical study. ACM Transactions on Software Engineering and Methodology, [e-journal] Available at: https://doi.org/10.48550/arxiv.2411.06077 [Accessed 21 May 2026].

GitHub Marketplace, 2026. Automated build Android app with GitHub action. [online] Available at: https://github.com/marketplace/actions/automated-build-android-app-with-github-action [Accessed 22 May 2026].

Independent Institute of Education, 2026. IMAD5112 Github-actions build.yml. [online] Available at: https://github.com/IMAD5112/Github-actions/blob/main/.github/workflows/build.yml [Accessed 22 May 2026].

JetBrains, 2026. Conditions and loops. [online] Available at: https://kotlinlang.org/docs/control-flow.html [Accessed 23 May 2026].

Zhao, Y., Yu, T., Su, T., Liu, Y., Zheng, W., Zhang, J. and G.J. Halfond, W., 2019. ReCDroid: Automatically reproducing Android application crashes from bug reports. In: 2019 IEEE/ACM 41st International Conference on Software Engineering (ICSE). [online] Available at: https://doi.org/10.1109/icse.2019.00030 [Accessed 22 May 2026]
