# Multiplication Table Android App

This is a simple Android application that dynamically displays the multiplication table for a number selected using a `SeekBar`. The app is designed using Java and the Android SDK.

## Features

- Interactive SeekBar to choose a number from 1 to 20.
- Displays the multiplication table (1 to 10) for the selected number.
- Dynamic updates as you move the SeekBar.
- Simple and clean UI with a ListView.

## Technologies Used

- Java
- Android SDK
- Android Studio
- XML Layouts

##  How it Works

1. The app launches with the multiplication table of 1 by default.
2. The user can slide the SeekBar to choose any number from 1 to 20.
3. As the SeekBar is adjusted, the corresponding multiplication table (1×N to 10×N) is generated and displayed in the ListView.

## Installation & Setup

1. Clone the repository or download the source code.
2. Open the project in **Android Studio**.
3. Connect an Android device or use an emulator.
4. Build and run the application.

## Project Structure

app/
├── java/com/example/trialapp/
│ └── MainActivity.java
├── res/layout/
│ └── activity_main.xml
└── AndroidManifest.xml       

## MainActivity.java

Key Components:
- `SeekBar` for selecting the multiplication number.
- `ListView` for displaying the results.
- A function `generateList(int number)` that dynamically generates the table.


