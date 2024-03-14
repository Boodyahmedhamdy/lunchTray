# Lunch Tray
an android app built with kotlin and jetpack compose based on navigation lesson
in android official course, 

learn more about this course [https://developer.android.com/courses/android-basics-compose/course](here)
## OverView

![media/overview.gif](media/overview.gif)

## What the app does?
this app is a simulation for ordering food from a restaurant.
this is the flow of the app
1. start the order by clicking start order screen
2. choose the Entree dish then click next
3. choose the side dish then click next
4. choose the accompaniment then click next
5. preview your order and price then click submit
6. you can cancel the order anytime in the process and start over again

> **NOTE** submit button in the last screen doesn't do anything, just go back to the first screen




## Lunch Tray - A Restaurant Order Simulator (Android)

**Lunch Tray** is an Android application written in Kotlin that simulates the experience of ordering food from a restaurant. It utilizes Jetpack Compose for a modern and declarative UI experience, and leverages Navigation to manage different screens and user flows within the app. 

### Getting Started

This project uses Gradle as its build tool. To get started, you'll need the following:

* Android Studio (with the latest Android SDK tools)
* Basic knowledge of Kotlin and Android development

**1. Clone the Repository:**

```bash
git clone https://github.com/your-username/Lunch-Tray.git
```

**2. Open in Android Studio:**

Open the project directory in Android Studio. 

**3. Build and Run:**

Click on the "Run" button (green triangle) in the toolbar and select your desired Android device or emulator.

### Project Structure

The project follows a standard Android directory structure:

* **app**: Contains the main application code, resources, and layouts.
    * **src/main/java**: Kotlin source code for the application logic.
    * **src/main/res**: Resources like layouts, strings, and images.
    * **AndroidManifest.xml**: Defines the application metadata.
* **build.gradle**: Defines the project build configuration with Gradle.

### Dependencies

The project uses the following key dependencies:

* **Jetpack Compose**: For building the UI with a declarative approach.
* **Android Navigation**: For managing navigation between different screens.

**For a complete list of dependencies, refer to the `build.gradle` file.**

### Usage

Lunch Tray simulates the restaurant ordering process. Users can browse through a menu, add items to their cart, and complete a mock order. 

**Features include:**

* Browsing a restaurant menu with various categories and items.
* Adding and removing items from the cart.
* Viewing the total order cost.
* (Optional, depending on implementation) Simulating the order confirmation process.

### Contributing

We welcome contributions to improve Lunch Tray! If you have any bug fixes, feature suggestions, or improvements, feel free to submit a pull request.

Before contributing, please make sure to:

* Fork the repository.
* Create a new branch for your changes.
* Commit your changes with clear descriptions.
* Submit a pull request for review.

### License

This project is licensed under the Apache License 2.0 (see LICENSE file for details).

