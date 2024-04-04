# Navigation Game App

This Android application implements navigation between different screens using the Navigation Component from Android Jetpack. It features a navigation drawer for easy navigation between screens.

## Features

- Implements navigation using the Navigation Component.
- Utilizes a navigation drawer for easy access to different screens.
- Locks the navigation drawer on certain screens for better user experience.

## Prerequisites

- Android Studio
- Basic understanding of Android development and navigation components

## Installation

1. Clone or download this repository.
2. Open the project in Android Studio.
3. Build and run the project on an Android device or emulator.

## Usage

- Upon launching the app, users are presented with a navigation drawer on the left side of the screen.
- Users can navigate between different screens by selecting items from the navigation drawer.
- The navigation drawer is locked on certain screens to prevent accidental navigation.

## Dependencies

- AndroidX: Android Jetpack libraries are used for navigation components.
- Data Binding: Used for binding layout components in the activity.
- Navigation Component: Used for implementing navigation between fragments.

## Implementation Details

- The `MainActivity` sets up the navigation component and navigation drawer.
- Navigation between fragments is handled by the Navigation Component's `NavController`.
- The navigation drawer is locked on specific screens using `setDrawerLockMode()` method.

## Contributing

Contributions are welcome! Feel free to open an issue or submit a pull request.

## License

This project is licensed under the MIT License. See the LICENSE file for details.

## Acknowledgments

- Thanks to Google for providing the Navigation Component for Android development.
- Special thanks to the Android Jetpack team for providing a robust set of tools for Android developers.
